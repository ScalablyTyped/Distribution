package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MathActivity extends js.Object {
  
  /**
    * The name of the attribute that contains the result of the math operation.
    */
  var attribute: AttributeName = js.native
  
  /**
    * An expression that uses one or more existing attributes and must return an integer value.
    */
  var math: MathExpression = js.native
  
  /**
    * The name of the math activity.
    */
  var name: ActivityName = js.native
  
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.native
}
object MathActivity {
  
  @scala.inline
  def apply(attribute: AttributeName, math: MathExpression, name: ActivityName): MathActivity = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], math = math.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MathActivity]
  }
  
  @scala.inline
  implicit class MathActivityOps[Self <: MathActivity] (val x: Self) extends AnyVal {
    
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
    def setAttribute(value: AttributeName): Self = this.set("attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMath(value: MathExpression): Self = this.set("math", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ActivityName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: ActivityName): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
  }
}
