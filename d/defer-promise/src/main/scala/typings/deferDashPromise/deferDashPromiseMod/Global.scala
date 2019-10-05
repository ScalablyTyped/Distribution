package typings.deferDashPromise.deferDashPromiseMod

import typings.deferDashPromise.deferDashPromiseMod.Global.DeferPromise.Deferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object Global extends js.Object {
  @js.native
  object DeferPromise extends js.Object {
    @js.native
    trait Deferred[T] extends js.Object {
      var promise: js.Promise[T] = js.native
      def reject(): Unit = js.native
      def reject(reason: js.Any): Unit = js.native
      def resolve(`this`: Deferred[Unit]): Unit = js.native
      def resolve(value: T): Unit = js.native
      def resolve(value: js.Thenable[T]): Unit = js.native
    }
    
  }
  
}

