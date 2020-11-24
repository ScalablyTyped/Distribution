package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.WRITE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait READ extends js.Object {
  
  var READ: typings.chromeApps.chromeAppsStrings.READ = js.native
  
  var WRITE: typings.chromeApps.chromeAppsStrings.WRITE = js.native
}
object READ {
  
  @scala.inline
  def apply(READ: typings.chromeApps.chromeAppsStrings.READ, WRITE: WRITE): READ = {
    val __obj = js.Dynamic.literal(READ = READ.asInstanceOf[js.Any], WRITE = WRITE.asInstanceOf[js.Any])
    __obj.asInstanceOf[READ]
  }
  
  @scala.inline
  implicit class READOps[Self <: READ] (val x: Self) extends AnyVal {
    
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
    def setREAD(value: typings.chromeApps.chromeAppsStrings.READ): Self = this.set("READ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWRITE(value: WRITE): Self = this.set("WRITE", value.asInstanceOf[js.Any])
  }
}
