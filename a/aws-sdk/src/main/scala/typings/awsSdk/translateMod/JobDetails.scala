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
  def apply(): JobDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobDetails]
  }
  @scala.inline
  implicit class JobDetailsOps[Self <: JobDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDocumentsWithErrorsCount(value: Integer): Self = this.set("DocumentsWithErrorsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentsWithErrorsCount: Self = this.set("DocumentsWithErrorsCount", js.undefined)
    @scala.inline
    def setInputDocumentsCount(value: Integer): Self = this.set("InputDocumentsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputDocumentsCount: Self = this.set("InputDocumentsCount", js.undefined)
    @scala.inline
    def setTranslatedDocumentsCount(value: Integer): Self = this.set("TranslatedDocumentsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslatedDocumentsCount: Self = this.set("TranslatedDocumentsCount", js.undefined)
  }
  
}

