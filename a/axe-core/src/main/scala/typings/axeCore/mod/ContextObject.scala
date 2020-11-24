package typings.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextObject extends js.Object {
  
  var exclude: js.UndefOr[js.Array[js.Array[String] | String]] = js.native
  
  var include: js.UndefOr[js.Array[js.Array[String] | String]] = js.native
}
object ContextObject {
  
  @scala.inline
  def apply(): ContextObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextObject]
  }
  
  @scala.inline
  implicit class ContextObjectOps[Self <: ContextObject] (val x: Self) extends AnyVal {
    
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
    def setExcludeVarargs(value: (js.Array[String] | String)*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: js.Array[js.Array[String] | String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: (js.Array[String] | String)*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: js.Array[js.Array[String] | String]): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
  }
}
