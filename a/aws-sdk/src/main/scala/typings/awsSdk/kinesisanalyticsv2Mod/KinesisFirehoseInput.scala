package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisFirehoseInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the delivery stream.
    */
  var ResourceARN: typings.awsSdk.kinesisanalyticsv2Mod.ResourceARN
}
object KinesisFirehoseInput {
  
  @scala.inline
  def apply(ResourceARN: ResourceARN): KinesisFirehoseInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisFirehoseInput]
  }
  
  @scala.inline
  implicit class KinesisFirehoseInputMutableBuilder[Self <: KinesisFirehoseInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
  }
}
