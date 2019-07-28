package typings.composerDashConcerto.composerDashConcertoMod

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
  def this(modelManager: ModelManager, definitions: String) = this()
  def this(modelManager: ModelManager, definitions: String, fileName: String) = this()
  def this(modelManager: ModelManager, definitions: String, fileName: String, isSystemModelFile: Boolean) = this()
  /**
    * Get all declarations in this ModelFile.
    */
  def getAllDeclarations(): js.Array[ClassDeclaration] = js.native
  /**
    * Get the AssetDeclarations defined in this ModelFile or null.
    */
  def getAssetDeclaration(name: String): AssetDeclaration | Null = js.native
  /**
    * Get the AssetDeclarations defined in this ModelFile.
    */
  def getAssetDeclarations(): js.Array[AssetDeclaration] = js.native
  def getAssetDeclarations(includeSystemType: Boolean): js.Array[AssetDeclaration] = js.native
  /**
    * Get the ConceptDeclarations defined in this ModelFile.
    */
  def getConceptDeclarations(): js.Array[ConceptDeclaration] = js.native
  def getConceptDeclarations(includeSystemType: Boolean): js.Array[ConceptDeclaration] = js.native
  /**
    * Get the instances of a given type in this ModelFile.
    */
  def getDeclarations(`type`: js.Function1[/* repeated */ js.Any, _]): js.Array[ClassDeclaration] = js.native
  def getDeclarations(`type`: js.Function1[/* repeated */ js.Any, _], includeSystemType: Boolean): js.Array[ClassDeclaration] = js.native
  /**
    * Get the definitions for this model.
    */
  def getDefinitions(): String = js.native
  /**
    * Get the EnumDeclarations defined in this ModelFile.
    */
  def getEnumDeclarations(): js.Array[EnumDeclaration] = js.native
  def getEnumDeclarations(includeSystemType: Boolean): js.Array[EnumDeclaration] = js.native
  /**
    * Get the EventDeclaration defined in this ModelFile or null.
    */
  def getEventDeclaration(name: String): EventDeclaration | Null = js.native
  /**
    * Get the EventDeclarations defined in this ModelFile.
    */
  def getEventDeclarations(): js.Array[EventDeclaration] = js.native
  def getEventDeclarations(includeSystemType: Boolean): js.Array[EventDeclaration] = js.native
  /**
    * Returns the types that have been imported into this ModelFile.
    */
  def getImports(): js.Array[String] = js.native
  /**
    * Returns the type with the specified name or null.
    */
  def getLocalType(`type`: String): ClassDeclaration | Null = js.native
  /**
    * Returns the ModelManager associated with this ModelFile.
    */
  def getModelManager(): ModelManager = js.native
  /**
    * Get the filename for this model file. Note that this may be null.
    */
  def getName(): String | Null = js.native
  /**
    * Get the Namespace for this model file.
    */
  def getNamespace(): String = js.native
  /**
    * Get the ParticipantDeclaration defined in this ModelFile or null.
    */
  def getParticipantDeclaration(name: String): ParticipantDeclaration | Null = js.native
  /**
    * Get the ParticipantDeclarations defined in this ModelFile.
    */
  def getParticipantDeclarations(): js.Array[ParticipantDeclaration] = js.native
  def getParticipantDeclarations(includeSystemType: Boolean): js.Array[ParticipantDeclaration] = js.native
  /**
    * Get the TransactionDeclaration defined in this ModelFile or null.
    */
  def getTransactionDeclaration(name: String): TransactionDeclaration | Null = js.native
  /**
    * Get the TransactionDeclarations defined in this ModelFile.
    */
  def getTransactionDeclarations(): js.Array[TransactionDeclaration] = js.native
  def getTransactionDeclarations(includeSystemType: Boolean): js.Array[TransactionDeclaration] = js.native
  /**
    * Returns true if the type is defined in the model file.
    */
  def isDefined(`type`: String): Boolean = js.native
  /**
    * Returns true if this ModelFile was downloaded from an external URI.
    */
  def isExternal(): Boolean = js.native
  /**
    * Returns true if this ModelFile is a system model.
    */
  def isSystemModelFile(): Boolean = js.native
}

