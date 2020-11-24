package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KinesisConfiguration extends js.Object {
  
  /**
    * Enables QLDB to publish multiple data records in a single Kinesis Data Streams record. To learn more, see KPL Key Concepts in the Amazon Kinesis Data Streams Developer Guide.
    */
  var AggregationEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Kinesis data stream resource.
    */
  var StreamArn: Arn = js.native
}
object KinesisConfiguration {
  
  @scala.inline
  def apply(StreamArn: Arn): KinesisConfiguration = {
    val __obj = js.Dynamic.literal(StreamArn = StreamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisConfiguration]
  }
  
  @scala.inline
  implicit class KinesisConfigurationOps[Self <: KinesisConfiguration] (val x: Self) extends AnyVal {
    
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
    def setStreamArn(value: Arn): Self = this.set("StreamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationEnabled(value: Boolean): Self = this.set("AggregationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregationEnabled: Self = this.set("AggregationEnabled", js.undefined)
  }
}
