package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityConfiguration extends StObject {
  
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
  implicit class SecurityConfigurationMutableBuilder[Self <: SecurityConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedTimeStamp(value: TimestampValue): Self = StObject.set(x, "CreatedTimeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeStampUndefined: Self = StObject.set(x, "CreatedTimeStamp", js.undefined)
    
    @scala.inline
    def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "EncryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionConfigurationUndefined: Self = StObject.set(x, "EncryptionConfiguration", js.undefined)
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
