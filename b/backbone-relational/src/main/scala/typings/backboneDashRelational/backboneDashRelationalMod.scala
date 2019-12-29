package typings.backboneDashRelational

import typings.backbone.backboneMod.Collection
import typings.backbone.backboneMod.EventsMixin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone-relational", JSImport.Namespace)
@js.native
object backboneDashRelationalMod extends js.Object {
  @js.native
  class HasMany () extends Relation {
    var collectionType: js.Any = js.native
    def addRelated(model: typings.backbone.backboneMod.Model, options: js.Any): Unit = js.native
    def findRelated(options: js.Any): typings.backbone.backboneMod.Model = js.native
    def onChange(model: typings.backbone.backboneMod.Model, attr: js.Any, options: js.Any): Unit = js.native
    def removeRelated(model: typings.backbone.backboneMod.Model, coll: js.Any, options: js.Any): Unit = js.native
    def setKeyContents(keyContents: String): Unit = js.native
    def setKeyContents(keyContents: Double): Unit = js.native
    def setKeyContents(keyContents: typings.backbone.backboneMod.Model): Unit = js.native
    def tryAddRelated(model: typings.backbone.backboneMod.Model, coll: js.Any, options: js.Any): Unit = js.native
  }
  
  @js.native
  class HasOne () extends Relation {
    var collectionType: js.Any = js.native
    def addRelated(model: typings.backbone.backboneMod.Model, options: js.Any): Unit = js.native
    def findRelated(options: js.Any): typings.backbone.backboneMod.Model = js.native
    def handleAddition(
      model: typings.backbone.backboneMod.Model,
      coll: Collection[typings.backbone.backboneMod.Model],
      options: js.Any
    ): Unit = js.native
    def handleRemoval(
      model: typings.backbone.backboneMod.Model,
      coll: Collection[typings.backbone.backboneMod.Model],
      options: js.Any
    ): Unit = js.native
    def handleReset(coll: Collection[typings.backbone.backboneMod.Model], options: js.Any): Unit = js.native
    def onChange(model: typings.backbone.backboneMod.Model, attr: js.Any, options: js.Any): Unit = js.native
    def removeRelated(model: typings.backbone.backboneMod.Model, coll: js.Any, options: js.Any): Unit = js.native
    def setKeyContents(keyContents: String): Unit = js.native
    def setKeyContents(keyContents: js.Array[Double | String]): Unit = js.native
    def setKeyContents(keyContents: Double): Unit = js.native
    def setKeyContents(keyContents: Collection[typings.backbone.backboneMod.Model]): Unit = js.native
    def tryAddRelated(model: typings.backbone.backboneMod.Model, coll: js.Any, options: js.Any): Unit = js.native
  }
  
  @js.native
  class Model ()
    extends typings.backbone.backboneMod.Model {
    /**
      * Do not use, prefer TypeScript's extend functionality.
      **/
    //private static extend(properties:any, classProperties?:any):any;
    var relations: js.Any = js.native
    var subModelTypeAttribute: js.Any = js.native
    var subModelTypes: js.Any = js.native
    def fetchRelated(key: String): js.Any = js.native
    def fetchRelated(key: String, options: js.Any): js.Any = js.native
    def fetchRelated(key: String, options: js.Any, update: Boolean): js.Any = js.native
    def getRelation(name: String): Relation = js.native
    def getRelations(): js.Array[Relation] = js.native
    def initializeRelations(options: js.Any): Unit = js.native
    def processQueue(): Unit = js.native
    def queue(func: js.Any): Unit = js.native
    def toJSON(): js.Any = js.native
    def toJSON(options: js.Any): js.Any = js.native
    def updateRelations(options: js.Any): Unit = js.native
  }
  
  @js.native
  class Relation ()
    extends typings.backbone.backboneMod.Model {
    var instance: js.Any = js.native
    var key: js.Any = js.native
    var keyContents: js.Any = js.native
    var options: js.Any = js.native
    var related: js.Any = js.native
    var relatedCollection: js.Any = js.native
    var relatedModel: js.Any = js.native
    var reverseRelation: js.Any = js.native
    def checkPreconditions(): Boolean = js.native
    def getReverseRelations(model: Model): Relation = js.native
    def setRelated(related: Collection[typings.backbone.backboneMod.Model]): Unit = js.native
    def setRelated(related: typings.backbone.backboneMod.Model): Unit = js.native
  }
  
  @js.native
  class Store () extends EventsMixin {
    def addModelScope(scope: js.Any): Unit = js.native
    def addOrphanRelation(relation: js.Any): Unit = js.native
    def addReverseRelation(relation: js.Any): Unit = js.native
    def addSubModels(subModelTypes: Model, superModelType: Model): Unit = js.native
    def checkId(model: Model, id: js.Any): Unit = js.native
    def getCollection(`type`: Model, create: Boolean): Collection[typings.backbone.backboneMod.Model] = js.native
    def getObjectByName(name: String): js.Any = js.native
    def initializeRelation(model: js.Any, relation: js.Any, options: js.Any): js.Any = js.native
    def processOrphanRelations(): Unit = js.native
    def register(model: Model): Unit = js.native
    def removeModelScope(scope: js.Any): Unit = js.native
    def reset(): Unit = js.native
    def resolveIdForItem(`type`: js.Any, item: js.Any): js.Any = js.native
    def retroFitRelation(relation: Model, create: Boolean): Collection[typings.backbone.backboneMod.Model] = js.native
    def setupSuperModel(modelType: Model): Unit = js.native
    def unregister(`type`: Collection[Model]): Unit = js.native
    def unregister(`type`: TypeofClassModel): Unit = js.native
    // tslint:disable-next-line use-default-type-parameter
    def unregister(`type`: Model): Unit = js.native
    def update(model: Model): Unit = js.native
  }
  
  val store: Store = js.native
  /* static members */
  @js.native
  object Model extends js.Object {
    def build(attributes: js.Any): js.Any = js.native
    def build(attributes: js.Any, options: js.Any): js.Any = js.native
    def findOrCreate(attributes: String): js.Any = js.native
    def findOrCreate(attributes: String, options: js.Any): js.Any = js.native
    def findOrCreate(attributes: js.Any): js.Any = js.native
    def findOrCreate(attributes: js.Any, options: js.Any): js.Any = js.native
    def findOrCreate(attributes: Double): js.Any = js.native
    def findOrCreate(attributes: Double, options: js.Any): js.Any = js.native
    def setup(): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Store extends js.Object {
    def find(`type`: js.Any, item: String): Model = js.native
    def find(`type`: js.Any, item: js.Any): Model = js.native
    def find(`type`: js.Any, item: Double): Model = js.native
    def find(`type`: js.Any, item: Model): Model = js.native
  }
  
}

