package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetXssMatchSetRequest extends js.Object {
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
}

