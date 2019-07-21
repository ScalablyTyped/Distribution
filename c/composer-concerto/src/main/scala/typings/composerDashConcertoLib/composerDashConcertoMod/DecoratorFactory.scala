package typings
package composerDashConcertoLib.composerDashConcertoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "DecoratorFactory")
@js.native
abstract class DecoratorFactory () extends js.Object {
  /**
    * Process the decorator, and return a specific implementation class for that
    * decorator, or return null if this decorator is not handled by this processor.
    */
  def newDecorator(parent: ClassDeclaration, ast: js.Any): Decorator = js.native
  def newDecorator(parent: Property, ast: js.Any): Decorator = js.native
}

