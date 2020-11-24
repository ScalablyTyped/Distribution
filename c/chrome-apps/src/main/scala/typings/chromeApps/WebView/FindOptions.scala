package typings.chromeApps.WebView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindOptions extends js.Object {
  
  /**
    * Flag to find matches in reverse order.
    * @default false
    */
  var backward: js.UndefOr[Boolean] = js.native
  
  /**
    * Flag to match with case-sensitivity.
    * @default false
    */
  var matchCase: js.UndefOr[Boolean] = js.native
}
object FindOptions {
  
  @scala.inline
  def apply(): FindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOptions]
  }
  
  @scala.inline
  implicit class FindOptionsOps[Self <: FindOptions] (val x: Self) extends AnyVal {
    
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
    def setBackward(value: Boolean): Self = this.set("backward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackward: Self = this.set("backward", js.undefined)
    
    @scala.inline
    def setMatchCase(value: Boolean): Self = this.set("matchCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchCase: Self = this.set("matchCase", js.undefined)
  }
}
