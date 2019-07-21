package typings
package composerDashConcertoLib.composerDashConcertoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "Identifiable")
@js.native
abstract class Identifiable protected () extends Typed {
  /**
    * Create an Identifiable.
    *
    * Note: Only to be called by framework code. Applications should
    * retrieve instances from {@link Factory}
    */
  def this(modelManager: ModelManager, classDeclaration: ClassDeclaration, ns: java.lang.String, `type`: java.lang.String, id: java.lang.String) = this()
  /**
    * Get the fully qualified identifier of this instance.
    * (namespace '.' type '#' identifier).
    */
  def getFullyQualifiedIdentifier(): java.lang.String = js.native
  /**
    * Get the identifier of this instance
    */
  def getIdentifier(): java.lang.String = js.native
  /**
    * Determine if this identifiable is a relationship.
    */
  def isRelationship(): scala.Boolean = js.native
  /**
    * Determine if this identifiable is a resource.
    */
  def isResource(): scala.Boolean = js.native
  /**
    * Set the identifier of this instance
    */
  def setIdentifier(id: java.lang.String): scala.Unit = js.native
  /**
    * Returns a URI representation of a reference to this identifiable.
    */
  def toURI(): java.lang.String = js.native
}

