package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChangeSetsInput extends StObject {
  
  /**
    * A string (provided by the ListChangeSets response output) that identifies the next page of change sets that you want to retrieve.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.undefined
  
  /**
    * The name or the Amazon Resource Name (ARN) of the stack for which you want to list change sets.
    */
  var StackName: StackNameOrId
}
object ListChangeSetsInput {
  
  @scala.inline
  def apply(StackName: StackNameOrId): ListChangeSetsInput = {
    val __obj = js.Dynamic.literal(StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChangeSetsInput]
  }
  
  @scala.inline
  implicit class ListChangeSetsInputMutableBuilder[Self <: ListChangeSetsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStackName(value: StackNameOrId): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
  }
}
