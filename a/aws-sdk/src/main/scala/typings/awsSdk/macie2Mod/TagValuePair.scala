package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagValuePair extends StObject {
  
  /**
    * The value for the tag key to use in the condition.
    */
  var key: js.UndefOr[string] = js.undefined
  
  /**
    * The tag value, associated with the specified tag key (key), to use in the condition. To specify only a tag key for a condition, specify the tag key for the key property and set this value to an empty string.
    */
  var value: js.UndefOr[string] = js.undefined
}
object TagValuePair {
  
  inline def apply(): TagValuePair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagValuePair]
  }
  
  extension [Self <: TagValuePair](x: Self) {
    
    inline def setKey(value: string): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: string): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
