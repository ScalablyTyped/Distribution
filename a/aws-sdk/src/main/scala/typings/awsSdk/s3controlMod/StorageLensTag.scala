package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageLensTag extends StObject {
  
  /**
    * 
    */
  var Key: TagKeyString
  
  /**
    * 
    */
  var Value: TagValueString
}
object StorageLensTag {
  
  @scala.inline
  def apply(Key: TagKeyString, Value: TagValueString): StorageLensTag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageLensTag]
  }
  
  @scala.inline
  implicit class StorageLensTagMutableBuilder[Self <: StorageLensTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: TagKeyString): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: TagValueString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
