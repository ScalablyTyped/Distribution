package typings.cucumberCucumber.anon

import typings.cucumberCucumber.libApiTypesMod.IRunOptionsRuntime
import typings.cucumberCucumber.libFormatterHelpersMod.EventDataCollector
import typings.cucumberCucumber.libLoggerMod.ILogger
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.ISupportCodeLibrary
import typings.cucumberMessages.distCjsSrcIdGeneratorMod.NewId
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cwd extends StObject {
  
  var cwd: String
  
  var eventBroadcaster: EventEmitter
  
  var eventDataCollector: EventDataCollector
  
  var importPaths: js.Array[String]
  
  var logger: ILogger
  
  def newId(): String
  @JSName("newId")
  var newId_Original: NewId
  
  var options: IRunOptionsRuntime
  
  var pickleIds: js.Array[String]
  
  var requireModules: js.Array[String]
  
  var requirePaths: js.Array[String]
  
  var supportCodeLibrary: ISupportCodeLibrary
}
object Cwd {
  
  inline def apply(
    cwd: String,
    eventBroadcaster: EventEmitter,
    eventDataCollector: EventDataCollector,
    importPaths: js.Array[String],
    logger: ILogger,
    newId: () => String,
    options: IRunOptionsRuntime,
    pickleIds: js.Array[String],
    requireModules: js.Array[String],
    requirePaths: js.Array[String],
    supportCodeLibrary: ISupportCodeLibrary
  ): Cwd = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], eventBroadcaster = eventBroadcaster.asInstanceOf[js.Any], eventDataCollector = eventDataCollector.asInstanceOf[js.Any], importPaths = importPaths.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], newId = js.Any.fromFunction0(newId), options = options.asInstanceOf[js.Any], pickleIds = pickleIds.asInstanceOf[js.Any], requireModules = requireModules.asInstanceOf[js.Any], requirePaths = requirePaths.asInstanceOf[js.Any], supportCodeLibrary = supportCodeLibrary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cwd]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cwd] (val x: Self) extends AnyVal {
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setEventBroadcaster(value: EventEmitter): Self = StObject.set(x, "eventBroadcaster", value.asInstanceOf[js.Any])
    
    inline def setEventDataCollector(value: EventDataCollector): Self = StObject.set(x, "eventDataCollector", value.asInstanceOf[js.Any])
    
    inline def setImportPaths(value: js.Array[String]): Self = StObject.set(x, "importPaths", value.asInstanceOf[js.Any])
    
    inline def setImportPathsVarargs(value: String*): Self = StObject.set(x, "importPaths", js.Array(value*))
    
    inline def setLogger(value: ILogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setNewId(value: () => String): Self = StObject.set(x, "newId", js.Any.fromFunction0(value))
    
    inline def setOptions(value: IRunOptionsRuntime): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPickleIds(value: js.Array[String]): Self = StObject.set(x, "pickleIds", value.asInstanceOf[js.Any])
    
    inline def setPickleIdsVarargs(value: String*): Self = StObject.set(x, "pickleIds", js.Array(value*))
    
    inline def setRequireModules(value: js.Array[String]): Self = StObject.set(x, "requireModules", value.asInstanceOf[js.Any])
    
    inline def setRequireModulesVarargs(value: String*): Self = StObject.set(x, "requireModules", js.Array(value*))
    
    inline def setRequirePaths(value: js.Array[String]): Self = StObject.set(x, "requirePaths", value.asInstanceOf[js.Any])
    
    inline def setRequirePathsVarargs(value: String*): Self = StObject.set(x, "requirePaths", js.Array(value*))
    
    inline def setSupportCodeLibrary(value: ISupportCodeLibrary): Self = StObject.set(x, "supportCodeLibrary", value.asInstanceOf[js.Any])
  }
}
