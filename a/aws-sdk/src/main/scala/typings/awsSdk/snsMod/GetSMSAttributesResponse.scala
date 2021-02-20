package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSMSAttributesResponse extends StObject {
  
  /**
    * The SMS attribute names and their values.
    */
  var attributes: js.UndefOr[MapStringToString] = js.native
}
object GetSMSAttributesResponse {
  
  @scala.inline
  def apply(): GetSMSAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSMSAttributesResponse]
  }
  
  @scala.inline
  implicit class GetSMSAttributesResponseMutableBuilder[Self <: GetSMSAttributesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: MapStringToString): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
  }
}
