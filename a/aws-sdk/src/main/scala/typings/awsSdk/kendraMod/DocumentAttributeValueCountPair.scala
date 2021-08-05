package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentAttributeValueCountPair extends StObject {
  
  /**
    * The number of documents in the response that have the attribute value for the key.
    */
  var Count: js.UndefOr[Integer] = js.undefined
  
  /**
    * The value of the attribute. For example, "HR."
    */
  var DocumentAttributeValue: js.UndefOr[typings.awsSdk.kendraMod.DocumentAttributeValue] = js.undefined
}
object DocumentAttributeValueCountPair {
  
  inline def apply(): DocumentAttributeValueCountPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentAttributeValueCountPair]
  }
  
  extension [Self <: DocumentAttributeValueCountPair](x: Self) {
    
    inline def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setDocumentAttributeValue(value: DocumentAttributeValue): Self = StObject.set(x, "DocumentAttributeValue", value.asInstanceOf[js.Any])
    
    inline def setDocumentAttributeValueUndefined: Self = StObject.set(x, "DocumentAttributeValue", js.undefined)
  }
}
