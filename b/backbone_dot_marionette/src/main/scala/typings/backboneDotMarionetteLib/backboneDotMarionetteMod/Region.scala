package typings
package backboneDotMarionetteLib.backboneDotMarionetteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone.marionette", "Region")
@js.native
class Region ()
  extends Object
     with DomMixin {
  /**
       * You can specify an el for the region to manage at the time the region
       * is instantiated.
       */
  def this(options: RegionConstructionOptions) = this()
  /* CompleteClass */
  override var appendChildren: js.Any = js.native
  /* CompleteClass */
  override var beforeEl: js.Any = js.native
  /**
       * Defaults to 'mnr' (undocumented)
       */
  var cidPrefix: java.lang.String = js.native
  /* CompleteClass */
  override var createBuffer: js.Any = js.native
  /**
       * @returns view that this region has.
       */
  var currentView: backboneLib.backboneMod.View[backboneLib.backboneMod.Model] = js.native
  /* CompleteClass */
  override var detachContents: js.Any = js.native
  /* CompleteClass */
  override var detachEl: js.Any = js.native
  /**
       * Contains the element that this region should manage.
       */
  var el: js.Any = js.native
  /* CompleteClass */
  override var findEls: js.Any = js.native
  /* CompleteClass */
  override var removeEl: js.Any = js.native
  /* CompleteClass */
  override var replaceEl: js.Any = js.native
  /**
       * Overwrite the parent el of the region with the rendered contents of
       * the inner View.
       */
  var replaceElement: scala.Boolean = js.native
  /* CompleteClass */
  override var setInnerContent: js.Any = js.native
  /**
       * Takes the DOM node el and appends the rendered children to the end of
       * the element's contents.
       * @param el is a jQuery argument: https://api.jquery.com/jQuery/
       * @param children is jQuery.append argument: http://api.jquery.com/append/
       */
  @JSName("appendChildren")
  def appendChildren_MRegion(el: js.Any, children: js.Any): scala.Unit = js.native
  /**
       * Override this method to change how the new view is appended to the
       * `$el` that the region is managing
       */
  def attachHtml(view: backboneLib.backboneMod.View[backboneLib.backboneMod.Model]): scala.Unit = js.native
  /**
       * Add sibling to the DOM immediately before the DOM node el. The
       * sibling will be at the same level as el.
       * @param el is a jQuery argument: https://api.jquery.com/jQuery/
       * @param sibling is jQuery.before argument: http://api.jquery.com/before/
       */
  @JSName("beforeEl")
  def beforeEl_MRegion(el: js.Any, sibling: js.Any): scala.Unit = js.native
  /**
       * Returns a new HTML DOM node instance. The resulting node can be
       * passed into the other DOM functions.
       */
  @JSName("createBuffer")
  def createBuffer_MRegion(): stdLib.DocumentFragment = js.native
  /**
       * Destroys the view taking into consideration if is a View descendant
       * or vanilla Backbone view.
       */
  def destroyView[TModel /* <: backboneLib.backboneMod.Model */](view: backboneLib.backboneMod.View[TModel]): backboneLib.backboneMod.View[TModel] = js.native
  /**
       * Remove the inner contents of el from the DOM while leaving el itself
       * in the DOM.
       * @param el is a jQuery argument: https://api.jquery.com/jQuery/
       */
  @JSName("detachContents")
  def detachContents_MRegion(el: js.Any): scala.Unit = js.native
  /**
       * Detach el from the DOM.
       * @param el is a jQuery argument: https://api.jquery.com/jQuery/
       */
  @JSName("detachEl")
  def detachEl_MRegion(el: js.Any): scala.Unit = js.native
  /**
       * Override this method to change how the region detaches current
       * content.
       */
  def detachHtml(): scala.Unit = js.native
  /**
       * Empties the Region without destroying the view, returns the detached
       * view.
       */
  def detachView(): backboneLib.backboneMod.View[backboneLib.backboneMod.Model] = js.native
  /**
       * Destroy the current view, clean up any event handlers and remove it
       * from the DOM. When a region is emptied empty events are triggered.
       */
  def empty(): js.Any = js.native
  /**
       * Destroy the current view, clean up any event handlers and remove it
       * from the DOM. When a region is emptied empty events are triggered.
       */
  def empty(options: RegionViewOptions): js.Any = js.native
  /**
       * Lookup the selector string within the DOM node for context. The
       * optional context argument will come in as a DOM Node reference to run
       * the selector search. If context hasn't been set, then findEls should
       * search the entire document for the selector.
       * @param selector is a jQuery argument: https://api.jquery.com/jQuery/
       * @param context is a jQuery argument: https://api.jquery.com/jQuery/
       */
  @JSName("findEls")
  def findEls_MRegion(selector: js.Any, context: js.Any): scala.Unit = js.native
  /**
       * Override this method to change how the region finds the DOM element
       * that it manages. Return a jQuery selector object scoped to a provided
       * parent el or the document if none exists. (undocumented)
       */
  def getEl(): js.Any = js.native
  /**
       * If you wish to check whether a region has a view, you can use the
       * hasView function. This will return a boolean value depending whether
       * or not the region is showing a view.
       */
  def hasView(): scala.Boolean = js.native
  /**
       * Check to see if the region’s el was replaced. (undocumented)
       */
  def isReplaced(): scala.Boolean = js.native
  /**
       * Check to see if a view is being swapped by another.
       */
  def isSwappingView(): scala.Boolean = js.native
  /**
       * Remove el from the DOM.
       * @param el is a jQuery argument: https://api.jquery.com/jQuery/
       */
  @JSName("removeEl")
  def removeEl_MRegion(el: js.Any): scala.Unit = js.native
  /**
       * Override the region's removeView method to change how and when the
       * view is destroyed / removed from the DOM.
       */
  def removeView(view: backboneLib.backboneMod.View[backboneLib.backboneMod.Model]): scala.Unit = js.native
  /**
       * Remove oldEl from the DOM and put newEl in its place.
       */
  @JSName("replaceEl")
  def replaceEl_MRegion(newEl: stdLib.HTMLElement, oldEL: stdLib.HTMLElement): scala.Unit = js.native
  /**
       * A region can be reset at any time. This destroys any existing view
       * being displayed, and deletes the cached el. The next time the region
       * shows a view, the region's el is queried from the DOM.
       */
  def reset(): js.Any = js.native
  /**
       * Replace the contents of el with the HTML string of html. Unlike other
       * DOM functions, this takes a literal string for its second argument.
       * @param el is a jQuery argument: https://api.jquery.com/jQuery/
       * @param html is a jQuery.html argument: https://api.jquery.com/html/
       */
  @JSName("setInnerContent")
  def setInnerContent_MRegion(el: js.Any, html: java.lang.String): scala.Unit = js.native
  /**
       * Renders and displays the specified view in this region.
       * @param view the view to display.
       */
  def show(view: backboneLib.backboneMod.View[backboneLib.backboneMod.Model]): scala.Unit = js.native
  /**
       * Renders and displays the specified view in this region.
       * @param view the view to display.
       */
  def show(view: backboneLib.backboneMod.View[backboneLib.backboneMod.Model], options: RegionViewOptions): scala.Unit = js.native
}

