package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag extends StObject {
  
  /**
    * One part of a key-value pair that makes up a tag. A key is a general label that acts like a category for more specific tag values.
    */
  var tagKey: TagKey
  
  /**
    * The optional part of a key-value pair that makes up a tag. A value acts as a descriptor within a tag category (key).
    */
  var tagValue: TagValue
}
object Tag {
  
  inline def apply(tagKey: TagKey, tagValue: TagValue): Tag = {
    val __obj = js.Dynamic.literal(tagKey = tagKey.asInstanceOf[js.Any], tagValue = tagValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  extension [Self <: Tag](x: Self) {
    
    inline def setTagKey(value: TagKey): Self = StObject.set(x, "tagKey", value.asInstanceOf[js.Any])
    
    inline def setTagValue(value: TagValue): Self = StObject.set(x, "tagValue", value.asInstanceOf[js.Any])
  }
}
