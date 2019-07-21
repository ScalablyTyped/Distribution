package typings
package composerDashConcertoLib.composerDashConcertoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "Property")
@js.native
class Property protected () extends Decorated {
  /**
    * Create a Property.
    * @throws {IllegalModelException}
    */
  def this(parent: ClassDeclaration, ast: js.Any) = this()
  /**
    * Returns the fully name of a property (ns + class name + property name).
    */
  def getFullyQualifiedName(): java.lang.String = js.native
  /**
    * Returns the fully qualified type name of a property.
    */
  def getFullyQualifiedTypeName(): java.lang.String = js.native
  /**
    * Returns the name of a property.
    */
  def getName(): java.lang.String = js.native
  /**
    * Returns the namespace of the parent of this property.
    */
  def getNamespace(): java.lang.String = js.native
  /**
    * Returns the owner of this property.
    */
  def getParent(): ClassDeclaration = js.native
  /**
    * Returns the type of a property.
    */
  def getType(): java.lang.String = js.native
  /**
    * Returns true if the field is d as an array type.
    */
  def isArray(): scala.Boolean = js.native
  /**
    * Returns true if the field is optional.
    */
  def isOptional(): scala.Boolean = js.native
  /**
    *  Returns true if this property is a primitive type.
    */
  def isPrimitive(): scala.Boolean = js.native
  /**
    * Returns true if the field is d as an enumerated value.
    */
  def isTypeEnum(): scala.Boolean = js.native
}

