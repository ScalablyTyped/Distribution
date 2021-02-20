package typings.chocolatechipjs

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Bottom extends StObject {
    
    var bottom: Double = js.native
    
    var left: Double = js.native
    
    var right: Double = js.native
    
    var top: Double = js.native
  }
  object Bottom {
    
    @scala.inline
    def apply(bottom: Double, left: Double, right: Double, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit class BottomMutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
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
    var data: js.Any = js.native
    
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
    def repeater(element: ChocolateChipElementArray, template: String, data: js.Any): Unit = js.native
  }
  
  @js.native
  trait CallbackName extends StObject {
    
    /**
      * The optional name for the callback when the server response will execute.
      * The default value is "callback".
      * However some sites may use a different name for their JSONP function.
      * Consult the documentation on the site to ascertain the correct value for this callback.
      */
    var callbackName: js.UndefOr[String] = js.native
    
    /**
      * This value determines whether the callbacks and script associate with JSONP persist or are purged after the request returns. By default this is set to true, meaning that they will be purged.
      */
    var clear: js.UndefOr[Boolean] = js.native
    
    /**
      * A number representing milliseconds to express when to refect a JSONP request.
      */
    var timeout: js.UndefOr[Double] = js.native
  }
  object CallbackName {
    
    @scala.inline
    def apply(): CallbackName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallbackName]
    }
    
    @scala.inline
    implicit class CallbackNameMutableBuilder[Self <: CallbackName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbackName(value: String): Self = StObject.set(x, "callbackName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackNameUndefined: Self = StObject.set(x, "callbackName", js.undefined)
      
      @scala.inline
      def setClear(value: Boolean): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait Data extends StObject {
    
    /**
      * DO NOT TOUCH! This stores information about registered events.
      */
    var events: Delete = js.native
  }
  object Data {
    
    @scala.inline
    def apply(events: Delete): Data = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvents(value: Delete): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Delete extends StObject {
    
    var _delete: js.Function = js.native
    
    var hasKey: js.Function = js.native
    
    var keys: js.Array[_] = js.native
    
    var set: js.Function = js.native
    
    var values: js.Array[_] = js.native
  }
  object Delete {
    
    @scala.inline
    def apply(
      _delete: js.Function,
      hasKey: js.Function,
      keys: js.Array[_],
      set: js.Function,
      values: js.Array[_]
    ): Delete = {
      val __obj = js.Dynamic.literal(_delete = _delete.asInstanceOf[js.Any], hasKey = hasKey.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delete]
    }
    
    @scala.inline
    implicit class DeleteMutableBuilder[Self <: Delete] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasKey(value: js.Function): Self = StObject.set(x, "hasKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeys(value: js.Array[_]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysVarargs(value: js.Any*): Self = StObject.set(x, "keys", js.Array(value :_*))
      
      @scala.inline
      def setSet(value: js.Function): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[_]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
      
      @scala.inline
      def set_delete(value: js.Function): Self = StObject.set(x, "_delete", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Extend extends StObject {
    
    /**
      * This method adds the provided object to the Array prototype to make it available to all arrays of HTML elements.
      *
      * @param object And object to add to element arrays.
      * @return The extended array of elements.
      */
    def extend(`object`: js.Object): js.Array[HTMLElement] = js.native
  }
  object Extend {
    
    @scala.inline
    def apply(extend: js.Object => js.Array[HTMLElement]): Extend = {
      val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend))
      __obj.asInstanceOf[Extend]
    }
    
    @scala.inline
    implicit class ExtendMutableBuilder[Self <: Extend] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtend(value: js.Object => js.Array[HTMLElement]): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    }
  }
}
