package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputDescription extends js.Object {
  /**
    * Data format used for writing data to the destination.
    */
  var DestinationSchema: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.DestinationSchema] = js.native
  /**
    * Describes the Amazon Kinesis Firehose delivery stream configured as the destination where output is written.
    */
  var KinesisFirehoseOutputDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.KinesisFirehoseOutputDescription] = js.native
  /**
    * Describes Amazon Kinesis stream configured as the destination where output is written.
    */
  var KinesisStreamsOutputDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.KinesisStreamsOutputDescription] = js.native
  /**
    * Describes the AWS Lambda function configured as the destination where output is written.
    */
  var LambdaOutputDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.LambdaOutputDescription] = js.native
  /**
    * Name of the in-application stream configured as output.
    */
  var Name: js.UndefOr[InAppStreamName] = js.native
  /**
    * A unique identifier for the output configuration.
    */
  var OutputId: js.UndefOr[Id] = js.native
}

object OutputDescription {
  @scala.inline
  def apply(): OutputDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputDescription]
  }
  @scala.inline
  implicit class OutputDescriptionOps[Self <: OutputDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestinationSchema(value: DestinationSchema): Self = this.set("DestinationSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationSchema: Self = this.set("DestinationSchema", js.undefined)
    @scala.inline
    def setKinesisFirehoseOutputDescription(value: KinesisFirehoseOutputDescription): Self = this.set("KinesisFirehoseOutputDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKinesisFirehoseOutputDescription: Self = this.set("KinesisFirehoseOutputDescription", js.undefined)
    @scala.inline
    def setKinesisStreamsOutputDescription(value: KinesisStreamsOutputDescription): Self = this.set("KinesisStreamsOutputDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKinesisStreamsOutputDescription: Self = this.set("KinesisStreamsOutputDescription", js.undefined)
    @scala.inline
    def setLambdaOutputDescription(value: LambdaOutputDescription): Self = this.set("LambdaOutputDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaOutputDescription: Self = this.set("LambdaOutputDescription", js.undefined)
    @scala.inline
    def setName(value: InAppStreamName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setOutputId(value: Id): Self = this.set("OutputId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputId: Self = this.set("OutputId", js.undefined)
  }
  
}

