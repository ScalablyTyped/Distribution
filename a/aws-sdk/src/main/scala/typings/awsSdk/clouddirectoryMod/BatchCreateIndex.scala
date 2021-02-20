package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchCreateIndex extends StObject {
  
  /**
    * The batch reference name. See Transaction Support for more information.
    */
  var BatchReferenceName: js.UndefOr[typings.awsSdk.clouddirectoryMod.BatchReferenceName] = js.native
  
  /**
    * Indicates whether the attribute that is being indexed has unique values or not.
    */
  var IsUnique: Bool = js.native
  
  /**
    * The name of the link between the parent object and the index object.
    */
  var LinkName: js.UndefOr[typings.awsSdk.clouddirectoryMod.LinkName] = js.native
  
  /**
    * Specifies the attributes that should be indexed on. Currently only a single attribute is supported.
    */
  var OrderedIndexedAttributeList: AttributeKeyList = js.native
  
  /**
    * A reference to the parent object that contains the index object.
    */
  var ParentReference: js.UndefOr[ObjectReference] = js.native
}
object BatchCreateIndex {
  
  @scala.inline
  def apply(IsUnique: Bool, OrderedIndexedAttributeList: AttributeKeyList): BatchCreateIndex = {
    val __obj = js.Dynamic.literal(IsUnique = IsUnique.asInstanceOf[js.Any], OrderedIndexedAttributeList = OrderedIndexedAttributeList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateIndex]
  }
  
  @scala.inline
  implicit class BatchCreateIndexMutableBuilder[Self <: BatchCreateIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchReferenceName(value: BatchReferenceName): Self = StObject.set(x, "BatchReferenceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchReferenceNameUndefined: Self = StObject.set(x, "BatchReferenceName", js.undefined)
    
    @scala.inline
    def setIsUnique(value: Bool): Self = StObject.set(x, "IsUnique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkName(value: LinkName): Self = StObject.set(x, "LinkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkNameUndefined: Self = StObject.set(x, "LinkName", js.undefined)
    
    @scala.inline
    def setOrderedIndexedAttributeList(value: AttributeKeyList): Self = StObject.set(x, "OrderedIndexedAttributeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderedIndexedAttributeListVarargs(value: AttributeKey*): Self = StObject.set(x, "OrderedIndexedAttributeList", js.Array(value :_*))
    
    @scala.inline
    def setParentReference(value: ObjectReference): Self = StObject.set(x, "ParentReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentReferenceUndefined: Self = StObject.set(x, "ParentReference", js.undefined)
  }
}
