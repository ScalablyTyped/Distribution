package typings.cannon.global.CANNON

import typings.cannon.CANNON.IContactMaterialOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.ContactMaterial")
@js.native
class ContactMaterial protected ()
  extends typings.cannon.CANNON.ContactMaterial {
  def this(m1: typings.cannon.CANNON.Material, m2: typings.cannon.CANNON.Material) = this()
  def this(
    m1: typings.cannon.CANNON.Material,
    m2: typings.cannon.CANNON.Material,
    options: IContactMaterialOptions
  ) = this()
}

