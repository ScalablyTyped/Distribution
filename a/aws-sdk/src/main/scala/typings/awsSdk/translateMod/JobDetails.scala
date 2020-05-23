package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobDetails extends js.Object {
  /**
    * The number of documents that could not be processed during a translation job.
    */
  var DocumentsWithErrorsCount: js.UndefOr[Integer] = js.native
  /**
    * The number of documents used as input in a translation job.
    */
  var InputDocumentsCount: js.UndefOr[Integer] = js.native
  /**
    * The number of documents successfully processed during a translation job.
    */
  var TranslatedDocumentsCount: js.UndefOr[Integer] = js.native
}

object JobDetails {
  @scala.inline
  def apply(
    DocumentsWithErrorsCount: js.UndefOr[Integer] = js.undefined,
    InputDocumentsCount: js.UndefOr[Integer] = js.undefined,
    TranslatedDocumentsCount: js.UndefOr[Integer] = js.undefined
  ): JobDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DocumentsWithErrorsCount)) __obj.updateDynamic("DocumentsWithErrorsCount")(DocumentsWithErrorsCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(InputDocumentsCount)) __obj.updateDynamic("InputDocumentsCount")(InputDocumentsCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TranslatedDocumentsCount)) __obj.updateDynamic("TranslatedDocumentsCount")(TranslatedDocumentsCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobDetails]
  }
}

