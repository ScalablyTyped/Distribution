package typings.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTagValuesOutput extends js.Object {
  /**
    * A string that indicates that the response contains more data than can be returned in a single response. To receive additional data, specify this string for the PaginationToken value in a subsequent request.
    */
  var PaginationToken: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.PaginationToken] = js.native
  /**
    * A list of all tag values for the specified key in the AWS account.
    */
  var TagValues: js.UndefOr[TagValuesOutputList] = js.native
}

object GetTagValuesOutput {
  @scala.inline
  def apply(PaginationToken: PaginationToken = null, TagValues: TagValuesOutputList = null): GetTagValuesOutput = {
    val __obj = js.Dynamic.literal()
    if (PaginationToken != null) __obj.updateDynamic("PaginationToken")(PaginationToken.asInstanceOf[js.Any])
    if (TagValues != null) __obj.updateDynamic("TagValues")(TagValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTagValuesOutput]
  }
}

