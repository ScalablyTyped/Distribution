package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisStreamsInputUpdate extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the input Kinesis data stream to read.
    */
  var ResourceARNUpdate: ResourceARN
}
object KinesisStreamsInputUpdate {
  
  inline def apply(ResourceARNUpdate: ResourceARN): KinesisStreamsInputUpdate = {
    val __obj = js.Dynamic.literal(ResourceARNUpdate = ResourceARNUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamsInputUpdate]
  }
  
  extension [Self <: KinesisStreamsInputUpdate](x: Self) {
    
    inline def setResourceARNUpdate(value: ResourceARN): Self = StObject.set(x, "ResourceARNUpdate", value.asInstanceOf[js.Any])
  }
}
