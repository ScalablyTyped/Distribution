package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexAttachment extends StObject {
  
  /**
    * The indexed attribute values.
    */
  var IndexedAttributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined
  
  /**
    * In response to ListIndex, the ObjectIdentifier of the object attached to the index. In response to ListAttachedIndices, the ObjectIdentifier of the index attached to the object. This field will always contain the ObjectIdentifier of the object on the opposite side of the attachment specified in the query.
    */
  var ObjectIdentifier: js.UndefOr[typings.awsSdk.clouddirectoryMod.ObjectIdentifier] = js.undefined
}
object IndexAttachment {
  
  inline def apply(): IndexAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexAttachment]
  }
  
  extension [Self <: IndexAttachment](x: Self) {
    
    inline def setIndexedAttributes(value: AttributeKeyAndValueList): Self = StObject.set(x, "IndexedAttributes", value.asInstanceOf[js.Any])
    
    inline def setIndexedAttributesUndefined: Self = StObject.set(x, "IndexedAttributes", js.undefined)
    
    inline def setIndexedAttributesVarargs(value: AttributeKeyAndValue*): Self = StObject.set(x, "IndexedAttributes", js.Array(value :_*))
    
    inline def setObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "ObjectIdentifier", value.asInstanceOf[js.Any])
    
    inline def setObjectIdentifierUndefined: Self = StObject.set(x, "ObjectIdentifier", js.undefined)
  }
}
