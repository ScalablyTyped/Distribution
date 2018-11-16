package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.ContactMaterial")
@js.native
class ContactMaterial protected () extends js.Object {
  def this(m1: Material, m2: Material) = this()
  def this(m1: Material, m2: Material, options: IContactMaterialOptions) = this()
  var contactEquationRelaxation: scala.Double = js.native
  var contactEquationStiffness: scala.Double = js.native
  var friction: scala.Double = js.native
  var frictionEquationRelaxation: scala.Double = js.native
  var frictionEquationStiffness: scala.Double = js.native
  var id: scala.Double = js.native
  var materials: js.Array[Material] = js.native
  var restitution: scala.Double = js.native
}

