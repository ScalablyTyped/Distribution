package typings
package composerDashConcertoLib.composerDashConcertoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "Decorator")
@js.native
class Decorator protected () extends js.Object {
  /**
    * Create a Decorator.
    * @throws {IllegalModelException}
    */
  def this(parent: ClassDeclaration, ast: js.Any) = this()
  def this(parent: Property, ast: js.Any) = this()
  /**
    * Returns the arguments for this decorator.
    */
  def getArguments(): js.Array[_] | scala.Null = js.native
  /**
    * Returns the name of a decorator.
    */
  def getName(): java.lang.String = js.native
  /**
    * Returns the owner of this property.
    */
  def getParent(): ClassDeclaration | Property = js.native
}

