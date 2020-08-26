package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAssociationResult extends js.Object {
  /**
    * Information about the association.
    */
  var AssociationDescription: js.UndefOr[typings.awsSdk.ssmMod.AssociationDescription] = js.native
}

object CreateAssociationResult {
  @scala.inline
  def apply(): CreateAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAssociationResult]
  }
  @scala.inline
  implicit class CreateAssociationResultOps[Self <: CreateAssociationResult] (val x: Self) extends AnyVal {
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
    def setAssociationDescription(value: AssociationDescription): Self = this.set("AssociationDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociationDescription: Self = this.set("AssociationDescription", js.undefined)
  }
  
}

