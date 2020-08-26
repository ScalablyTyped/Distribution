package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentClassifierInputDataConfig extends js.Object {
  /**
    * Indicates the delimiter used to separate each label for training a multi-label classifier. The default delimiter between labels is a pipe (|). You can use a different character as a delimiter (if it's an allowed character) by specifying it under Delimiter for labels. If the training documents use a delimiter other than the default or the delimiter you specify, the labels on that line will be combined to make a single unique label, such as LABELLABELLABEL.
    */
  var LabelDelimiter: js.UndefOr[typings.awsSdk.comprehendMod.LabelDelimiter] = js.native
  /**
    * The Amazon S3 URI for the input data. The S3 bucket must be in the same region as the API endpoint that you are calling. The URI can point to a single input file or it can provide the prefix for a collection of input files. For example, if you use the URI S3://bucketName/prefix, if the prefix is a single file, Amazon Comprehend uses that file as input. If more than one file begins with the prefix, Amazon Comprehend uses all of them as input.
    */
  var S3Uri: typings.awsSdk.comprehendMod.S3Uri = js.native
}

object DocumentClassifierInputDataConfig {
  @scala.inline
  def apply(S3Uri: S3Uri): DocumentClassifierInputDataConfig = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentClassifierInputDataConfig]
  }
  @scala.inline
  implicit class DocumentClassifierInputDataConfigOps[Self <: DocumentClassifierInputDataConfig] (val x: Self) extends AnyVal {
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
    def setS3Uri(value: S3Uri): Self = this.set("S3Uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelDelimiter(value: LabelDelimiter): Self = this.set("LabelDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelDelimiter: Self = this.set("LabelDelimiter", js.undefined)
  }
  
}

