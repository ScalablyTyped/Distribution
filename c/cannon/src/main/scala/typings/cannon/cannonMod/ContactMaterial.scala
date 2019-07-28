package typings.cannon.cannonMod

import typings.cannon.CANNONNs.IContactMaterialOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "ContactMaterial")
@js.native
class ContactMaterial protected ()
  extends typings.cannon.CANNONNs.ContactMaterial {
  def this(m1: typings.cannon.CANNONNs.Material, m2: typings.cannon.CANNONNs.Material) = this()
  def this(
    m1: typings.cannon.CANNONNs.Material,
    m2: typings.cannon.CANNONNs.Material,
    options: IContactMaterialOptions
  ) = this()
}

