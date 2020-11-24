package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditInitializeFiltering extends js.Object {
  
  var LimitResults: js.UndefOr[Double] = js.native
}
object EditInitializeFiltering {
  
  @scala.inline
  def apply(): EditInitializeFiltering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditInitializeFiltering]
  }
  
  @scala.inline
  implicit class EditInitializeFilteringOps[Self <: EditInitializeFiltering] (val x: Self) extends AnyVal {
    
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
    def setLimitResults(value: Double): Self = this.set("LimitResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitResults: Self = this.set("LimitResults", js.undefined)
  }
}
