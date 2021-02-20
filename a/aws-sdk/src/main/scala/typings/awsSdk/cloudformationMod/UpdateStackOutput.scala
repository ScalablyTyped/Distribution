package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateStackOutput extends StObject {
  
  /**
    * Unique identifier of the stack.
    */
  var StackId: js.UndefOr[typings.awsSdk.cloudformationMod.StackId] = js.native
}
object UpdateStackOutput {
  
  @scala.inline
  def apply(): UpdateStackOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateStackOutput]
  }
  
  @scala.inline
  implicit class UpdateStackOutputMutableBuilder[Self <: UpdateStackOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackId(value: StackId): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
