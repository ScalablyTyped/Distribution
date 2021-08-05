package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisParameters extends StObject {
  
  /**
    * The JSON path to be extracted from the event and used as the partition key. For more information, see Amazon Kinesis Streams Key Concepts in the Amazon Kinesis Streams Developer Guide.
    */
  var PartitionKeyPath: TargetPartitionKeyPath
}
object KinesisParameters {
  
  inline def apply(PartitionKeyPath: TargetPartitionKeyPath): KinesisParameters = {
    val __obj = js.Dynamic.literal(PartitionKeyPath = PartitionKeyPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisParameters]
  }
  
  extension [Self <: KinesisParameters](x: Self) {
    
    inline def setPartitionKeyPath(value: TargetPartitionKeyPath): Self = StObject.set(x, "PartitionKeyPath", value.asInstanceOf[js.Any])
  }
}
