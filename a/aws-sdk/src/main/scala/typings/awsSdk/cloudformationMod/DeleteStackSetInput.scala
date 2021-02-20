package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteStackSetInput extends StObject {
  
  /**
    * The name or unique ID of the stack set that you're deleting. You can obtain this value by running ListStackSets.
    */
  var StackSetName: typings.awsSdk.cloudformationMod.StackSetName = js.native
}
object DeleteStackSetInput {
  
  @scala.inline
  def apply(StackSetName: StackSetName): DeleteStackSetInput = {
    val __obj = js.Dynamic.literal(StackSetName = StackSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStackSetInput]
  }
  
  @scala.inline
  implicit class DeleteStackSetInputMutableBuilder[Self <: DeleteStackSetInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackSetName(value: StackSetName): Self = StObject.set(x, "StackSetName", value.asInstanceOf[js.Any])
  }
}
