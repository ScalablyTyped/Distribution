package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDeliveryStreamOutput extends StObject {
  
  /**
    * Information about the delivery stream.
    */
  var DeliveryStreamDescription: typings.awsSdk.firehoseMod.DeliveryStreamDescription
}
object DescribeDeliveryStreamOutput {
  
  @scala.inline
  def apply(DeliveryStreamDescription: DeliveryStreamDescription): DescribeDeliveryStreamOutput = {
    val __obj = js.Dynamic.literal(DeliveryStreamDescription = DeliveryStreamDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDeliveryStreamOutput]
  }
  
  @scala.inline
  implicit class DescribeDeliveryStreamOutputMutableBuilder[Self <: DescribeDeliveryStreamOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryStreamDescription(value: DeliveryStreamDescription): Self = StObject.set(x, "DeliveryStreamDescription", value.asInstanceOf[js.Any])
  }
}
