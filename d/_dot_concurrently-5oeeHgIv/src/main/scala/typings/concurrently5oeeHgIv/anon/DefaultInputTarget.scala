package typings.concurrently5oeeHgIv.anon

import typings.concurrently5oeeHgIv.commandDTsMod.CommandIdentifier
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultInputTarget extends StObject {
  
  var defaultInputTarget: js.UndefOr[CommandIdentifier] = js.undefined
  
  var inputStream: Readable
  
  var logger: typings.concurrently5oeeHgIv.loggerDTsMod.Logger
  
  var pauseInputStreamOnFinish: js.UndefOr[Boolean] = js.undefined
}
object DefaultInputTarget {
  
  inline def apply(inputStream: Readable, logger: typings.concurrently5oeeHgIv.loggerDTsMod.Logger): DefaultInputTarget = {
    val __obj = js.Dynamic.literal(inputStream = inputStream.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultInputTarget]
  }
  
  extension [Self <: DefaultInputTarget](x: Self) {
    
    inline def setDefaultInputTarget(value: CommandIdentifier): Self = StObject.set(x, "defaultInputTarget", value.asInstanceOf[js.Any])
    
    inline def setDefaultInputTargetUndefined: Self = StObject.set(x, "defaultInputTarget", js.undefined)
    
    inline def setInputStream(value: Readable): Self = StObject.set(x, "inputStream", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: typings.concurrently5oeeHgIv.loggerDTsMod.Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setPauseInputStreamOnFinish(value: Boolean): Self = StObject.set(x, "pauseInputStreamOnFinish", value.asInstanceOf[js.Any])
    
    inline def setPauseInputStreamOnFinishUndefined: Self = StObject.set(x, "pauseInputStreamOnFinish", js.undefined)
  }
}
