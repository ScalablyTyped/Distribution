package typings.chrome.chrome.system.display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayInfoFlags extends js.Object {
  
  /**
    * If set to true, only a single DisplayUnitInfo will be returned by getInfo when in unified desktop mode.
    * @see[enableUnifiedDesktop]
    * @default false
    */
  var singleUnified: js.UndefOr[Boolean] = js.native
}
object DisplayInfoFlags {
  
  @scala.inline
  def apply(): DisplayInfoFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayInfoFlags]
  }
  
  @scala.inline
  implicit class DisplayInfoFlagsOps[Self <: DisplayInfoFlags] (val x: Self) extends AnyVal {
    
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
    def setSingleUnified(value: Boolean): Self = this.set("singleUnified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleUnified: Self = this.set("singleUnified", js.undefined)
  }
}
