package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenFileInfoTelemetryEventData extends StObject {
  
  val info: OpenFileInfo
}
object OpenFileInfoTelemetryEventData {
  
  inline def apply(info: OpenFileInfo): OpenFileInfoTelemetryEventData = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenFileInfoTelemetryEventData]
  }
  
  extension [Self <: OpenFileInfoTelemetryEventData](x: Self) {
    
    inline def setInfo(value: OpenFileInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
