package typings.backboneMarionette.mod

import typings.backbone.mod.EventsMixin
import typings.backboneRadio.mod.Channel_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.backboneMarionette.mod.RadioMixin because var conflicts: bindEvents, unbindEvents. Inlined getChannel, bindRequests, unbindRequests */ @JSImport("backbone.marionette", "Object")
@js.native
open class Object ()
  extends EventsMixin
     with CommonMixin {
  def this(options: ObjectOptions) = this()
  
  /* CompleteClass */
  var bindEvents: Any = js.native
  /**
    * This method is used to bind a backbone "entity" (collection/model) to
    * methods on a target object.
    */
  @JSName("bindEvents")
  def bindEvents_MObject(entity: Any, bindings: Any): Unit = js.native
  
  var bindRequests: Any = js.native
  /**
    * This method is used to bind a radio requests to methods on a target
    * object.
    */
  def bindRequests(channel: Channel_, bindings: Any): Unit = js.native
  
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
  def destroy(args: Any*): Unit = js.native
  
  /**
    * Returns a Radio.Channel instance using 'channelName'
    */
  def getChannel(): Channel_ = js.native
  @JSName("getChannel")
  var getChannel_FObject: Any = js.native
  
  /* CompleteClass */
  var getOption: Any = js.native
  /**
    * Retrieve an object's attribute either directly from the object, or from
    * the object's this.options, with this.options taking precedence.
    * @param optionName the name of the option to retrieve.
    */
  @JSName("getOption")
  def getOption_MObject(optionName: String): Any = js.native
  
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
  
  /* CompleteClass */
  var mergeOptions: Any = js.native
  /**
    * A handy function to pluck certain options and attach them directly
    * to an instance.
    */
  @JSName("mergeOptions")
  def mergeOptions_MObject(options: Any, keys: Any): Unit = js.native
  
  /* CompleteClass */
  var normalizeMethods: Any = js.native
  /**
    * Receives a hash of event names and functions and/or function names,
    * and returns the same hash with the function names replaced with the
    * function references themselves.
    */
  @JSName("normalizeMethods")
  def normalizeMethods_MObject[T](hash: Any): T = js.native
  
  /**
    * Faulty overgeneralization of Backbone.Events.on, for historical
    * reasons.
    */
  def on(eventName: Any): Any = js.native
  def on(eventName: Any, callback: Any): Any = js.native
  def on(eventName: Any, callback: Any, context: Any): Any = js.native
  def on(eventName: Any, callback: Unit, context: Any): Any = js.native
  
  /**
    * Defines an events hash with the events to be listened and its respective handlers
    */
  var radioEvents: Any = js.native
  
  /**
    * Defines an events hash with the requests to be replied and its respective handlers
    */
  var radioRequests: Any = js.native
  
  /**
    * Trigger an event and a corresponding method on the target object.
    * All arguments that are passed to the triggerMethod call are passed
    * along to both the event and the method, with the exception of the
    * event name not being passed to the corresponding method.
    */
  def triggerMethod(name: String, args: Any*): Any = js.native
  
  /* CompleteClass */
  var unbindEvents: Any = js.native
  /**
    * This method can be used to unbind callbacks from entities'
    * (collection/model) events.
    */
  @JSName("unbindEvents")
  def unbindEvents_MObject(entity: Any, bindings: Any): Unit = js.native
  
  var unbindRequests: Any = js.native
  /**
    * This method is used to unbind a radio requests to methods on a target
    * object.
    */
  def unbindRequests(channel: Channel_, bindings: Any): Unit = js.native
}
