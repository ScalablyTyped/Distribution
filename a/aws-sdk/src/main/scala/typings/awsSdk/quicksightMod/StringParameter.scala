package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringParameter extends StObject {
  
  /**
    * A display name for a string parameter.
    */
  var Name: NonEmptyString = js.native
  
  /**
    * The values of a string parameter.
    */
  var Values: StringList = js.native
}
object StringParameter {
  
  @scala.inline
  def apply(Name: NonEmptyString, Values: StringList): StringParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringParameter]
  }
  
  @scala.inline
  implicit class StringParameterMutableBuilder[Self <: StringParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: StringList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
