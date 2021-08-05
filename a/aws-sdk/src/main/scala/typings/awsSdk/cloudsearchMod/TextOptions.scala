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
  
  inline def apply(): TextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextOptions]
  }
  
  extension [Self <: TextOptions](x: Self) {
    
    inline def setAnalysisScheme(value: Word): Self = StObject.set(x, "AnalysisScheme", value.asInstanceOf[js.Any])
    
    inline def setAnalysisSchemeUndefined: Self = StObject.set(x, "AnalysisScheme", js.undefined)
    
    inline def setDefaultValue(value: FieldValue): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "DefaultValue", js.undefined)
    
    inline def setHighlightEnabled(value: Boolean): Self = StObject.set(x, "HighlightEnabled", value.asInstanceOf[js.Any])
    
    inline def setHighlightEnabledUndefined: Self = StObject.set(x, "HighlightEnabled", js.undefined)
    
    inline def setReturnEnabled(value: Boolean): Self = StObject.set(x, "ReturnEnabled", value.asInstanceOf[js.Any])
    
    inline def setReturnEnabledUndefined: Self = StObject.set(x, "ReturnEnabled", js.undefined)
    
    inline def setSortEnabled(value: Boolean): Self = StObject.set(x, "SortEnabled", value.asInstanceOf[js.Any])
    
    inline def setSortEnabledUndefined: Self = StObject.set(x, "SortEnabled", js.undefined)
    
    inline def setSourceField(value: FieldName): Self = StObject.set(x, "SourceField", value.asInstanceOf[js.Any])
    
    inline def setSourceFieldUndefined: Self = StObject.set(x, "SourceField", js.undefined)
  }
}
