package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStacksRequest extends StObject {
  
  /**
    * An array of stack IDs that specify the stacks to be described. If you omit this parameter, DescribeStacks returns a description of every stack.
    */
  var StackIds: js.UndefOr[Strings] = js.native
}
object DescribeStacksRequest {
  
  @scala.inline
  def apply(): DescribeStacksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStacksRequest]
  }
  
  @scala.inline
  implicit class DescribeStacksRequestMutableBuilder[Self <: DescribeStacksRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackIds(value: Strings): Self = StObject.set(x, "StackIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdsUndefined: Self = StObject.set(x, "StackIds", js.undefined)
    
    @scala.inline
    def setStackIdsVarargs(value: String*): Self = StObject.set(x, "StackIds", js.Array(value :_*))
  }
}
