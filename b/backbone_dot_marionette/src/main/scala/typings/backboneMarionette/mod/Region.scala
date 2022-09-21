package typings.backboneMarionette.mod

import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.std.DocumentFragment
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backbone.marionette", "Region")
@js.native
/**
  * You can specify an el for the region to manage at the time the region
  * is instantiated.
  */
open class Region ()
  extends Object
     with DomMixin {
  def this(options: RegionConstructionOptions) = this()
  
  /* CompleteClass */
  var appendChildren: Any = js.native
  /**
    * Takes the DOM node el and appends the rendered children to the end of
    * the element's contents.
    * @param el is a jQuery argument: https://api.jquery.com/jQuery/
    * @param children is jQuery.append argument: http://api.jquery.com/append/
    */
  @JSName("appendChildren")
  def appendChildren_MRegion(el: Any, children: Any): Unit = js.native
  
  /**
    * Override this method to change how the new view is appended to the
    * `$el` that the region is managing
    */
  def attachHtml(view: typings.backbone.mod.View[Model[Any, ModelSetOptions, Any], HTMLElement]): Unit = js.native
  
  /* CompleteClass */
  var beforeEl: Any = js.native
  /**
    * Add sibling to the DOM immediately before the DOM node el. The
    * sibling will be at the same level as el.
    * @param el is a jQuery argument: https://api.jquery.com/jQuery/
    * @param sibling is jQuery.before argument: http://api.jquery.com/before/
    */
  @JSName("beforeEl")
  def beforeEl_MRegion(el: Any, sibling: Any): Unit = js.native
  
  /**
    * Defaults to 'mnr' (undocumented)
    */
  var cidPrefix: String = js.native
  
  /* CompleteClass */
  var createBuffer: Any = js.native
  /**
    * Returns a new HTML DOM node instance. The resulting node can be
    * passed into the other DOM functions.
    */
  @JSName("createBuffer")
  def createBuffer_MRegion(): DocumentFragment = js.native
  
  /**
    * @returns view that this region has.
    */
  var currentView: typings.backbone.mod.View[Model[Any, ModelSetOptions, Any], HTMLElement] = js.native
  
  /**
    * Destroys the view taking into consideration if is a View descendant
    * or vanilla Backbone view.
    */
  def destroyView[TModel /* <: Model[Any, ModelSetOptions, Any] */](view: typings.backbone.mod.View[TModel, HTMLElement]): typings.backbone.mod.View[TModel, HTMLElement] = js.native
  
  /* CompleteClass */
  var detachContents: Any = js.native
  /**
    * Remove the inner contents of el from the DOM while leaving el itself
    * in the DOM.
    * @param el is a jQuery argument: https://api.jquery.com/jQuery/
    */
  @JSName("detachContents")
  def detachContents_MRegion(el: Any): Unit = js.native
  
  /* CompleteClass */
  var detachEl: Any = js.native
  /**
    * Detach el from the DOM.
    * @param el is a jQuery argument: https://api.jquery.com/jQuery/
    */
  @JSName("detachEl")
  def detachEl_MRegion(el: Any): Unit = js.native
  
  /**
    * Override this method to change how the region detaches current
    * content.
    */
  def detachHtml(): Unit = js.native
  
  /**
    * Empties the Region without destroying the view, returns the detached
    * view.
    */
  def detachView(): typings.backbone.mod.View[Model[Any, ModelSetOptions, Any], HTMLElement] = js.native
  
  /**
    * Contains the element that this region should manage.
    */
  var el: Any = js.native
  
  /**
    * Destroy the current view, clean up any event handlers and remove it
    * from the DOM. When a region is emptied empty events are triggered.
    */
  def empty(): Any = js.native
  def empty(options: RegionViewOptions): Any = js.native
  
  /* CompleteClass */
  var findEls: Any = js.native
  /**
    * Lookup the selector string within the DOM node for context. The
    * optional context argument will come in as a DOM Node reference to run
    * the selector search. If context hasn't been set, then findEls should
    * search the entire document for the selector.
    * @param selector is a jQuery argument: https://api.jquery.com/jQuery/
    * @param context is a jQuery argument: https://api.jquery.com/jQuery/
    */
  @JSName("findEls")
  def findEls_MRegion(selector: Any, context: Any): Unit = js.native
  
  /**
    * Override this method to change how the region finds the DOM element
    * that it manages. Return a jQuery selector object scoped to a provided
    * parent el or the document if none exists. (undocumented)
    */
  def getEl(): Any = js.native
  
  /**
    * If you wish to check whether a region has a view, you can use the
    * hasView function. This will return a boolean value depending whether
    * or not the region is showing a view.
    */
  def hasView(): Boolean = js.native
  
  /**
    * Check to see if the region’s el was replaced. (undocumented)
    */
  def isReplaced(): Boolean = js.native
  
  /**
    * Check to see if a view is being swapped by another.
    */
  def isSwappingView(): Boolean = js.native
  
  /* CompleteClass */
  var removeEl: Any = js.native
  /**
    * Remove el from the DOM.
    * @param el is a jQuery argument: https://api.jquery.com/jQuery/
    */
  @JSName("removeEl")
  def removeEl_MRegion(el: Any): Unit = js.native
  
  /**
    * Override the region's removeView method to change how and when the
    * view is destroyed / removed from the DOM.
    */
  def removeView(view: typings.backbone.mod.View[Model[Any, ModelSetOptions, Any], HTMLElement]): Unit = js.native
  
  /* CompleteClass */
  var replaceEl: Any = js.native
  /**
    * Remove oldEl from the DOM and put newEl in its place.
    */
  @JSName("replaceEl")
  def replaceEl_MRegion(newEl: HTMLElement, oldEL: HTMLElement): Unit = js.native
  
  /**
    * Overwrite the parent el of the region with the rendered contents of
    * the inner View.
    */
  var replaceElement: Boolean = js.native
  
  /**
    * A region can be reset at any time. This destroys any existing view
    * being displayed, and deletes the cached el. The next time the region
    * shows a view, the region's el is queried from the DOM.
    */
  def reset(): Any = js.native
  
  /* CompleteClass */
  var setInnerContent: Any = js.native
  /**
    * Replace the contents of el with the HTML string of html. Unlike other
    * DOM functions, this takes a literal string for its second argument.
    * @param el is a jQuery argument: https://api.jquery.com/jQuery/
    * @param html is a jQuery.html argument: https://api.jquery.com/html/
    */
  @JSName("setInnerContent")
  def setInnerContent_MRegion(el: Any, html: String): Unit = js.native
  
  /**
    * Renders and displays the specified view in this region.
    * @param view the view to display.
    */
  def show(view: typings.backbone.mod.View[Model[Any, ModelSetOptions, Any], HTMLElement]): Unit = js.native
  def show(
    view: typings.backbone.mod.View[Model[Any, ModelSetOptions, Any], HTMLElement],
    options: RegionViewOptions
  ): Unit = js.native
}
