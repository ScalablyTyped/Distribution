package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HITLayoutParameter extends StObject {
  
  /**
    *  The name of the parameter in the HITLayout. 
    */
  var Name: String = js.native
  
  /**
    * The value substituted for the parameter referenced in the HITLayout. 
    */
  var Value: String = js.native
}
object HITLayoutParameter {
  
  @scala.inline
  def apply(Name: String, Value: String): HITLayoutParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HITLayoutParameter]
  }
  
  @scala.inline
  implicit class HITLayoutParameterMutableBuilder[Self <: HITLayoutParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
