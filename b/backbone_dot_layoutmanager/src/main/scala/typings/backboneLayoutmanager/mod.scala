package typings.backboneLayoutmanager

import org.scalablytyped.runtime.StringDictionary
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.backbone.mod.View
import typings.backbone.mod.ViewOptions
import typings.jquery.JQueryPromise
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @JSImport("backbone", "Layout")
  @js.native
  open class Layout[TModel /* <: Model[Any, ModelSetOptions, Any] */] () extends View[TModel, HTMLElement] {
    def this(options: LayoutOptions[TModel]) = this()
    
    def afterRender(): Unit = js.native
    
    def async(): js.Function1[/* compiled */ js.Function1[/* context */ Any, Unit], Unit] = js.native
    
    def beforeRender(): Unit = js.native
    
    def cleanup(): Unit = js.native
    
    def fetchTemplate(path: String): js.Function1[/* context */ Any, String] = js.native
    
    def getAllOptions(): LayoutOptions[TModel] = js.native
    
    def getView(): Any = js.native
    def getView(fn: Any): Any = js.native
    
    def getViews(): js.Array[Any] = js.native
    def getViews(fn: Any): js.Array[Any] = js.native
    
    def insertView(selector: Any): Any = js.native
    def insertView(selector: Any, view: Any): Any = js.native
    
    // return view;
    def insertViews(views: Any): Layout[TModel] = js.native
    
    def promise(): JQueryPromise[Any] = js.native
    
    def removeView(fn: Any): Layout[TModel] = js.native
    
    def renderViews(): Layout[TModel] = js.native
    
    // return this
    def setView[U](name: Any, view: U): U = js.native
    def setView[U](name: Any, view: U, insert: Boolean): U = js.native
    
    // return view
    def setViews(views: Any): Layout[TModel] = js.native
    
    var template: String = js.native
    
    // return this
    def `then`(fn: js.Function0[Unit]): Unit = js.native
  }
  /* static members */
  object Layout {
    
    @JSImport("backbone", "Layout")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cache(path: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cache")(path.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def cache(path: String, contents: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("cache")(path.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def cleanViews(views: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanViews")(views.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def configure(options: LayoutManagerOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setupView(views: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupView")(views.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setupView(views: Any, options: LayoutOptions[Model[Any, ModelSetOptions, Any]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setupView")(views.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  trait LayoutManagerOptions extends StObject {
    
    var el: js.UndefOr[Boolean] = js.undefined
    
    var manage: js.UndefOr[Boolean] = js.undefined
  }
  object LayoutManagerOptions {
    
    inline def apply(): LayoutManagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutManagerOptions]
    }
    
    extension [Self <: LayoutManagerOptions](x: Self) {
      
      inline def setEl(value: Boolean): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      inline def setManage(value: Boolean): Self = StObject.set(x, "manage", value.asInstanceOf[js.Any])
      
      inline def setManageUndefined: Self = StObject.set(x, "manage", js.undefined)
    }
  }
  
  trait LayoutOptions[TModel /* <: Model[Any, ModelSetOptions, Any] */]
    extends StObject
       with ViewOptions[TModel, HTMLElement] {
    
    var template: js.UndefOr[String] = js.undefined
    
    var views: js.UndefOr[StringDictionary[View[TModel, HTMLElement]]] = js.undefined
  }
  object LayoutOptions {
    
    inline def apply[TModel /* <: Model[Any, ModelSetOptions, Any] */](): LayoutOptions[TModel] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutOptions[TModel]]
    }
    
    extension [Self <: LayoutOptions[?], TModel /* <: Model[Any, ModelSetOptions, Any] */](x: Self & LayoutOptions[TModel]) {
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setViews(value: StringDictionary[View[TModel, HTMLElement]]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    }
  }
}
