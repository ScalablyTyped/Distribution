package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputUpdate extends js.Object {
  /**
    * Describes the data format when records are written to the destination. For more information, see Configuring Application Output.
    */
  var DestinationSchemaUpdate: js.UndefOr[DestinationSchema] = js.native
  /**
    * Describes an Amazon Kinesis Firehose delivery stream as the destination for the output.
    */
  var KinesisFirehoseOutputUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.KinesisFirehoseOutputUpdate] = js.native
  /**
    * Describes an Amazon Kinesis stream as the destination for the output.
    */
  var KinesisStreamsOutputUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.KinesisStreamsOutputUpdate] = js.native
  /**
    * Describes an AWS Lambda function as the destination for the output.
    */
  var LambdaOutputUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.LambdaOutputUpdate] = js.native
  /**
    * If you want to specify a different in-application stream for this output configuration, use this field to specify the new in-application stream name.
    */
  var NameUpdate: js.UndefOr[InAppStreamName] = js.native
  /**
    * Identifies the specific output configuration that you want to update.
    */
  var OutputId: Id = js.native
}

object OutputUpdate {
  @scala.inline
  def apply(OutputId: Id): OutputUpdate = {
    val __obj = js.Dynamic.literal(OutputId = OutputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputUpdate]
  }
  @scala.inline
  implicit class OutputUpdateOps[Self <: OutputUpdate] (val x: Self) extends AnyVal {
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
    def setOutputId(value: Id): Self = this.set("OutputId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationSchemaUpdate(value: DestinationSchema): Self = this.set("DestinationSchemaUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationSchemaUpdate: Self = this.set("DestinationSchemaUpdate", js.undefined)
    @scala.inline
    def setKinesisFirehoseOutputUpdate(value: KinesisFirehoseOutputUpdate): Self = this.set("KinesisFirehoseOutputUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKinesisFirehoseOutputUpdate: Self = this.set("KinesisFirehoseOutputUpdate", js.undefined)
    @scala.inline
    def setKinesisStreamsOutputUpdate(value: KinesisStreamsOutputUpdate): Self = this.set("KinesisStreamsOutputUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKinesisStreamsOutputUpdate: Self = this.set("KinesisStreamsOutputUpdate", js.undefined)
    @scala.inline
    def setLambdaOutputUpdate(value: LambdaOutputUpdate): Self = this.set("LambdaOutputUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaOutputUpdate: Self = this.set("LambdaOutputUpdate", js.undefined)
    @scala.inline
    def setNameUpdate(value: InAppStreamName): Self = this.set("NameUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameUpdate: Self = this.set("NameUpdate", js.undefined)
  }
  
}

