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
  
  inline def apply(Key: TagKeyString, Value: TagValueString): StorageLensTag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageLensTag]
  }
  
  extension [Self <: StorageLensTag](x: Self) {
    
    inline def setKey(value: TagKeyString): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TagValueString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
