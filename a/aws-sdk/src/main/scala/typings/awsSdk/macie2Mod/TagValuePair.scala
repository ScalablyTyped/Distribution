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
  
  @scala.inline
  def apply(): TagValuePair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagValuePair]
  }
  
  @scala.inline
  implicit class TagValuePairMutableBuilder[Self <: TagValuePair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: string): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: string): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
