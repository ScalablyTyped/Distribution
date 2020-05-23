package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactMaterial extends js.Object {
  var contactEquationRelaxation: Double
  var contactEquationStiffness: Double
  var friction: Double
  var frictionEquationRelaxation: Double
  var frictionEquationStiffness: Double
  var id: Double
  var materials: js.Array[Material]
  var restitution: Double
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
}

