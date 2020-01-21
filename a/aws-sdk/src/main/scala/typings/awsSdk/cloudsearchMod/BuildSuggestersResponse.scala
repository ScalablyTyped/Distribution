package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildSuggestersResponse extends js.Object {
  var FieldNames: js.UndefOr[FieldNameList] = js.native
}

object BuildSuggestersResponse {
  @scala.inline
  def apply(FieldNames: FieldNameList = null): BuildSuggestersResponse = {
    val __obj = js.Dynamic.literal()
    if (FieldNames != null) __obj.updateDynamic("FieldNames")(FieldNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildSuggestersResponse]
  }
}

