package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDocumentRequest extends js.Object {
  /**
    * Returns the document in the specified format. The document format can be either JSON or YAML. JSON is the default format.
    */
  var DocumentFormat: js.UndefOr[typings.awsSdk.ssmMod.DocumentFormat] = js.native
  /**
    * The document version for which you want information.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.DocumentVersion] = js.native
  /**
    * The name of the Systems Manager document.
    */
  var Name: DocumentARN = js.native
  /**
    * An optional field specifying the version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document and can't be changed.
    */
  var VersionName: js.UndefOr[DocumentVersionName] = js.native
}

object GetDocumentRequest {
  @scala.inline
  def apply(Name: DocumentARN): GetDocumentRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentRequest]
  }
  @scala.inline
  implicit class GetDocumentRequestOps[Self <: GetDocumentRequest] (val x: Self) extends AnyVal {
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
    def setName(value: DocumentARN): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocumentFormat(value: DocumentFormat): Self = this.set("DocumentFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentFormat: Self = this.set("DocumentFormat", js.undefined)
    @scala.inline
    def setDocumentVersion(value: DocumentVersion): Self = this.set("DocumentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentVersion: Self = this.set("DocumentVersion", js.undefined)
    @scala.inline
    def setVersionName(value: DocumentVersionName): Self = this.set("VersionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionName: Self = this.set("VersionName", js.undefined)
  }
  
}

