package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityConfigurationSummary extends StObject {
  
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
  implicit class SecurityConfigurationSummaryMutableBuilder[Self <: SecurityConfigurationSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDateTime(value: Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
    
    @scala.inline
    def setName(value: XmlString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
