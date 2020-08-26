package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentsSource extends js.Object {
  /**
    * The key of a key-value pair that identifies the location of an attachment to a document.
    */
  var Key: js.UndefOr[AttachmentsSourceKey] = js.native
  /**
    * The name of the document attachment file.
    */
  var Name: js.UndefOr[AttachmentIdentifier] = js.native
  /**
    * The value of a key-value pair that identifies the location of an attachment to a document. The format for Value depends on the type of key you specify.   For the key SourceUrl, the value is an S3 bucket location. For example:  "Values": [ "s3://my-bucket/my-folder" ]    For the key S3FileUrl, the value is a file in an S3 bucket. For example:  "Values": [ "s3://my-bucket/my-folder/my-file.py" ]    For the key AttachmentReference, the value is constructed from the name of another SSM document in your account, a version number of that document, and a file attached to that document version that you want to reuse. For example:  "Values": [ "MyOtherDocument/3/my-other-file.py" ]  However, if the SSM document is shared with you from another account, the full SSM document ARN must be specified instead of the document name only. For example:  "Values": [ "arn:aws:ssm:us-east-2:111122223333:document/OtherAccountDocument/3/their-file.py" ]   
    */
  var Values: js.UndefOr[AttachmentsSourceValues] = js.native
}

object AttachmentsSource {
  @scala.inline
  def apply(): AttachmentsSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentsSource]
  }
  @scala.inline
  implicit class AttachmentsSourceOps[Self <: AttachmentsSource] (val x: Self) extends AnyVal {
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
    def setKey(value: AttachmentsSourceKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    @scala.inline
    def setName(value: AttachmentIdentifier): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setValuesVarargs(value: AttachmentsSourceValue*): Self = this.set("Values", js.Array(value :_*))
    @scala.inline
    def setValues(value: AttachmentsSourceValues): Self = this.set("Values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("Values", js.undefined)
  }
  
}

