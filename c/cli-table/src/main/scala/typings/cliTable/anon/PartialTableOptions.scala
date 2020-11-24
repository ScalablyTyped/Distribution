package typings.cliTable.anon

import typings.cliTable.cliTableStrings.left
import typings.cliTable.cliTableStrings.middle
import typings.cliTable.cliTableStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cli-table.cli-table.TableOptions> */
@js.native
trait PartialTableOptions extends js.Object {
  
  var chars: js.UndefOr[PartialRecordtoptopmidtop] = js.native
  
  var colAligns: js.UndefOr[js.Array[left | middle | right]] = js.native
  
  var colWidths: js.UndefOr[js.Array[Double]] = js.native
  
  var colors: js.UndefOr[Boolean] = js.native
  
  var head: js.UndefOr[js.Array[String]] = js.native
  
  var style: js.UndefOr[Partialpaddingleftnumberp] = js.native
  
  var truncate: js.UndefOr[String] = js.native
}
object PartialTableOptions {
  
  @scala.inline
  def apply(): PartialTableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTableOptions]
  }
  
  @scala.inline
  implicit class PartialTableOptionsOps[Self <: PartialTableOptions] (val x: Self) extends AnyVal {
    
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
    def setChars(value: PartialRecordtoptopmidtop): Self = this.set("chars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChars: Self = this.set("chars", js.undefined)
    
    @scala.inline
    def setColAlignsVarargs(value: (left | middle | right)*): Self = this.set("colAligns", js.Array(value :_*))
    
    @scala.inline
    def setColAligns(value: js.Array[left | middle | right]): Self = this.set("colAligns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColAligns: Self = this.set("colAligns", js.undefined)
    
    @scala.inline
    def setColWidthsVarargs(value: Double*): Self = this.set("colWidths", js.Array(value :_*))
    
    @scala.inline
    def setColWidths(value: js.Array[Double]): Self = this.set("colWidths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColWidths: Self = this.set("colWidths", js.undefined)
    
    @scala.inline
    def setColors(value: Boolean): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setHeadVarargs(value: String*): Self = this.set("head", js.Array(value :_*))
    
    @scala.inline
    def setHead(value: js.Array[String]): Self = this.set("head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHead: Self = this.set("head", js.undefined)
    
    @scala.inline
    def setStyle(value: Partialpaddingleftnumberp): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTruncate(value: String): Self = this.set("truncate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruncate: Self = this.set("truncate", js.undefined)
  }
}
