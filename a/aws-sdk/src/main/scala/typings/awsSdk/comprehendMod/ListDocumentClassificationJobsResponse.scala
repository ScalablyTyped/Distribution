package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDocumentClassificationJobsResponse extends js.Object {
  /**
    * A list containing the properties of each job returned.
    */
  var DocumentClassificationJobPropertiesList: js.UndefOr[typings.awsSdk.comprehendMod.DocumentClassificationJobPropertiesList] = js.native
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListDocumentClassificationJobsResponse {
  @scala.inline
  def apply(
    DocumentClassificationJobPropertiesList: DocumentClassificationJobPropertiesList = null,
    NextToken: String = null
  ): ListDocumentClassificationJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (DocumentClassificationJobPropertiesList != null) __obj.updateDynamic("DocumentClassificationJobPropertiesList")(DocumentClassificationJobPropertiesList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDocumentClassificationJobsResponse]
  }
}

