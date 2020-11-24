package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipeAction extends js.Object {
  
  /**
    * The name of a valid DataBrew transformation to be performed on the data.
    */
  var Operation: typings.awsSdk.databrewMod.Operation = js.native
  
  /**
    * Contextual parameters for the transformation.
    */
  var Parameters: js.UndefOr[ParameterMap] = js.native
}
object RecipeAction {
  
  @scala.inline
  def apply(Operation: Operation): RecipeAction = {
    val __obj = js.Dynamic.literal(Operation = Operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipeAction]
  }
  
  @scala.inline
  implicit class RecipeActionOps[Self <: RecipeAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOperation(value: Operation): Self = this.set("Operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: ParameterMap): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
  }
}
