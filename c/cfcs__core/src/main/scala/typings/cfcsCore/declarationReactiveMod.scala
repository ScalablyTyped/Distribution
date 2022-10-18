package typings.cfcsCore

import typings.cfcsCore.anon.Destroy
import typings.cfcsCore.declarationCoreTypesMod.Ref
import typings.cfcsCore.declarationReactiveInlineReactiveMod.ReactiveObject
import typings.cfcsCore.declarationReactiveReactiveAdapterMod.ReactiveAdapter
import typings.cfcsCore.declarationReactiveReactiveSubscribeMod.ReactiveSubscribe
import typings.cfcsCore.declarationReactiveTypesMod.ReactiveMethods
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationReactiveMod {
  
  @JSImport("@cfcs/core/declaration/reactive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@cfcs/core/declaration/reactive", "Observer")
  @js.native
  open class Observer[Value] ()
    extends typings.cfcsCore.declarationReactiveObserverMod.Observer[Value] {
    def this(value: Value) = this()
  }
  
  inline def ReactiveSubscribe(Constructor: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ReactiveSubscribe")(Constructor.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def Reactive_(): js.Function2[/* prototype */ Any, /* memberName */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Reactive")().asInstanceOf[js.Function2[/* prototype */ Any, /* memberName */ String, Unit]]
  inline def Reactive_(name: String): js.Function2[/* prototype */ Any, /* memberName */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Reactive")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* prototype */ Any, /* memberName */ String, Unit]]
  
  inline def adaptReactive[Instance /* <: ReactiveSubscribe[Record[String, Any]] */, State /* <: Record[String, Any] */, Methods /* <: /* keyof std.Partial<Instance> */ String */, Data, Events /* <: Record[String, Any] */](adapter: ReactiveAdapter[Instance, State, Methods, Data, Events]): Destroy[State, Instance] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptReactive")(adapter.asInstanceOf[js.Any]).asInstanceOf[Destroy[State, Instance]]
  
  inline def defineObservers(instance: Any): Record[String, typings.cfcsCore.declarationReactiveObserverMod.Observer[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineObservers")(instance.asInstanceOf[js.Any]).asInstanceOf[Record[String, typings.cfcsCore.declarationReactiveObserverMod.Observer[Any]]]
  
  inline def getObserver(instance: Any, name: String): typings.cfcsCore.declarationReactiveObserverMod.Observer[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getObserver")(instance.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.cfcsCore.declarationReactiveObserverMod.Observer[Any]]
  inline def getObserver(instance: Any, name: String, defaultValue: Any): typings.cfcsCore.declarationReactiveObserverMod.Observer[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getObserver")(instance.asInstanceOf[js.Any], name.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[typings.cfcsCore.declarationReactiveObserverMod.Observer[Any]]
  
  inline def getObservers(instance: Any): Record[String, typings.cfcsCore.declarationReactiveObserverMod.Observer[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getObservers")(instance.asInstanceOf[js.Any]).asInstanceOf[Record[String, typings.cfcsCore.declarationReactiveObserverMod.Observer[Any]]]
  
  inline def injectReactiveSubscribe(`object`: Record[String, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("injectReactiveSubscribe")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isObserver(`val`: Any): /* is @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObserver")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<any> */ Boolean]
  
  inline def observe[Type](): typings.cfcsCore.declarationReactiveObserverMod.Observer[Type] = ^.asInstanceOf[js.Dynamic].applyDynamic("observe")().asInstanceOf[typings.cfcsCore.declarationReactiveObserverMod.Observer[Type]]
  inline def observe[Type](defaultValue: Type): typings.cfcsCore.declarationReactiveObserverMod.Observer[Type] = ^.asInstanceOf[js.Dynamic].applyDynamic("observe")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[typings.cfcsCore.declarationReactiveObserverMod.Observer[Type]]
  
  inline def reactive[Object /* <: Record[String, Any] */](setup: Object): ReactiveObject[Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("reactive")(setup.asInstanceOf[js.Any]).asInstanceOf[ReactiveObject[Object]]
  inline def reactive[Object /* <: Record[String, Any] */](setup: js.Function0[Object]): ReactiveObject[Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("reactive")(setup.asInstanceOf[js.Any]).asInstanceOf[ReactiveObject[Object]]
  
  inline def setObserver(
    instance: Any,
    name: String,
    observer: typings.cfcsCore.declarationReactiveObserverMod.Observer[Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setObserver")(instance.asInstanceOf[js.Any], name.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def withReactiveMethods[Instance, Names /* <: /* keyof std.Partial<Instance> */ String */, Return /* <: ReactiveMethods[Instance, Names] */](ref: Ref[Instance]): Return = ^.asInstanceOf[js.Dynamic].applyDynamic("withReactiveMethods")(ref.asInstanceOf[js.Any]).asInstanceOf[Return]
  inline def withReactiveMethods[Instance, Names /* <: /* keyof std.Partial<Instance> */ String */, Return /* <: ReactiveMethods[Instance, Names] */](ref: Ref[Instance], methods: js.Array[Names]): Return = (^.asInstanceOf[js.Dynamic].applyDynamic("withReactiveMethods")(ref.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[Return]
}
