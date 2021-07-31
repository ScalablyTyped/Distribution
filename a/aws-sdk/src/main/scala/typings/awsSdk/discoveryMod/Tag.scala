package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag extends StObject {
  
  /**
    * The type of tag on which to filter.
    */
  var key: TagKey
  
  /**
    * A value for a tag key on which to filter.
    */
  var value: TagValue
}
object Tag {
  
  @scala.inline
  def apply(key: TagKey, value: TagValue): Tag = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  @scala.inline
  implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: TagKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: TagValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
