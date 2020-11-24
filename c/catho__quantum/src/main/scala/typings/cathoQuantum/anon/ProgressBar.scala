package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressBar extends js.Object {
  
  var progressBar: js.UndefOr[js.Object] = js.native
}
object ProgressBar {
  
  @scala.inline
  def apply(): ProgressBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBar]
  }
  
  @scala.inline
  implicit class ProgressBarOps[Self <: ProgressBar] (val x: Self) extends AnyVal {
    
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
    def setProgressBar(value: js.Object): Self = this.set("progressBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressBar: Self = this.set("progressBar", js.undefined)
  }
}
