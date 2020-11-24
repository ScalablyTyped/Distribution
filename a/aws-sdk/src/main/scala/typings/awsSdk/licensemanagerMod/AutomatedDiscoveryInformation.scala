package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutomatedDiscoveryInformation extends js.Object {
  
  /**
    * Time that automated discovery last ran.
    */
  var LastRunTime: js.UndefOr[DateTime] = js.native
}
object AutomatedDiscoveryInformation {
  
  @scala.inline
  def apply(): AutomatedDiscoveryInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomatedDiscoveryInformation]
  }
  
  @scala.inline
  implicit class AutomatedDiscoveryInformationOps[Self <: AutomatedDiscoveryInformation] (val x: Self) extends AnyVal {
    
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
    def setLastRunTime(value: DateTime): Self = this.set("LastRunTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastRunTime: Self = this.set("LastRunTime", js.undefined)
  }
}
