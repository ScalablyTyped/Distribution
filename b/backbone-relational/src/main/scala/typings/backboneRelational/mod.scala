package typings.backboneRelational

import typings.backbone.mod.Collection
import typings.backbone.mod.CombinedModelConstructorOptions
import typings.backbone.mod.EventsMixin
import typings.backbone.mod.ModelSetOptions
import typings.backboneRelational.anon.TypeofModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("backbone-relational", "HasMany")
  @js.native
  class HasMany () extends Relation {
    def this(attributes: js.Any) = this()
    def this(
      attributes: js.UndefOr[scala.Nothing],
      options: CombinedModelConstructorOptions[js.Object, typings.backbone.mod.Model[_, ModelSetOptions, js.Object]]
    ) = this()
    def this(
      attributes: js.Any,
      options: CombinedModelConstructorOptions[js.Object, typings.backbone.mod.Model[_, ModelSetOptions, js.Object]]
    ) = this()
    
    def addRelated(model: typings.backbone.mod.Model[_, ModelSetOptions, js.Object], options: js.Any): Unit = js.native
    
    var collectionType: js.Any = js.native
    
    def findRelated(options: js.Any): typings.backbone.mod.Model[_, ModelSetOptions, js.Object] = js.native
    
    def onChange(model: typings.backbone.mod.Model[_, ModelSetOptions, js.Object], attr: js.Any, options: js.Any): Unit = js.native
    
    def removeRelated(model: typings.backbone.mod.Model[_, ModelSetOptions, js.Object], coll: js.Any, options: js.Any): Unit = js.native
    
    def setKeyContents(keyContents: String): Unit = js.native
    def setKeyContents(keyContents: Double): Unit = js.native
    def setKeyContents(keyContents: typings.backbone.mod.Model[_, ModelSetOptions, js.Object]): Unit = js.native
    
    def tryAddRelated(model: typings.backbone.mod.Model[_, ModelSetOptions, js.Object], coll: js.Any, options: js.Any): Unit = js.native
  }
  
  @JSImport("backbone-relational", "HasOne")
  @js.native
  class HasOne () extends Relation {
    def this(attributes: js.Any) = this()
    def this(
      attributes: js.UndefOr[scala.Nothing],
      options: CombinedModelConstructorOptions[js.Object, typings.backbone.mod.Model[_, ModelSetOptions, js.Object]]
    ) = this()
    def this(
      attributes: js.Any,
      options: CombinedModelConstructorOptions[js.Object, typings.backbone.mod.Model[_, ModelSetOptions, js.Object]]
    ) = this()
    
    def addRelated(model: typings.backbone.mod.Model[_, ModelSetOptions, js.Object], options: js.Any): Unit = js.native
    
    var collectionType: js.Any = js.native
    
    def findRelated(options: js.Any): typings.backbone.mod.Model[_, ModelSetOptions, js.Object] = js.native
    
    def handleAddition(
      model: typings.backbone.mod.Model[_, ModelSetOptions, js.Object],
      coll: Collection[typings.backbone.mod.Model[_, ModelSetOptions, js.Object]],
      options: js.Any
    ): Unit = js.native
    
    def handleRemoval(
      model: typings.backbone.mod.Model[_, ModelSetOptions, js.Object],
      coll: Collection[typings.backbone.mod.Model[_, ModelSetOptions, js.Object]],
      options: js.Any
    ): Unit = js.native
    
    def handleReset(coll: Collection[typings.backbone.mod.Model[_, ModelSetOptions, js.Object]], options: js.Any): Unit = js.native
    
    def onChange(model: typings.backbone.mod.Model[_, ModelSetOptions, js.Object], attr: js.Any, options: js.Any): Unit = js.native
    
    def removeRelated(model: typings.backbone.mod.Model[_, ModelSetOptions, js.Object], coll: js.Any, options: js.Any): Unit = js.native
    
    def setKeyContents(keyContents: String): Unit = js.native
    def setKeyContents(keyContents: js.Array[Double | String]): Unit = js.native
    def setKeyContents(keyContents: Double): Unit = js.native
    def setKeyContents(keyContents: Collection[typings.backbone.mod.Model[_, ModelSetOptions, js.Object]]): Unit = js.native
    
    def tryAddRelated(model: typings.backbone.mod.Model[_, ModelSetOptions, js.Object], coll: js.Any, options: js.Any): Unit = js.native
  }
  
  @JSImport("backbone-relational", "Model")
  @js.native
  class Model ()
    extends typings.backbone.mod.Model[js.Any, ModelSetOptions, js.Object] {
    def this(attributes: js.Any) = this()
    def this(
      attributes: js.UndefOr[scala.Nothing],
      options: CombinedModelConstructorOptions[js.Object, typings.backbone.mod.Model[_, ModelSetOptions, js.Object]]
    ) = this()
    def this(
      attributes: js.Any,
      options: CombinedModelConstructorOptions[js.Object, typings.backbone.mod.Model[_, ModelSetOptions, js.Object]]
    ) = this()
    
    def fetchRelated(key: String): js.Any = js.native
    def fetchRelated(key: String, options: js.UndefOr[scala.Nothing], update: Boolean): js.Any = js.native
    def fetchRelated(key: String, options: js.Any): js.Any = js.native
    def fetchRelated(key: String, options: js.Any, update: Boolean): js.Any = js.native
    
    def getRelation(name: String): Relation = js.native
    
    def getRelations(): js.Array[Relation] = js.native
    
    def initializeRelations(options: js.Any): Unit = js.native
    
    def processQueue(): Unit = js.native
    
    def queue(func: js.Any): Unit = js.native
    
    /**
      * Do not use, prefer TypeScript's extend functionality.
      **/
    //private static extend(properties:any, classProperties?:any):any;
    var relations: js.Any = js.native
    
    var subModelTypeAttribute: js.Any = js.native
    
    var subModelTypes: js.Any = js.native
    
    def toJSON(): js.Any = js.native
    def toJSON(options: js.Any): js.Any = js.native
    
    def updateRelations(options: js.Any): Unit = js.native
  }
  /* static members */
  object Model {
    
    @JSImport("backbone-relational", "Model.build")
    @js.native
    def build(attributes: js.Any): js.Any = js.native
    @JSImport("backbone-relational", "Model.build")
    @js.native
    def build(attributes: js.Any, options: js.Any): js.Any = js.native
    
    @JSImport("backbone-relational", "Model.findOrCreate")
    @js.native
    def findOrCreate(attributes: String): js.Any = js.native
    @JSImport("backbone-relational", "Model.findOrCreate")
    @js.native
    def findOrCreate(attributes: String, options: js.Any): js.Any = js.native
    @JSImport("backbone-relational", "Model.findOrCreate")
    @js.native
    def findOrCreate(attributes: js.Any): js.Any = js.native
    @JSImport("backbone-relational", "Model.findOrCreate")
    @js.native
    def findOrCreate(attributes: js.Any, options: js.Any): js.Any = js.native
    @JSImport("backbone-relational", "Model.findOrCreate")
    @js.native
    def findOrCreate(attributes: Double): js.Any = js.native
    @JSImport("backbone-relational", "Model.findOrCreate")
    @js.native
    def findOrCreate(attributes: Double, options: js.Any): js.Any = js.native
    
    @JSImport("backbone-relational", "Model.setup")
    @js.native
    def setup(): js.Any = js.native
  }
  
  @JSImport("backbone-relational", "Relation")
  @js.native
  class Relation ()
    extends typings.backbone.mod.Model[js.Any, ModelSetOptions, js.Object] {
    def this(attributes: js.Any) = this()
    def this(
      attributes: js.UndefOr[scala.Nothing],
      options: CombinedModelConstructorOptions[js.Object, typings.backbone.mod.Model[_, ModelSetOptions, js.Object]]
    ) = this()
    def this(
      attributes: js.Any,
      options: CombinedModelConstructorOptions[js.Object, typings.backbone.mod.Model[_, ModelSetOptions, js.Object]]
    ) = this()
    
    def checkPreconditions(): Boolean = js.native
    
    def getReverseRelations(model: Model): Relation = js.native
    
    var instance: js.Any = js.native
    
    var key: js.Any = js.native
    
    var keyContents: js.Any = js.native
    
    var options: js.Any = js.native
    
    var related: js.Any = js.native
    
    var relatedCollection: js.Any = js.native
    
    var relatedModel: js.Any = js.native
    
    var reverseRelation: js.Any = js.native
    
    def setRelated(related: Collection[typings.backbone.mod.Model[_, ModelSetOptions, js.Object]]): Unit = js.native
    def setRelated(related: typings.backbone.mod.Model[_, ModelSetOptions, js.Object]): Unit = js.native
  }
  
  @JSImport("backbone-relational", "Store")
  @js.native
  class Store_ () extends EventsMixin {
    
    def addModelScope(scope: js.Any): Unit = js.native
    
    def addOrphanRelation(relation: js.Any): Unit = js.native
    
    def addReverseRelation(relation: js.Any): Unit = js.native
    
    def addSubModels(subModelTypes: Model, superModelType: Model): Unit = js.native
    
    def checkId(model: Model, id: js.Any): Unit = js.native
    
    def getCollection(`type`: Model, create: Boolean): Collection[typings.backbone.mod.Model[_, ModelSetOptions, js.Object]] = js.native
    
    def getObjectByName(name: String): js.Any = js.native
    
    def initializeRelation(model: js.Any, relation: js.Any, options: js.Any): js.Any = js.native
    
    def processOrphanRelations(): Unit = js.native
    
    def register(model: Model): Unit = js.native
    
    def removeModelScope(scope: js.Any): Unit = js.native
    
    def reset(): Unit = js.native
    
    def resolveIdForItem(`type`: js.Any, item: js.Any): js.Any = js.native
    
    def retroFitRelation(relation: Model, create: Boolean): Collection[typings.backbone.mod.Model[_, ModelSetOptions, js.Object]] = js.native
    
    def setupSuperModel(modelType: Model): Unit = js.native
    
    def unregister(`type`: Collection[Model]): Unit = js.native
    def unregister(`type`: TypeofModel): Unit = js.native
    // tslint:disable-next-line use-default-type-parameter
    def unregister(`type`: Model): Unit = js.native
    
    def update(model: Model): Unit = js.native
  }
  /* static members */
  object Store_ {
    
    @JSImport("backbone-relational", "Store.find")
    @js.native
    def find(`type`: js.Any, item: String): Model = js.native
    @JSImport("backbone-relational", "Store.find")
    @js.native
    def find(`type`: js.Any, item: js.Any): Model = js.native
    @JSImport("backbone-relational", "Store.find")
    @js.native
    def find(`type`: js.Any, item: Double): Model = js.native
    @JSImport("backbone-relational", "Store.find")
    @js.native
    def find(`type`: js.Any, item: Model): Model = js.native
  }
  
  @JSImport("backbone-relational", "store")
  @js.native
  val store: Store_ = js.native
}
