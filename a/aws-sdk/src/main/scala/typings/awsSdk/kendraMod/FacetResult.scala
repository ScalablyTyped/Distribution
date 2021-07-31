package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FacetResult extends StObject {
  
  /**
    * The key for the facet values. This is the same as the DocumentAttributeKey provided in the query.
    */
  var DocumentAttributeKey: js.UndefOr[typings.awsSdk.kendraMod.DocumentAttributeKey] = js.undefined
  
  /**
    * An array of key/value pairs, where the key is the value of the attribute and the count is the number of documents that share the key value.
    */
  var DocumentAttributeValueCountPairs: js.UndefOr[DocumentAttributeValueCountPairList] = js.undefined
  
  /**
    * The data type of the facet value. This is the same as the type defined for the index field when it was created.
    */
  var DocumentAttributeValueType: js.UndefOr[typings.awsSdk.kendraMod.DocumentAttributeValueType] = js.undefined
}
object FacetResult {
  
  @scala.inline
  def apply(): FacetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FacetResult]
  }
  
  @scala.inline
  implicit class FacetResultMutableBuilder[Self <: FacetResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentAttributeKey(value: DocumentAttributeKey): Self = StObject.set(x, "DocumentAttributeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentAttributeKeyUndefined: Self = StObject.set(x, "DocumentAttributeKey", js.undefined)
    
    @scala.inline
    def setDocumentAttributeValueCountPairs(value: DocumentAttributeValueCountPairList): Self = StObject.set(x, "DocumentAttributeValueCountPairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentAttributeValueCountPairsUndefined: Self = StObject.set(x, "DocumentAttributeValueCountPairs", js.undefined)
    
    @scala.inline
    def setDocumentAttributeValueCountPairsVarargs(value: DocumentAttributeValueCountPair*): Self = StObject.set(x, "DocumentAttributeValueCountPairs", js.Array(value :_*))
    
    @scala.inline
    def setDocumentAttributeValueType(value: DocumentAttributeValueType): Self = StObject.set(x, "DocumentAttributeValueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentAttributeValueTypeUndefined: Self = StObject.set(x, "DocumentAttributeValueType", js.undefined)
  }
}
