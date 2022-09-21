package typings.azureCoreHttp

import typings.azureCoreHttp.anon.AbortErrorMsg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object delayMod {
  
  @JSImport("@azure/core-http/types/latest/src/util/delay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def delay[T](delayInMs: Double): js.Promise[T | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delayInMs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T | Unit]]
  inline def delay[T](delayInMs: Double, value: T): js.Promise[T | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delayInMs.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T | Unit]]
  inline def delay[T](delayInMs: Double, value: T, options: AbortErrorMsg): js.Promise[T | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delayInMs.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T | Unit]]
  inline def delay[T](delayInMs: Double, value: Unit, options: AbortErrorMsg): js.Promise[T | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delayInMs.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T | Unit]]
}
