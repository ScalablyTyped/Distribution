package typings.backboneAssociations

import org.scalablytyped.runtime.Instantiable0
import typings.backbone.mod.Collection
import typings.backbone.mod.CombinedModelConstructorOptions
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.backboneAssociations.mod.Associations.IRelation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @JSImport("backbone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("backbone", "AssociatedModel")
  @js.native
  class AssociatedModel ()
    extends Model[js.Any, ModelSetOptions, js.Object] {
    def this(attributes: js.Any) = this()
    def this(
      attributes: js.Any,
      options: CombinedModelConstructorOptions[js.Object, Model[js.Any, ModelSetOptions, js.Object]]
    ) = this()
    def this(
      attributes: Unit,
      options: CombinedModelConstructorOptions[js.Object, Model[js.Any, ModelSetOptions, js.Object]]
    ) = this()
    
    var _proxyCalls: js.Any = js.native
    
    /** Cleans up any parent relations on other AssociatedModels */
    def cleanup(): Unit = js.native
    
    /** Reverse association lookup for objects that contain this object */
    var parents: js.Array[js.Any] = js.native
    
    /** Relations with their associated model */
    var relations: js.Array[IRelation] = js.native
  }
  
  object Associations {
    
    @JSImport("backbone", "Associations")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("backbone", "Associations.AssociatedModel")
    @js.native
    class AssociatedModel ()
      extends Model[js.Any, ModelSetOptions, js.Object] {
      def this(attributes: js.Any) = this()
      def this(
        attributes: js.Any,
        options: CombinedModelConstructorOptions[js.Object, Model[js.Any, ModelSetOptions, js.Object]]
      ) = this()
      def this(
        attributes: Unit,
        options: CombinedModelConstructorOptions[js.Object, Model[js.Any, ModelSetOptions, js.Object]]
      ) = this()
      
      var _proxyCalls: js.Any = js.native
      
      /** Cleans up any parent relations on other AssociatedModels */
      def cleanup(): Unit = js.native
      
      /** Reverse association lookup for objects that contain this object */
      var parents: js.Array[js.Any] = js.native
      
      /** Relations with their associated model */
      var relations: js.Array[IRelation] = js.native
    }
    
    @JSImport("backbone", "Associations.EVENTS_BUBBLE")
    @js.native
    def EVENTS_BUBBLE: Boolean = js.native
    @scala.inline
    def EVENTS_BUBBLE_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENTS_BUBBLE")(x.asInstanceOf[js.Any])
    
    @JSImport("backbone", "Associations.EVENTS_NC")
    @js.native
    def EVENTS_NC: Boolean = js.native
    @scala.inline
    def EVENTS_NC_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENTS_NC")(x.asInstanceOf[js.Any])
    
    @JSImport("backbone", "Associations.EVENTS_WILDCARD")
    @js.native
    def EVENTS_WILDCARD: Boolean = js.native
    @scala.inline
    def EVENTS_WILDCARD_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENTS_WILDCARD")(x.asInstanceOf[js.Any])
    
    @JSImport("backbone", "Associations.Many")
    @js.native
    def Many: String = js.native
    @scala.inline
    def Many_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Many")(x.asInstanceOf[js.Any])
    
    @JSImport("backbone", "Associations.One")
    @js.native
    def One: String = js.native
    @scala.inline
    def One_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("One")(x.asInstanceOf[js.Any])
    
    @JSImport("backbone", "Associations.SEPARATOR")
    @js.native
    def SEPARATOR: String = js.native
    @scala.inline
    def SEPARATOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEPARATOR")(x.asInstanceOf[js.Any])
    
    @JSImport("backbone", "Associations.Self")
    @js.native
    def Self: String = js.native
    @scala.inline
    def Self_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Self")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def getSeparator(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeparator")().asInstanceOf[js.Any]
    
    @scala.inline
    def setSeparator(value: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSeparator")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    trait IRelation extends StObject {
      
      /** Determines the type of collection used. If used, the relatedModel property is ignored */
      var collectionType: js.UndefOr[String | Instantiable0[Collection[js.Any]]] = js.undefined
      
      /** If set to true, then the attribute will not be serialized in toJSON() calls. Defaults to false */
      var isTransient: js.UndefOr[Boolean] = js.undefined
      
      /** The key for this relationship on this model */
      var key: String
      
      /** A transformation function to convert the value before it is assigned to the key on the relatedModel */
      var map: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
      
      /** The type of model for this relationship */
      var relatedModel: String | Instantiable0[typings.backboneAssociations.mod.Associations.AssociatedModel]
      
      /** Specify remoteKey to serialize the key to a different key name in toJSON() calls. Useful in ROR nested-attributes like scenarios. */
      var remoteKey: js.UndefOr[String] = js.undefined
      
      /** the attributes to serialize when calling toJSON */
      var serialize: js.UndefOr[js.Array[String]] = js.undefined
      
      // meh, no string enums in TS. Just have to trust the user not to be a fool
      /** The cardinality of this relationship. */
      var `type`: String
    }
    object IRelation {
      
      @scala.inline
      def apply(
        key: String,
        relatedModel: String | Instantiable0[typings.backboneAssociations.mod.Associations.AssociatedModel],
        `type`: String
      ): IRelation = {
        val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], relatedModel = relatedModel.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[IRelation]
      }
      
      @scala.inline
      implicit class IRelationMutableBuilder[Self <: IRelation] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCollectionType(value: String | Instantiable0[Collection[js.Any]]): Self = StObject.set(x, "collectionType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCollectionTypeUndefined: Self = StObject.set(x, "collectionType", js.undefined)
        
        @scala.inline
        def setIsTransient(value: Boolean): Self = StObject.set(x, "isTransient", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsTransientUndefined: Self = StObject.set(x, "isTransient", js.undefined)
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMap(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
        
        @scala.inline
        def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
        
        @scala.inline
        def setRelatedModel(value: String | Instantiable0[typings.backboneAssociations.mod.Associations.AssociatedModel]): Self = StObject.set(x, "relatedModel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRemoteKey(value: String): Self = StObject.set(x, "remoteKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRemoteKeyUndefined: Self = StObject.set(x, "remoteKey", js.undefined)
        
        @scala.inline
        def setSerialize(value: js.Array[String]): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
        
        @scala.inline
        def setSerializeVarargs(value: String*): Self = StObject.set(x, "serialize", js.Array(value :_*))
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("backbone", "Many")
  @js.native
  def Many: String = js.native
  @scala.inline
  def Many_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Many")(x.asInstanceOf[js.Any])
  
  @JSImport("backbone", "One")
  @js.native
  def One: String = js.native
  @scala.inline
  def One_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("One")(x.asInstanceOf[js.Any])
  
  @JSImport("backbone", "Self")
  @js.native
  def Self: String = js.native
  @scala.inline
  def Self_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Self")(x.asInstanceOf[js.Any])
}
