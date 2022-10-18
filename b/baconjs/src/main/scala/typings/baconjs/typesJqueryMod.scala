package typings.baconjs

import typings.baconjs.typesObservableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesJqueryMod {
  
  object _empty {
    
    @JSImport("baconjs/types/jquery", "$")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def asEventStream(eventName: String, selector: String, eventTransformer: Any): EventStream[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("asEventStream")(eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventTransformer.asInstanceOf[js.Any])).asInstanceOf[EventStream[Any]]
    inline def asEventStream(eventName: String, selector: Unit, eventTransformer: Any): EventStream[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("asEventStream")(eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventTransformer.asInstanceOf[js.Any])).asInstanceOf[EventStream[Any]]
    
    /**
      * Installs the [asEventStream](#_.aseventstream) to the given jQuery/Zepto object (the `$` object).
      */
    inline def init(jQuery: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(jQuery.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
