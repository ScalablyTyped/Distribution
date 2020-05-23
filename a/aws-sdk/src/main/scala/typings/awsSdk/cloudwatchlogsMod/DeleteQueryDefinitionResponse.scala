package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteQueryDefinitionResponse extends js.Object {
  var success: js.UndefOr[Success] = js.native
}

object DeleteQueryDefinitionResponse {
  @scala.inline
  def apply(success: js.UndefOr[Success] = js.undefined): DeleteQueryDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteQueryDefinitionResponse]
  }
}

