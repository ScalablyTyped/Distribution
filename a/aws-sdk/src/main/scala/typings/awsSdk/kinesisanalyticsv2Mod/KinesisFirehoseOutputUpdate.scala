package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KinesisFirehoseOutputUpdate extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the delivery stream to write to. 
    */
  var ResourceARNUpdate: ResourceARN = js.native
}
object KinesisFirehoseOutputUpdate {
  
  @scala.inline
  def apply(ResourceARNUpdate: ResourceARN): KinesisFirehoseOutputUpdate = {
    val __obj = js.Dynamic.literal(ResourceARNUpdate = ResourceARNUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisFirehoseOutputUpdate]
  }
  
  @scala.inline
  implicit class KinesisFirehoseOutputUpdateMutableBuilder[Self <: KinesisFirehoseOutputUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceARNUpdate(value: ResourceARN): Self = StObject.set(x, "ResourceARNUpdate", value.asInstanceOf[js.Any])
  }
}
