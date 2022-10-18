package typings.backbone

import typings.backbone.anon.Typeofbackbone
import typings.backbone.mod.CombinedModelConstructorOptions
import typings.backbone.mod.ModelSetOptions
import typings.backbone.mod.ObjectHash
import typings.backbone.mod.RouterOptions
import typings.backbone.mod.ViewOptions
import typings.jquery.JQueryAjaxSettings
import typings.jquery.JQueryStatic
import typings.jquery.JQueryXHR
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Backbone {
    
    @JSGlobal("Backbone")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Backbone.Collection")
    @js.native
    open class Collection[TModel /* <: typings.backbone.mod.Model[Any, ModelSetOptions, Any] */] () extends StObject {
      def this(models: js.Array[(Record[String, Any]) | TModel]) = this()
      def this(models: js.Array[(Record[String, Any]) | TModel], options: Any) = this()
      def this(models: Unit, options: Any) = this()
    }
    object Collection {
      
      @JSGlobal("Backbone.Collection")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Do not use, prefer TypeScript's extend functionality.
        */
      /* static member */
      inline def extend(properties: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any]).asInstanceOf[Any]
      inline def extend(properties: Any, classProperties: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any], classProperties.asInstanceOf[js.Any])).asInstanceOf[Any]
    }
    
    @JSGlobal("Backbone.Events")
    @js.native
    val Events: typings.backbone.mod.Events = js.native
    
    /**
      * Helper to avoid code repetition in type declarations.
      * Backbone.Events cannot be extended, hence a separate abstract
      * class with a different name. Both classes and interfaces can
      * extend from this helper class to reuse the signatures.
      *
      * For class type declarations that already extend another base
      * class, and for actual class definitions, please see the
      * Events_* interfaces above.
      */
    /* note: abstract class */ @JSGlobal("Backbone.EventsMixin")
    @js.native
    open class EventsMixin () extends StObject
    
    @JSGlobal("Backbone.History")
    @js.native
    open class History_ () extends StObject
    object History_ {
      
      @JSGlobal("Backbone.History")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Backbone.History.started")
      @js.native
      def started: Boolean = js.native
      inline def started_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("started")(x.asInstanceOf[js.Any])
    }
    
    /**
      * E - Extensions to the model constructor options. You can accept additional constructor options
      * by listing them in the E parameter.
      */
    @JSGlobal("Backbone.Model")
    @js.native
    open class Model[T /* <: ObjectHash */, S, E] () extends StObject {
      def this(attributes: T) = this()
      def this(
        attributes: T,
        options: CombinedModelConstructorOptions[E, typings.backbone.mod.Model[Any, ModelSetOptions, Any]]
      ) = this()
      def this(
        attributes: Unit,
        options: CombinedModelConstructorOptions[E, typings.backbone.mod.Model[Any, ModelSetOptions, Any]]
      ) = this()
    }
    object Model {
      
      @JSGlobal("Backbone.Model")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Do not use, prefer TypeScript's extend functionality.
        */
      /* static member */
      inline def extend(properties: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any]).asInstanceOf[Any]
      inline def extend(properties: Any, classProperties: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any], classProperties.asInstanceOf[js.Any])).asInstanceOf[Any]
    }
    
    @JSGlobal("Backbone.ModelBase")
    @js.native
    open class ModelBase () extends StObject
    
    @JSGlobal("Backbone.Router")
    @js.native
    open class Router () extends StObject {
      def this(options: RouterOptions) = this()
    }
    object Router {
      
      @JSGlobal("Backbone.Router")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Do not use, prefer TypeScript's extend functionality.
        */
      /* static member */
      inline def extend(properties: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any]).asInstanceOf[Any]
      inline def extend(properties: Any, classProperties: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any], classProperties.asInstanceOf[js.Any])).asInstanceOf[Any]
    }
    
    @JSGlobal("Backbone.View")
    @js.native
    open class View[TModel /* <: js.UndefOr[typings.backbone.mod.Model[Any, ModelSetOptions, Any]] */, TElement /* <: Element */] () extends StObject {
      def this(options: ViewOptions[TModel, TElement]) = this()
    }
    object View {
      
      @JSGlobal("Backbone.View")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Do not use, prefer TypeScript's extend functionality.
        */
      /* static member */
      inline def extend(properties: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any]).asInstanceOf[Any]
      inline def extend(properties: Any, classProperties: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any], classProperties.asInstanceOf[js.Any])).asInstanceOf[Any]
    }
    
    @JSGlobal("Backbone.$")
    @js.native
    def _empty: JQueryStatic = js.native
    
    inline def _empty_=(x: JQueryStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$")(x.asInstanceOf[js.Any])
    
    inline def ajax(): JQueryXHR = ^.asInstanceOf[js.Dynamic].applyDynamic("ajax")().asInstanceOf[JQueryXHR]
    inline def ajax(options: JQueryAjaxSettings): JQueryXHR = ^.asInstanceOf[js.Dynamic].applyDynamic("ajax")(options.asInstanceOf[js.Any]).asInstanceOf[JQueryXHR]
    
    @JSGlobal("Backbone.emulateHTTP")
    @js.native
    def emulateHTTP: Boolean = js.native
    inline def emulateHTTP_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emulateHTTP")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Backbone.emulateJSON")
    @js.native
    def emulateJSON: Boolean = js.native
    inline def emulateJSON_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emulateJSON")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Backbone.history")
    @js.native
    val history: typings.backbone.mod.History_ = js.native
    
    // Utility
    inline def noConflict(): Typeofbackbone = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[Typeofbackbone]
    
    inline def sync(
      method: String,
      model: typings.backbone.mod.Collection[typings.backbone.mod.Model[Any, ModelSetOptions, Any]]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(method.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def sync(
      method: String,
      model: typings.backbone.mod.Collection[typings.backbone.mod.Model[Any, ModelSetOptions, Any]],
      options: JQueryAjaxSettings
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(method.asInstanceOf[js.Any], model.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    // SYNC
    inline def sync(method: String, model: typings.backbone.mod.Model[Any, ModelSetOptions, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(method.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def sync(
      method: String,
      model: typings.backbone.mod.Model[Any, ModelSetOptions, Any],
      options: JQueryAjaxSettings
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(method.asInstanceOf[js.Any], model.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
}
