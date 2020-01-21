package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRegexMatchSetResponse extends js.Object {
  /**
    * Information about the RegexMatchSet that you specified in the GetRegexMatchSet request. For more information, see RegexMatchTuple.
    */
  var RegexMatchSet: js.UndefOr[typings.awsSdk.wafregionalMod.RegexMatchSet] = js.native
}

object GetRegexMatchSetResponse {
  @scala.inline
  def apply(RegexMatchSet: RegexMatchSet = null): GetRegexMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    if (RegexMatchSet != null) __obj.updateDynamic("RegexMatchSet")(RegexMatchSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRegexMatchSetResponse]
  }
}

