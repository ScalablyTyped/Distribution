package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIdentityDkimAttributesResponse extends StObject {
  
  /**
    * The DKIM attributes for an email address or a domain.
    */
  var DkimAttributes: typings.awsSdk.sesMod.DkimAttributes = js.native
}
object GetIdentityDkimAttributesResponse {
  
  @scala.inline
  def apply(DkimAttributes: DkimAttributes): GetIdentityDkimAttributesResponse = {
    val __obj = js.Dynamic.literal(DkimAttributes = DkimAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityDkimAttributesResponse]
  }
  
  @scala.inline
  implicit class GetIdentityDkimAttributesResponseMutableBuilder[Self <: GetIdentityDkimAttributesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDkimAttributes(value: DkimAttributes): Self = StObject.set(x, "DkimAttributes", value.asInstanceOf[js.Any])
  }
}
