package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndInstallTypesEventBody
  extends StObject
     with InstallTypesEventBody {
  
  /**
    * true if installation succeeded, otherwise false
    */
  var success: Boolean
}
object EndInstallTypesEventBody {
  
  inline def apply(eventId: Double, packages: Array[String], success: Boolean): EndInstallTypesEventBody = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], packages = packages.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndInstallTypesEventBody]
  }
  
  extension [Self <: EndInstallTypesEventBody](x: Self) {
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
