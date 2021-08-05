package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateIndex extends StObject {
  
  /**
    * The batch reference name. See Transaction Support for more information.
    */
  var BatchReferenceName: js.UndefOr[typings.awsSdk.clouddirectoryMod.BatchReferenceName] = js.undefined
  
  /**
    * Indicates whether the attribute that is being indexed has unique values or not.
    */
  var IsUnique: Bool
  
  /**
    * The name of the link between the parent object and the index object.
    */
  var LinkName: js.UndefOr[typings.awsSdk.clouddirectoryMod.LinkName] = js.undefined
  
  /**
    * Specifies the attributes that should be indexed on. Currently only a single attribute is supported.
    */
  var OrderedIndexedAttributeList: AttributeKeyList
  
  /**
    * A reference to the parent object that contains the index object.
    */
  var ParentReference: js.UndefOr[ObjectReference] = js.undefined
}
object BatchCreateIndex {
  
  inline def apply(IsUnique: Bool, OrderedIndexedAttributeList: AttributeKeyList): BatchCreateIndex = {
    val __obj = js.Dynamic.literal(IsUnique = IsUnique.asInstanceOf[js.Any], OrderedIndexedAttributeList = OrderedIndexedAttributeList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateIndex]
  }
  
  extension [Self <: BatchCreateIndex](x: Self) {
    
    inline def setBatchReferenceName(value: BatchReferenceName): Self = StObject.set(x, "BatchReferenceName", value.asInstanceOf[js.Any])
    
    inline def setBatchReferenceNameUndefined: Self = StObject.set(x, "BatchReferenceName", js.undefined)
    
    inline def setIsUnique(value: Bool): Self = StObject.set(x, "IsUnique", value.asInstanceOf[js.Any])
    
    inline def setLinkName(value: LinkName): Self = StObject.set(x, "LinkName", value.asInstanceOf[js.Any])
    
    inline def setLinkNameUndefined: Self = StObject.set(x, "LinkName", js.undefined)
    
    inline def setOrderedIndexedAttributeList(value: AttributeKeyList): Self = StObject.set(x, "OrderedIndexedAttributeList", value.asInstanceOf[js.Any])
    
    inline def setOrderedIndexedAttributeListVarargs(value: AttributeKey*): Self = StObject.set(x, "OrderedIndexedAttributeList", js.Array(value :_*))
    
    inline def setParentReference(value: ObjectReference): Self = StObject.set(x, "ParentReference", value.asInstanceOf[js.Any])
    
    inline def setParentReferenceUndefined: Self = StObject.set(x, "ParentReference", js.undefined)
  }
}
