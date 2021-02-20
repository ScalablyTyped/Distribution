package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStackInstanceInput extends StObject {
  
  /**
    * The ID of an AWS account that's associated with this stack instance.
    */
  var StackInstanceAccount: Account = js.native
  
  /**
    * The name of a Region that's associated with this stack instance.
    */
  var StackInstanceRegion: Region = js.native
  
  /**
    * The name or the unique stack ID of the stack set that you want to get stack instance information for.
    */
  var StackSetName: typings.awsSdk.cloudformationMod.StackSetName = js.native
}
object DescribeStackInstanceInput {
  
  @scala.inline
  def apply(StackInstanceAccount: Account, StackInstanceRegion: Region, StackSetName: StackSetName): DescribeStackInstanceInput = {
    val __obj = js.Dynamic.literal(StackInstanceAccount = StackInstanceAccount.asInstanceOf[js.Any], StackInstanceRegion = StackInstanceRegion.asInstanceOf[js.Any], StackSetName = StackSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStackInstanceInput]
  }
  
  @scala.inline
  implicit class DescribeStackInstanceInputMutableBuilder[Self <: DescribeStackInstanceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackInstanceAccount(value: Account): Self = StObject.set(x, "StackInstanceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackInstanceRegion(value: Region): Self = StObject.set(x, "StackInstanceRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackSetName(value: StackSetName): Self = StObject.set(x, "StackSetName", value.asInstanceOf[js.Any])
  }
}
