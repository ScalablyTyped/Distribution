package typings.blazorJavascriptInterop.DotNet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the .NET instance passed by reference to JavaScript.
  */
@js.native
trait DotNetObject extends js.Object {
  /**
    * Invokes the specified .NET instance public method synchronously. Not all hosting scenarios support
    * synchronous invocation, so if possible use invokeMethodAsync instead.
    *
    * @param methodIdentifier The identifier of the method to invoke. The method must have a [JSInvokable] attribute specifying this identifier.
    * @param args Arguments to pass to the method, each of which must be JSON-serializable.
    * @returns The result of the operation.
    */
  def invokeMethod[T](methodIdentifier: String, args: js.Any*): T = js.native
  /**
    * Invokes the specified .NET instance public method asynchronously.
    *
    * @param methodIdentifier The identifier of the method to invoke. The method must have a [JSInvokable] attribute specifying this identifier.
    * @param args Arguments to pass to the method, each of which must be JSON-serializable.
    * @returns A promise representing the result of the operation.
    */
  def invokeMethodAsync[T](methodIdentifier: String, args: js.Any*): js.Promise[T] = js.native
}

object DotNetObject {
  @scala.inline
  def apply(
    invokeMethod: (String, /* repeated */ js.Any) => js.Any,
    invokeMethodAsync: (String, /* repeated */ js.Any) => js.Promise[js.Any]
  ): DotNetObject = {
    val __obj = js.Dynamic.literal(invokeMethod = js.Any.fromFunction2(invokeMethod), invokeMethodAsync = js.Any.fromFunction2(invokeMethodAsync))
    __obj.asInstanceOf[DotNetObject]
  }
  @scala.inline
  implicit class DotNetObjectOps[Self <: DotNetObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInvokeMethod(value: (String, /* repeated */ js.Any) => js.Any): Self = this.set("invokeMethod", js.Any.fromFunction2(value))
    @scala.inline
    def setInvokeMethodAsync(value: (String, /* repeated */ js.Any) => js.Promise[js.Any]): Self = this.set("invokeMethodAsync", js.Any.fromFunction2(value))
  }
  
}

