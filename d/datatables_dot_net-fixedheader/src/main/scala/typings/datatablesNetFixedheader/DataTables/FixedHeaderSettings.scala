package typings.datatablesNetFixedheader.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * FixedHeader extension options
  */
@js.native
trait FixedHeaderSettings extends js.Object {
  
  /*
    * Enable / disable fixed footer
    */
  var footer: js.UndefOr[Boolean] = js.native
  
  /*
    * Offset the table's fixed footer
    */
  var footerOffset: js.UndefOr[Double] = js.native
  
  /*
    * Enable / disable fixed header
    */
  var header: js.UndefOr[Boolean] = js.native
  
  /*
    * Offset the table's fixed header
    */
  var headerOffset: js.UndefOr[Double] = js.native
}
object FixedHeaderSettings {
  
  @scala.inline
  def apply(): FixedHeaderSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FixedHeaderSettings]
  }
  
  @scala.inline
  implicit class FixedHeaderSettingsOps[Self <: FixedHeaderSettings] (val x: Self) extends AnyVal {
    
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
    def setFooter(value: Boolean): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setFooterOffset(value: Double): Self = this.set("footerOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterOffset: Self = this.set("footerOffset", js.undefined)
    
    @scala.inline
    def setHeader(value: Boolean): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setHeaderOffset(value: Double): Self = this.set("headerOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderOffset: Self = this.set("headerOffset", js.undefined)
  }
}
