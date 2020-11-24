package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentMetadataConfiguration extends js.Object {
  
  /**
    * The name of the index field.
    */
  var Name: DocumentMetadataConfigurationName = js.native
  
  /**
    * Provides manual tuning parameters to determine how the field affects the search results.
    */
  var Relevance: js.UndefOr[typings.awsSdk.kendraMod.Relevance] = js.native
  
  /**
    * Provides information about how the field is used during a search.
    */
  var Search: js.UndefOr[typings.awsSdk.kendraMod.Search] = js.native
  
  /**
    * The data type of the index field. 
    */
  var Type: DocumentAttributeValueType = js.native
}
object DocumentMetadataConfiguration {
  
  @scala.inline
  def apply(Name: DocumentMetadataConfigurationName, Type: DocumentAttributeValueType): DocumentMetadataConfiguration = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentMetadataConfiguration]
  }
  
  @scala.inline
  implicit class DocumentMetadataConfigurationOps[Self <: DocumentMetadataConfiguration] (val x: Self) extends AnyVal {
    
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
    def setName(value: DocumentMetadataConfigurationName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DocumentAttributeValueType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevance(value: Relevance): Self = this.set("Relevance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelevance: Self = this.set("Relevance", js.undefined)
    
    @scala.inline
    def setSearch(value: Search): Self = this.set("Search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch: Self = this.set("Search", js.undefined)
  }
}
