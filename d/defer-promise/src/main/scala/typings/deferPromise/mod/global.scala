package typings.deferPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object DeferPromise extends js.Object {
    @js.native
    trait Deferred[T] extends js.Object {
      var promise: js.Promise[T] = js.native
      def reject(): Unit = js.native
      def reject(reason: js.Any): Unit = js.native
      def resolve(): Unit = js.native
      def resolve(value: T): Unit = js.native
      def resolve(value: js.Thenable[T]): Unit = js.native
    }
    
  }
  
}

