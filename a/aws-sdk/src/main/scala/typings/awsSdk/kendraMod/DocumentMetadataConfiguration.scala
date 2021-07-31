package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentMetadataConfiguration extends StObject {
  
  /**
    * The name of the index field.
    */
  var Name: DocumentMetadataConfigurationName
  
  /**
    * Provides manual tuning parameters to determine how the field affects the search results.
    */
  var Relevance: js.UndefOr[typings.awsSdk.kendraMod.Relevance] = js.undefined
  
  /**
    * Provides information about how the field is used during a search.
    */
  var Search: js.UndefOr[typings.awsSdk.kendraMod.Search] = js.undefined
  
  /**
    * The data type of the index field. 
    */
  var Type: DocumentAttributeValueType
}
object DocumentMetadataConfiguration {
  
  @scala.inline
  def apply(Name: DocumentMetadataConfigurationName, Type: DocumentAttributeValueType): DocumentMetadataConfiguration = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentMetadataConfiguration]
  }
  
  @scala.inline
  implicit class DocumentMetadataConfigurationMutableBuilder[Self <: DocumentMetadataConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: DocumentMetadataConfigurationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevance(value: Relevance): Self = StObject.set(x, "Relevance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevanceUndefined: Self = StObject.set(x, "Relevance", js.undefined)
    
    @scala.inline
    def setSearch(value: Search): Self = StObject.set(x, "Search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "Search", js.undefined)
    
    @scala.inline
    def setType(value: DocumentAttributeValueType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
