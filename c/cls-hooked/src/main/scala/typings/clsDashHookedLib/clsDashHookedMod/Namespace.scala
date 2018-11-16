package typings
package clsDashHookedLib.clsDashHookedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Namespace extends js.Object {
  var active: js.Any = js.native
  def bind[F /* <: js.Function */](fn: F): F = js.native
  def bind[F /* <: js.Function */](fn: F, context: js.Any): F = js.native
   // tslint:disable-line: ban-types
  def bindEmitter(emitter: nodeLib.eventsMod.EventEmitter): scala.Unit = js.native
  def createContext(): js.Any = js.native
  def get(key: java.lang.String): js.Any = js.native
  def run(fn: js.Function1[/* repeated */js.Any, scala.Unit]): scala.Unit = js.native
  def runAndReturn[T](fn: js.Function1[/* repeated */js.Any, T]): T = js.native
  def runPromise[T](fn: js.Function1[/* repeated */js.Any, stdLib.Promise[T]]): stdLib.Promise[T] = js.native
  def set[T](key: java.lang.String, value: T): T = js.native
}

