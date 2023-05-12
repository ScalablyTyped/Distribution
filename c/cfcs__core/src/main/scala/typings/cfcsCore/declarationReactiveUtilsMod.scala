package typings.cfcsCore

import typings.cfcsCore.declarationCoreTypesMod.Ref
import typings.cfcsCore.declarationReactiveObserverMod.Observer
import typings.cfcsCore.declarationReactiveTypesMod.ReactiveMethods
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationReactiveUtilsMod {
  
  @JSImport("@cfcs/core/declaration/reactive/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defineObservers(instance: Any): Record[String, Observer[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineObservers")(instance.asInstanceOf[js.Any]).asInstanceOf[Record[String, Observer[Any]]]
  
  inline def getObserver(instance: Any, name: String): Observer[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getObserver")(instance.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Observer[Any]]
  inline def getObserver(instance: Any, name: String, defaultValue: Any): Observer[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getObserver")(instance.asInstanceOf[js.Any], name.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Observer[Any]]
  
  inline def getObservers(instance: Any): Record[String, Observer[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getObservers")(instance.asInstanceOf[js.Any]).asInstanceOf[Record[String, Observer[Any]]]
  inline def getObservers(instance: Any, isComputed: Boolean): Record[String, Observer[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getObservers")(instance.asInstanceOf[js.Any], isComputed.asInstanceOf[js.Any])).asInstanceOf[Record[String, Observer[Any]]]
  
  inline def isObserver(`val`: Any): /* is @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObserver")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<any> */ Boolean]
  
  inline def isReactive(`val`: Any): /* is @cfcs/core.@cfcs/core/declaration/reactive/decorators/ReactiveSubscribe.ReactiveSubscribe<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReactive")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is @cfcs/core.@cfcs/core/declaration/reactive/decorators/ReactiveSubscribe.ReactiveSubscribe<any> */ Boolean]
  
  inline def setObserver(instance: Any, name: String, observer: Observer[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setObserver")(instance.asInstanceOf[js.Any], name.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def withReactiveMethods[Instance, Names /* <: /* keyof std.Partial<Instance> */ String */, Return /* <: ReactiveMethods[Instance, Names] */](ref: Ref[Instance]): Return = ^.asInstanceOf[js.Dynamic].applyDynamic("withReactiveMethods")(ref.asInstanceOf[js.Any]).asInstanceOf[Return]
  inline def withReactiveMethods[Instance, Names /* <: /* keyof std.Partial<Instance> */ String */, Return /* <: ReactiveMethods[Instance, Names] */](ref: Ref[Instance], methods: js.Array[Names]): Return = (^.asInstanceOf[js.Dynamic].applyDynamic("withReactiveMethods")(ref.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[Return]
}
