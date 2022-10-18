package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag extends StObject {
  
  /**
    * The first part of a key:value pair that forms a tag associated with a given resource. For example, in the tag 'Department':'Sales', the key is 'Department'. 
    */
  var Key: TagKey
  
  /**
    * The second part of a key:value pair that forms a tag associated with a given resource. For example, in the tag 'Department':'Sales', the value is 'Sales'. 
    */
  var Value: TagValue
}
object Tag {
  
  inline def apply(Key: TagKey, Value: TagValue): Tag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  extension [Self <: Tag](x: Self) {
    
    inline def setKey(value: TagKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TagValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
