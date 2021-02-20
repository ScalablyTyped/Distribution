package typings.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportServerEngineAttributeResponse extends StObject {
  
  /**
    * The requested engine attribute pair with attribute name and value.
    */
  var EngineAttribute: js.UndefOr[typings.awsSdk.opsworkscmMod.EngineAttribute] = js.native
  
  /**
    * The server name used in the request.
    */
  var ServerName: js.UndefOr[typings.awsSdk.opsworkscmMod.ServerName] = js.native
}
object ExportServerEngineAttributeResponse {
  
  @scala.inline
  def apply(): ExportServerEngineAttributeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportServerEngineAttributeResponse]
  }
  
  @scala.inline
  implicit class ExportServerEngineAttributeResponseMutableBuilder[Self <: ExportServerEngineAttributeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEngineAttribute(value: EngineAttribute): Self = StObject.set(x, "EngineAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineAttributeUndefined: Self = StObject.set(x, "EngineAttribute", js.undefined)
    
    @scala.inline
    def setServerName(value: ServerName): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerNameUndefined: Self = StObject.set(x, "ServerName", js.undefined)
  }
}
