package typings.composerDashConcerto.composerDashConcertoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "ModelManager")
@js.native
/**
  * Create the ModelManager.
  */
class ModelManager () extends js.Object {
  /**
    * Add a decorator factory to this model manager.
    */
  def addDecoratorFactory(factory: DecoratorFactory): Unit = js.native
  /**
    * Adds a Composer file (as a string) to the ModelManager.
    * Composer files have a single namespace. If a Composer file with the
    * same namespace has already been added to the ModelManager then it
    * will be replaced.
    * Note that if there are dependencies between multiple files the files
    * must be added in dependency order, or the addModelFiles method can be
    * used to add a set of files irrespective of dependencies.
    * @throws {IllegalModelException}
    */
  def addModelFile(modelFile: String): js.Any = js.native
  def addModelFile(modelFile: String, fileName: String): js.Any = js.native
  def addModelFile(modelFile: String, fileName: String, disableValidation: Boolean): js.Any = js.native
  def addModelFile(modelFile: String, fileName: String, disableValidation: Boolean, systemModelTable: Boolean): js.Any = js.native
  /**
    * Add a set of Composer files to the model manager.
    */
  def addModelFiles(modelFiles: js.Array[String]): js.Array[_] = js.native
  def addModelFiles(modelFiles: js.Array[String], fileNames: js.Array[String]): js.Array[_] = js.native
  def addModelFiles(modelFiles: js.Array[String], fileNames: js.Array[String], disableValidation: Boolean): js.Array[_] = js.native
  def addModelFiles(
    modelFiles: js.Array[String],
    fileNames: js.Array[String],
    disableValidation: Boolean,
    systemModelTable: Boolean
  ): js.Array[_] = js.native
  /**
    * Remove all registered Composer files
    */
  def clearModelFiles(): Unit = js.native
  /**
    * Remove the Composer file for a given namespace
    */
  def deleteModelFile(namespace: String): Unit = js.native
  /**
    * Get the AssetDeclarations defined in this model manager.
    */
  def getAssetDeclarations(): js.Array[AssetDeclaration] = js.native
  def getAssetDeclarations(includeSystemType: Boolean): js.Array[AssetDeclaration] = js.native
  /**
    * Get the Concepts defined in this model manager.
    */
  def getConceptDeclarations(): js.Array[ConceptDeclaration] = js.native
  def getConceptDeclarations(includeSystemType: Boolean): js.Array[ConceptDeclaration] = js.native
  /**
    * Get the decorator factories for this model manager.
    */
  def getDecoratorFactories(): js.Array[DecoratorFactory] = js.native
  /**
    * Get the EnumDeclarations defined in this model manager.
    */
  def getEnumDeclarations(): js.Array[EnumDeclaration] = js.native
  def getEnumDeclarations(includeSystemType: Boolean): js.Array[EnumDeclaration] = js.native
  /**
    * Get the EventDeclarations defined in this model manager.
    */
  def getEventDeclarations(): js.Array[EventDeclaration] = js.native
  def getEventDeclarations(includeSystemType: Boolean): js.Array[EventDeclaration] = js.native
  /**
    * Get a factory for creating new instances of types defined in this model manager.
    */
  def getFactory(): Factory = js.native
  /**
    * Get the namespaces registered with the ModelManager.
    */
  def getNamespaces(): js.Array[String] = js.native
  /**
    * Get the ParticipantDeclarations defined in this model manager.
    */
  def getParticipantDeclarations(): js.Array[ParticipantDeclaration] = js.native
  def getParticipantDeclarations(includeSystemType: Boolean): js.Array[ParticipantDeclaration] = js.native
  /**
    * Get a serializer for serializing instances of types defined in this model manager.
    */
  def getSerializer(): Serializer = js.native
  /**
    * Get all class declarations from system namespaces
    */
  def getSystemTypes(): js.Array[ClassDeclaration] = js.native
  /**
    * Get the TransactionDeclarations defined in this model manager.
    */
  def getTransactionDeclarations(): js.Array[TransactionDeclaration] = js.native
  def getTransactionDeclarations(includeSystemType: Boolean): js.Array[TransactionDeclaration] = js.native
  /**
    * Downloads all ModelFiles that are external dependencies and adds or
    * updates them in this ModelManager.
    * @throws {IllegalModelException} if the models fail validation
    */
  def updateExternalModels(): js.Promise[js.Array[ModelFile]] = js.native
  def updateExternalModels(options: js.Any): js.Promise[js.Array[ModelFile]] = js.native
  def updateExternalModels(options: js.Any, modelFileDownloader: ModelFileDownloader): js.Promise[js.Array[ModelFile]] = js.native
  /**
    * Updates a Composer file (as a string) on the ModelManager.
    * Composer files have a single namespace. If a Composer file with the
    * same namespace has already been added to the ModelManager then it
    * will be replaced.
    * @throws {IllegalModelException}
    */
  def updateModelFile(modelFile: String): js.Any = js.native
  def updateModelFile(modelFile: String, fileName: String): js.Any = js.native
  def updateModelFile(modelFile: String, fileName: String, disableValidation: Boolean): js.Any = js.native
  /**
    * Validates a Composer file (as a string) to the ModelManager.
    * Composer files have a single namespace.
    * Note that if there are dependencies between multiple files the files
    * must be added in dependency order, or the addModelFiles method can be
    * used to add a set of files irrespective of dependencies.
    * @throws {IllegalModelException}
    */
  def validateModelFile(modelFile: String): Unit = js.native
  def validateModelFile(modelFile: String, fileName: String): Unit = js.native
  /**
    * Validates all models files in this model manager.
    */
  def validateModelFiles(): Unit = js.native
}

