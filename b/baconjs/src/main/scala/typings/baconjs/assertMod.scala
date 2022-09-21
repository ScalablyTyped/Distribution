package typings.baconjs

import typings.std.IArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assertMod {
  
  @JSImport("baconjs/types/internal/assert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assert(message: String, condition: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(message.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def assertArray(xs: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertArray")(xs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def assertEventStream(event: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertEventStream")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def assertFunction(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFunction")().asInstanceOf[Unit]
  inline def assertFunction(f: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFunction")(f.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def assertNoArguments(args: IArguments): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNoArguments")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def assertObservable(observable: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertObservable")(observable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def assertObservableIsProperty(x: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertObservableIsProperty")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
