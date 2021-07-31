package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSecurityConfigurationOutput extends StObject {
  
  /**
    * The date and time the security configuration was created.
    */
  var CreationDateTime: Date
  
  /**
    * The name of the security configuration.
    */
  var Name: XmlString
}
object CreateSecurityConfigurationOutput {
  
  @scala.inline
  def apply(CreationDateTime: Date, Name: XmlString): CreateSecurityConfigurationOutput = {
    val __obj = js.Dynamic.literal(CreationDateTime = CreationDateTime.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSecurityConfigurationOutput]
  }
  
  @scala.inline
  implicit class CreateSecurityConfigurationOutputMutableBuilder[Self <: CreateSecurityConfigurationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDateTime(value: Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: XmlString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
