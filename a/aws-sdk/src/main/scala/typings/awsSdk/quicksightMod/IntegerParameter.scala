package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegerParameter extends StObject {
  
  /**
    * The name of the integer parameter.
    */
  var Name: NonEmptyString = js.native
  
  /**
    * The values for the integer parameter.
    */
  var Values: LongList = js.native
}
object IntegerParameter {
  
  @scala.inline
  def apply(Name: NonEmptyString, Values: LongList): IntegerParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerParameter]
  }
  
  @scala.inline
  implicit class IntegerParameterMutableBuilder[Self <: IntegerParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: LongList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: Long_ *): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
