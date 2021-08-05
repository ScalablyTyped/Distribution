package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagDeliveryStreamInput extends StObject {
  
  /**
    * The name of the delivery stream to which you want to add the tags.
    */
  var DeliveryStreamName: typings.awsSdk.firehoseMod.DeliveryStreamName
  
  /**
    * A set of key-value pairs to use to create the tags.
    */
  var Tags: TagDeliveryStreamInputTagList
}
object TagDeliveryStreamInput {
  
  inline def apply(DeliveryStreamName: DeliveryStreamName, Tags: TagDeliveryStreamInputTagList): TagDeliveryStreamInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagDeliveryStreamInput]
  }
  
  extension [Self <: TagDeliveryStreamInput](x: Self) {
    
    inline def setDeliveryStreamName(value: DeliveryStreamName): Self = StObject.set(x, "DeliveryStreamName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagDeliveryStreamInputTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
