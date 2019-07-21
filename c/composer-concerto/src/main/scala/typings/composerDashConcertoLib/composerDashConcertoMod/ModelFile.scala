package typings
package composerDashConcertoLib.composerDashConcertoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "ModelFile")
@js.native
class ModelFile protected () extends js.Object {
  /**
    * Create a ModelFile. This should only be called by framework code.
    * Use the ModelManager to manage ModelFiles.
    * @throws {IllegalModelException}
    */
  def this(modelManager: ModelManager, definitions: java.lang.String) = this()
  def this(modelManager: ModelManager, definitions: java.lang.String, fileName: java.lang.String) = this()
  def this(modelManager: ModelManager, definitions: java.lang.String, fileName: java.lang.String, isSystemModelFile: scala.Boolean) = this()
  /**
    * Get all declarations in this ModelFile.
    */
  def getAllDeclarations(): js.Array[ClassDeclaration] = js.native
  /**
    * Get the AssetDeclarations defined in this ModelFile or null.
    */
  def getAssetDeclaration(name: java.lang.String): AssetDeclaration | scala.Null = js.native
  /**
    * Get the AssetDeclarations defined in this ModelFile.
    */
  def getAssetDeclarations(): js.Array[AssetDeclaration] = js.native
  def getAssetDeclarations(includeSystemType: scala.Boolean): js.Array[AssetDeclaration] = js.native
  /**
    * Get the ConceptDeclarations defined in this ModelFile.
    */
  def getConceptDeclarations(): js.Array[ConceptDeclaration] = js.native
  def getConceptDeclarations(includeSystemType: scala.Boolean): js.Array[ConceptDeclaration] = js.native
  /**
    * Get the instances of a given type in this ModelFile.
    */
  def getDeclarations(`type`: js.Function1[/* repeated */ js.Any, _]): js.Array[ClassDeclaration] = js.native
  def getDeclarations(`type`: js.Function1[/* repeated */ js.Any, _], includeSystemType: scala.Boolean): js.Array[ClassDeclaration] = js.native
  /**
    * Get the definitions for this model.
    */
  def getDefinitions(): java.lang.String = js.native
  /**
    * Get the EnumDeclarations defined in this ModelFile.
    */
  def getEnumDeclarations(): js.Array[EnumDeclaration] = js.native
  def getEnumDeclarations(includeSystemType: scala.Boolean): js.Array[EnumDeclaration] = js.native
  /**
    * Get the EventDeclaration defined in this ModelFile or null.
    */
  def getEventDeclaration(name: java.lang.String): EventDeclaration | scala.Null = js.native
  /**
    * Get the EventDeclarations defined in this ModelFile.
    */
  def getEventDeclarations(): js.Array[EventDeclaration] = js.native
  def getEventDeclarations(includeSystemType: scala.Boolean): js.Array[EventDeclaration] = js.native
  /**
    * Returns the types that have been imported into this ModelFile.
    */
  def getImports(): js.Array[java.lang.String] = js.native
  /**
    * Returns the type with the specified name or null.
    */
  def getLocalType(`type`: java.lang.String): ClassDeclaration | scala.Null = js.native
  /**
    * Returns the ModelManager associated with this ModelFile.
    */
  def getModelManager(): ModelManager = js.native
  /**
    * Get the filename for this model file. Note that this may be null.
    */
  def getName(): java.lang.String | scala.Null = js.native
  /**
    * Get the Namespace for this model file.
    */
  def getNamespace(): java.lang.String = js.native
  /**
    * Get the ParticipantDeclaration defined in this ModelFile or null.
    */
  def getParticipantDeclaration(name: java.lang.String): ParticipantDeclaration | scala.Null = js.native
  /**
    * Get the ParticipantDeclarations defined in this ModelFile.
    */
  def getParticipantDeclarations(): js.Array[ParticipantDeclaration] = js.native
  def getParticipantDeclarations(includeSystemType: scala.Boolean): js.Array[ParticipantDeclaration] = js.native
  /**
    * Get the TransactionDeclaration defined in this ModelFile or null.
    */
  def getTransactionDeclaration(name: java.lang.String): TransactionDeclaration | scala.Null = js.native
  /**
    * Get the TransactionDeclarations defined in this ModelFile.
    */
  def getTransactionDeclarations(): js.Array[TransactionDeclaration] = js.native
  def getTransactionDeclarations(includeSystemType: scala.Boolean): js.Array[TransactionDeclaration] = js.native
  /**
    * Returns true if the type is defined in the model file.
    */
  def isDefined(`type`: java.lang.String): scala.Boolean = js.native
  /**
    * Returns true if this ModelFile was downloaded from an external URI.
    */
  def isExternal(): scala.Boolean = js.native
  /**
    * Returns true if this ModelFile is a system model.
    */
  def isSystemModelFile(): scala.Boolean = js.native
}

