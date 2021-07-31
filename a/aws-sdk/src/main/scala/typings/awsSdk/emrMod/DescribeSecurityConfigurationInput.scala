package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSecurityConfigurationInput extends StObject {
  
  /**
    * The name of the security configuration.
    */
  var Name: XmlString
}
object DescribeSecurityConfigurationInput {
  
  @scala.inline
  def apply(Name: XmlString): DescribeSecurityConfigurationInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSecurityConfigurationInput]
  }
  
  @scala.inline
  implicit class DescribeSecurityConfigurationInputMutableBuilder[Self <: DescribeSecurityConfigurationInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: XmlString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
