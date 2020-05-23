package typings.cannon.mod

import typings.cannon.CANNON.IContactMaterialOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "ContactMaterial")
@js.native
class ContactMaterial protected ()
  extends typings.cannon.CANNON.ContactMaterial {
  def this(m1: typings.cannon.CANNON.Material, m2: typings.cannon.CANNON.Material) = this()
  def this(
    m1: typings.cannon.CANNON.Material,
    m2: typings.cannon.CANNON.Material,
    options: IContactMaterialOptions
  ) = this()
  /* CompleteClass */
  override var contactEquationRelaxation: Double = js.native
  /* CompleteClass */
  override var contactEquationStiffness: Double = js.native
  /* CompleteClass */
  override var friction: Double = js.native
  /* CompleteClass */
  override var frictionEquationRelaxation: Double = js.native
  /* CompleteClass */
  override var frictionEquationStiffness: Double = js.native
  /* CompleteClass */
  override var id: Double = js.native
  /* CompleteClass */
  override var materials: js.Array[typings.cannon.CANNON.Material] = js.native
  /* CompleteClass */
  override var restitution: Double = js.native
}

