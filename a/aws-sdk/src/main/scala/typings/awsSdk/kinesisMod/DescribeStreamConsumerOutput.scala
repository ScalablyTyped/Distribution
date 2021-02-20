package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStreamConsumerOutput extends StObject {
  
  /**
    * An object that represents the details of the consumer.
    */
  var ConsumerDescription: typings.awsSdk.kinesisMod.ConsumerDescription = js.native
}
object DescribeStreamConsumerOutput {
  
  @scala.inline
  def apply(ConsumerDescription: ConsumerDescription): DescribeStreamConsumerOutput = {
    val __obj = js.Dynamic.literal(ConsumerDescription = ConsumerDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamConsumerOutput]
  }
  
  @scala.inline
  implicit class DescribeStreamConsumerOutputMutableBuilder[Self <: DescribeStreamConsumerOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumerDescription(value: ConsumerDescription): Self = StObject.set(x, "ConsumerDescription", value.asInstanceOf[js.Any])
  }
}
