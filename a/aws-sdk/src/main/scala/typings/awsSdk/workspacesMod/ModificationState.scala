package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModificationState extends js.Object {
  /**
    * The resource.
    */
  var Resource: js.UndefOr[ModificationResourceEnum] = js.native
  /**
    * The modification state.
    */
  var State: js.UndefOr[ModificationStateEnum] = js.native
}

object ModificationState {
  @scala.inline
  def apply(): ModificationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModificationState]
  }
  @scala.inline
  implicit class ModificationStateOps[Self <: ModificationState] (val x: Self) extends AnyVal {
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
    def setResource(value: ModificationResourceEnum): Self = this.set("Resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("Resource", js.undefined)
    @scala.inline
    def setState(value: ModificationStateEnum): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
  
}

