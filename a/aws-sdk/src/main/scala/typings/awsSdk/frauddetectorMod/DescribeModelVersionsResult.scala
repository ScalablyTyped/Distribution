package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeModelVersionsResult extends js.Object {
  /**
    * The model version details.
    */
  var modelVersionDetails: js.UndefOr[ModelVersionDetailList] = js.native
  /**
    * The next token.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object DescribeModelVersionsResult {
  @scala.inline
  def apply(modelVersionDetails: ModelVersionDetailList = null, nextToken: String = null): DescribeModelVersionsResult = {
    val __obj = js.Dynamic.literal()
    if (modelVersionDetails != null) __obj.updateDynamic("modelVersionDetails")(modelVersionDetails.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelVersionsResult]
  }
}

