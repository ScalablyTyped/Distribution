package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStackSetOutput extends StObject {
  
  /**
    * The specified stack set.
    */
  var StackSet: js.UndefOr[typings.awsSdk.cloudformationMod.StackSet] = js.native
}
object DescribeStackSetOutput {
  
  @scala.inline
  def apply(): DescribeStackSetOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackSetOutput]
  }
  
  @scala.inline
  implicit class DescribeStackSetOutputMutableBuilder[Self <: DescribeStackSetOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackSet(value: StackSet): Self = StObject.set(x, "StackSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackSetUndefined: Self = StObject.set(x, "StackSet", js.undefined)
  }
}
