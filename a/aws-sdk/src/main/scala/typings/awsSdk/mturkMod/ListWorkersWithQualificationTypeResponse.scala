package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListWorkersWithQualificationTypeResponse extends js.Object {
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  The number of Qualifications on this page in the filtered results list, equivalent to the number of Qualifications being returned by this call.
    */
  var NumResults: js.UndefOr[Integer] = js.native
  /**
    *  The list of Qualification elements returned by this call. 
    */
  var Qualifications: js.UndefOr[QualificationList] = js.native
}

object ListWorkersWithQualificationTypeResponse {
  @scala.inline
  def apply(
    NextToken: PaginationToken = null,
    NumResults: Int | Double = null,
    Qualifications: QualificationList = null
  ): ListWorkersWithQualificationTypeResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (NumResults != null) __obj.updateDynamic("NumResults")(NumResults.asInstanceOf[js.Any])
    if (Qualifications != null) __obj.updateDynamic("Qualifications")(Qualifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkersWithQualificationTypeResponse]
  }
}

