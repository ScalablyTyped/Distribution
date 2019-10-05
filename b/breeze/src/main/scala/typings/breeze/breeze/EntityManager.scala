package typings.breeze.breeze

import typings.breeze.Anon_Any
import typings.breeze.Anon_Entities
import typings.breeze.breeze.core.ErrorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.EntityManager")
@js.native
class EntityManager () extends js.Object {
  def this(config: String) = this()
  def this(config: EntityManagerOptions) = this()
  var dataService: DataService = js.native
  var entityChanged: EntityChangedEvent = js.native
  var hasChangesChanged: HasChangesChangedEvent = js.native
  var keyGeneratorCtor: js.Function = js.native
  var metadataStore: MetadataStore = js.native
  var queryOptions: QueryOptions = js.native
  var saveOptions: SaveOptions = js.native
  var serviceName: String = js.native
  var validationErrorsChanged: ValidationErrorsChangedEvent = js.native
  var validationOptions: ValidationOptions = js.native
  def acceptChanges(): Unit = js.native
  def addEntity(entity: Entity): Entity = js.native
  def attachEntity(entity: Entity): Entity = js.native
  def attachEntity(entity: Entity, entityState: EntityStateSymbol): Entity = js.native
  def attachEntity(entity: Entity, entityState: EntityStateSymbol, mergeStrategy: MergeStrategySymbol): Entity = js.native
  def clear(): Unit = js.native
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
  def createEntity(typeName: String): Entity = js.native
  def createEntity(typeName: String, config: js.Object): Entity = js.native
  def createEntity(typeName: String, config: js.Object, entityState: EntityStateSymbol): Entity = js.native
  def createEntity(
    typeName: String,
    config: js.Object,
    entityState: EntityStateSymbol,
    mergeStrategy: MergeStrategySymbol
  ): Entity = js.native
  def detachEntity(entity: Entity): Boolean = js.native
  def executeQuery(query: String): js.Promise[QueryResult] = js.native
  def executeQuery(query: String, callback: ExecuteQuerySuccessCallback): js.Promise[QueryResult] = js.native
  def executeQuery(query: String, callback: ExecuteQuerySuccessCallback, errorCallback: ExecuteQueryErrorCallback): js.Promise[QueryResult] = js.native
  def executeQuery(query: EntityQuery): js.Promise[QueryResult] = js.native
  def executeQuery(query: EntityQuery, callback: ExecuteQuerySuccessCallback): js.Promise[QueryResult] = js.native
  def executeQuery(
    query: EntityQuery,
    callback: ExecuteQuerySuccessCallback,
    errorCallback: ExecuteQueryErrorCallback
  ): js.Promise[QueryResult] = js.native
  def executeQueryLocally(query: EntityQuery): js.Array[Entity] = js.native
  def exportEntities(): String = js.native
  def exportEntities(entities: js.Array[Entity]): String = js.native
  def exportEntities(entities: js.Array[Entity], includeMetadata: Boolean): String = js.native
  def exportEntities(entities: js.Array[Entity], options: ExportEntitiesOptions): js.Any = js.native
  @JSName("exportEntities")
  def exportEntities_Any(): js.Any = js.native
  @JSName("exportEntities")
  def exportEntities_Any(entities: js.Array[Entity]): js.Any = js.native
  def fetchEntityByKey(entityKey: EntityKey): js.Promise[EntityByKeyResult] = js.native
   // string | Object
  def fetchEntityByKey(typeName: String, keyValue: js.Any): js.Promise[EntityByKeyResult] = js.native
  def fetchEntityByKey(typeName: String, keyValue: js.Any, checkLocalCacheFirst: Boolean): js.Promise[EntityByKeyResult] = js.native
  def fetchEntityByKey(typeName: String, keyValues: js.Array[_]): js.Promise[EntityByKeyResult] = js.native
  def fetchEntityByKey(typeName: String, keyValues: js.Array[_], checkLocalCacheFirst: Boolean): js.Promise[EntityByKeyResult] = js.native
  def fetchMetadata(): js.Promise[_] = js.native
  def fetchMetadata(callback: js.Function1[/* schema */ js.Any, Unit]): js.Promise[_] = js.native
  def fetchMetadata(callback: js.Function1[/* schema */ js.Any, Unit], errorCallback: ErrorCallback): js.Promise[_] = js.native
  def generateTempKeyValue(entity: Entity): js.Any = js.native
  def getChanges(): js.Array[Entity] = js.native
  def getChanges(entityTypeName: String): js.Array[Entity] = js.native
  def getChanges(entityTypeNames: js.Array[EntityType | String]): js.Array[Entity] = js.native
  def getChanges(entityType: EntityType): js.Array[Entity] = js.native
  def getEntities(): js.Array[Entity] = js.native
  def getEntities(entityTypeName: String): js.Array[Entity] = js.native
  def getEntities(entityTypeName: String, entityStates: js.Array[EntityStateSymbol]): js.Array[Entity] = js.native
  def getEntities(entityTypeName: String, entityState: EntityStateSymbol): js.Array[Entity] = js.native
  def getEntities(entityTypeNames: js.Array[EntityType | String]): js.Array[Entity] = js.native
  def getEntities(entityTypeNames: js.Array[EntityType | String], entityStates: js.Array[EntityStateSymbol]): js.Array[Entity] = js.native
  def getEntities(entityTypeNames: js.Array[EntityType | String], entityState: EntityStateSymbol): js.Array[Entity] = js.native
  def getEntities(entityType: EntityType): js.Array[Entity] = js.native
  def getEntities(entityType: EntityType, entityStates: js.Array[EntityStateSymbol]): js.Array[Entity] = js.native
  def getEntities(entityType: EntityType, entityState: EntityStateSymbol): js.Array[Entity] = js.native
  def getEntityByKey(entityKey: EntityKey): Entity = js.native
  def getEntityByKey(typeName: String, keyValue: js.Any): Entity = js.native
  def getEntityByKey(typeName: String, keyValues: js.Array[_]): Entity = js.native
  def hasChanges(): Boolean = js.native
  def hasChanges(entityTypeName: String): Boolean = js.native
  def hasChanges(entityTypeNames: js.Array[EntityType | String]): Boolean = js.native
  def hasChanges(entityType: EntityType): Boolean = js.native
  def importEntities(exportedData: js.Object): Anon_Entities = js.native
  def importEntities(exportedData: js.Object, config: Anon_Any): Anon_Entities = js.native
  def importEntities(exportedString: String): Anon_Entities = js.native
  def importEntities(exportedString: String, config: Anon_Any): Anon_Entities = js.native
  def rejectChanges(): js.Array[Entity] = js.native
  def saveChanges(): js.Promise[SaveResult] = js.native
  def saveChanges(entities: js.Array[Entity]): js.Promise[SaveResult] = js.native
  def saveChanges(entities: js.Array[Entity], saveOptions: SaveOptions): js.Promise[SaveResult] = js.native
  def saveChanges(entities: js.Array[Entity], saveOptions: SaveOptions, callback: SaveChangesSuccessCallback): js.Promise[SaveResult] = js.native
  def saveChanges(
    entities: js.Array[Entity],
    saveOptions: SaveOptions,
    callback: SaveChangesSuccessCallback,
    errorCallback: SaveChangesErrorCallback
  ): js.Promise[SaveResult] = js.native
  def setProperties(config: EntityManagerProperties): Unit = js.native
}

/* static members */
@JSGlobal("breeze.EntityManager")
@js.native
object EntityManager extends js.Object {
  def importEntities(exportedData: js.Object): EntityManager = js.native
  def importEntities(exportedData: js.Object, config: Anon_Any): EntityManager = js.native
  def importEntities(exportedString: String): EntityManager = js.native
  def importEntities(exportedString: String, config: Anon_Any): EntityManager = js.native
}

