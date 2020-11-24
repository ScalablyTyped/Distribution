package typings.branchSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Makenewlink extends js.Object {
  
  var make_new_link: js.UndefOr[Boolean] = js.native
}
object Makenewlink {
  
  @scala.inline
  def apply(): Makenewlink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Makenewlink]
  }
  
  @scala.inline
  implicit class MakenewlinkOps[Self <: Makenewlink] (val x: Self) extends AnyVal {
    
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
    def setMake_new_link(value: Boolean): Self = this.set("make_new_link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMake_new_link: Self = this.set("make_new_link", js.undefined)
  }
}
