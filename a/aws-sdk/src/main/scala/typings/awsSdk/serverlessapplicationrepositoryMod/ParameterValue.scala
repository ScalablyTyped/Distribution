package typings.awsSdk.serverlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterValue extends StObject {
  
  /**
    * The key associated with the parameter. If you don't specify a key and value for a particular parameter, AWS CloudFormation
    uses the default value that is specified in your template.
    */
  var Name: string
  
  /**
    * The input value associated with the parameter.
    */
  var Value: string
}
object ParameterValue {
  
  @scala.inline
  def apply(Name: string, Value: string): ParameterValue = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterValue]
  }
  
  @scala.inline
  implicit class ParameterValueMutableBuilder[Self <: ParameterValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: string): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
