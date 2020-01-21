package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexDocumentsResponse extends js.Object {
  /**
    * The names of the fields that are currently being indexed.
    */
  var FieldNames: js.UndefOr[FieldNameList] = js.native
}

object IndexDocumentsResponse {
  @scala.inline
  def apply(FieldNames: FieldNameList = null): IndexDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    if (FieldNames != null) __obj.updateDynamic("FieldNames")(FieldNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexDocumentsResponse]
  }
}

