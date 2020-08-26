package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StageDeclaration extends js.Object {
  /**
    * The actions included in a stage.
    */
  var actions: StageActionDeclarationList = js.native
  /**
    * Reserved for future use.
    */
  var blockers: js.UndefOr[StageBlockerDeclarationList] = js.native
  /**
    * The name of the stage.
    */
  var name: StageName = js.native
}

object StageDeclaration {
  @scala.inline
  def apply(actions: StageActionDeclarationList, name: StageName): StageDeclaration = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StageDeclaration]
  }
  @scala.inline
  implicit class StageDeclarationOps[Self <: StageDeclaration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActionsVarargs(value: ActionDeclaration*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: StageActionDeclarationList): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: StageName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlockersVarargs(value: BlockerDeclaration*): Self = this.set("blockers", js.Array(value :_*))
    @scala.inline
    def setBlockers(value: StageBlockerDeclarationList): Self = this.set("blockers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockers: Self = this.set("blockers", js.undefined)
  }
  
}

