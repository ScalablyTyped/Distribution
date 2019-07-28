package typings.backboneDotMarionette.backboneDotMarionetteMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.backbone.backboneMod.Model
import typings.backboneDotMarionette.Anon_BehaviorClass
import typings.backboneDotMarionette.backboneDotMarionetteNumbers.`false`
import typings.jquery.JQuery
import typings.std.DocumentFragment
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.backboneDotMarionette.backboneDotMarionetteMod.ViewMixin because var conflicts: delegateEvents. Inlined supportsRenderLifecycle, supportsDestroyLifecycle, isDestroyed, isRendered, isAttached, getTriggers, delegateEntityEvents, undelegateEntityEvents, destroy, bindUIElements, unbindUIElements, childViewEventPrefix, triggerMethod */ @JSImport("backbone.marionette", "View")
@js.native
class View[TModel /* <: Model */] ()
  extends typings.backbone.backboneMod.View[TModel]
     with RegionsMixin {
  def this(options: ViewOptions[TModel]) = this()
  /* CompleteClass */
  override var addRegion: js.Any = js.native
  /* CompleteClass */
  override var addRegions: js.Any = js.native
  /**
    * Behavior objects to assign to this View.
    */
  var behaviors: (js.Array[Anon_BehaviorClass | Behavior]) | (StringDictionary[Instantiable1[js.UndefOr[/* options */ js.Any], Behavior]]) = js.native
  @JSName("bindUIElements")
  var bindUIElements_FView: js.Any = js.native
  /**
    * Customize the event prefix for events that are forwarded through the
    * collection view.
    */
  var childViewEventPrefix: js.Any | String | `false` = js.native
  @JSName("delegateEntityEvents")
  var delegateEntityEvents_FView: js.Any = js.native
  var destroy: js.Any = js.native
  /* CompleteClass */
  override var detachChildView: js.Any = js.native
  /* CompleteClass */
  override var emptyRegions: js.Any = js.native
  /* CompleteClass */
  override var getChildView: js.Any = js.native
  /* CompleteClass */
  override var getRegion: js.Any = js.native
  /* CompleteClass */
  override var getRegions: js.Any = js.native
  @JSName("getTriggers")
  var getTriggers_FView: js.Any = js.native
  /* CompleteClass */
  override var hasRegion: js.Any = js.native
  @JSName("isAttached")
  var isAttached_FView: js.Any = js.native
  @JSName("isDestroyed")
  var isDestroyed_FView: js.Any = js.native
  @JSName("isRendered")
  var isRendered_FView: js.Any = js.native
  /**
    * Bind to events that occur on attached models.
    */
  var modelEvents: EventsHash = js.native
  /* CompleteClass */
  override var regionClass: js.Any = js.native
  /* CompleteClass */
  override var removeRegion: js.Any = js.native
  /* CompleteClass */
  override var removeRegions: js.Any = js.native
  /* CompleteClass */
  override var showChildView: js.Any = js.native
  /**
    * Internal property. (undocumented)
    */
  var supportsDestroyLifecycle: js.Any | Boolean = js.native
  /**
    * Internal property. (undocumented)
    */
  var supportsRenderLifecycle: js.Any | Boolean = js.native
  var triggerMethod: js.Any = js.native
  /**
    * The view triggers attribute binds DOM events to Marionette View events
    * that can be responded to at the view or parent level.
    */
  var triggers: EventsHash = js.native
  /**
    * Name parts of your template to be used
    * throughout the view with the ui attribute.
    */
  var ui: js.Any = js.native
  @JSName("unbindUIElements")
  var unbindUIElements_FView: js.Any = js.native
  @JSName("undelegateEntityEvents")
  var undelegateEntityEvents_FView: js.Any = js.native
  /**
    * Add a region to this View.
    */
  @JSName("addRegion")
  def addRegion_MView(regionName: String, element: js.Any): js.Any = js.native
  /**
    * Add multiple regions to this View.
    */
  @JSName("addRegions")
  def addRegions_MView(regions: js.Any): js.Any = js.native
  /**
    * Takes the DOM node el and appends the rendered children to the end of
    * the element's contents.
    * @param el is a jQuery argument: https://api.jquery.com/jQuery/
    * @param children is jQuery.append argument: http://api.jquery.com/append/
    */
  def appendChildren(el: js.Any, children: js.Any): Unit = js.native
  /**
    * Used to attached the rendered template to this View's element.
    */
  def attachElContent(html: String): View[TModel] = js.native
  /**
    * Add sibling to the DOM immediately before the DOM node el. The
    * sibling will be at the same level as el.
    * @param el is a jQuery argument: https://api.jquery.com/jQuery/
    * @param sibling is jQuery.before argument: http://api.jquery.com/before/
    */
  def beforeEl(el: js.Any, sibling: js.Any): Unit = js.native
  /**
    * This method is used to bind a backbone "entity" (collection/model) to
    * methods on a target object.
    */
  def bindEvents(entity: js.Any, bindings: js.Any): Unit = js.native
  /**
    * Bind UI elements to this view. By default this is called in the
    * render method. (undocumented)
    */
  def bindUIElements(): js.Any = js.native
  /**
    * Returns a new HTML DOM node instance. The resulting node can be
    * passed into the other DOM functions.
    */
  def createBuffer(): DocumentFragment = js.native
  /**
    * Delegate entity events. (undocumented)
    */
  def delegateEntityEvents(): View[TModel] = js.native
  /**
    * Overrides Backbone.View.delegateEvents. By default Marionette uses
    * this to add handlers for events and triggers. (undocumented)
    */
  def delegateEvents(eventsArg: js.Any): View[TModel] = js.native
  /**
    * Manually destroy a view by calling the destroy method. The method
    * unbinds the UI elements, removes the view and its children from the
    * DOM and unbinds the listeners. It also triggers lifecycle events.
    */
  def destroy(args: js.Any*): View[TModel] = js.native
  /**
    * Detach a view from a region.
    */
  @JSName("detachChildView")
  def detachChildView_MView[TModel /* <: Model */](regionName: String): typings.backbone.backboneMod.View[TModel] = js.native
  /**
    * Remove the inner contents of el from the DOM while leaving el itself
    * in the DOM.
    * @param el is a jQuery argument: https://api.jquery.com/jQuery/
    */
  def detachContents(el: js.Any): Unit = js.native
  /**
    * Detach el from the DOM.
    * @param el is a jQuery argument: https://api.jquery.com/jQuery/
    */
  def detachEl(el: js.Any): Unit = js.native
  /**
    * Empty all regions from this View.
    */
  @JSName("emptyRegions")
  def emptyRegions_MView(): js.Any = js.native
  /**
    * Lookup the selector string within the DOM node for context. The
    * optional context argument will come in as a DOM Node reference to run
    * the selector search. If context hasn't been set, then findEls should
    * search the entire document for the selector.
    * @param selector is a jQuery argument: https://api.jquery.com/jQuery/
    * @param context is a jQuery argument: https://api.jquery.com/jQuery/
    */
  def findEls(selector: js.Any, context: js.Any): Unit = js.native
  /**
    * Get the view from a region.
    */
  @JSName("getChildView")
  def getChildView_MView[TModel /* <: Model */](regionName: String): typings.backbone.backboneMod.View[TModel] = js.native
  /**
    * Retrieve an object's attribute either directly from the object, or from
    * the object's this.options, with this.options taking precedence.
    * @param optionName the name of the option to retrieve.
    */
  def getOption(optionName: String): js.Any = js.native
  /**
    * Return a region from this View.
    */
  @JSName("getRegion")
  def getRegion_MView(regionName: String): Region = js.native
  /**
    * Returns all regions from this View.
    */
  @JSName("getRegions")
  def getRegions_MView(): js.Any = js.native
  /**
    * Used to determine which template to use. Override this method to add
    * logic for using multiple templates.
    */
  def getTemplate(): js.Any = js.native
  /**
    * Get the triggers that are currently attached to this view.
    * (undocumented)
    */
  def getTriggers(): EventsHash = js.native
  /**
    * Get handle on UI element defined in ui hash
    */
  def getUI(ui: String): JQuery[HTMLElement] = js.native
  /**
    * Check if this View has a particular region.
    */
  @JSName("hasRegion")
  def hasRegion_MView(regionName: String): js.Any = js.native
  /**
    * Check if this View is attached to the DOM.
    */
  def isAttached(): Boolean = js.native
  /**
    * Check if this View has been destroyed.
    */
  def isDestroyed(): Boolean = js.native
  /**
    * Check if this View has been rendered.
    */
  def isRendered(): Boolean = js.native
  /**
    * A handy function to pluck certain options and attach them directly
    * to an instance.
    */
  def mergeOptions(options: js.Any, keys: js.Any): Unit = js.native
  /**
    * Mix in template context methods. Looks for a templateContext
    * attribute, which can either be an object literal, or a function that
    * returns an object literal. All methods and attributes from this
    * object are copies to the object passed in. (undocumented)
    */
  def mixinTemplateContext(args: js.Any*): js.Any = js.native
  /**
    * Receives a hash of event names and functions and/or function names,
    * and returns the same hash with the function names replaced with the
    * function references themselves.
    */
  def normalizeMethods[T](hash: js.Any): T = js.native
  /**
    * Event that is triggered after a Region has been added.
    */
  def onAddRegion(regionName: String, region: Region): Unit = js.native
  /**
    * Event that is triggered after this View's element has been added to
    * the DOM.
    */
  def onAttach(view: View[TModel]): Unit = js.native
  /**
    * Event that is triggered before a Region is added.
    */
  def onBeforeAddRegion(regionName: String, region: Region): Unit = js.native
  /**
    * Event that is triggered before this View is added to the DOM.
    */
  def onBeforeAttach(view: View[TModel]): Unit = js.native
  /**
    * Event that is triggered before this View is destroyed.
    */
  def onBeforeDestroy(view: View[TModel], args: js.Any*): Unit = js.native
  /**
    * Event that is triggered before this View's element is removed from
    * the DOM.
    */
  def onBeforeDetach(view: View[TModel]): Unit = js.native
  /**
    * Event that is triggered before a Region is removed.
    */
  def onBeforeRemoveRegion(regionName: String, region: Region): Unit = js.native
  /**
    * Event that is triggered before this View is rendered.
    */
  def onBeforeRender(view: View[TModel]): Unit = js.native
  /**
    * Event that is triggered after this View is destroyed.
    */
  def onDestroy(view: View[TModel], args: js.Any*): Unit = js.native
  /**
    * Event that is triggered after this View's element has been removed
    * from the DOM.
    */
  def onDetach(view: View[TModel]): Unit = js.native
  /**
    * Event that is triggered after this View's content has been added to
    * the DOM. Is also triggered every time this.render() is called.
    */
  def onDomRefresh(view: View[TModel]): Unit = js.native
  /**
    * Event that is triggered before this View's content is removed from
    * the DOM.
    */
  def onDomRemove(view: View[TModel]): Unit = js.native
  /**
    * Event that is triggered after a Region has been removed.
    */
  def onRemoveRegion(regionName: String, region: Region): Unit = js.native
  /**
    * Event that is triggered after this View is rendered.
    */
  def onRender(view: View[TModel]): Unit = js.native
  /**
    * Remove el from the DOM.
    * @param el is a jQuery argument: https://api.jquery.com/jQuery/
    */
  def removeEl(el: js.Any): Unit = js.native
  /**
    * Remove a region from this View.
    */
  @JSName("removeRegion")
  def removeRegion_MView(regionName: String): js.Any = js.native
  /**
    * Remove all regions from this View.
    */
  @JSName("removeRegions")
  def removeRegions_MView(): js.Any = js.native
  /**
    * Remove oldEl from the DOM and put newEl in its place.
    */
  def replaceEl(newEl: HTMLElement, oldEL: HTMLElement): Unit = js.native
  /**
    * Method used by this.serializeData to serialize this View's collection
    * data.
    */
  def serializeCollection(): js.Any = js.native
  /**
    * The results of this method ared passed to this View's template. By
    * default Marionette will attempt to pass either an attached model or
    * collection which has been converted to JSON.
    */
  def serializeData(): js.Any = js.native
  /**
    * Method used by this.serializeData to serialize this View's model
    * data.
    */
  def serializeModel(): js.Any = js.native
  /**
    * Replace the contents of el with the HTML string of html. Unlike other
    * DOM functions, this takes a literal string for its second argument.
    * @param el is a jQuery argument: https://api.jquery.com/jQuery/
    * @param html is a jQuery.html argument: https://api.jquery.com/html/
    */
  def setInnerContent(el: js.Any, html: String): Unit = js.native
  /**
    * Used to set the renderer for this View. The rendere function is
    * passed the template and the data and is expected to return an html
    * string. By default this is set to use Renderer.
    */
  def setRenderer(renderer: js.Function2[/* template */ js.Any, /* data */ js.Any, String]): Unit = js.native
  /**
    * Show a view inside a region.
    */
  @JSName("showChildView")
  def showChildView_MView(regionName: String, view: js.Any): Unit = js.native
  @JSName("showChildView")
  def showChildView_MView(regionName: String, view: js.Any, options: RegionViewOptions): Unit = js.native
  /**
    * Trigger an event and a corresponding method on the target object.
    * All arguments that are passed to the triggerMethod call are passed
    * along to both the event and the method, with the exception of the
    * event name not being passed to the corresponding method.
    */
  def triggerMethod(name: String, args: js.Any*): js.Any = js.native
  /**
    * This method can be used to unbind callbacks from entities'
    * (collection/model) events.
    */
  def unbindEvents(entity: js.Any, bindings: js.Any): Unit = js.native
  /**
    * Bind UI elements from this view. (undocumented)
    */
  def unbindUIElements(): js.Any = js.native
  /**
    * Undelegate entity events. (undocumented)
    */
  def undelegateEntityEvents(): View[TModel] = js.native
}

