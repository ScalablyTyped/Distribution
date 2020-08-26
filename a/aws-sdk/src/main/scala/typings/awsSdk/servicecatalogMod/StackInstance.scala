package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackInstance extends js.Object {
  /**
    * The name of the AWS account that the stack instance is associated with.
    */
  var Account: js.UndefOr[AccountId] = js.native
  /**
    * The name of the AWS region that the stack instance is associated with.
    */
  var Region: js.UndefOr[typings.awsSdk.servicecatalogMod.Region] = js.native
  /**
    * The status of the stack instance, in terms of its synchronization with its associated stack set.     INOPERABLE: A DeleteStackInstances operation has failed and left the stack in an unstable state. Stacks in this state are excluded from further UpdateStackSet operations. You might need to perform a DeleteStackInstances operation, with RetainStacks set to true, to delete the stack instance, and then delete the stack manually.     OUTDATED: The stack isn't currently up to date with the stack set because either the associated stack failed during a CreateStackSet or UpdateStackSet operation, or the stack was part of a CreateStackSet or UpdateStackSet operation that failed or was stopped before the stack was created or updated.    CURRENT: The stack is currently up to date with the stack set.  
    */
  var StackInstanceStatus: js.UndefOr[typings.awsSdk.servicecatalogMod.StackInstanceStatus] = js.native
}

object StackInstance {
  @scala.inline
  def apply(): StackInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackInstance]
  }
  @scala.inline
  implicit class StackInstanceOps[Self <: StackInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccount(value: AccountId): Self = this.set("Account", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount: Self = this.set("Account", js.undefined)
    @scala.inline
    def setRegion(value: Region): Self = this.set("Region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
    @scala.inline
    def setStackInstanceStatus(value: StackInstanceStatus): Self = this.set("StackInstanceStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackInstanceStatus: Self = this.set("StackInstanceStatus", js.undefined)
  }
  
}

