package typings.cfcsCore

import org.scalablytyped.runtime.TopLevel
import typings.cfcsCore.typesMod.ExtractNever
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inlineReactiveMod {
  
  @JSImport("@cfcs/core/declaration/reactive/inlineReactive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reactive[Object /* <: Record[String, Any] */](setup: Object): ReactiveObject[Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("reactive")(setup.asInstanceOf[js.Any]).asInstanceOf[ReactiveObject[Object]]
  inline def reactive[Object /* <: Record[String, Any] */](setup: js.Function0[Object]): ReactiveObject[Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("reactive")(setup.asInstanceOf[js.Any]).asInstanceOf[ReactiveObject[Object]]
  
  /* Inlined {[ Key in keyof Object ]: Object[Key] extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type>? Type : Object[Key]} */
  trait ConvertValue[Object /* <: Record[String, Any] */] extends StObject {
    
    var constructor: js.Function
    
    @JSName("hasOwnProperty")
    var hasOwnProperty_FConvertValue: js.Function1[/* v */ PropertyKey, Boolean]
    
    @JSName("isPrototypeOf")
    var isPrototypeOf_FConvertValue: js.Function1[/* v */ js.Object, Boolean]
    
    @JSName("propertyIsEnumerable")
    var propertyIsEnumerable_FConvertValue: js.Function1[/* v */ PropertyKey, Boolean]
    
    @JSName("toLocaleString")
    var toLocaleString_FConvertValue: js.Function0[String]
    
    @JSName("toString")
    var toString_FConvertValue: js.Function0[String]
    
    @JSName("valueOf")
    var valueOf_FConvertValue: js.Function0[js.Object]
  }
  object ConvertValue {
    
    inline def apply[Object /* <: Record[String, Any] */](
      constructor: js.Function,
      hasOwnProperty: /* v */ PropertyKey => Boolean,
      isPrototypeOf: /* v */ js.Object => Boolean,
      propertyIsEnumerable: /* v */ PropertyKey => Boolean,
      toLocaleString: () => String,
      toString_ : () => String,
      valueOf: () => js.Object
    ): ConvertValue[Object] = {
      val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), isPrototypeOf = js.Any.fromFunction1(isPrototypeOf), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), toLocaleString = js.Any.fromFunction0(toLocaleString), valueOf = js.Any.fromFunction0(valueOf))
      __obj.updateDynamic("toString")(js.Any.fromFunction0(toString_))
      __obj.asInstanceOf[ConvertValue[Object]]
    }
    
    extension [Self <: ConvertValue[?], Object /* <: Record[String, Any] */](x: Self & ConvertValue[Object]) {
      
      inline def setConstructor(value: js.Function): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
      
      inline def setHasOwnProperty(value: /* v */ PropertyKey => Boolean): Self = StObject.set(x, "hasOwnProperty", js.Any.fromFunction1(value))
      
      inline def setIsPrototypeOf(value: /* v */ js.Object => Boolean): Self = StObject.set(x, "isPrototypeOf", js.Any.fromFunction1(value))
      
      inline def setPropertyIsEnumerable(value: /* v */ PropertyKey => Boolean): Self = StObject.set(x, "propertyIsEnumerable", js.Any.fromFunction1(value))
      
      inline def setToLocaleString(value: () => String): Self = StObject.set(x, "toLocaleString", js.Any.fromFunction0(value))
      
      inline def setToString_(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
      
      inline def setValueOf(value: () => js.Object): Self = StObject.set(x, "valueOf", js.Any.fromFunction0(value))
    }
  }
  
  type PickObverser[Object /* <: Record[String, Any] */] = ExtractNever[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Key in keyof Object ]: Object[Key] extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type>? any : never}
    */ typings.cfcsCore.cfcsCoreStrings.PickObverser & TopLevel[Object]
  ]
  
  /* Inlined @cfcs/core.@cfcs/core/declaration/reactive/inlineReactive.ConvertValue<Object> & @cfcs/core.@cfcs/core/declaration/reactive/ReactiveSubscribe.ReactiveSubscribe<@cfcs/core.@cfcs/core/declaration/reactive/inlineReactive.PickObverser<Object>> */
  @js.native
  trait ReactiveObject[Object /* <: Record[String, Any] */] extends StObject {
    
    var constructor: js.Function = js.native
    
    @JSName("hasOwnProperty")
    var hasOwnProperty_FReactiveObject: js.Function1[/* v */ PropertyKey, Boolean] = js.native
    
    @JSName("isPrototypeOf")
    var isPrototypeOf_FReactiveObject: js.Function1[/* v */ js.Object, Boolean] = js.native
    
    @JSName("propertyIsEnumerable")
    var propertyIsEnumerable_FReactiveObject: js.Function1[/* v */ PropertyKey, Boolean] = js.native
    
    def subscribe[Name /* <: /* keyof @cfcs/core.@cfcs/core/declaration/reactive/inlineReactive.PickObverser<Object> */ String */](
      name: Name,
      callback: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: @cfcs/core.@cfcs/core/declaration/reactive/inlineReactive.PickObverser<Object>[Name] */ /* value */ js.Any, 
          Unit
        ]
    ): Unit = js.native
    
    @JSName("toLocaleString")
    var toLocaleString_FReactiveObject: js.Function0[String] = js.native
    
    @JSName("toString")
    var toString_FReactiveObject: js.Function0[String] = js.native
    
    def unsubscribe[Name /* <: /* keyof @cfcs/core.@cfcs/core/declaration/reactive/inlineReactive.PickObverser<Object> */ String */](): Unit = js.native
    def unsubscribe[Name /* <: /* keyof @cfcs/core.@cfcs/core/declaration/reactive/inlineReactive.PickObverser<Object> */ String */](name: Name): Unit = js.native
    def unsubscribe[Name /* <: /* keyof @cfcs/core.@cfcs/core/declaration/reactive/inlineReactive.PickObverser<Object> */ String */](
      name: Name,
      callback: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: @cfcs/core.@cfcs/core/declaration/reactive/inlineReactive.PickObverser<Object>[Name] */ /* value */ js.Any, 
          Unit
        ]
    ): Unit = js.native
    def unsubscribe[Name /* <: /* keyof @cfcs/core.@cfcs/core/declaration/reactive/inlineReactive.PickObverser<Object> */ String */](
      name: Unit,
      callback: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: @cfcs/core.@cfcs/core/declaration/reactive/inlineReactive.PickObverser<Object>[Name] */ /* value */ js.Any, 
          Unit
        ]
    ): Unit = js.native
    
    @JSName("valueOf")
    var valueOf_FReactiveObject: js.Function0[js.Object] = js.native
  }
}
