package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KinesisStreamsOutputUpdate extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Kinesis data stream where you want to write the output.
    */
  var ResourceARNUpdate: ResourceARN = js.native
}
object KinesisStreamsOutputUpdate {
  
  @scala.inline
  def apply(ResourceARNUpdate: ResourceARN): KinesisStreamsOutputUpdate = {
    val __obj = js.Dynamic.literal(ResourceARNUpdate = ResourceARNUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamsOutputUpdate]
  }
  
  @scala.inline
  implicit class KinesisStreamsOutputUpdateMutableBuilder[Self <: KinesisStreamsOutputUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceARNUpdate(value: ResourceARN): Self = StObject.set(x, "ResourceARNUpdate", value.asInstanceOf[js.Any])
  }
}
