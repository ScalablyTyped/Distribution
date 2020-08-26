package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactMaterial extends js.Object {
  var contactEquationRelaxation: Double = js.native
  var contactEquationStiffness: Double = js.native
  var friction: Double = js.native
  var frictionEquationRelaxation: Double = js.native
  var frictionEquationStiffness: Double = js.native
  var id: Double = js.native
  var materials: js.Array[Material] = js.native
  var restitution: Double = js.native
}

object ContactMaterial {
  @scala.inline
  def apply(
    contactEquationRelaxation: Double,
    contactEquationStiffness: Double,
    friction: Double,
    frictionEquationRelaxation: Double,
    frictionEquationStiffness: Double,
    id: Double,
    materials: js.Array[Material],
    restitution: Double
  ): ContactMaterial = {
    val __obj = js.Dynamic.literal(contactEquationRelaxation = contactEquationRelaxation.asInstanceOf[js.Any], contactEquationStiffness = contactEquationStiffness.asInstanceOf[js.Any], friction = friction.asInstanceOf[js.Any], frictionEquationRelaxation = frictionEquationRelaxation.asInstanceOf[js.Any], frictionEquationStiffness = frictionEquationStiffness.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], materials = materials.asInstanceOf[js.Any], restitution = restitution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactMaterial]
  }
  @scala.inline
  implicit class ContactMaterialOps[Self <: ContactMaterial] (val x: Self) extends AnyVal {
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
    def setContactEquationStiffness(value: Double): Self = this.set("contactEquationStiffness", value.asInstanceOf[js.Any])
    @scala.inline
    def setFriction(value: Double): Self = this.set("friction", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrictionEquationRelaxation(value: Double): Self = this.set("frictionEquationRelaxation", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrictionEquationStiffness(value: Double): Self = this.set("frictionEquationStiffness", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaterialsVarargs(value: Material*): Self = this.set("materials", js.Array(value :_*))
    @scala.inline
    def setMaterials(value: js.Array[Material]): Self = this.set("materials", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestitution(value: Double): Self = this.set("restitution", value.asInstanceOf[js.Any])
  }
  
}

