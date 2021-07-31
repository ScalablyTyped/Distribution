package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntOptions extends StObject {
  
  /**
    * A value to use for the field if the field isn't specified for a document. This can be important if you are using the field in an expression and that field is not present in every document.
    */
  var DefaultValue: js.UndefOr[Long] = js.undefined
  
  /**
    * Whether facet information can be returned for the field.
    */
  var FacetEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the contents of the field can be returned in the search results.
    */
  var ReturnEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the contents of the field are searchable.
    */
  var SearchEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the field can be used to sort the search results.
    */
  var SortEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the source field to map to the field. 
    */
  var SourceField: js.UndefOr[FieldName] = js.undefined
}
object IntOptions {
  
  @scala.inline
  def apply(): IntOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntOptions]
  }
  
  @scala.inline
  implicit class IntOptionsMutableBuilder[Self <: IntOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: Long): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "DefaultValue", js.undefined)
    
    @scala.inline
    def setFacetEnabled(value: Boolean): Self = StObject.set(x, "FacetEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetEnabledUndefined: Self = StObject.set(x, "FacetEnabled", js.undefined)
    
    @scala.inline
    def setReturnEnabled(value: Boolean): Self = StObject.set(x, "ReturnEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnEnabledUndefined: Self = StObject.set(x, "ReturnEnabled", js.undefined)
    
    @scala.inline
    def setSearchEnabled(value: Boolean): Self = StObject.set(x, "SearchEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchEnabledUndefined: Self = StObject.set(x, "SearchEnabled", js.undefined)
    
    @scala.inline
    def setSortEnabled(value: Boolean): Self = StObject.set(x, "SortEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortEnabledUndefined: Self = StObject.set(x, "SortEnabled", js.undefined)
    
    @scala.inline
    def setSourceField(value: FieldName): Self = StObject.set(x, "SourceField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFieldUndefined: Self = StObject.set(x, "SourceField", js.undefined)
  }
}
