package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperatingSystemConfigurationManager extends js.Object {
  
  /**
    * The name of the configuration manager, which is Chef.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The versions of the configuration manager that are supported by an operating system.
    */
  var Version: js.UndefOr[String] = js.native
}
object OperatingSystemConfigurationManager {
  
  @scala.inline
  def apply(): OperatingSystemConfigurationManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperatingSystemConfigurationManager]
  }
  
  @scala.inline
  implicit class OperatingSystemConfigurationManagerOps[Self <: OperatingSystemConfigurationManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
}
