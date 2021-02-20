package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentAttribute extends StObject {
  
  /**
    * The identifier for the attribute.
    */
  var Key: DocumentAttributeKey = js.native
  
  /**
    * The value of the attribute.
    */
  var Value: DocumentAttributeValue = js.native
}
object DocumentAttribute {
  
  @scala.inline
  def apply(Key: DocumentAttributeKey, Value: DocumentAttributeValue): DocumentAttribute = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentAttribute]
  }
  
  @scala.inline
  implicit class DocumentAttributeMutableBuilder[Self <: DocumentAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: DocumentAttributeKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: DocumentAttributeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
