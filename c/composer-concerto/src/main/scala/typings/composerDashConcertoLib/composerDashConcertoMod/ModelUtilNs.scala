package typings
package composerDashConcertoLib.composerDashConcertoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "ModelUtil")
@js.native
object ModelUtilNs extends js.Object {
  /**
    * Get the fully qualified name of a type.
    */
  def getFullyQualifiedName(namespace: java.lang.String, `type`: java.lang.String): java.lang.String = js.native
  /**
    * Returns the default system model table for a system model file where the class names
    * exactly match the defaults expected by the ClassDeclarations.
    *
    * The default names are:
    * - 'Transaction'
    * - 'Asset'
    * - 'Event'
    * - 'Participant'
    *
    */
  def getIdentitySystemModelTable(): java.lang.String = js.native
}

