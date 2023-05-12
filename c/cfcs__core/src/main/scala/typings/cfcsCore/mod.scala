package typings.cfcsCore

import typings.cfcsCore.anon.Destroy
import typings.cfcsCore.declarationCoreTypesMod.Ref
import typings.cfcsCore.declarationReactiveDecoratorsReactiveSubscribeMod.ReactiveSubscribe
import typings.cfcsCore.declarationReactiveInlineMod.ParitalReactiveObject
import typings.cfcsCore.declarationReactiveInlineMod.ReactiveObject
import typings.cfcsCore.declarationReactiveReactiveAdapterMod.ReactiveAdapterParam
import typings.cfcsCore.declarationReactiveTypesMod.ReactiveMethods
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@cfcs/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@cfcs/core", "ComputedObserver")
  @js.native
  open class ComputedObserver[T] protected ()
    extends typings.cfcsCore.declarationReactiveMod.ComputedObserver[T] {
    /**
      * @description Creates a new computed observer from the values of other observers.
      * It is read-only and if you change the value of the observer used inside the callback, its value will be automatically updated.
      * @param _computedCallback A function for observers to be computed.
      */
    def this(_computedCallback: js.Function0[T]) = this()
  }
  
  inline def Computed_(prototype: Any, memberName: String, attributes: js.PropertyDescriptor): js.PropertyDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("Computed")(prototype.asInstanceOf[js.Any], memberName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[js.PropertyDescriptor]
  
  inline def Observe_(): js.Function2[/* protoype */ Any, /* memberName */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Observe")().asInstanceOf[js.Function2[/* protoype */ Any, /* memberName */ String, Unit]]
  inline def Observe_(name: String): js.Function2[/* protoype */ Any, /* memberName */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Observe")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* protoype */ Any, /* memberName */ String, Unit]]
  inline def Observe_(protoype: Any, memberName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Observe")(protoype.asInstanceOf[js.Any], memberName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@cfcs/core", "Observer")
  @js.native
  /**
    *
    */
  open class Observer[Value] ()
    extends typings.cfcsCore.declarationReactiveMod.Observer[Value] {
    def this(value: Value) = this()
  }
  
  inline def ReactiveSubscribe(Constructor: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ReactiveSubscribe")(Constructor.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def Reactive_(): js.Function2[/* protoype */ Any, /* memberName */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Reactive")().asInstanceOf[js.Function2[/* protoype */ Any, /* memberName */ String, Unit]]
  inline def Reactive_(name: String): js.Function2[/* protoype */ Any, /* memberName */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Reactive")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* protoype */ Any, /* memberName */ String, Unit]]
  inline def Reactive_(protoype: Any, memberName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Reactive")(protoype.asInstanceOf[js.Any], memberName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def adaptReactive[Instance /* <: ReactiveSubscribe[Record[String, Any]] */, State /* <: Record[String, Any] */, Methods /* <: /* keyof std.Partial<Instance> */ String */, Props, Events /* <: Record[String, Any] */](adapter: ReactiveAdapterParam[Instance, State, Methods, Props, Events]): Destroy[Events, State, Instance] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptReactive")(adapter.asInstanceOf[js.Any]).asInstanceOf[Destroy[Events, State, Instance]]
  inline def adaptReactive[Instance /* <: ReactiveSubscribe[Record[String, Any]] */, State /* <: Record[String, Any] */, Methods /* <: /* keyof std.Partial<Instance> */ String */, Props, Events /* <: Record[String, Any] */](adapter: ReactiveAdapterParam[Instance, State, Methods, Props, Events], props: js.Function0[Props]): Destroy[Events, State, Instance] = (^.asInstanceOf[js.Dynamic].applyDynamic("adaptReactive")(adapter.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Destroy[Events, State, Instance]]
  
  inline def camelize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def computed[Type](computedCallback: js.Function0[Type]): typings.cfcsCore.declarationReactiveComputedObserverMod.ComputedObserver[Type] = ^.asInstanceOf[js.Dynamic].applyDynamic("computed")(computedCallback.asInstanceOf[js.Any]).asInstanceOf[typings.cfcsCore.declarationReactiveComputedObserverMod.ComputedObserver[Type]]
  
  inline def defineObservers(instance: Any): Record[String, typings.cfcsCore.declarationReactiveObserverMod.Observer[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineObservers")(instance.asInstanceOf[js.Any]).asInstanceOf[Record[String, typings.cfcsCore.declarationReactiveObserverMod.Observer[Any]]]
  
  inline def findTarget[Target /* <: Element */](): Target | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findTarget")().asInstanceOf[Target | Null]
  inline def findTarget[Target /* <: Element */](target: Target): Target | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findTarget")(target.asInstanceOf[js.Any]).asInstanceOf[Target | Null]
  inline def findTarget[Target /* <: Element */](target: String): Target | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findTarget")(target.asInstanceOf[js.Any]).asInstanceOf[Target | Null]
  inline def findTarget[Target /* <: Element */](target: Ref[Target]): Target | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findTarget")(target.asInstanceOf[js.Any]).asInstanceOf[Target | Null]
  
  inline def getObserver(instance: Any, name: String): typings.cfcsCore.declarationReactiveObserverMod.Observer[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getObserver")(instance.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.cfcsCore.declarationReactiveObserverMod.Observer[Any]]
  inline def getObserver(instance: Any, name: String, defaultValue: Any): typings.cfcsCore.declarationReactiveObserverMod.Observer[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getObserver")(instance.asInstanceOf[js.Any], name.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[typings.cfcsCore.declarationReactiveObserverMod.Observer[Any]]
  
  inline def getObservers(instance: Any): Record[String, typings.cfcsCore.declarationReactiveObserverMod.Observer[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getObservers")(instance.asInstanceOf[js.Any]).asInstanceOf[Record[String, typings.cfcsCore.declarationReactiveObserverMod.Observer[Any]]]
  inline def getObservers(instance: Any, isComputed: Boolean): Record[String, typings.cfcsCore.declarationReactiveObserverMod.Observer[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getObservers")(instance.asInstanceOf[js.Any], isComputed.asInstanceOf[js.Any])).asInstanceOf[Record[String, typings.cfcsCore.declarationReactiveObserverMod.Observer[Any]]]
  
  inline def injectReactiveSubscribe(`object`: Record[String, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("injectReactiveSubscribe")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isFunction(`val`: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isObject(`val`: Any): /* is object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is object */ Boolean]
  
  inline def isObserver(`val`: Any): /* is @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObserver")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<any> */ Boolean]
  
  inline def isReactive(`val`: Any): /* is @cfcs/core.@cfcs/core/declaration/reactive/decorators/ReactiveSubscribe.ReactiveSubscribe<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReactive")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is @cfcs/core.@cfcs/core/declaration/reactive/decorators/ReactiveSubscribe.ReactiveSubscribe<any> */ Boolean]
  
  inline def isString(`val`: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def keys[T /* <: Record[String, Any] */](obj: T): js.Array[/* keyof T */ String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[/* keyof T */ String]]
  
  inline def observe[Type](): typings.cfcsCore.declarationReactiveObserverMod.Observer[Type] = ^.asInstanceOf[js.Dynamic].applyDynamic("observe")().asInstanceOf[typings.cfcsCore.declarationReactiveObserverMod.Observer[Type]]
  inline def observe[Type](defaultValue: Type): typings.cfcsCore.declarationReactiveObserverMod.Observer[Type] = ^.asInstanceOf[js.Dynamic].applyDynamic("observe")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[typings.cfcsCore.declarationReactiveObserverMod.Observer[Type]]
  
  inline def partialReactive[Object /* <: Record[String, Any] */](setup: Object): ParitalReactiveObject[Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("partialReactive")(setup.asInstanceOf[js.Any]).asInstanceOf[ParitalReactiveObject[Object]]
  inline def partialReactive[Object /* <: Record[String, Any] */](setup: js.Function0[Object]): ParitalReactiveObject[Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("partialReactive")(setup.asInstanceOf[js.Any]).asInstanceOf[ParitalReactiveObject[Object]]
  
  inline def reactive[Object /* <: Record[String, Any] */](setup: Object): ReactiveObject[Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("reactive")(setup.asInstanceOf[js.Any]).asInstanceOf[ReactiveObject[Object]]
  inline def reactive[Object /* <: Record[String, Any] */](setup: js.Function0[Object]): ReactiveObject[Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("reactive")(setup.asInstanceOf[js.Any]).asInstanceOf[ReactiveObject[Object]]
  
  inline def setObserver(
    instance: Any,
    name: String,
    observer: typings.cfcsCore.declarationReactiveObserverMod.Observer[Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setObserver")(instance.asInstanceOf[js.Any], name.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def withClassMethods(methods: js.Array[String]): js.Function2[/* prototype */ Any, /* memberName */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("withClassMethods")(methods.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* prototype */ Any, /* memberName */ String, Unit]]
  
  inline def withReactiveMethods[Instance, Names /* <: /* keyof std.Partial<Instance> */ String */, Return /* <: ReactiveMethods[Instance, Names] */](ref: Ref[Instance]): Return = ^.asInstanceOf[js.Dynamic].applyDynamic("withReactiveMethods")(ref.asInstanceOf[js.Any]).asInstanceOf[Return]
  inline def withReactiveMethods[Instance, Names /* <: /* keyof std.Partial<Instance> */ String */, Return /* <: ReactiveMethods[Instance, Names] */](ref: Ref[Instance], methods: js.Array[Names]): Return = (^.asInstanceOf[js.Dynamic].applyDynamic("withReactiveMethods")(ref.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[Return]
}
