package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackInstanceInput extends js.Object {
  /**
    * The ID of an AWS account that's associated with this stack instance.
    */
  var StackInstanceAccount: Account = js.native
  /**
    * The name of a region that's associated with this stack instance.
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
}

