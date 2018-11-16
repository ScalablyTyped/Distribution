package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.EntityManager")
@js.native
class EntityManager () extends js.Object {
  def this(config: EntityManagerOptions) = this()
  def this(config: java.lang.String) = this()
  var dataService: DataService = js.native
  var entityChanged: EntityChangedEvent = js.native
  var hasChangesChanged: HasChangesChangedEvent = js.native
  var keyGeneratorCtor: js.Function = js.native
  var metadataStore: MetadataStore = js.native
  var queryOptions: QueryOptions = js.native
  var saveOptions: SaveOptions = js.native
  var serviceName: java.lang.String = js.native
  var validationErrorsChanged: ValidationErrorsChangedEvent = js.native
  var validationOptions: ValidationOptions = js.native
  def acceptChanges(): scala.Unit = js.native
  def addEntity(entity: Entity): Entity = js.native
  def attachEntity(entity: Entity): Entity = js.native
  def attachEntity(entity: Entity, entityState: EntityStateSymbol): Entity = js.native
  def attachEntity(entity: Entity, entityState: EntityStateSymbol, mergeStrategy: MergeStrategySymbol): Entity = js.native
  def clear(): scala.Unit = js.native
  def createEmptyCopy(): EntityManager = js.native
  def createEntity(entityType: EntityType): Entity = js.native
  def createEntity(entityType: EntityType, config: js.Object): Entity = js.native
  def createEntity(entityType: EntityType, config: js.Object, entityState: EntityStateSymbol): Entity = js.native
  def createEntity(
    entityType: EntityType,
    config: js.Object,
    entityState: EntityStateSymbol,
    mergeStrategy: MergeStrategySymbol
  ): Entity = js.native
  def createEntity(typeName: java.lang.String): Entity = js.native
  def createEntity(typeName: java.lang.String, config: js.Object): Entity = js.native
  def createEntity(typeName: java.lang.String, config: js.Object, entityState: EntityStateSymbol): Entity = js.native
  def createEntity(
    typeName: java.lang.String,
    config: js.Object,
    entityState: EntityStateSymbol,
    mergeStrategy: MergeStrategySymbol
  ): Entity = js.native
  def detachEntity(entity: Entity): scala.Boolean = js.native
  def executeQuery(query: EntityQuery): stdLib.Promise[QueryResult] = js.native
  def executeQuery(query: EntityQuery, callback: ExecuteQuerySuccessCallback): stdLib.Promise[QueryResult] = js.native
  def executeQuery(
    query: EntityQuery,
    callback: ExecuteQuerySuccessCallback,
    errorCallback: ExecuteQueryErrorCallback
  ): stdLib.Promise[QueryResult] = js.native
  def executeQuery(query: java.lang.String): stdLib.Promise[QueryResult] = js.native
  def executeQuery(query: java.lang.String, callback: ExecuteQuerySuccessCallback): stdLib.Promise[QueryResult] = js.native
  def executeQuery(
    query: java.lang.String,
    callback: ExecuteQuerySuccessCallback,
    errorCallback: ExecuteQueryErrorCallback
  ): stdLib.Promise[QueryResult] = js.native
  def executeQueryLocally(query: EntityQuery): js.Array[Entity] = js.native
  def exportEntities(): java.lang.String = js.native
  def exportEntities(entities: js.Array[Entity]): java.lang.String = js.native
  def exportEntities(entities: js.Array[Entity], includeMetadata: scala.Boolean): java.lang.String = js.native
  def exportEntities(entities: js.Array[Entity], options: ExportEntitiesOptions): js.Any = js.native
  @JSName("exportEntities")
  def exportEntities_Any(): js.Any = js.native
  @JSName("exportEntities")
  def exportEntities_Any(entities: js.Array[Entity]): js.Any = js.native
  def fetchEntityByKey(entityKey: EntityKey): stdLib.Promise[EntityByKeyResult] = js.native
   // string | Object
  def fetchEntityByKey(typeName: java.lang.String, keyValue: js.Any): stdLib.Promise[EntityByKeyResult] = js.native
   // string | Object
  def fetchEntityByKey(typeName: java.lang.String, keyValue: js.Any, checkLocalCacheFirst: scala.Boolean): stdLib.Promise[EntityByKeyResult] = js.native
  def fetchEntityByKey(typeName: java.lang.String, keyValues: js.Array[_]): stdLib.Promise[EntityByKeyResult] = js.native
  def fetchEntityByKey(typeName: java.lang.String, keyValues: js.Array[_], checkLocalCacheFirst: scala.Boolean): stdLib.Promise[EntityByKeyResult] = js.native
  def fetchMetadata(): stdLib.Promise[_] = js.native
  def fetchMetadata(callback: js.Function1[/* schema */ js.Any, scala.Unit]): stdLib.Promise[_] = js.native
  def fetchMetadata(
    callback: js.Function1[/* schema */ js.Any, scala.Unit],
    errorCallback: breezeLib.breezeNs.coreNs.ErrorCallback
  ): stdLib.Promise[_] = js.native
  def generateTempKeyValue(entity: Entity): js.Any = js.native
  def getChanges(): js.Array[Entity] = js.native
  def getChanges(entityTypeName: java.lang.String): js.Array[Entity] = js.native
  def getChanges(entityTypeNames: js.Array[EntityType | java.lang.String]): js.Array[Entity] = js.native
  def getChanges(entityType: EntityType): js.Array[Entity] = js.native
  def getEntities(): js.Array[Entity] = js.native
  def getEntities(entityTypeName: java.lang.String): js.Array[Entity] = js.native
  def getEntities(entityTypeName: java.lang.String, entityState: EntityStateSymbol): js.Array[Entity] = js.native
  def getEntities(entityTypeName: java.lang.String, entityStates: js.Array[EntityStateSymbol]): js.Array[Entity] = js.native
  def getEntities(entityTypeNames: js.Array[EntityType | java.lang.String]): js.Array[Entity] = js.native
  def getEntities(entityTypeNames: js.Array[EntityType | java.lang.String], entityState: EntityStateSymbol): js.Array[Entity] = js.native
  def getEntities(
    entityTypeNames: js.Array[EntityType | java.lang.String],
    entityStates: js.Array[EntityStateSymbol]
  ): js.Array[Entity] = js.native
  def getEntities(entityType: EntityType): js.Array[Entity] = js.native
  def getEntities(entityType: EntityType, entityState: EntityStateSymbol): js.Array[Entity] = js.native
  def getEntities(entityType: EntityType, entityStates: js.Array[EntityStateSymbol]): js.Array[Entity] = js.native
  def getEntityByKey(entityKey: EntityKey): Entity = js.native
  def getEntityByKey(typeName: java.lang.String, keyValue: js.Any): Entity = js.native
  def getEntityByKey(typeName: java.lang.String, keyValues: js.Array[_]): Entity = js.native
  def hasChanges(): scala.Boolean = js.native
  def hasChanges(entityTypeName: java.lang.String): scala.Boolean = js.native
  def hasChanges(entityTypeNames: js.Array[EntityType | java.lang.String]): scala.Boolean = js.native
  def hasChanges(entityType: EntityType): scala.Boolean = js.native
  def importEntities(exportedData: js.Object): breezeLib.Anon_Entities = js.native
  def importEntities(exportedData: js.Object, config: breezeLib.Anon_MetadataVersionFn): breezeLib.Anon_Entities = js.native
  def importEntities(exportedString: java.lang.String): breezeLib.Anon_Entities = js.native
  def importEntities(exportedString: java.lang.String, config: breezeLib.Anon_MetadataVersionFn): breezeLib.Anon_Entities = js.native
  def rejectChanges(): js.Array[Entity] = js.native
  def saveChanges(): stdLib.Promise[SaveResult] = js.native
  def saveChanges(entities: js.Array[Entity]): stdLib.Promise[SaveResult] = js.native
  def saveChanges(entities: js.Array[Entity], saveOptions: SaveOptions): stdLib.Promise[SaveResult] = js.native
  def saveChanges(entities: js.Array[Entity], saveOptions: SaveOptions, callback: SaveChangesSuccessCallback): stdLib.Promise[SaveResult] = js.native
  def saveChanges(
    entities: js.Array[Entity],
    saveOptions: SaveOptions,
    callback: SaveChangesSuccessCallback,
    errorCallback: SaveChangesErrorCallback
  ): stdLib.Promise[SaveResult] = js.native
  def setProperties(config: EntityManagerProperties): scala.Unit = js.native
}

@JSGlobal("breeze.EntityManager")
@js.native
object EntityManager extends js.Object {
  def importEntities(exportedData: js.Object): breezeLib.breezeNs.EntityManager = js.native
  def importEntities(exportedData: js.Object, config: breezeLib.Anon_MetadataVersionFn): breezeLib.breezeNs.EntityManager = js.native
  def importEntities(exportedString: java.lang.String): breezeLib.breezeNs.EntityManager = js.native
  def importEntities(exportedString: java.lang.String, config: breezeLib.Anon_MetadataVersionFn): breezeLib.breezeNs.EntityManager = js.native
}

