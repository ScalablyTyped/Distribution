package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecimalParameter extends StObject {
  
  /**
    * A display name for the decimal parameter.
    */
  var Name: NonEmptyString = js.native
  
  /**
    * The values for the decimal parameter.
    */
  var Values: DoubleList = js.native
}
object DecimalParameter {
  
  @scala.inline
  def apply(Name: NonEmptyString, Values: DoubleList): DecimalParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecimalParameter]
  }
  
  @scala.inline
  implicit class DecimalParameterMutableBuilder[Self <: DecimalParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: DoubleList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: Double*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
