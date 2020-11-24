package typings.cliTable2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<cli-table2.cli-table2.CharName, string>> */
@js.native
trait PartialRecordCharNamestri extends js.Object {
  
  var bottom: js.UndefOr[String] = js.native
  
  var `bottom-left`: js.UndefOr[String] = js.native
  
  var `bottom-mid`: js.UndefOr[String] = js.native
  
  var `bottom-right`: js.UndefOr[String] = js.native
  
  var left: js.UndefOr[String] = js.native
  
  var `left-mid`: js.UndefOr[String] = js.native
  
  var mid: js.UndefOr[String] = js.native
  
  var `mid-mid`: js.UndefOr[String] = js.native
  
  var middle: js.UndefOr[String] = js.native
  
  var right: js.UndefOr[String] = js.native
  
  var `right-mid`: js.UndefOr[String] = js.native
  
  var top: js.UndefOr[String] = js.native
  
  var `top-left`: js.UndefOr[String] = js.native
  
  var `top-mid`: js.UndefOr[String] = js.native
  
  var `top-right`: js.UndefOr[String] = js.native
}
object PartialRecordCharNamestri {
  
  @scala.inline
  def apply(): PartialRecordCharNamestri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordCharNamestri]
  }
  
  @scala.inline
  implicit class PartialRecordCharNamestriOps[Self <: PartialRecordCharNamestri] (val x: Self) extends AnyVal {
    
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
    def setBottom(value: String): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def `setBottom-left`(value: String): Self = this.set("bottom-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBottom-left`: Self = this.set("bottom-left", js.undefined)
    
    @scala.inline
    def `setBottom-mid`(value: String): Self = this.set("bottom-mid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBottom-mid`: Self = this.set("bottom-mid", js.undefined)
    
    @scala.inline
    def `setBottom-right`(value: String): Self = this.set("bottom-right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBottom-right`: Self = this.set("bottom-right", js.undefined)
    
    @scala.inline
    def setLeft(value: String): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def `setLeft-mid`(value: String): Self = this.set("left-mid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLeft-mid`: Self = this.set("left-mid", js.undefined)
    
    @scala.inline
    def setMid(value: String): Self = this.set("mid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMid: Self = this.set("mid", js.undefined)
    
    @scala.inline
    def `setMid-mid`(value: String): Self = this.set("mid-mid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMid-mid`: Self = this.set("mid-mid", js.undefined)
    
    @scala.inline
    def setMiddle(value: String): Self = this.set("middle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMiddle: Self = this.set("middle", js.undefined)
    
    @scala.inline
    def setRight(value: String): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def `setRight-mid`(value: String): Self = this.set("right-mid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteRight-mid`: Self = this.set("right-mid", js.undefined)
    
    @scala.inline
    def setTop(value: String): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
    @scala.inline
    def `setTop-left`(value: String): Self = this.set("top-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTop-left`: Self = this.set("top-left", js.undefined)
    
    @scala.inline
    def `setTop-mid`(value: String): Self = this.set("top-mid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTop-mid`: Self = this.set("top-mid", js.undefined)
    
    @scala.inline
    def `setTop-right`(value: String): Self = this.set("top-right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTop-right`: Self = this.set("top-right", js.undefined)
  }
}
