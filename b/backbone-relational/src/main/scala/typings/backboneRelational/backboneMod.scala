package typings.backboneRelational

import typings.backbone.mod.Collection
import typings.backbone.mod.CombinedModelConstructorOptions
import typings.backbone.mod.EventsMixin
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.backboneRelational.anon.TypeofRelationalModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object backboneMod {
  
  @JSImport("backbone", "HasMany")
  @js.native
  open class HasMany () extends Relation {
    def this(attributes: Any) = this()
    def this(attributes: Any, options: CombinedModelConstructorOptions[Any, Model[Any, ModelSetOptions, Any]]) = this()
    def this(attributes: Unit, options: CombinedModelConstructorOptions[Any, Model[Any, ModelSetOptions, Any]]) = this()
    
    def addRelated(model: Model[Any, ModelSetOptions, Any], options: Any): Unit = js.native
    
    var collectionType: Any = js.native
    
    def findRelated(options: Any): Model[Any, ModelSetOptions, Any] = js.native
    
    def onChange(model: Model[Any, ModelSetOptions, Any], attr: Any, options: Any): Unit = js.native
    
    def removeRelated(model: Model[Any, ModelSetOptions, Any], coll: Any, options: Any): Unit = js.native
    
    def setKeyContents(keyContents: String): Unit = js.native
    def setKeyContents(keyContents: Double): Unit = js.native
    def setKeyContents(keyContents: Model[Any, ModelSetOptions, Any]): Unit = js.native
    
    def tryAddRelated(model: Model[Any, ModelSetOptions, Any], coll: Any, options: Any): Unit = js.native
  }
  
  @JSImport("backbone", "HasOne")
  @js.native
  open class HasOne () extends Relation {
    def this(attributes: Any) = this()
    def this(attributes: Any, options: CombinedModelConstructorOptions[Any, Model[Any, ModelSetOptions, Any]]) = this()
    def this(attributes: Unit, options: CombinedModelConstructorOptions[Any, Model[Any, ModelSetOptions, Any]]) = this()
    
    def addRelated(model: Model[Any, ModelSetOptions, Any], options: Any): Unit = js.native
    
    var collectionType: Any = js.native
    
    def findRelated(options: Any): Model[Any, ModelSetOptions, Any] = js.native
    
    def handleAddition(
      model: Model[Any, ModelSetOptions, Any],
      coll: Collection[Model[Any, ModelSetOptions, Any]],
      options: Any
    ): Unit = js.native
    
    def handleRemoval(
      model: Model[Any, ModelSetOptions, Any],
      coll: Collection[Model[Any, ModelSetOptions, Any]],
      options: Any
    ): Unit = js.native
    
    def handleReset(coll: Collection[Model[Any, ModelSetOptions, Any]], options: Any): Unit = js.native
    
    def onChange(model: Model[Any, ModelSetOptions, Any], attr: Any, options: Any): Unit = js.native
    
    def removeRelated(model: Model[Any, ModelSetOptions, Any], coll: Any, options: Any): Unit = js.native
    
    def setKeyContents(keyContents: String): Unit = js.native
    def setKeyContents(keyContents: js.Array[Double | String]): Unit = js.native
    def setKeyContents(keyContents: Double): Unit = js.native
    def setKeyContents(keyContents: Collection[Model[Any, ModelSetOptions, Any]]): Unit = js.native
    
    def tryAddRelated(model: Model[Any, ModelSetOptions, Any], coll: Any, options: Any): Unit = js.native
  }
  
  @JSImport("backbone", "Relation")
  @js.native
  open class Relation () extends Model[Any, ModelSetOptions, Any] {
    def this(attributes: Any) = this()
    def this(attributes: Any, options: CombinedModelConstructorOptions[Any, Model[Any, ModelSetOptions, Any]]) = this()
    def this(attributes: Unit, options: CombinedModelConstructorOptions[Any, Model[Any, ModelSetOptions, Any]]) = this()
    
    def checkPreconditions(): Boolean = js.native
    
    def getReverseRelations(model: RelationalModel): Relation = js.native
    
    var instance: Any = js.native
    
    var key: Any = js.native
    
    var keyContents: Any = js.native
    
    var options: Any = js.native
    
    var related: Any = js.native
    
    var relatedCollection: Any = js.native
    
    var relatedModel: Any = js.native
    
    var reverseRelation: Any = js.native
    
    def setRelated(related: Collection[Model[Any, ModelSetOptions, Any]]): Unit = js.native
    def setRelated(related: Model[Any, ModelSetOptions, Any]): Unit = js.native
  }
  
  @JSImport("backbone", "RelationalModel")
  @js.native
  open class RelationalModel () extends Model[Any, ModelSetOptions, Any] {
    def this(attributes: Any) = this()
    def this(attributes: Any, options: CombinedModelConstructorOptions[Any, Model[Any, ModelSetOptions, Any]]) = this()
    def this(attributes: Unit, options: CombinedModelConstructorOptions[Any, Model[Any, ModelSetOptions, Any]]) = this()
    
    def fetchRelated(key: String): Any = js.native
    def fetchRelated(key: String, options: Any): Any = js.native
    def fetchRelated(key: String, options: Any, update: Boolean): Any = js.native
    def fetchRelated(key: String, options: Unit, update: Boolean): Any = js.native
    
    def getRelation(name: String): Relation = js.native
    
    def getRelations(): js.Array[Relation] = js.native
    
    def initializeRelations(options: Any): Unit = js.native
    
    def processQueue(): Unit = js.native
    
    def queue(func: Any): Unit = js.native
    
    /**
      * Do not use, prefer TypeScript's extend functionality.
      **/
    //private static extend(properties:any, classProperties?:any):any;
    var relations: Any = js.native
    
    var subModelTypeAttribute: Any = js.native
    
    var subModelTypes: Any = js.native
    
    def toJSON(): Any = js.native
    def toJSON(options: Any): Any = js.native
    
    def updateRelations(options: Any): Unit = js.native
  }
  /* static members */
  object RelationalModel {
    
    @JSImport("backbone", "RelationalModel")
    @js.native
    val ^ : js.Any = js.native
    
    inline def build(attributes: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(attributes.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def build(attributes: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(attributes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def findOrCreate(attributes: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findOrCreate")(attributes.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def findOrCreate(attributes: String, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findOrCreate")(attributes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def findOrCreate(attributes: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findOrCreate")(attributes.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def findOrCreate(attributes: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findOrCreate")(attributes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def findOrCreate(attributes: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findOrCreate")(attributes.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def findOrCreate(attributes: Double, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findOrCreate")(attributes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def setup(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")().asInstanceOf[Any]
  }
  
  @JSImport("backbone", "Store")
  @js.native
  open class Store_ () extends EventsMixin {
    
    def addModelScope(scope: Any): Unit = js.native
    
    def addOrphanRelation(relation: Any): Unit = js.native
    
    def addReverseRelation(relation: Any): Unit = js.native
    
    def addSubModels(subModelTypes: RelationalModel, superModelType: RelationalModel): Unit = js.native
    
    def checkId(model: RelationalModel, id: Any): Unit = js.native
    
    def getCollection(`type`: RelationalModel, create: Boolean): Collection[Model[Any, ModelSetOptions, Any]] = js.native
    
    def getObjectByName(name: String): Any = js.native
    
    def initializeRelation(model: Any, relation: Any, options: Any): Any = js.native
    
    def processOrphanRelations(): Unit = js.native
    
    def register(model: RelationalModel): Unit = js.native
    
    def removeModelScope(scope: Any): Unit = js.native
    
    def reset(): Unit = js.native
    
    def resolveIdForItem(`type`: Any, item: Any): Any = js.native
    
    def retroFitRelation(relation: RelationalModel, create: Boolean): Collection[Model[Any, ModelSetOptions, Any]] = js.native
    
    def setupSuperModel(modelType: RelationalModel): Unit = js.native
    
    def unregister(`type`: Collection[Model[Any, ModelSetOptions, Any]]): Unit = js.native
    def unregister(`type`: TypeofRelationalModel): Unit = js.native
    // tslint:disable-next-line use-default-type-parameter
    def unregister(`type`: RelationalModel): Unit = js.native
    
    def update(model: RelationalModel): Unit = js.native
  }
  /* static members */
  object Store_ {
    
    @JSImport("backbone", "Store")
    @js.native
    val ^ : js.Any = js.native
    
    inline def find(`type`: Any, item: String): RelationalModel = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(`type`.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[RelationalModel]
    inline def find(`type`: Any, item: Any): RelationalModel = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(`type`.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[RelationalModel]
    inline def find(`type`: Any, item: Double): RelationalModel = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(`type`.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[RelationalModel]
    inline def find(`type`: Any, item: RelationalModel): RelationalModel = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(`type`.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[RelationalModel]
  }
  
  @JSImport("backbone", "store")
  @js.native
  val store: Store_ = js.native
}
