package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KinesisStreamsInputUpdate extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the input Kinesis data stream to read.
    */
  var ResourceARNUpdate: ResourceARN = js.native
}
object KinesisStreamsInputUpdate {
  
  @scala.inline
  def apply(ResourceARNUpdate: ResourceARN): KinesisStreamsInputUpdate = {
    val __obj = js.Dynamic.literal(ResourceARNUpdate = ResourceARNUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamsInputUpdate]
  }
  
  @scala.inline
  implicit class KinesisStreamsInputUpdateMutableBuilder[Self <: KinesisStreamsInputUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceARNUpdate(value: ResourceARN): Self = StObject.set(x, "ResourceARNUpdate", value.asInstanceOf[js.Any])
  }
}
