package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStackResourceInput extends StObject {
  
  /**
    * The logical name of the resource as specified in the template. Default: There is no default value.
    */
  var LogicalResourceId: typings.awsSdk.cloudformationMod.LogicalResourceId
  
  /**
    * The name or the unique stack ID that is associated with the stack, which are not always interchangeable:   Running stacks: You can specify either the stack's name or its unique stack ID.   Deleted stacks: You must specify the unique stack ID.   Default: There is no default value.
    */
  var StackName: typings.awsSdk.cloudformationMod.StackName
}
object DescribeStackResourceInput {
  
  @scala.inline
  def apply(LogicalResourceId: LogicalResourceId, StackName: StackName): DescribeStackResourceInput = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStackResourceInput]
  }
  
  @scala.inline
  implicit class DescribeStackResourceInputMutableBuilder[Self <: DescribeStackResourceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogicalResourceId(value: LogicalResourceId): Self = StObject.set(x, "LogicalResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackName(value: StackName): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
  }
}
