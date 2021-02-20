package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecoveryOptionType extends StObject {
  
  /**
    * Specifies the recovery method for a user.
    */
  var Name: RecoveryOptionNameType = js.native
  
  /**
    * A positive integer specifying priority of a method with 1 being the highest priority.
    */
  var Priority: PriorityType = js.native
}
object RecoveryOptionType {
  
  @scala.inline
  def apply(Name: RecoveryOptionNameType, Priority: PriorityType): RecoveryOptionType = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecoveryOptionType]
  }
  
  @scala.inline
  implicit class RecoveryOptionTypeMutableBuilder[Self <: RecoveryOptionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: RecoveryOptionNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: PriorityType): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
  }
}
