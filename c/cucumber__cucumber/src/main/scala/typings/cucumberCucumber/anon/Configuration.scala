package typings.cucumberCucumber.anon

import typings.cucumberCucumber.libApiTypesMod.IRunOptionsFormats
import typings.cucumberCucumber.libFormatterHelpersMod.EventDataCollector
import typings.cucumberCucumber.libFormatterMod.IFormatterStream
import typings.cucumberCucumber.libLoggerMod.ILogger
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.ISupportCodeLibrary
import typings.node.eventsMod.EventEmitter
import typings.node.processMod.global.NodeJS.ProcessEnv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configuration extends StObject {
  
  var configuration: IRunOptionsFormats
  
  var cwd: String
  
  var env: ProcessEnv
  
  var eventBroadcaster: EventEmitter
  
  var eventDataCollector: EventDataCollector
  
  var logger: ILogger
  
  def onStreamError(): Unit
  
  var stderr: IFormatterStream
  
  var stdout: IFormatterStream
  
  var supportCodeLibrary: ISupportCodeLibrary
}
object Configuration {
  
  inline def apply(
    configuration: IRunOptionsFormats,
    cwd: String,
    env: ProcessEnv,
    eventBroadcaster: EventEmitter,
    eventDataCollector: EventDataCollector,
    logger: ILogger,
    onStreamError: () => Unit,
    stderr: IFormatterStream,
    stdout: IFormatterStream,
    supportCodeLibrary: ISupportCodeLibrary
  ): Configuration = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], eventBroadcaster = eventBroadcaster.asInstanceOf[js.Any], eventDataCollector = eventDataCollector.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], onStreamError = js.Any.fromFunction0(onStreamError), stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], supportCodeLibrary = supportCodeLibrary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: IRunOptionsFormats): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEventBroadcaster(value: EventEmitter): Self = StObject.set(x, "eventBroadcaster", value.asInstanceOf[js.Any])
    
    inline def setEventDataCollector(value: EventDataCollector): Self = StObject.set(x, "eventDataCollector", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: ILogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setOnStreamError(value: () => Unit): Self = StObject.set(x, "onStreamError", js.Any.fromFunction0(value))
    
    inline def setStderr(value: IFormatterStream): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    inline def setStdout(value: IFormatterStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    
    inline def setSupportCodeLibrary(value: ISupportCodeLibrary): Self = StObject.set(x, "supportCodeLibrary", value.asInstanceOf[js.Any])
  }
}
