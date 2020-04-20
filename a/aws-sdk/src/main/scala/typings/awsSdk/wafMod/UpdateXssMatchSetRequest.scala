package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateXssMatchSetRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.wafMod.ChangeToken = js.native
  /**
    * An array of XssMatchSetUpdate objects that you want to insert into or delete from an XssMatchSet. For more information, see the applicable data types:    XssMatchSetUpdate: Contains Action and XssMatchTuple     XssMatchTuple: Contains FieldToMatch and TextTransformation     FieldToMatch: Contains Data and Type   
    */
  var Updates: XssMatchSetUpdates = js.native
  /**
    * The XssMatchSetId of the XssMatchSet that you want to update. XssMatchSetId is returned by CreateXssMatchSet and by ListXssMatchSets.
    */
  var XssMatchSetId: ResourceId = js.native
}

object UpdateXssMatchSetRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, Updates: XssMatchSetUpdates, XssMatchSetId: ResourceId): UpdateXssMatchSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], Updates = Updates.asInstanceOf[js.Any], XssMatchSetId = XssMatchSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateXssMatchSetRequest]
  }
}

