package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFindingsRequest extends js.Object {
  /**
    * The ARN that specifies the finding that you want to describe.
    */
  var findingArns: BatchDescribeArnList = js.native
  /**
    * The locale into which you want to translate a finding description, recommendation, and the short description that identifies the finding.
    */
  var locale: js.UndefOr[Locale] = js.native
}

object DescribeFindingsRequest {
  @scala.inline
  def apply(findingArns: BatchDescribeArnList, locale: Locale = null): DescribeFindingsRequest = {
    val __obj = js.Dynamic.literal(findingArns = findingArns.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFindingsRequest]
  }
}

