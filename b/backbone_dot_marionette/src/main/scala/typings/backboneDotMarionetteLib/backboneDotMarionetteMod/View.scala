package typings
package backboneDotMarionetteLib.backboneDotMarionetteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone.marionette", "View")
@js.native
class View[TModel /* <: backboneLib.backboneMod.Model */] ()
  extends backboneLib.backboneMod.View[TModel]
     with ViewMixin
     with RegionsMixin {
  def this(options: ViewOptions[TModel]) = this()
  /* CompleteClass */
  override var addRegion: js.Any = js.native
  /* CompleteClass */
  override var addRegions: js.Any = js.native
  /* CompleteClass */
  override var appendChildren: js.Any = js.native
  /* CompleteClass */
  override var beforeEl: js.Any = js.native
  /**
    * Behavior objects to assign to this View.
    */
  var behaviors: js.Array[Behavior] | (org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.Instantiable1[/* options */ js.UndefOr[/* options */ js.Any], Behavior]
  ]) | js.Array[backboneDotMarionetteLib.Anon_BehaviorClass] = js.native
  /* CompleteClass */
  override var bindEvents: js.Any = js.native
  /* CompleteClass */
  override var bindUIElements: js.Any = js.native
  /* CompleteClass */
  override var childViewEventPrefix: js.Any = js.native
  /**
    * Customize the event prefix for events that are forwarded through the
    * collection view.
    */
  @JSName("childViewEventPrefix")
  var childViewEventPrefix_View: java.lang.String | backboneDotMarionetteLib.backboneDotMarionetteLibNumbers.`false` = js.native
  /* CompleteClass */
  override var createBuffer: js.Any = js.native
  /* CompleteClass */
  override var delegateEntityEvents: js.Any = js.native
  /* CompleteClass */
  override var delegateEvents: js.Any = js.native
  /* CompleteClass */
  override var destroy: js.Any = js.native
  /* CompleteClass */
  override var detachChildView: js.Any = js.native
  /* CompleteClass */
  override var detachContents: js.Any = js.native
  /* CompleteClass */
  override var detachEl: js.Any = js.native
  /* CompleteClass */
  override var emptyRegions: js.Any = js.native
  /* CompleteClass */
  override var findEls: js.Any = js.native
  /* CompleteClass */
  override var getChildView: js.Any = js.native
  /* CompleteClass */
  override var getOption: js.Any = js.native
  /* CompleteClass */
  override var getRegion: js.Any = js.native
  /* CompleteClass */
  override var getRegions: js.Any = js.native
  /* CompleteClass */
  override var getTriggers: js.Any = js.native
  /* CompleteClass */
  override var hasRegion: js.Any = js.native
  /* CompleteClass */
  override var isAttached: js.Any = js.native
  /* CompleteClass */
  override var isDestroyed: js.Any = js.native
  /* CompleteClass */
  override var isRendered: js.Any = js.native
  /* CompleteClass */
  override var mergeOptions: js.Any = js.native
  /**
    * Bind to events that occur on attached models.
    */
  var modelEvents: EventsHash = js.native
  /* CompleteClass */
  override var normalizeMethods: js.Any = js.native
  /* CompleteClass */
  override var regionClass: js.Any = js.native
  /* CompleteClass */
  override var removeEl: js.Any = js.native
  /* CompleteClass */
  override var removeRegion: js.Any = js.native
  /* CompleteClass */
  override var removeRegions: js.Any = js.native
  /* CompleteClass */
  override var replaceEl: js.Any = js.native
  /* CompleteClass */
  override var setInnerContent: js.Any = js.native
  /* CompleteClass */
  override var showChildView: js.Any = js.native
  /* CompleteClass */
  override var supportsDestroyLifecycle: js.Any = js.native
  /**
    * Internal property. (undocumented)
    */
  @JSName("supportsDestroyLifecycle")
  var supportsDestroyLifecycle_View: scala.Boolean = js.native
  /* CompleteClass */
  override var supportsRenderLifecycle: js.Any = js.native
  /**
    * Internal property. (undocumented)
    */
  @JSName("supportsRenderLifecycle")
  var supportsRenderLifecycle_View: scala.Boolean = js.native
  /* CompleteClass */
  override var triggerMethod: js.Any = js.native
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
  /* CompleteClass */
  override var unbindEvents: js.Any = js.native
  /* CompleteClass */
  override var unbindUIElements: js.Any = js.native
  /* CompleteClass */
  override var undelegateEntityEvents: js.Any = js.native
  /**
    * Add a region to this View.
    */
  @JSName("addRegion")
  def addRegion_MView(regionName: java.lang.String, element: js.Any): js.Any = js.native
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
  @JSName("appendChildren")
  def appendChildren_MView(el: js.Any, children: js.Any): scala.Unit = js.native
  /**
    * Used to attached the rendered template to this View's element.
    */
  def attachElContent(html: java.lang.String): View[TModel] = js.native
  /**
    * Add sibling to the DOM immediately before the DOM node el. The
    * sibling will be at the same level as el.
    * @param el is a jQuery argument: https://api.jquery.com/jQuery/
    * @param sibling is jQuery.before argument: http://api.jquery.com/before/
    */
  @JSName("beforeEl")
  def beforeEl_MView(el: js.Any, sibling: js.Any): scala.Unit = js.native
  /**
    * This method is used to bind a backbone "entity" (collection/model) to
    * methods on a target object.
    */
  @JSName("bindEvents")
  def bindEvents_MView(entity: js.Any, bindings: js.Any): scala.Unit = js.native
  /**
    * Bind UI elements to this view. By default this is called in the
    * render method. (undocumented)
    */
  @JSName("bindUIElements")
  def bindUIElements_MView(): js.Any = js.native
  /**
    * Returns a new HTML DOM node instance. The resulting node can be
    * passed into the other DOM functions.
    */
  @JSName("createBuffer")
  def createBuffer_MView(): stdLib.DocumentFragment = js.native
  /**
    * Delegate entity events. (undocumented)
    */
  @JSName("delegateEntityEvents")
  def delegateEntityEvents_MView(): View[TModel] = js.native
  /**
    * Overrides Backbone.View.delegateEvents. By default Marionette uses
    * this to add handlers for events and triggers. (undocumented)
    */
  @JSName("delegateEvents")
  def delegateEvents_MView(eventsArg: js.Any): View[TModel] = js.native
  /**
    * Manually destroy a view by calling the destroy method. The method
    * unbinds the UI elements, removes the view and its children from the
    * DOM and unbinds the listeners. It also triggers lifecycle events.
    */
  @JSName("destroy")
  def destroy_MView(args: js.Any*): View[TModel] = js.native
  /**
    * Detach a view from a region.
    */
  @JSName("detachChildView")
  def detachChildView_MView[TModel /* <: backboneLib.backboneMod.Model */](regionName: java.lang.String): backboneLib.backboneMod.View[TModel] = js.native
  /**
    * Remove the inner contents of el from the DOM while leaving el itself
    * in the DOM.
    * @param el is a jQuery argument: https://api.jquery.com/jQuery/
    */
  @JSName("detachContents")
  def detachContents_MView(el: js.Any): scala.Unit = js.native
  /**
    * Detach el from the DOM.
    * @param el is a jQuery argument: https://api.jquery.com/jQuery/
    */
  @JSName("detachEl")
  def detachEl_MView(el: js.Any): scala.Unit = js.native
  /**
    * Empty all regions from this View.
    */
  @JSName("emptyRegions")
  def emptyRegions_MView(): js.Any = js.native
  def events(): EventsHash = js.native
  /**
    * Lookup the selector string within the DOM node for context. The
    * optional context argument will come in as a DOM Node reference to run
    * the selector search. If context hasn't been set, then findEls should
    * search the entire document for the selector.
    * @param selector is a jQuery argument: https://api.jquery.com/jQuery/
    * @param context is a jQuery argument: https://api.jquery.com/jQuery/
    */
  @JSName("findEls")
  def findEls_MView(selector: js.Any, context: js.Any): scala.Unit = js.native
  /**
    * Get the view from a region.
    */
  @JSName("getChildView")
  def getChildView_MView[TModel /* <: backboneLib.backboneMod.Model */](regionName: java.lang.String): backboneLib.backboneMod.View[TModel] = js.native
  /**
    * Retrieve an object's attribute either directly from the object, or from
    * the object's this.options, with this.options taking precedence.
    * @param optionName the name of the option to retrieve.
    */
  @JSName("getOption")
  def getOption_MView(optionName: java.lang.String): js.Any = js.native
  /**
    * Return a region from this View.
    */
  @JSName("getRegion")
  def getRegion_MView(regionName: java.lang.String): Region = js.native
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
  @JSName("getTriggers")
  def getTriggers_MView(): EventsHash = js.native
  /**
    * Get handle on UI element defined in ui hash
    */
  def getUI(ui: java.lang.String): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  /**
    * Check if this View has a particular region.
    */
  @JSName("hasRegion")
  def hasRegion_MView(regionName: java.lang.String): js.Any = js.native
  /**
    * Check if this View is attached to the DOM.
    */
  @JSName("isAttached")
  def isAttached_MView(): scala.Boolean = js.native
  /**
    * Check if this View has been destroyed.
    */
  @JSName("isDestroyed")
  def isDestroyed_MView(): scala.Boolean = js.native
  /**
    * Check if this View has been rendered.
    */
  @JSName("isRendered")
  def isRendered_MView(): scala.Boolean = js.native
  /**
    * A handy function to pluck certain options and attach them directly
    * to an instance.
    */
  @JSName("mergeOptions")
  def mergeOptions_MView(options: js.Any, keys: js.Any): scala.Unit = js.native
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
  @JSName("normalizeMethods")
  def normalizeMethods_MView[T](hash: js.Any): T = js.native
  /**
    * Event that is triggered after a Region has been added.
    */
  def onAddRegion(regionName: java.lang.String, region: Region): scala.Unit = js.native
  /**
    * Event that is triggered after this View's element has been added to
    * the DOM.
    */
  def onAttach(view: View[TModel]): scala.Unit = js.native
  /**
    * Event that is triggered before a Region is added.
    */
  def onBeforeAddRegion(regionName: java.lang.String, region: Region): scala.Unit = js.native
  /**
    * Event that is triggered before this View is added to the DOM.
    */
  def onBeforeAttach(view: View[TModel]): scala.Unit = js.native
  /**
    * Event that is triggered before this View is destroyed.
    */
  def onBeforeDestroy(view: View[TModel], args: js.Any*): scala.Unit = js.native
  /**
    * Event that is triggered before this View's element is removed from
    * the DOM.
    */
  def onBeforeDetach(view: View[TModel]): scala.Unit = js.native
  /**
    * Event that is triggered before a Region is removed.
    */
  def onBeforeRemoveRegion(regionName: java.lang.String, region: Region): scala.Unit = js.native
  /**
    * Event that is triggered before this View is rendered.
    */
  def onBeforeRender(view: View[TModel]): scala.Unit = js.native
  /**
    * Event that is triggered after this View is destroyed.
    */
  def onDestroy(view: View[TModel], args: js.Any*): scala.Unit = js.native
  /**
    * Event that is triggered after this View's element has been removed
    * from the DOM.
    */
  def onDetach(view: View[TModel]): scala.Unit = js.native
  /**
    * Event that is triggered after this View's content has been added to
    * the DOM. Is also triggered every time this.render() is called.
    */
  def onDomRefresh(view: View[TModel]): scala.Unit = js.native
  /**
    * Event that is triggered before this View's content is removed from
    * the DOM.
    */
  def onDomRemove(view: View[TModel]): scala.Unit = js.native
  /**
    * Event that is triggered after a Region has been removed.
    */
  def onRemoveRegion(regionName: java.lang.String, region: Region): scala.Unit = js.native
  /**
    * Event that is triggered after this View is rendered.
    */
  def onRender(view: View[TModel]): scala.Unit = js.native
  /**
    * Remove el from the DOM.
    * @param el is a jQuery argument: https://api.jquery.com/jQuery/
    */
  @JSName("removeEl")
  def removeEl_MView(el: js.Any): scala.Unit = js.native
  /**
    * Remove a region from this View.
    */
  @JSName("removeRegion")
  def removeRegion_MView(regionName: java.lang.String): js.Any = js.native
  /**
    * Remove all regions from this View.
    */
  @JSName("removeRegions")
  def removeRegions_MView(): js.Any = js.native
  /**
    * Renders the view. Given a template this method will build your HTML
    * from that template, mixing in model information and any extra
    * template context.
    */
  def render(): View[TModel] = js.native
  /**
    * Remove oldEl from the DOM and put newEl in its place.
    */
  @JSName("replaceEl")
  def replaceEl_MView(newEl: stdLib.HTMLElement, oldEL: stdLib.HTMLElement): scala.Unit = js.native
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
    * Rebind this View to a new element. Overriding Backbone.View’s
    * setElement to handle if an element was previously defined.
    * (undocumented)
    */
  def setElement(element: js.Any): View[TModel] = js.native
  /**
    * Replace the contents of el with the HTML string of html. Unlike other
    * DOM functions, this takes a literal string for its second argument.
    * @param el is a jQuery argument: https://api.jquery.com/jQuery/
    * @param html is a jQuery.html argument: https://api.jquery.com/html/
    */
  @JSName("setInnerContent")
  def setInnerContent_MView(el: js.Any, html: java.lang.String): scala.Unit = js.native
  /**
    * Used to set the renderer for this View. The rendere function is
    * passed the template and the data and is expected to return an html
    * string. By default this is set to use Renderer.
    */
  def setRenderer(renderer: js.Function2[/* template */ js.Any, /* data */ js.Any, java.lang.String]): scala.Unit = js.native
  /**
    * Show a view inside a region.
    */
  @JSName("showChildView")
  def showChildView_MView(regionName: java.lang.String, view: js.Any): scala.Unit = js.native
  @JSName("showChildView")
  def showChildView_MView(regionName: java.lang.String, view: js.Any, options: RegionViewOptions): scala.Unit = js.native
  /**
    * Trigger an event and a corresponding method on the target object.
    * All arguments that are passed to the triggerMethod call are passed
    * along to both the event and the method, with the exception of the
    * event name not being passed to the corresponding method.
    */
  @JSName("triggerMethod")
  def triggerMethod_MView(name: java.lang.String, args: js.Any*): js.Any = js.native
  /**
    * This method can be used to unbind callbacks from entities'
    * (collection/model) events.
    */
  @JSName("unbindEvents")
  def unbindEvents_MView(entity: js.Any, bindings: js.Any): scala.Unit = js.native
  /**
    * Bind UI elements from this view. (undocumented)
    */
  @JSName("unbindUIElements")
  def unbindUIElements_MView(): js.Any = js.native
  /**
    * Undelegate entity events. (undocumented)
    */
  @JSName("undelegateEntityEvents")
  def undelegateEntityEvents_MView(): View[TModel] = js.native
}

