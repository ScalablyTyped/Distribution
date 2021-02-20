package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KinesisParameters extends StObject {
  
  /**
    * The JSON path to be extracted from the event and used as the partition key. For more information, see Amazon Kinesis Streams Key Concepts in the Amazon Kinesis Streams Developer Guide.
    */
  var PartitionKeyPath: TargetPartitionKeyPath = js.native
}
object KinesisParameters {
  
  @scala.inline
  def apply(PartitionKeyPath: TargetPartitionKeyPath): KinesisParameters = {
    val __obj = js.Dynamic.literal(PartitionKeyPath = PartitionKeyPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisParameters]
  }
  
  @scala.inline
  implicit class KinesisParametersMutableBuilder[Self <: KinesisParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPartitionKeyPath(value: TargetPartitionKeyPath): Self = StObject.set(x, "PartitionKeyPath", value.asInstanceOf[js.Any])
  }
}
