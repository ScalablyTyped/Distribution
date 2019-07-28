package typings.composerDashConcerto.composerDashConcertoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "Relationship")
@js.native
class Relationship protected () extends Identifiable {
  /**
    * Create a Relationship.
    *
    * Note: Only to be called by framework code. Applications should
    * retrieve instances from {@link Factory}
    */
  def this(
    modelManager: ModelManager,
    classDeclaration: ClassDeclaration,
    ns: String,
    `type`: String,
    id: String
  ) = this()
}

/* static members */
@JSImport("composer-concerto", "Relationship")
@js.native
object Relationship extends js.Object {
  /**
    * Contructs a Relationship instance from a URI representation (created using toURI).
    */
  def fromURI(modelManager: ModelManager, uriAsstring: String): Relationship = js.native
  def fromURI(modelManager: ModelManager, uriAsstring: String, defaultNamespace: String): Relationship = js.native
  def fromURI(modelManager: ModelManager, uriAsstring: String, defaultNamespace: String, defaultType: String): Relationship = js.native
}

