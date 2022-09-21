package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSecurityConfigurationOutput extends StObject {
  
  /**
    * The date and time the security configuration was created
    */
  var CreationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the security configuration.
    */
  var Name: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The security configuration details in JSON format.
    */
  var SecurityConfiguration: js.UndefOr[String] = js.undefined
}
object DescribeSecurityConfigurationOutput {
  
  inline def apply(): DescribeSecurityConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSecurityConfigurationOutput]
  }
  
  extension [Self <: DescribeSecurityConfigurationOutput](x: Self) {
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
    
    inline def setName(value: XmlString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSecurityConfiguration(value: String): Self = StObject.set(x, "SecurityConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSecurityConfigurationUndefined: Self = StObject.set(x, "SecurityConfiguration", js.undefined)
  }
}
