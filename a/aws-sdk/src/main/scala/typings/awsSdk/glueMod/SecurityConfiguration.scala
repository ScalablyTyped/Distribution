package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityConfiguration extends js.Object {
  
  /**
    * The time at which this security configuration was created.
    */
  var CreatedTimeStamp: js.UndefOr[TimestampValue] = js.native
  
  /**
    * The encryption configuration associated with this security configuration.
    */
  var EncryptionConfiguration: js.UndefOr[typings.awsSdk.glueMod.EncryptionConfiguration] = js.native
  
  /**
    * The name of the security configuration.
    */
  var Name: js.UndefOr[NameString] = js.native
}
object SecurityConfiguration {
  
  @scala.inline
  def apply(): SecurityConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityConfiguration]
  }
  
  @scala.inline
  implicit class SecurityConfigurationOps[Self <: SecurityConfiguration] (val x: Self) extends AnyVal {
    
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
    def setCreatedTimeStamp(value: TimestampValue): Self = this.set("CreatedTimeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTimeStamp: Self = this.set("CreatedTimeStamp", js.undefined)
    
    @scala.inline
    def setEncryptionConfiguration(value: EncryptionConfiguration): Self = this.set("EncryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionConfiguration: Self = this.set("EncryptionConfiguration", js.undefined)
    
    @scala.inline
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
