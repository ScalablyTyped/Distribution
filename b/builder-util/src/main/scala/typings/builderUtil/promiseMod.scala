package typings.builderUtil

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("builder-util/out/promise", JSImport.Namespace)
@js.native
object promiseMod extends js.Object {
  
  def executeFinally[T](promise: js.Promise[T], task: js.Function1[/* isErrorOccurred */ Boolean, js.Promise[_]]): js.Promise[T] = js.native
  
  def orIfFileNotExist[T](promise: js.Promise[T], fallbackValue: T): js.Promise[T] = js.native
  
  def orNullIfFileNotExist[T](promise: js.Promise[T]): js.Promise[T | Null] = js.native
  
  def printErrorAndExit(error: Error): Unit = js.native
  
  @js.native
  class NestedError protected () extends Error {
    def this(errors: js.Array[Error]) = this()
    def this(errors: js.Array[Error], message: String) = this()
  }
}
