package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityConfigurationSummary extends js.Object {
  
  /**
    * The date and time the security configuration was created.
    */
  var CreationDateTime: js.UndefOr[Date] = js.native
  
  /**
    * The name of the security configuration.
    */
  var Name: js.UndefOr[XmlString] = js.native
}
object SecurityConfigurationSummary {
  
  @scala.inline
  def apply(): SecurityConfigurationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityConfigurationSummary]
  }
  
  @scala.inline
  implicit class SecurityConfigurationSummaryOps[Self <: SecurityConfigurationSummary] (val x: Self) extends AnyVal {
    
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
    def setCreationDateTime(value: Date): Self = this.set("CreationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDateTime: Self = this.set("CreationDateTime", js.undefined)
    
    @scala.inline
    def setName(value: XmlString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
