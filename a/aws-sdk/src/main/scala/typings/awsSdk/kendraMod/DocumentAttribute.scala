package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentAttribute extends StObject {
  
  /**
    * The identifier for the attribute.
    */
  var Key: DocumentAttributeKey
  
  /**
    * The value of the attribute.
    */
  var Value: DocumentAttributeValue
}
object DocumentAttribute {
  
  inline def apply(Key: DocumentAttributeKey, Value: DocumentAttributeValue): DocumentAttribute = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentAttribute]
  }
  
  extension [Self <: DocumentAttribute](x: Self) {
    
    inline def setKey(value: DocumentAttributeKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: DocumentAttributeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
