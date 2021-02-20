package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MathActivity extends StObject {
  
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
  implicit class MathActivityMutableBuilder[Self <: MathActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: AttributeName): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMath(value: MathExpression): Self = StObject.set(x, "math", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ActivityName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: ActivityName): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
