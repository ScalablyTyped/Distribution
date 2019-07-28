package typings.composerDashConcerto.composerDashConcertoMod

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
  def this(
    modelManager: ModelManager,
    classDeclaration: ClassDeclaration,
    ns: String,
    `type`: String,
    id: String
  ) = this()
  /**
    * Get the fully qualified identifier of this instance.
    * (namespace '.' type '#' identifier).
    */
  def getFullyQualifiedIdentifier(): String = js.native
  /**
    * Get the identifier of this instance
    */
  def getIdentifier(): String = js.native
  /**
    * Determine if this identifiable is a relationship.
    */
  def isRelationship(): Boolean = js.native
  /**
    * Determine if this identifiable is a resource.
    */
  def isResource(): Boolean = js.native
  /**
    * Set the identifier of this instance
    */
  def setIdentifier(id: String): Unit = js.native
  /**
    * Returns a URI representation of a reference to this identifiable.
    */
  def toURI(): String = js.native
}

