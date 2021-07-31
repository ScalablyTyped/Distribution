package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag extends StObject {
  
  /**
    * Name of the object key.
    */
  var Key: ObjectKey
  
  /**
    * Value of the tag.
    */
  var Value: typings.awsSdk.s3Mod.Value
}
object Tag {
  
  @scala.inline
  def apply(Key: ObjectKey, Value: Value): Tag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  @scala.inline
  implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: ObjectKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Value): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
