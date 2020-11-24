package typings.bootstrapGrowlIfightcrime.BootstrapGrowlIfightcrime

import typings.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * 'left', 'right', or 'center'
    */
  var align: js.UndefOr[AlignType] = js.native
  
  /**
    *  If true then will display a cross to close the popup.
    */
  var allow_dismiss: js.UndefOr[Boolean] = js.native
  
  /**
    * Time while the message will be displayed. It's not equivalent to the *demo* timeOut!
    */
  var delay: js.UndefOr[Double] = js.native
  
  /**
    * Which element to append to
    */
  var ele: js.UndefOr[String] = js.native
  
  /**
    * Offset Options
    */
  var offset: js.UndefOr[OffsetOption] = js.native
  
  /**
    * Spacing between consecutively stacked growls.
    */
  var stackup_spacing: js.UndefOr[Double] = js.native
  
  /**
    * Values of (null, 'info', 'danger', 'success', 'warning') or another value
    */
  var `type`: js.UndefOr[AlertType] = js.native
  
  /**
    * Integer or 'auto'
    */
  var width: js.UndefOr[Double | auto] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: AlignType): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setAllow_dismiss(value: Boolean): Self = this.set("allow_dismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_dismiss: Self = this.set("allow_dismiss", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setEle(value: String): Self = this.set("ele", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEle: Self = this.set("ele", js.undefined)
    
    @scala.inline
    def setOffset(value: OffsetOption): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setStackup_spacing(value: Double): Self = this.set("stackup_spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackup_spacing: Self = this.set("stackup_spacing", js.undefined)
    
    @scala.inline
    def setType(value: AlertType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
    
    @scala.inline
    def setWidth(value: Double | auto): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
