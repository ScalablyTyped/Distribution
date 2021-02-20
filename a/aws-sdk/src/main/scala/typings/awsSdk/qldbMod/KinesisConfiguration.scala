package typings.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KinesisConfiguration extends StObject {
  
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
  implicit class KinesisConfigurationMutableBuilder[Self <: KinesisConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregationEnabled(value: Boolean): Self = StObject.set(x, "AggregationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationEnabledUndefined: Self = StObject.set(x, "AggregationEnabled", js.undefined)
    
    @scala.inline
    def setStreamArn(value: Arn): Self = StObject.set(x, "StreamArn", value.asInstanceOf[js.Any])
  }
}
