package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformInput extends js.Object {
  /**
    * If your transform data is compressed, specify the compression type. Amazon SageMaker automatically decompresses the data for the transform job accordingly. The default value is None.
    */
  var CompressionType: js.UndefOr[typings.awsSdk.sagemakerMod.CompressionType] = js.native
  /**
    * The multipurpose internet mail extension (MIME) type of the data. Amazon SageMaker uses the MIME type with each http call to transfer data to the transform job.
    */
  var ContentType: js.UndefOr[typings.awsSdk.sagemakerMod.ContentType] = js.native
  /**
    * Describes the location of the channel data, which is, the S3 location of the input data that the model can consume.
    */
  var DataSource: TransformDataSource = js.native
  /**
    * The method to use to split the transform job's data files into smaller batches. Splitting is necessary when the total size of each object is too large to fit in a single request. You can also use data splitting to improve performance by processing multiple concurrent mini-batches. The default value for SplitType is None, which indicates that input data files are not split, and request payloads contain the entire contents of an input object. Set the value of this parameter to Line to split records on a newline character boundary. SplitType also supports a number of record-oriented binary data formats. When splitting is enabled, the size of a mini-batch depends on the values of the BatchStrategy and MaxPayloadInMB parameters. When the value of BatchStrategy is MultiRecord, Amazon SageMaker sends the maximum number of records in each request, up to the MaxPayloadInMB limit. If the value of BatchStrategy is SingleRecord, Amazon SageMaker sends individual records in each request.  Some data formats represent a record as a binary payload wrapped with extra padding bytes. When splitting is applied to a binary data format, padding is removed if the value of BatchStrategy is set to SingleRecord. Padding is not removed if the value of BatchStrategy is set to MultiRecord. For more information about RecordIO, see Create a Dataset Using RecordIO in the MXNet documentation. For more information about TFRecord, see Consuming TFRecord data in the TensorFlow documentation. 
    */
  var SplitType: js.UndefOr[typings.awsSdk.sagemakerMod.SplitType] = js.native
}

object TransformInput {
  @scala.inline
  def apply(DataSource: TransformDataSource): TransformInput = {
    val __obj = js.Dynamic.literal(DataSource = DataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformInput]
  }
  @scala.inline
  implicit class TransformInputOps[Self <: TransformInput] (val x: Self) extends AnyVal {
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
    def setDataSource(value: TransformDataSource): Self = this.set("DataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompressionType(value: CompressionType): Self = this.set("CompressionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompressionType: Self = this.set("CompressionType", js.undefined)
    @scala.inline
    def setContentType(value: ContentType): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("ContentType", js.undefined)
    @scala.inline
    def setSplitType(value: SplitType): Self = this.set("SplitType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitType: Self = this.set("SplitType", js.undefined)
  }
  
}

