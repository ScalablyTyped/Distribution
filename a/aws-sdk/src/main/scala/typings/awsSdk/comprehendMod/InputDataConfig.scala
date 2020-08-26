package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputDataConfig extends js.Object {
  /**
    * Specifies how the text in an input file should be processed:    ONE_DOC_PER_FILE - Each file is considered a separate document. Use this option when you are processing large documents, such as newspaper articles or scientific papers.    ONE_DOC_PER_LINE - Each line in a file is considered a separate document. Use this option when you are processing many short documents, such as text messages.  
    */
  var InputFormat: js.UndefOr[typings.awsSdk.comprehendMod.InputFormat] = js.native
  /**
    * The Amazon S3 URI for the input data. The URI must be in same region as the API endpoint that you are calling. The URI can point to a single input file or it can provide the prefix for a collection of data files.  For example, if you use the URI S3://bucketName/prefix, if the prefix is a single file, Amazon Comprehend uses that file as input. If more than one file begins with the prefix, Amazon Comprehend uses all of them as input.
    */
  var S3Uri: typings.awsSdk.comprehendMod.S3Uri = js.native
}

object InputDataConfig {
  @scala.inline
  def apply(S3Uri: S3Uri): InputDataConfig = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputDataConfig]
  }
  @scala.inline
  implicit class InputDataConfigOps[Self <: InputDataConfig] (val x: Self) extends AnyVal {
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
    def setInputFormat(value: InputFormat): Self = this.set("InputFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputFormat: Self = this.set("InputFormat", js.undefined)
  }
  
}

