package typings.classValidator

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Always extends StObject {
    
    /**
      * Indicates if validation must be performed always, no matter of validation groups used.
      */
    var always: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Constraints set by validation type.
      */
    var constraints: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /**
      * Specifies if validated value is an array and each of its item must be validated.
      */
    var each: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Validation groups used for this validation.
      */
    var groups: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Error message used to be used on validation fail.
      * You can use "$value" to use value that was failed by validation.
      * You can use "$constraint1" and "$constraint2" keys in the message string,
      * and they will be replaced with constraint values if they exist.
      * Message can be either string, either a function that returns a string.
      * Second option allows to use values and custom messages depend of them.
      */
    var message: js.UndefOr[
        String | (js.Function3[
          /* value */ js.UndefOr[js.Any], 
          /* constraint1 */ js.UndefOr[js.Any], 
          /* constraint2 */ js.UndefOr[js.Any], 
          String
        ])
      ] = js.undefined
    
    /**
      * Specific validation type options.
      */
    var options: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Validation type. Should be one of the ValidationTypes value.
      */
    var `type`: String
  }
  object Always {
    
    @scala.inline
    def apply(`type`: String): Always = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Always]
    }
    
    @scala.inline
    implicit class AlwaysMutableBuilder[Self <: Always] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlways(value: Boolean): Self = StObject.set(x, "always", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysUndefined: Self = StObject.set(x, "always", js.undefined)
      
      @scala.inline
      def setConstraints(value: js.Array[js.Any]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      @scala.inline
      def setConstraintsVarargs(value: js.Any*): Self = StObject.set(x, "constraints", js.Array(value :_*))
      
      @scala.inline
      def setEach(value: Boolean): Self = StObject.set(x, "each", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
      
      @scala.inline
      def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      @scala.inline
      def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setMessage(
        value: String | (js.Function3[
              /* value */ js.UndefOr[js.Any], 
              /* constraint1 */ js.UndefOr[js.Any], 
              /* constraint2 */ js.UndefOr[js.Any], 
              String
            ])
      ): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageFunction3(
        value: (/* value */ js.UndefOr[js.Any], /* constraint1 */ js.UndefOr[js.Any], /* constraint2 */ js.UndefOr[js.Any]) => String
      ): Self = StObject.set(x, "message", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Async extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object Async {
    
    @scala.inline
    def apply(): Async = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Async]
    }
    
    @scala.inline
    implicit class AsyncMutableBuilder[Self <: Async] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait Get extends StObject {
    
    def get(someClass: js.Any): js.Any
  }
  object Get {
    
    @scala.inline
    def apply(get: js.Any => js.Any): Get = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
      __obj.asInstanceOf[Get]
    }
    
    @scala.inline
    implicit class GetMutableBuilder[Self <: Get] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: js.Any => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Instantiable[T]
    extends StObject
       with Instantiable1[/* args (repeated) */ js.Any, T]
  
  trait Target extends StObject {
    
    /**
      * Indicates if target should be exposed in ValidationError.
      */
    var target: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates if validated value should be exposed in ValidationError.
      */
    var value: js.UndefOr[Boolean] = js.undefined
  }
  object Target {
    
    @scala.inline
    def apply(): Target = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Target]
    }
    
    @scala.inline
    implicit class TargetMutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTarget(value: Boolean): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
