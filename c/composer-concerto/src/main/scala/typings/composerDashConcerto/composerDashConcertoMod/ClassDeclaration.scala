package typings.composerDashConcerto.composerDashConcertoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "ClassDeclaration")
@js.native
abstract class ClassDeclaration protected () extends Decorated {
  /**
    * Create a ClassDeclaration from an Abstract Syntax Tree. The AST is the
    * result of parsing.
    * @throws {IllegalModelException}
    */
  def this(modelFile: ModelFile, ast: String) = this()
  /**
    * Resolve the super type on this class and store it as an internal property.
    */
  def _resolveSuperType(): ClassDeclaration | Null = js.native
  /**
    * Get all the super-type declarations for this type.
    */
  def getAllSuperTypeDeclarations(): js.Array[ClassDeclaration] = js.native
  /**
    * Get the class declarations for all subclasses of this class, including this class.
    */
  def getAssignableClassDeclarations(): js.Array[ClassDeclaration] = js.native
  /**
    * Returns the fully qualified name of this class.
    * The name will include the namespace if present.
    */
  def getFullyQualifiedName(): String = js.native
  /**
    * Returns the name of the identifying field for this class. Note
    * that the identifying field may come from a super type.
    */
  def getIdentifierFieldName(): String = js.native
  /**
    * Returns the short name of a class. This name does not include the
    * namespace from the owning ModelFile.
    */
  def getName(): String = js.native
  /**
    * Return the namespace of this class.
    */
  def getNamespace(): String = js.native
  /**
    * Get a nested property using a dotted property path.
    * @throws {IllegalModelException} if the property path is invalid or the property does not exist
    */
  def getNestedProperty(propertyPath: String): Property = js.native
  /**
    * Returns the fields directly defined by this class.
    */
  def getOwnProperties(): js.Array[Property] = js.native
  /**
    * Returns the field with a given name or null if it does not exist.
    * The field must be directly owned by this class -- the super-type is
    * not introspected.
    */
  def getOwnProperty(name: String): Property | Null = js.native
  /**
    * Returns the properties defined in this class and all super classes.
    */
  def getProperties(): js.Array[Property] = js.native
  /**
    * Returns the property with a given name or null if it does not exist.
    * Fields defined in super-types are also introspected.
    */
  def getProperty(name: String): Property | Null = js.native
  /**
    * Returns the FQN of the super type for this class or null if this
    * class does not have a super type.
    */
  def getSuperType(): String | Null = js.native
  /**
    * Get the super type class declaration for this class.
    */
  def getSuperTypeDeclaration(): ClassDeclaration | Null = js.native
  /**
    * Returns the base system type for this type of class declaration. Override
    * this method in derived classes to specify a base system type.
    */
  def getSystemType(): String | Null = js.native
  /**
    * Returns true if this class is d as abstract in the model file.
    */
  def isAbstract(): Boolean = js.native
  /**
    * Returns true if this class is the definition of a concept.
    */
  def isConcept(): Boolean = js.native
  /**
    * Returns true if this class is an enumeration.
    */
  def isEnum(): Boolean = js.native
  /**
    * Returns true if this class is the definition of an event.
    */
  def isEvent(): Boolean = js.native
  /**
    * Returns true if this class can be pointed to by a relationship.
    */
  def isRelationshipTarget(): Boolean = js.native
  /**
    * Returns true if this class is a system core type - both in the system
    * namespace, and also one of the system core types (Asset, Participant, etc).
    */
  def isSystemCoreType(): Boolean = js.native
  /**
    * Returns true if this class can be pointed to by a relationship in a
    * system model
    */
  def isSystemRelationshipTarget(): Boolean = js.native
  /**
    * Returns true is this type is in the system namespace.
    */
  def isSystemType(): Boolean = js.native
}

