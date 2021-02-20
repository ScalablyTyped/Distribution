package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KinesisFirehoseInputUpdate extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the input delivery stream to read.
    */
  var ResourceARNUpdate: ResourceARN = js.native
}
object KinesisFirehoseInputUpdate {
  
  @scala.inline
  def apply(ResourceARNUpdate: ResourceARN): KinesisFirehoseInputUpdate = {
    val __obj = js.Dynamic.literal(ResourceARNUpdate = ResourceARNUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisFirehoseInputUpdate]
  }
  
  @scala.inline
  implicit class KinesisFirehoseInputUpdateMutableBuilder[Self <: KinesisFirehoseInputUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceARNUpdate(value: ResourceARN): Self = StObject.set(x, "ResourceARNUpdate", value.asInstanceOf[js.Any])
  }
}
