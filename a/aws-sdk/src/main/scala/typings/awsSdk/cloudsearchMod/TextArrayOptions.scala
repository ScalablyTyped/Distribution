package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextArrayOptions extends StObject {
  
  /**
    * The name of an analysis scheme for a text-array field.
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
    * A list of source fields to map to the field. 
    */
  var SourceFields: js.UndefOr[FieldNameCommaList] = js.undefined
}
object TextArrayOptions {
  
  @scala.inline
  def apply(): TextArrayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextArrayOptions]
  }
  
  @scala.inline
  implicit class TextArrayOptionsMutableBuilder[Self <: TextArrayOptions] (val x: Self) extends AnyVal {
    
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
    def setSourceFields(value: FieldNameCommaList): Self = StObject.set(x, "SourceFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFieldsUndefined: Self = StObject.set(x, "SourceFields", js.undefined)
  }
}
