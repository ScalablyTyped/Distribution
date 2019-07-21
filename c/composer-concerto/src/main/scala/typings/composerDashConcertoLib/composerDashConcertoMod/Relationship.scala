package typings
package composerDashConcertoLib.composerDashConcertoMod

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
  def this(modelManager: ModelManager, classDeclaration: ClassDeclaration, ns: java.lang.String, `type`: java.lang.String, id: java.lang.String) = this()
}

/* static members */
@JSImport("composer-concerto", "Relationship")
@js.native
object Relationship extends js.Object {
  /**
    * Contructs a Relationship instance from a URI representation (created using toURI).
    */
  def fromURI(
    modelManager: composerDashConcertoLib.composerDashConcertoMod.ModelManager,
    uriAsstring: java.lang.String
  ): composerDashConcertoLib.composerDashConcertoMod.Relationship = js.native
  def fromURI(
    modelManager: composerDashConcertoLib.composerDashConcertoMod.ModelManager,
    uriAsstring: java.lang.String,
    defaultNamespace: java.lang.String
  ): composerDashConcertoLib.composerDashConcertoMod.Relationship = js.native
  def fromURI(
    modelManager: composerDashConcertoLib.composerDashConcertoMod.ModelManager,
    uriAsstring: java.lang.String,
    defaultNamespace: java.lang.String,
    defaultType: java.lang.String
  ): composerDashConcertoLib.composerDashConcertoMod.Relationship = js.native
}

