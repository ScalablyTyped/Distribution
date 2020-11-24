package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderStyle extends js.Object {
  
  /**
    * The option to enable display of borders for visuals.
    */
  var Show: js.UndefOr[scala.Boolean] = js.native
}
object BorderStyle {
  
  @scala.inline
  def apply(): BorderStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderStyle]
  }
  
  @scala.inline
  implicit class BorderStyleOps[Self <: BorderStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setShow(value: scala.Boolean): Self = this.set("Show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("Show", js.undefined)
  }
}
