package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseStarted

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Platform. */
@js.native
trait IPlatform extends js.Object {
  
  /** Platform cpu */
  var cpu: js.UndefOr[String | Null] = js.native
  
  /** Platform implementation */
  var implementation: js.UndefOr[String | Null] = js.native
  
  /** Platform os */
  var os: js.UndefOr[String | Null] = js.native
  
  /** Platform version */
  var version: js.UndefOr[String | Null] = js.native
}
object IPlatform {
  
  @scala.inline
  def apply(): IPlatform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPlatform]
  }
  
  @scala.inline
  implicit class IPlatformOps[Self <: IPlatform] (val x: Self) extends AnyVal {
    
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
    def setCpu(value: String): Self = this.set("cpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpu: Self = this.set("cpu", js.undefined)
    
    @scala.inline
    def setCpuNull: Self = this.set("cpu", null)
    
    @scala.inline
    def setImplementation(value: String): Self = this.set("implementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImplementation: Self = this.set("implementation", js.undefined)
    
    @scala.inline
    def setImplementationNull: Self = this.set("implementation", null)
    
    @scala.inline
    def setOs(value: String): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOs: Self = this.set("os", js.undefined)
    
    @scala.inline
    def setOsNull: Self = this.set("os", null)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setVersionNull: Self = this.set("version", null)
  }
}
