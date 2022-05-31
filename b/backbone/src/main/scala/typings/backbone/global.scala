package typings.backbone

import typings.backbone.anon.Typeofbackbone
import typings.backbone.mod.CombinedModelConstructorOptions
import typings.backbone.mod.ModelSetOptions
import typings.backbone.mod.RouterOptions
import typings.backbone.mod.ViewOptions
import typings.jquery.JQueryAjaxSettings
import typings.jquery.JQueryStatic
import typings.jquery.JQueryXHR
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
    class Collection[TModel /* <: typings.backbone.mod.Model[js.Any, ModelSetOptions, js.Object] */] () extends StObject {
      def this(models: js.Array[js.Object | TModel]) = this()
      def this(models: js.Array[js.Object | TModel], options: js.Any) = this()
      def this(models: Unit, options: js.Any) = this()
    }
    object Collection {
      
      @JSGlobal("Backbone.Collection")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Do not use, prefer TypeScript's extend functionality.
        **/
      /* static member */
      inline def extend(properties: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      inline def extend(properties: js.Any, classProperties: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any], classProperties.asInstanceOf[js.Any])).asInstanceOf[js.Any]
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
    @JSGlobal("Backbone.EventsMixin")
    @js.native
    abstract class EventsMixin () extends StObject
    
    @JSGlobal("Backbone.History")
    @js.native
    class History_ () extends StObject
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
    class Model[T, S, E] () extends StObject {
      def this(attributes: T) = this()
      def this(
        attributes: T,
        options: CombinedModelConstructorOptions[E, typings.backbone.mod.Model[js.Any, ModelSetOptions, js.Object]]
      ) = this()
      def this(
        attributes: Unit,
        options: CombinedModelConstructorOptions[E, typings.backbone.mod.Model[js.Any, ModelSetOptions, js.Object]]
      ) = this()
    }
    object Model {
      
      @JSGlobal("Backbone.Model")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Do not use, prefer TypeScript's extend functionality.
        **/
      /* static member */
      inline def extend(properties: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      inline def extend(properties: js.Any, classProperties: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any], classProperties.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    }
    
    @JSGlobal("Backbone.ModelBase")
    @js.native
    class ModelBase () extends StObject
    
    @JSGlobal("Backbone.Router")
    @js.native
    class Router () extends StObject {
      def this(options: RouterOptions) = this()
    }
    object Router {
      
      @JSGlobal("Backbone.Router")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Do not use, prefer TypeScript's extend functionality.
        **/
      /* static member */
      inline def extend(properties: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      inline def extend(properties: js.Any, classProperties: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any], classProperties.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    }
    
    @JSGlobal("Backbone.View")
    @js.native
    class View[TModel /* <: typings.backbone.mod.Model[js.Any, ModelSetOptions, js.Object] */] () extends StObject {
      def this(options: ViewOptions[TModel]) = this()
    }
    object View {
      
      @JSGlobal("Backbone.View")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Do not use, prefer TypeScript's extend functionality.
        **/
      /* static member */
      inline def extend(properties: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      inline def extend(properties: js.Any, classProperties: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any], classProperties.asInstanceOf[js.Any])).asInstanceOf[js.Any]
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
    def history: typings.backbone.mod.History_ = js.native
    inline def history_=(x: typings.backbone.mod.History_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("history")(x.asInstanceOf[js.Any])
    
    // Utility
    inline def noConflict(): Typeofbackbone = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[Typeofbackbone]
    
    inline def sync(
      method: String,
      model: typings.backbone.mod.Collection[typings.backbone.mod.Model[js.Any, ModelSetOptions, js.Object]]
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(method.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def sync(
      method: String,
      model: typings.backbone.mod.Collection[typings.backbone.mod.Model[js.Any, ModelSetOptions, js.Object]],
      options: JQueryAjaxSettings
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(method.asInstanceOf[js.Any], model.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    // SYNC
    inline def sync(method: String, model: typings.backbone.mod.Model[js.Any, ModelSetOptions, js.Object]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(method.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def sync(
      method: String,
      model: typings.backbone.mod.Model[js.Any, ModelSetOptions, js.Object],
      options: JQueryAjaxSettings
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(method.asInstanceOf[js.Any], model.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
}
