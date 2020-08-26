package typings.baretest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baretest", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait TesterSubFunctions extends js.Object {
    def after(fn: SyncOrAsyncVoidFunction): Unit = js.native
    def before(fn: SyncOrAsyncVoidFunction): Unit = js.native
    def only(name: String, fn: SyncOrAsyncVoidFunction): Unit = js.native
    def run(): js.Promise[Boolean] = js.native
    def skip(): Unit = js.native
    def skip(name: js.UndefOr[scala.Nothing], fn: SyncOrAsyncVoidFunction): Unit = js.native
    def skip(name: String): Unit = js.native
    def skip(name: String, fn: SyncOrAsyncVoidFunction): Unit = js.native
  }
  
  def apply(headline: String): TesterFunctionObject = js.native
  type SyncOrAsyncVoidFunction = js.Function0[Unit | js.Promise[Unit]]
  type TesterFunction = js.Function2[/* name */ String, /* fn */ SyncOrAsyncVoidFunction, Unit]
  type TesterFunctionObject = TesterFunction with TesterSubFunctions
}

