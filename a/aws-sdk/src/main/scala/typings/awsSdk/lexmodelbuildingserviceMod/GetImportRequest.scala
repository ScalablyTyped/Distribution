package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetImportRequest extends StObject {
  
  /**
    * The identifier of the import job information to return.
    */
  var importId: String = js.native
}
object GetImportRequest {
  
  @scala.inline
  def apply(importId: String): GetImportRequest = {
    val __obj = js.Dynamic.literal(importId = importId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImportRequest]
  }
  
  @scala.inline
  implicit class GetImportRequestMutableBuilder[Self <: GetImportRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImportId(value: String): Self = StObject.set(x, "importId", value.asInstanceOf[js.Any])
  }
}
