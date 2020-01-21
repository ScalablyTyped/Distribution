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
    DocumentsWithErrorsCount: Int | Double = null,
    InputDocumentsCount: Int | Double = null,
    TranslatedDocumentsCount: Int | Double = null
  ): JobDetails = {
    val __obj = js.Dynamic.literal()
    if (DocumentsWithErrorsCount != null) __obj.updateDynamic("DocumentsWithErrorsCount")(DocumentsWithErrorsCount.asInstanceOf[js.Any])
    if (InputDocumentsCount != null) __obj.updateDynamic("InputDocumentsCount")(InputDocumentsCount.asInstanceOf[js.Any])
    if (TranslatedDocumentsCount != null) __obj.updateDynamic("TranslatedDocumentsCount")(TranslatedDocumentsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobDetails]
  }
}

