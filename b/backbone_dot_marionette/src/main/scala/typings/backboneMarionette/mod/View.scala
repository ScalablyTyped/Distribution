package typings.backboneMarionette.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.backboneMarionette.anon.Dictindex
import typings.backboneMarionette.backboneMarionetteBooleans.`false`
import typings.jquery.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.backboneMarionette.mod.ViewMixin because var conflicts: delegateEvents. Inlined supportsRenderLifecycle, supportsDestroyLifecycle, isDestroyed, isRendered, isAttached, getTriggers, delegateEntityEvents, undelegateEntityEvents, destroy, bindUIElements, unbindUIElements, childViewEventPrefix, triggerMethod */ @JSImport("backbone.marionette", "View")
@js.native
open class View[TModel /* <: Model[Any, ModelSetOptions, Any] */] ()
  extends typings.backbone.mod.View[TModel, HTMLElement]
     with RegionsMixin
     with DomMixin
     with CommonMixin {
  def this(options: ViewOptions[TModel]) = this()
  
  /* CompleteClass */
  var addRegion: Any = js.native
  
  /* CompleteClass */
  var addRegions: Any = js.native
  
  /* CompleteClass */
  var appendChildren: Any = js.native
  
  /**
    * Used to attached the rendered template to this View's element.
    */
  def attachElContent(html: String): View[TModel] = js.native
  
  /* CompleteClass */
  var beforeEl: Any = js.native
  
  /**
    * Behavior objects to assign to this View.
    */
  var behaviors: (js.Array[Behavior | Dictindex]) | (StringDictionary[Instantiable1[/* options */ js.UndefOr[Any], Behavior]]) = js.native
  
  /* CompleteClass */
  var bindEvents: Any = js.native
  
  /**
    * Bind UI elements to this view. By default this is called in the
    * render method. (undocumented)
    */
  def bindUIElements(): Any = js.native
  
  /**
    * Customize the event prefix for events that are forwarded through the
    * collection view.
    */
  var childViewEventPrefix: Any | String | `false` = js.native
  
  /* CompleteClass */
  var createBuffer: Any = js.native
  
  /**
    * Delegate entity events. (undocumented)
    */
  def delegateEntityEvents(): View[TModel] = js.native
  
  /**
    * Overrides Backbone.View.delegateEvents. By default Marionette uses
    * this to add handlers for events and triggers. (undocumented)
    */
  def delegateEvents(eventsArg: Any): this.type = js.native
  
  var destroy: Any = js.native
  /**
    * Manually destroy a view by calling the destroy method. The method
    * unbinds the UI elements, removes the view and its children from the
    * DOM and unbinds the listeners. It also triggers lifecycle events.
    */
  def destroy(args: Any*): View[TModel] = js.native
  
  /* CompleteClass */
  var detachChildView: Any = js.native
  
  /* CompleteClass */
  var detachContents: Any = js.native
  
  /* CompleteClass */
  var detachEl: Any = js.native
  
  /* CompleteClass */
  var emptyRegions: Any = js.native
  
  /* CompleteClass */
  var findEls: Any = js.native
  
  /* CompleteClass */
  var getChildView: Any = js.native
  
  /* CompleteClass */
  var getOption: Any = js.native
  
  /* CompleteClass */
  var getRegion: Any = js.native
  
  /* CompleteClass */
  var getRegions: Any = js.native
  
  /**
    * Used to determine which template to use. Override this method to add
    * logic for using multiple templates.
    */
  def getTemplate(): Any = js.native
  
  /**
    * Get the triggers that are currently attached to this view.
    * (undocumented)
    */
  def getTriggers(): EventsHash = js.native
  
  /**
    * Get handle on UI element defined in ui hash
    */
  def getUI(ui: String): JQuery[HTMLElement] = js.native
  
  /* CompleteClass */
  var hasRegion: Any = js.native
  
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
  
  /* CompleteClass */
  var mergeOptions: Any = js.native
  
  /**
    * Mix in template context methods. Looks for a templateContext
    * attribute, which can either be an object literal, or a function that
    * returns an object literal. All methods and attributes from this
    * object are copies to the object passed in. (undocumented)
    */
  def mixinTemplateContext(args: Any*): Any = js.native
  
  /**
    * Bind to events that occur on attached models.
    */
  var modelEvents: EventsHash = js.native
  
  /* CompleteClass */
  var normalizeMethods: Any = js.native
  
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
  def onBeforeDestroy(view: View[TModel], args: Any*): Unit = js.native
  
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
  def onDestroy(view: View[TModel], args: Any*): Unit = js.native
  
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
  
  /* CompleteClass */
  var regionClass: Any = js.native
  
  /* CompleteClass */
  var removeEl: Any = js.native
  
  /* CompleteClass */
  var removeRegion: Any = js.native
  
  /* CompleteClass */
  var removeRegions: Any = js.native
  
  /* CompleteClass */
  var replaceEl: Any = js.native
  
  /**
    * Method used by this.serializeData to serialize this View's collection
    * data.
    */
  def serializeCollection(): Any = js.native
  
  /**
    * The results of this method ared passed to this View's template. By
    * default Marionette will attempt to pass either an attached model or
    * collection which has been converted to JSON.
    */
  def serializeData(): Any = js.native
  
  /**
    * Method used by this.serializeData to serialize this View's model
    * data.
    */
  def serializeModel(): Any = js.native
  
  /**
    * Rebind this View to a new element. Overriding Backbone.View’s
    * setElement to handle if an element was previously defined.
    * (undocumented)
    */
  def setElement(element: Any): this.type = js.native
  
  /* CompleteClass */
  var setInnerContent: Any = js.native
  
  /**
    * Used to set the renderer for this View. The rendere function is
    * passed the template and the data and is expected to return an html
    * string. By default this is set to use Renderer.
    */
  def setRenderer(renderer: js.Function2[/* template */ Any, /* data */ Any, String]): Unit = js.native
  
  /* CompleteClass */
  var showChildView: Any = js.native
  
  /**
    * Internal property. (undocumented)
    */
  var supportsDestroyLifecycle: Any | Boolean = js.native
  
  /**
    * Internal property. (undocumented)
    */
  var supportsRenderLifecycle: Any | Boolean = js.native
  
  var triggerMethod: Any = js.native
  /**
    * Trigger an event and a corresponding method on the target object.
    * All arguments that are passed to the triggerMethod call are passed
    * along to both the event and the method, with the exception of the
    * event name not being passed to the corresponding method.
    */
  def triggerMethod(name: String, args: Any*): Any = js.native
  
  /**
    * The view triggers attribute binds DOM events to Marionette View events
    * that can be responded to at the view or parent level.
    */
  var triggers: EventsHash = js.native
  
  /**
    * Name parts of your template to be used
    * throughout the view with the ui attribute.
    */
  var ui: Any = js.native
  
  /* CompleteClass */
  var unbindEvents: Any = js.native
  
  /**
    * Bind UI elements from this view. (undocumented)
    */
  def unbindUIElements(): Any = js.native
  
  /**
    * Undelegate entity events. (undocumented)
    */
  def undelegateEntityEvents(): View[TModel] = js.native
}
