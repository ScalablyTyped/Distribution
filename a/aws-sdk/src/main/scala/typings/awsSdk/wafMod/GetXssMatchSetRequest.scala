package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetXssMatchSetRequest extends StObject {
  
  /**
    * The XssMatchSetId of the XssMatchSet that you want to get. XssMatchSetId is returned by CreateXssMatchSet and by ListXssMatchSets.
    */
  var XssMatchSetId: ResourceId = js.native
}
object GetXssMatchSetRequest {
  
  @scala.inline
  def apply(XssMatchSetId: ResourceId): GetXssMatchSetRequest = {
    val __obj = js.Dynamic.literal(XssMatchSetId = XssMatchSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetXssMatchSetRequest]
  }
  
  @scala.inline
  implicit class GetXssMatchSetRequestMutableBuilder[Self <: GetXssMatchSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setXssMatchSetId(value: ResourceId): Self = StObject.set(x, "XssMatchSetId", value.asInstanceOf[js.Any])
  }
}
