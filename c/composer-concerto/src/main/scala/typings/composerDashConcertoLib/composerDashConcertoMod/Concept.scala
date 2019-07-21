package typings
package composerDashConcertoLib.composerDashConcertoMod

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
  def this(modelManager: ModelManager, classDeclaration: ClassDeclaration, ns: java.lang.String, `type`: java.lang.String) = this()
  /**
    * Determine if this typed is a concept.
    */
  def isConcept(): scala.Boolean = js.native
}

