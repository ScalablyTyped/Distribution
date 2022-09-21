package typings.devextremeB5DqTZzf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlternateDataFields extends StObject {
  
  var alternateDataFields: js.UndefOr[Boolean] = js.undefined
  
  var customizeChart: js.UndefOr[js.Function] = js.undefined
  
  var customizeSeries: js.UndefOr[js.Function] = js.undefined
  
  var dataFieldsDisplayMode: js.UndefOr[String] = js.undefined
  
  var inverted: js.UndefOr[Boolean] = js.undefined
  
  var processCell: js.UndefOr[js.Function] = js.undefined
  
  var putDataFieldsInto: js.UndefOr[String] = js.undefined
}
object AlternateDataFields {
  
  inline def apply(): AlternateDataFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlternateDataFields]
  }
  
  extension [Self <: AlternateDataFields](x: Self) {
    
    inline def setAlternateDataFields(value: Boolean): Self = StObject.set(x, "alternateDataFields", value.asInstanceOf[js.Any])
    
    inline def setAlternateDataFieldsUndefined: Self = StObject.set(x, "alternateDataFields", js.undefined)
    
    inline def setCustomizeChart(value: js.Function): Self = StObject.set(x, "customizeChart", value.asInstanceOf[js.Any])
    
    inline def setCustomizeChartUndefined: Self = StObject.set(x, "customizeChart", js.undefined)
    
    inline def setCustomizeSeries(value: js.Function): Self = StObject.set(x, "customizeSeries", value.asInstanceOf[js.Any])
    
    inline def setCustomizeSeriesUndefined: Self = StObject.set(x, "customizeSeries", js.undefined)
    
    inline def setDataFieldsDisplayMode(value: String): Self = StObject.set(x, "dataFieldsDisplayMode", value.asInstanceOf[js.Any])
    
    inline def setDataFieldsDisplayModeUndefined: Self = StObject.set(x, "dataFieldsDisplayMode", js.undefined)
    
    inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
    
    inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
    
    inline def setProcessCell(value: js.Function): Self = StObject.set(x, "processCell", value.asInstanceOf[js.Any])
    
    inline def setProcessCellUndefined: Self = StObject.set(x, "processCell", js.undefined)
    
    inline def setPutDataFieldsInto(value: String): Self = StObject.set(x, "putDataFieldsInto", value.asInstanceOf[js.Any])
    
    inline def setPutDataFieldsIntoUndefined: Self = StObject.set(x, "putDataFieldsInto", js.undefined)
  }
}
