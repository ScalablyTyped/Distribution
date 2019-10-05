package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.ContactMaterial")
@js.native
class ContactMaterial protected () extends js.Object {
  def this(m1: Material, m2: Material) = this()
  def this(m1: Material, m2: Material, options: IContactMaterialOptions) = this()
  var contactEquationRelaxation: Double = js.native
  var contactEquationStiffness: Double = js.native
  var friction: Double = js.native
  var frictionEquationRelaxation: Double = js.native
  var frictionEquationStiffness: Double = js.native
  var id: Double = js.native
  var materials: js.Array[Material] = js.native
  var restitution: Double = js.native
}

