package typings.blueprintjsCore.domUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IThrottledReactEventOptions extends js.Object {
  
  var preventDefault: js.UndefOr[Boolean] = js.native
}
object IThrottledReactEventOptions {
  
  @scala.inline
  def apply(): IThrottledReactEventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IThrottledReactEventOptions]
  }
  
  @scala.inline
  implicit class IThrottledReactEventOptionsOps[Self <: IThrottledReactEventOptions] (val x: Self) extends AnyVal {
    
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
    def setPreventDefault(value: Boolean): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventDefault: Self = this.set("preventDefault", js.undefined)
  }
}
