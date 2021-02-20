package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateStackSetOutput extends StObject {
  
  /**
    * The ID of the stack set that you're creating.
    */
  var StackSetId: js.UndefOr[typings.awsSdk.cloudformationMod.StackSetId] = js.native
}
object CreateStackSetOutput {
  
  @scala.inline
  def apply(): CreateStackSetOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStackSetOutput]
  }
  
  @scala.inline
  implicit class CreateStackSetOutputMutableBuilder[Self <: CreateStackSetOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackSetId(value: StackSetId): Self = StObject.set(x, "StackSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackSetIdUndefined: Self = StObject.set(x, "StackSetId", js.undefined)
  }
}
