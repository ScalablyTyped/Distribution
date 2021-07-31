package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStackInstanceOutput extends StObject {
  
  /**
    * The stack instance that matches the specified request parameters.
    */
  var StackInstance: js.UndefOr[typings.awsSdk.cloudformationMod.StackInstance] = js.undefined
}
object DescribeStackInstanceOutput {
  
  @scala.inline
  def apply(): DescribeStackInstanceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackInstanceOutput]
  }
  
  @scala.inline
  implicit class DescribeStackInstanceOutputMutableBuilder[Self <: DescribeStackInstanceOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackInstance(value: StackInstance): Self = StObject.set(x, "StackInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackInstanceUndefined: Self = StObject.set(x, "StackInstance", js.undefined)
  }
}
