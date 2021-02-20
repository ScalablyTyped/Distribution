package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyValue extends StObject {
  
  /**
    * The unique identifier of a key value pair.
    */
  var Key: js.UndefOr[XmlString] = js.native
  
  /**
    * The value part of the identified key.
    */
  var Value: js.UndefOr[XmlString] = js.native
}
object KeyValue {
  
  @scala.inline
  def apply(): KeyValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyValue]
  }
  
  @scala.inline
  implicit class KeyValueMutableBuilder[Self <: KeyValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: XmlString): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setValue(value: XmlString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
