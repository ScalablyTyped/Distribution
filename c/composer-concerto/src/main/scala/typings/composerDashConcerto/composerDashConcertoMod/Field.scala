package typings.composerDashConcerto.composerDashConcertoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "Field")
@js.native
class Field protected () extends Property {
  /**
    * Create an Field.
    * @throws {IllegalModelException}
    */
  def this(parent: ClassDeclaration, ast: js.Any) = this()
  /**
    * Returns the default value for the field or null.
    */
  def getDefaultValue(): String | Null = js.native
  /**
    * Returns the validator string for this field.
    */
  def getValidator(): String | Null = js.native
}

