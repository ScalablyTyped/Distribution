package typings.cfcsCore

import typings.cfcsCore.declarationCoreTypesMod.ExtractNever
import typings.cfcsCore.declarationReactiveComputedObserverMod.ComputedObserver
import typings.cfcsCore.declarationReactiveDecoratorsReactiveSubscribeMod.ReactiveSubscribe
import typings.cfcsCore.declarationReactiveObserverMod.Observer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationReactiveInlineMod {
  
  @JSImport("@cfcs/core/declaration/reactive/inline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computed[Type](computedCallback: js.Function0[Type]): ComputedObserver[Type] = ^.asInstanceOf[js.Dynamic].applyDynamic("computed")(computedCallback.asInstanceOf[js.Any]).asInstanceOf[ComputedObserver[Type]]
  
  inline def observe[Type](): Observer[Type] = ^.asInstanceOf[js.Dynamic].applyDynamic("observe")().asInstanceOf[Observer[Type]]
  inline def observe[Type](defaultValue: Type): Observer[Type] = ^.asInstanceOf[js.Dynamic].applyDynamic("observe")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[Observer[Type]]
  
  inline def partialReactive[Object /* <: Record[String, Any] */](setup: Object): ParitalReactiveObject[Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("partialReactive")(setup.asInstanceOf[js.Any]).asInstanceOf[ParitalReactiveObject[Object]]
  inline def partialReactive[Object /* <: Record[String, Any] */](setup: js.Function0[Object]): ParitalReactiveObject[Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("partialReactive")(setup.asInstanceOf[js.Any]).asInstanceOf[ParitalReactiveObject[Object]]
  
  inline def reactive[Object /* <: Record[String, Any] */](setup: Object): ReactiveObject[Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("reactive")(setup.asInstanceOf[js.Any]).asInstanceOf[ReactiveObject[Object]]
  inline def reactive[Object /* <: Record[String, Any] */](setup: js.Function0[Object]): ReactiveObject[Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("reactive")(setup.asInstanceOf[js.Any]).asInstanceOf[ReactiveObject[Object]]
  
  /* Inlined {[ Key in keyof Object ]: Object[Key] extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type>? Type : Object[Key]} */
  trait ConvertValue[Object /* <: Record[String, Any] */] extends StObject {
    
    var constructor: /* import warning: importer.ImportType#apply Failed type conversion: std.Function extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : std.Function */ js.Any
    
    @JSName("hasOwnProperty")
    var hasOwnProperty_FConvertValue: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.PropertyKey): boolean extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (v : std.PropertyKey): boolean */ js.Any
    
    @JSName("isPrototypeOf")
    var isPrototypeOf_FConvertValue: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.Object): boolean extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (v : std.Object): boolean */ js.Any
    
    @JSName("propertyIsEnumerable")
    var propertyIsEnumerable_FConvertValue: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.PropertyKey): boolean extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (v : std.PropertyKey): boolean */ js.Any
    
    @JSName("toLocaleString")
    var toLocaleString_FConvertValue: /* import warning: importer.ImportType#apply Failed type conversion: (): string extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (): string */ js.Any
    
    @JSName("toString")
    var toString_FConvertValue: /* import warning: importer.ImportType#apply Failed type conversion: (): string extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (): string */ js.Any
    
    @JSName("valueOf")
    var valueOf_FConvertValue: /* import warning: importer.ImportType#apply Failed type conversion: (): std.Object extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (): std.Object */ js.Any
  }
  object ConvertValue {
    
    inline def apply[Object /* <: Record[String, Any] */](
      constructor: /* import warning: importer.ImportType#apply Failed type conversion: std.Function extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : std.Function */ js.Any,
      hasOwnProperty: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.PropertyKey): boolean extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (v : std.PropertyKey): boolean */ js.Any,
      isPrototypeOf: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.Object): boolean extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (v : std.Object): boolean */ js.Any,
      propertyIsEnumerable: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.PropertyKey): boolean extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (v : std.PropertyKey): boolean */ js.Any,
      toLocaleString: /* import warning: importer.ImportType#apply Failed type conversion: (): string extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (): string */ js.Any,
      toString_ : /* import warning: importer.ImportType#apply Failed type conversion: (): string extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (): string */ js.Any,
      valueOf: /* import warning: importer.ImportType#apply Failed type conversion: (): std.Object extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (): std.Object */ js.Any
    ): ConvertValue[Object] = {
      val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = hasOwnProperty.asInstanceOf[js.Any], isPrototypeOf = isPrototypeOf.asInstanceOf[js.Any], propertyIsEnumerable = propertyIsEnumerable.asInstanceOf[js.Any], toLocaleString = toLocaleString.asInstanceOf[js.Any], valueOf = valueOf.asInstanceOf[js.Any])
      __obj.updateDynamic("toString")(toString_.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvertValue[Object]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConvertValue[?], Object /* <: Record[String, Any] */] (val x: Self & ConvertValue[Object]) extends AnyVal {
      
      inline def setConstructor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.Function extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : std.Function */ js.Any
      ): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
      
      inline def setHasOwnProperty(
        value: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.PropertyKey): boolean extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (v : std.PropertyKey): boolean */ js.Any
      ): Self = StObject.set(x, "hasOwnProperty", value.asInstanceOf[js.Any])
      
      inline def setIsPrototypeOf(
        value: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.Object): boolean extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (v : std.Object): boolean */ js.Any
      ): Self = StObject.set(x, "isPrototypeOf", value.asInstanceOf[js.Any])
      
      inline def setPropertyIsEnumerable(
        value: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.PropertyKey): boolean extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (v : std.PropertyKey): boolean */ js.Any
      ): Self = StObject.set(x, "propertyIsEnumerable", value.asInstanceOf[js.Any])
      
      inline def setToLocaleString(
        value: /* import warning: importer.ImportType#apply Failed type conversion: (): string extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (): string */ js.Any
      ): Self = StObject.set(x, "toLocaleString", value.asInstanceOf[js.Any])
      
      inline def setToString_(
        value: /* import warning: importer.ImportType#apply Failed type conversion: (): string extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (): string */ js.Any
      ): Self = StObject.set(x, "toString", value.asInstanceOf[js.Any])
      
      inline def setValueOf(
        value: /* import warning: importer.ImportType#apply Failed type conversion: (): std.Object extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (): std.Object */ js.Any
      ): Self = StObject.set(x, "valueOf", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @cfcs/core.@cfcs/core/declaration/reactive/inline.ConvertValue<Object> & @cfcs/core.@cfcs/core/declaration/reactive/decorators/ReactiveSubscribe.ReactiveSubscribe<@cfcs/core.@cfcs/core/declaration/reactive/inline.PickObverser<Object>> */
  @js.native
  trait ParitalReactiveObject[Object /* <: Record[String, Any] */] extends StObject {
    
    var constructor: /* import warning: importer.ImportType#apply Failed type conversion: std.Function extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : std.Function */ js.Any = js.native
    
    @JSName("hasOwnProperty")
    var hasOwnProperty_FParitalReactiveObject: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.PropertyKey): boolean extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (v : std.PropertyKey): boolean */ js.Any = js.native
    
    @JSName("isPrototypeOf")
    var isPrototypeOf_FParitalReactiveObject: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.Object): boolean extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (v : std.Object): boolean */ js.Any = js.native
    
    @JSName("propertyIsEnumerable")
    var propertyIsEnumerable_FParitalReactiveObject: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.PropertyKey): boolean extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (v : std.PropertyKey): boolean */ js.Any = js.native
    
    /**
      * When the value of the property changes, the callback function is called.
      */
    def subscribe[Name /* <: /* keyof @cfcs/core.@cfcs/core/declaration/reactive/inline.PickObverser<Object> */ String */](
      name: Name,
      callback: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: @cfcs/core.@cfcs/core/declaration/reactive/inline.PickObverser<Object>[Name] */ /* value */ js.Any, 
          Unit
        ]
    ): Unit = js.native
    
    @JSName("toLocaleString")
    var toLocaleString_FParitalReactiveObject: /* import warning: importer.ImportType#apply Failed type conversion: (): string extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (): string */ js.Any = js.native
    
    @JSName("toString")
    var toString_FParitalReactiveObject: /* import warning: importer.ImportType#apply Failed type conversion: (): string extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (): string */ js.Any = js.native
    
    /**
      * Unregister the callback function corresponding to the property.
      */
    def unsubscribe[Name /* <: /* keyof @cfcs/core.@cfcs/core/declaration/reactive/inline.PickObverser<Object> */ String */](): Unit = js.native
    def unsubscribe[Name /* <: /* keyof @cfcs/core.@cfcs/core/declaration/reactive/inline.PickObverser<Object> */ String */](name: Name): Unit = js.native
    def unsubscribe[Name /* <: /* keyof @cfcs/core.@cfcs/core/declaration/reactive/inline.PickObverser<Object> */ String */](
      name: Name,
      callback: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: @cfcs/core.@cfcs/core/declaration/reactive/inline.PickObverser<Object>[Name] */ /* value */ js.Any, 
          Unit
        ]
    ): Unit = js.native
    def unsubscribe[Name /* <: /* keyof @cfcs/core.@cfcs/core/declaration/reactive/inline.PickObverser<Object> */ String */](
      name: Unit,
      callback: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: @cfcs/core.@cfcs/core/declaration/reactive/inline.PickObverser<Object>[Name] */ /* value */ js.Any, 
          Unit
        ]
    ): Unit = js.native
    
    @JSName("valueOf")
    var valueOf_FParitalReactiveObject: /* import warning: importer.ImportType#apply Failed type conversion: (): std.Object extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (): std.Object */ js.Any = js.native
  }
  
  type PickObverser[Object /* <: Record[String, Any] */] = ExtractNever[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof Object ]: Object[Key] extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type>? Type : never} */ js.Any
  ]
  
  type ReactiveObject[Object /* <: Record[String, Any] */] = Object & ReactiveSubscribe[Object]
}
