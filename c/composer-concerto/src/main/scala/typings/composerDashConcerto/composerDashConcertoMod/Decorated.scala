package typings.composerDashConcerto.composerDashConcertoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "Decorated")
@js.native
class Decorated protected () extends js.Object {
  /**
    * Create a Decorated from an Abstract Syntax Tree. The AST is the
    * result of parsing.
    * @throws {IllegalModelException}
    */
  def this(modelFile: ModelFile, ast: String) = this()
  /**
    * Returns the decorator for this class with a given name.
    */
  def getDecorator(name: String): Decorator = js.native
  /**
    * Returns the decorators for this class.
    */
  def getDecorators(): js.Array[Decorator] = js.native
  /**
    * Returns the ModelFile that defines this class.
    */
  def getModelFile(): ModelFile = js.native
}

