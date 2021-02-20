package typings.builderUtil

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promiseMod {
  
  @JSImport("builder-util/out/promise", "NestedError")
  @js.native
  class NestedError protected () extends Error {
    def this(errors: js.Array[Error]) = this()
    def this(errors: js.Array[Error], message: String) = this()
  }
  
  @JSImport("builder-util/out/promise", "executeFinally")
  @js.native
  def executeFinally[T](promise: js.Promise[T], task: js.Function1[/* isErrorOccurred */ Boolean, js.Promise[_]]): js.Promise[T] = js.native
  
  @JSImport("builder-util/out/promise", "orIfFileNotExist")
  @js.native
  def orIfFileNotExist[T](promise: js.Promise[T], fallbackValue: T): js.Promise[T] = js.native
  
  @JSImport("builder-util/out/promise", "orNullIfFileNotExist")
  @js.native
  def orNullIfFileNotExist[T](promise: js.Promise[T]): js.Promise[T | Null] = js.native
  
  @JSImport("builder-util/out/promise", "printErrorAndExit")
  @js.native
  def printErrorAndExit(error: Error): Unit = js.native
}
