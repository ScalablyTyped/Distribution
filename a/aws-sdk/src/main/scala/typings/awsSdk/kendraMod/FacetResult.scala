package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FacetResult extends js.Object {
  
  /**
    * The key for the facet values. This is the same as the DocumentAttributeKey provided in the query.
    */
  var DocumentAttributeKey: js.UndefOr[typings.awsSdk.kendraMod.DocumentAttributeKey] = js.native
  
  /**
    * An array of key/value pairs, where the key is the value of the attribute and the count is the number of documents that share the key value.
    */
  var DocumentAttributeValueCountPairs: js.UndefOr[DocumentAttributeValueCountPairList] = js.native
  
  /**
    * The data type of the facet value. This is the same as the type defined for the index field when it was created.
    */
  var DocumentAttributeValueType: js.UndefOr[typings.awsSdk.kendraMod.DocumentAttributeValueType] = js.native
}
object FacetResult {
  
  @scala.inline
  def apply(): FacetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FacetResult]
  }
  
  @scala.inline
  implicit class FacetResultOps[Self <: FacetResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDocumentAttributeKey(value: DocumentAttributeKey): Self = this.set("DocumentAttributeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentAttributeKey: Self = this.set("DocumentAttributeKey", js.undefined)
    
    @scala.inline
    def setDocumentAttributeValueCountPairsVarargs(value: DocumentAttributeValueCountPair*): Self = this.set("DocumentAttributeValueCountPairs", js.Array(value :_*))
    
    @scala.inline
    def setDocumentAttributeValueCountPairs(value: DocumentAttributeValueCountPairList): Self = this.set("DocumentAttributeValueCountPairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentAttributeValueCountPairs: Self = this.set("DocumentAttributeValueCountPairs", js.undefined)
    
    @scala.inline
    def setDocumentAttributeValueType(value: DocumentAttributeValueType): Self = this.set("DocumentAttributeValueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentAttributeValueType: Self = this.set("DocumentAttributeValueType", js.undefined)
  }
}
