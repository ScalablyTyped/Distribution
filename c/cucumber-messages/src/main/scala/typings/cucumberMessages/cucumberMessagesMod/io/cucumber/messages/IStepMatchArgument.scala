package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a StepMatchArgument. */
@js.native
trait IStepMatchArgument extends StObject {
  
  /**
    * Represents the outermost capture group of an argument. This message closely matches the
    * `Group` class in the `cucumber-expressions` library.
    */
  var group: js.UndefOr[IGroup | Null] = js.native
  
  /** StepMatchArgument parameterTypeName */
  var parameterTypeName: js.UndefOr[String | Null] = js.native
}
object IStepMatchArgument {
  
  @scala.inline
  def apply(): IStepMatchArgument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStepMatchArgument]
  }
  
  @scala.inline
  implicit class IStepMatchArgumentMutableBuilder[Self <: IStepMatchArgument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: IGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNull: Self = StObject.set(x, "group", null)
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setParameterTypeName(value: String): Self = StObject.set(x, "parameterTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterTypeNameNull: Self = StObject.set(x, "parameterTypeName", null)
    
    @scala.inline
    def setParameterTypeNameUndefined: Self = StObject.set(x, "parameterTypeName", js.undefined)
  }
}
