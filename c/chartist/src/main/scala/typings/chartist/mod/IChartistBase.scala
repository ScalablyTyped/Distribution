package typings.chartist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChartistBase[T /* <: IChartOptions */] extends js.Object {
  
  var container: js.Any = js.native
  
  var data: IChartistData = js.native
  
  var defaultOptions: T = js.native
  
  def detach(): Unit = js.native
  
  // this most likely doesn't need to be exposed to the user
  var eventEmitter: js.Any = js.native
  
  /**
    * Use this function to un-register event handlers. If the handler function parameter is omitted all handlers for the given event will be un-registered.
    *
    * @method off
    * @param event {string} Name of the event for which a handler should be removed
    * @param handler {Function} The handler function that that was previously used to register a new event handler. This handler will be removed from the event handler list. If this parameter is omitted then all event handlers for the given event are removed from the list.
    */
  def off(event: String): IChartistBase[T] = js.native
  def off(event: String, handler: js.Function): IChartistBase[T] = js.native
  
  /**
    * Use this function to register event handlers. The handler callbacks are synchronous and will run in the main thread rather than the event loop.
    *
    * @method on
    * @param event {string} Name of the event. Check the examples for supported events.
    * @param handler {Function} The handler function that will be called when an event with the given name was emitted. This function will receive a data argument which contains event data. See the example for more details.
    */
  def on(event: String, handler: js.Function): IChartistBase[T] = js.native
  
  var options: T = js.native
  
  var plugins: js.UndefOr[js.Array[_]] = js.native
  
  var resizeListener: js.Any = js.native
  
  var responsiveOptions: js.Array[IResponsiveOptionTuple[T]] = js.native
  
  var supportsAnimations: Boolean = js.native
  
  var supportsForeignObject: Boolean = js.native
  
   // all of these plugins seem to be functions with options, but keeping type any for now
  def update(data: js.Object): Unit = js.native
  def update(data: js.Object, options: T): Unit = js.native
  def update(data: js.Object, options: T, `override`: Boolean): Unit = js.native
  def update(data: js.Object, options: js.UndefOr[scala.Nothing], `override`: Boolean): Unit = js.native
}
