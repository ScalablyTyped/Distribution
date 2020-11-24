package typings.bluebirdLst.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FromNodeOptions extends js.Object {
  
  var multiArgs: js.UndefOr[Boolean] = js.native
}
object FromNodeOptions {
  
  @scala.inline
  def apply(): FromNodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FromNodeOptions]
  }
  
  @scala.inline
  implicit class FromNodeOptionsOps[Self <: FromNodeOptions] (val x: Self) extends AnyVal {
    
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
    def setMultiArgs(value: Boolean): Self = this.set("multiArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiArgs: Self = this.set("multiArgs", js.undefined)
  }
}
