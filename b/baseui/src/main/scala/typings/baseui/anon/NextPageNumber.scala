package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NextPageNumber extends js.Object {
  
  var nextPage: Double = js.native
}
object NextPageNumber {
  
  @scala.inline
  def apply(nextPage: Double): NextPageNumber = {
    val __obj = js.Dynamic.literal(nextPage = nextPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextPageNumber]
  }
  
  @scala.inline
  implicit class NextPageNumberOps[Self <: NextPageNumber] (val x: Self) extends AnyVal {
    
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
    def setNextPage(value: Double): Self = this.set("nextPage", value.asInstanceOf[js.Any])
  }
}
