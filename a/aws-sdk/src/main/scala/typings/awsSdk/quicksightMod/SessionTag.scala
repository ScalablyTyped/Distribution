package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionTag extends StObject {
  
  /**
    * The key for the tag.
    */
  var Key: SessionTagKey
  
  /**
    * The value that you want to assign the tag.
    */
  var Value: SessionTagValue
}
object SessionTag {
  
  inline def apply(Key: SessionTagKey, Value: SessionTagValue): SessionTag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionTag]
  }
  
  extension [Self <: SessionTag](x: Self) {
    
    inline def setKey(value: SessionTagKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: SessionTagValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
