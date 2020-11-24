package typings.baconjs.jqueryMod

import typings.baconjs.observableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/jquery", "$")
@js.native
object _empty extends js.Object {
  
  def asEventStream(eventName: String, selector: js.UndefOr[scala.Nothing], eventTransformer: js.Any): EventStream[_] = js.native
  /**
    Creates an EventStream from events on a
    jQuery or Zepto.js object. You can pass optional arguments to add a
    jQuery live selector and/or a function that processes the jQuery
    event and its parameters, if given, like this:
    
    ```js
    $("#my-div").asEventStream("click", ".more-specific-selector")
    $("#my-div").asEventStream("click", ".more-specific-selector", function(event, args) { return args[0] })
    $("#my-div").asEventStream("click", function(event, args) { return args[0] })
    ```
    
    Note: you need to install the `asEventStream` method on JQuery by calling
    [init()](#_.aseventstream) as in `Bacon.$.init($)`.
    */
  def asEventStream(eventName: String, selector: String, eventTransformer: js.Any): EventStream[_] = js.native
  
  /**
    * Installs the [asEventStream](#_.aseventstream) to the given jQuery/Zepto object (the `$` object).
    */
  def init(jQuery: js.Any): Unit = js.native
}
