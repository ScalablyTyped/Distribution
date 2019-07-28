package typings.composerDashConcerto.composerDashConcertoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "Introspector")
@js.native
class Introspector protected () extends js.Object {
  /**
    * Create the Introspector.
    */
  def this(modelManager: ModelManager) = this()
  /**
    * Returns the class declaration with the given fully qualified name.
    * @throws {Error} if the class declaration does not exist
    */
  def getClassDeclaration(fullyQualifiedTypeName: String): ClassDeclaration = js.native
  /**
    * Returns all the class declarations for the business network.
    */
  def getClassDeclarations(): js.Array[ClassDeclaration] = js.native
}

