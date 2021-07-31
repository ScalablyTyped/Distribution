package typings.azureMobileApps.Azure.MobileApps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Thenable[R] extends StObject {
  
  def `catch`[U](): Thenable[U] = js.native
  def `catch`[U](onRejected: js.Function1[/* error */ js.Any, Thenable[U] | U | Unit]): Thenable[U] = js.native
  
  def `then`[U](): Thenable[U] = js.native
  def `then`[U](onFulfilled: js.Function1[/* value */ R, U | Thenable[U]]): Thenable[U] = js.native
  def `then`[U](
    onFulfilled: js.Function1[/* value */ R, Thenable[U] | U],
    onRejected: js.Function1[/* error */ js.Any, Thenable[U] | U | Unit]
  ): Thenable[U] = js.native
  def `then`[U](onFulfilled: Unit, onRejected: js.Function1[/* error */ js.Any, Thenable[U] | U | Unit]): Thenable[U] = js.native
}
