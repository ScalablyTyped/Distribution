package typings.chocolatechipjs

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bottom extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object Bottom {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    extension [Self <: Bottom](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Call extends StObject {
    
    /**
      * This method parses a string and an optoinal variable name and returns a parsed template in the form of a function. You can then pass this function data to get rendered nodes.
      *
      * @param template A string of markup to use as a template.
      * @param variable An option name to use in the template. If it were "myData": [[= myData.name]]. Otherwise it defaults to "data": [[= data.name]].
      */
    def apply(template: String): js.Function = js.native
    def apply(template: String, variable: String): js.Function = js.native
    
    /**
      * An object that holds the reference to the controller for a repeater.
      * This is used to cache the data that a repeater uses. After the repeater is rendered, the reference is deleted from this object.
      * Example: $.template.data["myRepeater"] = [{name: "Joe"}, {name: "Sue"}];
      */
    var data: Any = js.native
    
    /**
      * Use this value to output an index value in a template repeater.
      */
    var index: Double = js.native
    
    /**
      * The repeater method used to rendering iterable template data.
      */
    def repeater(): Unit = js.native
    /**
      * The repeater method used to rendering iterable template data.
      */
    def repeater(element: ChocolateChipElementArray, template: String, data: Any): Unit = js.native
  }
  
  trait CallbackName extends StObject {
    
    /**
      * The optional name for the callback when the server response will execute.
      * The default value is "callback".
      * However some sites may use a different name for their JSONP function.
      * Consult the documentation on the site to ascertain the correct value for this callback.
      */
    var callbackName: js.UndefOr[String] = js.undefined
    
    /**
      * This value determines whether the callbacks and script associate with JSONP persist or are purged after the request returns. By default this is set to true, meaning that they will be purged.
      */
    var clear: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A number representing milliseconds to express when to refect a JSONP request.
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object CallbackName {
    
    inline def apply(): CallbackName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallbackName]
    }
    
    extension [Self <: CallbackName](x: Self) {
      
      inline def setCallbackName(value: String): Self = StObject.set(x, "callbackName", value.asInstanceOf[js.Any])
      
      inline def setCallbackNameUndefined: Self = StObject.set(x, "callbackName", js.undefined)
      
      inline def setClear(value: Boolean): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait Data extends StObject {
    
    /**
      * DO NOT TOUCH! This stores information about registered events.
      */
    var events: Delete
  }
  object Data {
    
    inline def apply(events: Delete): Data = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setEvents(value: Delete): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    }
  }
  
  trait Delete extends StObject {
    
    var _delete: js.Function
    
    var hasKey: js.Function
    
    var keys: js.Array[Any]
    
    var set: js.Function
    
    var values: js.Array[Any]
  }
  object Delete {
    
    inline def apply(
      _delete: js.Function,
      hasKey: js.Function,
      keys: js.Array[Any],
      set: js.Function,
      values: js.Array[Any]
    ): Delete = {
      val __obj = js.Dynamic.literal(_delete = _delete.asInstanceOf[js.Any], hasKey = hasKey.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delete]
    }
    
    extension [Self <: Delete](x: Self) {
      
      inline def setHasKey(value: js.Function): Self = StObject.set(x, "hasKey", value.asInstanceOf[js.Any])
      
      inline def setKeys(value: js.Array[Any]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: Any*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setSet(value: js.Function): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
      
      inline def set_delete(value: js.Function): Self = StObject.set(x, "_delete", value.asInstanceOf[js.Any])
    }
  }
  
  trait Extend extends StObject {
    
    /**
      * This method adds the provided object to the Array prototype to make it available to all arrays of HTML elements.
      *
      * @param object And object to add to element arrays.
      * @return The extended array of elements.
      */
    def extend(`object`: js.Object): js.Array[HTMLElement]
  }
  object Extend {
    
    inline def apply(extend: js.Object => js.Array[HTMLElement]): Extend = {
      val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend))
      __obj.asInstanceOf[Extend]
    }
    
    extension [Self <: Extend](x: Self) {
      
      inline def setExtend(value: js.Object => js.Array[HTMLElement]): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    }
  }
}
