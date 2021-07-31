package typings.d3pie.anon

import typings.d3pie.d3pie.ID3PieLabelsOptions
import typings.d3pie.d3pie.ID3PieStyleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Formatter extends StObject {
  
  var formatter: js.UndefOr[js.Function1[/* context */ Section, String]] = js.undefined
  
  var inner: js.UndefOr[ID3PieLabelsOptions] = js.undefined
  
  var lines: js.UndefOr[Enabled] = js.undefined
  
  var mainLabel: js.UndefOr[ID3PieStyleOptions] = js.undefined
  
  var outer: js.UndefOr[pieDistancenumberundefine] = js.undefined
  
  var percentage: js.UndefOr[decimalPlacesnumberundefi] = js.undefined
  
  var truncation: js.UndefOr[TruncateLength] = js.undefined
  
  var value: js.UndefOr[ID3PieStyleOptions] = js.undefined
}
object Formatter {
  
  @scala.inline
  def apply(): Formatter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Formatter]
  }
  
  @scala.inline
  implicit class FormatterMutableBuilder[Self <: Formatter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormatter(value: /* context */ Section => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setInner(value: ID3PieLabelsOptions): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerUndefined: Self = StObject.set(x, "inner", js.undefined)
    
    @scala.inline
    def setLines(value: Enabled): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    @scala.inline
    def setMainLabel(value: ID3PieStyleOptions): Self = StObject.set(x, "mainLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainLabelUndefined: Self = StObject.set(x, "mainLabel", js.undefined)
    
    @scala.inline
    def setOuter(value: pieDistancenumberundefine): Self = StObject.set(x, "outer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterUndefined: Self = StObject.set(x, "outer", js.undefined)
    
    @scala.inline
    def setPercentage(value: decimalPlacesnumberundefi): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
    
    @scala.inline
    def setTruncation(value: TruncateLength): Self = StObject.set(x, "truncation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruncationUndefined: Self = StObject.set(x, "truncation", js.undefined)
    
    @scala.inline
    def setValue(value: ID3PieStyleOptions): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
