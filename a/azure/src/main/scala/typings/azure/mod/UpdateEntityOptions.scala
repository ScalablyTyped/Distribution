package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateEntityOptions extends TimeoutIntervalOptions {
  
  var checkEtag: js.UndefOr[Boolean] = js.native
}
object UpdateEntityOptions {
  
  @scala.inline
  def apply(): UpdateEntityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEntityOptions]
  }
  
  @scala.inline
  implicit class UpdateEntityOptionsOps[Self <: UpdateEntityOptions] (val x: Self) extends AnyVal {
    
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
    def setCheckEtag(value: Boolean): Self = this.set("checkEtag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckEtag: Self = this.set("checkEtag", js.undefined)
  }
}
