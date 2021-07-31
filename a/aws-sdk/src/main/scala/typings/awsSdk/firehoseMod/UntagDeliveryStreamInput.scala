package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagDeliveryStreamInput extends StObject {
  
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: typings.awsSdk.firehoseMod.DeliveryStreamName
  
  /**
    * A list of tag keys. Each corresponding tag is removed from the delivery stream.
    */
  var TagKeys: TagKeyList
}
object UntagDeliveryStreamInput {
  
  @scala.inline
  def apply(DeliveryStreamName: DeliveryStreamName, TagKeys: TagKeyList): UntagDeliveryStreamInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagDeliveryStreamInput]
  }
  
  @scala.inline
  implicit class UntagDeliveryStreamInputMutableBuilder[Self <: UntagDeliveryStreamInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryStreamName(value: DeliveryStreamName): Self = StObject.set(x, "DeliveryStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeys(value: TagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
  }
}
