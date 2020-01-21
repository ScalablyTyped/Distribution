package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContainerPolicyInput extends js.Object {
  /**
    * The name of the container. 
    */
  var ContainerName: typings.awsSdk.mediastoreMod.ContainerName = js.native
}

object GetContainerPolicyInput {
  @scala.inline
  def apply(ContainerName: ContainerName): GetContainerPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetContainerPolicyInput]
  }
}

