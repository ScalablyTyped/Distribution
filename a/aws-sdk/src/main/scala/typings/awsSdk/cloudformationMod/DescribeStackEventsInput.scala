package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStackEventsInput extends StObject {
  
  /**
    * A string that identifies the next page of events that you want to retrieve.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.undefined
  
  /**
    * The name or the unique stack ID that is associated with the stack, which are not always interchangeable:   Running stacks: You can specify either the stack's name or its unique stack ID.   Deleted stacks: You must specify the unique stack ID.   Default: There is no default value.
    */
  var StackName: js.UndefOr[typings.awsSdk.cloudformationMod.StackName] = js.undefined
}
object DescribeStackEventsInput {
  
  @scala.inline
  def apply(): DescribeStackEventsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackEventsInput]
  }
  
  @scala.inline
  implicit class DescribeStackEventsInputMutableBuilder[Self <: DescribeStackEventsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStackName(value: StackName): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackNameUndefined: Self = StObject.set(x, "StackName", js.undefined)
  }
}
