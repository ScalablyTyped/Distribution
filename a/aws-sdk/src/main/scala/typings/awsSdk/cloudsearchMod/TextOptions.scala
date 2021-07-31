package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextOptions extends StObject {
  
  /**
    * The name of an analysis scheme for a text field.
    */
  var AnalysisScheme: js.UndefOr[Word] = js.undefined
  
  /**
    * A value to use for the field if the field isn't specified for a document.
    */
  var DefaultValue: js.UndefOr[FieldValue] = js.undefined
  
  /**
    * Whether highlights can be returned for the field.
    */
  var HighlightEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the contents of the field can be returned in the search results.
    */
  var ReturnEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the field can be used to sort the search results.
    */
  var SortEnabled: js.UndefOr[Boolean] = js.undefined
  
  var SourceField: js.UndefOr[FieldName] = js.undefined
}
object TextOptions {
  
  @scala.inline
  def apply(): TextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextOptions]
  }
  
  @scala.inline
  implicit class TextOptionsMutableBuilder[Self <: TextOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisScheme(value: Word): Self = StObject.set(x, "AnalysisScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalysisSchemeUndefined: Self = StObject.set(x, "AnalysisScheme", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: FieldValue): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "DefaultValue", js.undefined)
    
    @scala.inline
    def setHighlightEnabled(value: Boolean): Self = StObject.set(x, "HighlightEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightEnabledUndefined: Self = StObject.set(x, "HighlightEnabled", js.undefined)
    
    @scala.inline
    def setReturnEnabled(value: Boolean): Self = StObject.set(x, "ReturnEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnEnabledUndefined: Self = StObject.set(x, "ReturnEnabled", js.undefined)
    
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
