package typings.composerDashConcerto.composerDashConcertoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "Concept")
@js.native
class Concept protected () extends Typed {
  /**
    * Create a Concept.
    *
    * Note: Only to be called by framework code. Applications should
    * retrieve instances from {@link Factory}
    */
  def this(modelManager: ModelManager, classDeclaration: ClassDeclaration, ns: String, `type`: String) = this()
  /**
    * Determine if this typed is a concept.
    */
  def isConcept(): Boolean = js.native
}

