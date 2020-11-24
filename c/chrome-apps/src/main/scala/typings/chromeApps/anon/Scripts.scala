package typings.chromeApps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scripts extends js.Object {
  
  var scripts: js.UndefOr[js.Array[String]] = js.native
}
object Scripts {
  
  @scala.inline
  def apply(): Scripts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scripts]
  }
  
  @scala.inline
  implicit class ScriptsOps[Self <: Scripts] (val x: Self) extends AnyVal {
    
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
    def setScriptsVarargs(value: String*): Self = this.set("scripts", js.Array(value :_*))
    
    @scala.inline
    def setScripts(value: js.Array[String]): Self = this.set("scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScripts: Self = this.set("scripts", js.undefined)
  }
}
