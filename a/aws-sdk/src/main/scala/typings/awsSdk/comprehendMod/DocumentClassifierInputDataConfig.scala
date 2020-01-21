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
  def apply(S3Uri: S3Uri, LabelDelimiter: LabelDelimiter = null): DocumentClassifierInputDataConfig = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
    if (LabelDelimiter != null) __obj.updateDynamic("LabelDelimiter")(LabelDelimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentClassifierInputDataConfig]
  }
}

