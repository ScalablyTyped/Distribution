package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDocumentClassifiersResponse extends js.Object {
  /**
    * A list containing the properties of each job returned.
    */
  var DocumentClassifierPropertiesList: js.UndefOr[typings.awsSdk.comprehendMod.DocumentClassifierPropertiesList] = js.native
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListDocumentClassifiersResponse {
  @scala.inline
  def apply(
    DocumentClassifierPropertiesList: DocumentClassifierPropertiesList = null,
    NextToken: String = null
  ): ListDocumentClassifiersResponse = {
    val __obj = js.Dynamic.literal()
    if (DocumentClassifierPropertiesList != null) __obj.updateDynamic("DocumentClassifierPropertiesList")(DocumentClassifierPropertiesList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDocumentClassifiersResponse]
  }
}

