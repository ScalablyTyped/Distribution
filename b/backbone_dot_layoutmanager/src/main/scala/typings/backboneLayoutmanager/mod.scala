package typings.backboneLayoutmanager

import org.scalablytyped.runtime.StringDictionary
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.backbone.mod.View
import typings.backbone.mod.ViewOptions
import typings.jquery.JQueryPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @JSImport("backbone", "Layout")
  @js.native
  class Layout[TModel /* <: Model[_, ModelSetOptions, js.Object] */] () extends View[TModel] {
    def this(options: LayoutOptions[TModel]) = this()
    
    def afterRender(): Unit = js.native
    
    def async(): js.Function1[/* compiled */ js.Function1[/* context */ js.Any, Unit], Unit] = js.native
    
    def beforeRender(): Unit = js.native
    
    def cleanup(): Unit = js.native
    
    def fetchTemplate(path: String): js.Function1[/* context */ js.Any, String] = js.native
    
    def getAllOptions(): LayoutOptions[TModel] = js.native
    
    def getView(): js.Any = js.native
    def getView(fn: js.Any): js.Any = js.native
    
    def getViews(): js.Array[_] = js.native
    def getViews(fn: js.Any): js.Array[_] = js.native
    
    def insertView(selector: js.Any): js.Any = js.native
    def insertView(selector: js.Any, view: js.Any): js.Any = js.native
    
    // return view;
    def insertViews(views: js.Any): Layout[TModel] = js.native
    
    def promise(): JQueryPromise[_] = js.native
    
    def removeView(fn: js.Any): Layout[TModel] = js.native
    
    // return this
    def renderViews(): Layout[TModel] = js.native
    
    // return this
    def setView[U](name: js.Any, view: U): U = js.native
    def setView[U](name: js.Any, view: U, insert: Boolean): U = js.native
    
    // return view
    def setViews(views: js.Any): Layout[TModel] = js.native
    
    var template: String = js.native
    
    // return this
    def `then`(fn: js.Function0[Unit]): Unit = js.native
  }
  /* static members */
  object Layout {
    
    @JSImport("backbone", "Layout.cache")
    @js.native
    def cache(path: String): js.Any = js.native
    @JSImport("backbone", "Layout.cache")
    @js.native
    def cache(path: String, contents: js.Any): js.Any = js.native
    
    @JSImport("backbone", "Layout.cleanViews")
    @js.native
    def cleanViews(views: js.Any): Unit = js.native
    
    @JSImport("backbone", "Layout.configure")
    @js.native
    def configure(options: LayoutManagerOptions): Unit = js.native
    
    @JSImport("backbone", "Layout.setupView")
    @js.native
    def setupView(views: js.Any): Unit = js.native
    @JSImport("backbone", "Layout.setupView")
    @js.native
    def setupView(views: js.Any, options: LayoutOptions[Model[_, ModelSetOptions, js.Object]]): Unit = js.native
  }
  
  @js.native
  trait LayoutManagerOptions extends StObject {
    
    var el: js.UndefOr[Boolean] = js.native
    
    var manage: js.UndefOr[Boolean] = js.native
  }
  object LayoutManagerOptions {
    
    @scala.inline
    def apply(): LayoutManagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutManagerOptions]
    }
    
    @scala.inline
    implicit class LayoutManagerOptionsMutableBuilder[Self <: LayoutManagerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEl(value: Boolean): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      @scala.inline
      def setManage(value: Boolean): Self = StObject.set(x, "manage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManageUndefined: Self = StObject.set(x, "manage", js.undefined)
    }
  }
  
  @js.native
  trait LayoutOptions[TModel /* <: Model[_, ModelSetOptions, js.Object] */] extends ViewOptions[TModel] {
    
    var template: js.UndefOr[String] = js.native
    
    var views: js.UndefOr[StringDictionary[View[TModel]]] = js.native
  }
  object LayoutOptions {
    
    @scala.inline
    def apply[TModel /* <: Model[_, ModelSetOptions, js.Object] */](): LayoutOptions[TModel] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutOptions[TModel]]
    }
    
    @scala.inline
    implicit class LayoutOptionsMutableBuilder[Self <: LayoutOptions[_], TModel /* <: Model[_, ModelSetOptions, js.Object] */] (val x: Self with LayoutOptions[TModel]) extends AnyVal {
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setViews(value: StringDictionary[View[TModel]]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    }
  }
}
