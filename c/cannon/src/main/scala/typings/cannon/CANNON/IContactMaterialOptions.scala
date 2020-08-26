package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContactMaterialOptions extends js.Object {
  var contactEquationRelaxation: js.UndefOr[Double] = js.native
  var contactEquationStiffness: js.UndefOr[Double] = js.native
  var friction: js.UndefOr[Double] = js.native
  var frictionEquationRelaxation: js.UndefOr[Double] = js.native
  var frictionEquationStiffness: js.UndefOr[Double] = js.native
  var restitution: js.UndefOr[Double] = js.native
}

object IContactMaterialOptions {
  @scala.inline
  def apply(): IContactMaterialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContactMaterialOptions]
  }
  @scala.inline
  implicit class IContactMaterialOptionsOps[Self <: IContactMaterialOptions] (val x: Self) extends AnyVal {
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
    def setContactEquationRelaxation(value: Double): Self = this.set("contactEquationRelaxation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactEquationRelaxation: Self = this.set("contactEquationRelaxation", js.undefined)
    @scala.inline
    def setContactEquationStiffness(value: Double): Self = this.set("contactEquationStiffness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactEquationStiffness: Self = this.set("contactEquationStiffness", js.undefined)
    @scala.inline
    def setFriction(value: Double): Self = this.set("friction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFriction: Self = this.set("friction", js.undefined)
    @scala.inline
    def setFrictionEquationRelaxation(value: Double): Self = this.set("frictionEquationRelaxation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrictionEquationRelaxation: Self = this.set("frictionEquationRelaxation", js.undefined)
    @scala.inline
    def setFrictionEquationStiffness(value: Double): Self = this.set("frictionEquationStiffness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrictionEquationStiffness: Self = this.set("frictionEquationStiffness", js.undefined)
    @scala.inline
    def setRestitution(value: Double): Self = this.set("restitution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestitution: Self = this.set("restitution", js.undefined)
  }
  
}

