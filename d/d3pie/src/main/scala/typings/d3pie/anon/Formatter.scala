package typings.d3pie.anon

import typings.d3pie.d3pie.ID3PieLabelsOptions
import typings.d3pie.d3pie.ID3PieStyleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Formatter extends js.Object {
  
  var formatter: js.UndefOr[js.Function1[/* context */ Section, String]] = js.native
  
  var inner: js.UndefOr[ID3PieLabelsOptions] = js.native
  
  var lines: js.UndefOr[Enabled] = js.native
  
  var mainLabel: js.UndefOr[ID3PieStyleOptions] = js.native
  
  var outer: js.UndefOr[pieDistancenumberundefine] = js.native
  
  var percentage: js.UndefOr[decimalPlacesnumberundefi] = js.native
  
  var truncation: js.UndefOr[TruncateLength] = js.native
  
  var value: js.UndefOr[ID3PieStyleOptions] = js.native
}
object Formatter {
  
  @scala.inline
  def apply(): Formatter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Formatter]
  }
  
  @scala.inline
  implicit class FormatterOps[Self <: Formatter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFormatter(value: /* context */ Section => String): Self = this.set("formatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setInner(value: ID3PieLabelsOptions): Self = this.set("inner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInner: Self = this.set("inner", js.undefined)
    
    @scala.inline
    def setLines(value: Enabled): Self = this.set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLines: Self = this.set("lines", js.undefined)
    
    @scala.inline
    def setMainLabel(value: ID3PieStyleOptions): Self = this.set("mainLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainLabel: Self = this.set("mainLabel", js.undefined)
    
    @scala.inline
    def setOuter(value: pieDistancenumberundefine): Self = this.set("outer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuter: Self = this.set("outer", js.undefined)
    
    @scala.inline
    def setPercentage(value: decimalPlacesnumberundefi): Self = this.set("percentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentage: Self = this.set("percentage", js.undefined)
    
    @scala.inline
    def setTruncation(value: TruncateLength): Self = this.set("truncation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruncation: Self = this.set("truncation", js.undefined)
    
    @scala.inline
    def setValue(value: ID3PieStyleOptions): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
