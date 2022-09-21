package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisFirehoseDestinationDetails extends StObject {
  
  /**
    * The name of the Kinesis Data Firehose delivery stream.
    */
  var DeliveryStream: js.UndefOr[String] = js.undefined
}
object KinesisFirehoseDestinationDetails {
  
  inline def apply(): KinesisFirehoseDestinationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinesisFirehoseDestinationDetails]
  }
  
  extension [Self <: KinesisFirehoseDestinationDetails](x: Self) {
    
    inline def setDeliveryStream(value: String): Self = StObject.set(x, "DeliveryStream", value.asInstanceOf[js.Any])
    
    inline def setDeliveryStreamUndefined: Self = StObject.set(x, "DeliveryStream", js.undefined)
  }
}
