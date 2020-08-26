package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestRepositoryTriggersInput extends js.Object {
  /**
    * The name of the repository in which to test the triggers.
    */
  var repositoryName: RepositoryName = js.native
  /**
    * The list of triggers to test.
    */
  var triggers: RepositoryTriggersList = js.native
}

object TestRepositoryTriggersInput {
  @scala.inline
  def apply(repositoryName: RepositoryName, triggers: RepositoryTriggersList): TestRepositoryTriggersInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRepositoryTriggersInput]
  }
  @scala.inline
  implicit class TestRepositoryTriggersInputOps[Self <: TestRepositoryTriggersInput] (val x: Self) extends AnyVal {
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
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggersVarargs(value: RepositoryTrigger*): Self = this.set("triggers", js.Array(value :_*))
    @scala.inline
    def setTriggers(value: RepositoryTriggersList): Self = this.set("triggers", value.asInstanceOf[js.Any])
  }
  
}

