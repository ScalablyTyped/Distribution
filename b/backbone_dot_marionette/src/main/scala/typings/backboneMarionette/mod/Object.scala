package typings.backboneMarionette.mod

import typings.backbone.mod.EventsMixin
import typings.backboneRadio.mod.Channel_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.backboneMarionette.mod.RadioMixin because var conflicts: bindEvents, unbindEvents. Inlined getChannel, bindRequests, unbindRequests */ @JSImport("backbone.marionette", "Object")
@js.native
class Object ()
  extends EventsMixin
     with CommonMixin {
  def this(options: ObjectOptions) = this()
  
  /**
    * This method is used to bind a backbone "entity" (collection/model) to
    * methods on a target object.
    */
  @JSName("bindEvents")
  def bindEvents_MObject(entity: js.Any, bindings: js.Any): Unit = js.native
  
  var bindRequests: js.Any = js.native
  /**
    * This method is used to bind a radio requests to methods on a target
    * object.
    */
  def bindRequests(channel: Channel_, bindings: js.Any): Unit = js.native
  
  /**
    * Defines the Radio channel that will be used for the requests and/or events
    */
  var channelName: String = js.native
  
  /**
    * Objects have a destroy method that unbind the events that are directly
    * attached to the instance. Invoking the destroy method will trigger a
    * "before:destroy" event and corresponding onBeforeDestroy method call.
    * These calls will be passed any arguments destroy was invoked with.
    * @param args any arguments to pass to the "before:destroy" event and call to
    * onBeforeDestroy.
    */
  def destroy(args: js.Any*): Unit = js.native
  
  /**
    * Returns a Radio.Channel instance using 'channelName'
    */
  def getChannel(): Channel_ = js.native
  @JSName("getChannel")
  var getChannel_FObject: js.Any = js.native
  
  /**
    * Retrieve an object's attribute either directly from the object, or from
    * the object's this.options, with this.options taking precedence.
    * @param optionName the name of the option to retrieve.
    */
  @JSName("getOption")
  def getOption_MObject(optionName: String): js.Any = js.native
  
  /**
    * Initialize is called immediately after the Object has been instantiated,
    * and is invoked with the same arguments that the constructor received.
    */
  def initialize(): Unit = js.native
  def initialize(options: ObjectOptions): Unit = js.native
  
  /**
    * Check if this Object has been destroyed.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * A handy function to pluck certain options and attach them directly
    * to an instance.
    */
  @JSName("mergeOptions")
  def mergeOptions_MObject(options: js.Any, keys: js.Any): Unit = js.native
  
  /**
    * Receives a hash of event names and functions and/or function names,
    * and returns the same hash with the function names replaced with the
    * function references themselves.
    */
  @JSName("normalizeMethods")
  def normalizeMethods_MObject[T](hash: js.Any): T = js.native
  
  /**
    * Faulty overgeneralization of Backbone.Events.on, for historical
    * reasons.
    */
  def on(eventName: js.Any): js.Any = js.native
  def on(eventName: js.Any, callback: js.UndefOr[scala.Nothing], context: js.Any): js.Any = js.native
  def on(eventName: js.Any, callback: js.Any): js.Any = js.native
  def on(eventName: js.Any, callback: js.Any, context: js.Any): js.Any = js.native
  
  /**
    * Defines an events hash with the events to be listened and its respective handlers
    */
  var radioEvents: js.Any = js.native
  
  /**
    * Defines an events hash with the requests to be replied and its respective handlers
    */
  var radioRequests: js.Any = js.native
  
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
  @JSName("unbindEvents")
  def unbindEvents_MObject(entity: js.Any, bindings: js.Any): Unit = js.native
  
  var unbindRequests: js.Any = js.native
  /**
    * This method is used to unbind a radio requests to methods on a target
    * object.
    */
  def unbindRequests(channel: Channel_, bindings: js.Any): Unit = js.native
}
