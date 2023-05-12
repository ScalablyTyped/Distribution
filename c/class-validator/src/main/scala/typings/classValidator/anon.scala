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
    var constraints: js.UndefOr[js.Array[Any]] = js.undefined
    
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
          /* value */ js.UndefOr[Any], 
          /* constraint1 */ js.UndefOr[Any], 
          /* constraint2 */ js.UndefOr[Any], 
          String
        ])
      ] = js.undefined
    
    /**
      * Validator name.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Specific validation type options.
      */
    var options: js.UndefOr[Any] = js.undefined
    
    /**
      * Validation type. Should be one of the ValidationTypes value.
      */
    var `type`: String
  }
  object Always {
    
    inline def apply(`type`: String): Always = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Always]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Always] (val x: Self) extends AnyVal {
      
      inline def setAlways(value: Boolean): Self = StObject.set(x, "always", value.asInstanceOf[js.Any])
      
      inline def setAlwaysUndefined: Self = StObject.set(x, "always", js.undefined)
      
      inline def setConstraints(value: js.Array[Any]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      inline def setConstraintsVarargs(value: Any*): Self = StObject.set(x, "constraints", js.Array(value*))
      
      inline def setEach(value: Boolean): Self = StObject.set(x, "each", value.asInstanceOf[js.Any])
      
      inline def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
      
      inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
      
      inline def setMessage(
        value: String | (js.Function3[
              /* value */ js.UndefOr[Any], 
              /* constraint1 */ js.UndefOr[Any], 
              /* constraint2 */ js.UndefOr[Any], 
              String
            ])
      ): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageFunction3(
        value: (/* value */ js.UndefOr[Any], /* constraint1 */ js.UndefOr[Any], /* constraint2 */ js.UndefOr[Any]) => String
      ): Self = StObject.set(x, "message", js.Any.fromFunction3(value))
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Async extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object Async {
    
    inline def apply(): Async = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Async]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Async] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait Get extends StObject {
    
    def get(someClass: Any): Any
  }
  object Get {
    
    inline def apply(get: Any => Any): Get = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
      __obj.asInstanceOf[Get]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Get] (val x: Self) extends AnyVal {
      
      inline def setGet(value: Any => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Instantiable[T]
    extends StObject
       with Instantiable1[/* args (repeated) */ Any, T]
  
  trait Nullable extends StObject {
    
    var nullable: js.UndefOr[Boolean] = js.undefined
  }
  object Nullable {
    
    inline def apply(): Nullable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Nullable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Nullable] (val x: Self) extends AnyVal {
      
      inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
      
      inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    }
  }
  
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
    
    inline def apply(): Target = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Target]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
      
      inline def setTarget(value: Boolean): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
