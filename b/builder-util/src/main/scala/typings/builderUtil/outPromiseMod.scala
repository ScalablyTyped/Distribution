package typings.builderUtil

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outPromiseMod {
  
  @JSImport("builder-util/out/promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("builder-util/out/promise", "NestedError")
  @js.native
  open class NestedError protected ()
    extends StObject
       with Error {
    def this(errors: js.Array[js.Error]) = this()
    def this(errors: js.Array[js.Error], message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def executeFinally[T](promise: js.Promise[T], task: js.Function1[/* isErrorOccurred */ Boolean, js.Promise[Any]]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeFinally")(promise.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def orIfFileNotExist[T](promise: js.Promise[T], fallbackValue: T): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("orIfFileNotExist")(promise.asInstanceOf[js.Any], fallbackValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def orNullIfFileNotExist[T](promise: js.Promise[T]): js.Promise[T | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("orNullIfFileNotExist")(promise.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T | Null]]
  
  inline def printErrorAndExit(error: js.Error): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printErrorAndExit")(error.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
