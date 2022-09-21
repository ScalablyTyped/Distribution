package typings.axios.mod

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object default extends Shortcut {
  
  @JSImport("axios", JSImport.Default)
  @js.native
  val ^ : AxiosStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("axios", "default.Axios")
  @js.native
  open class AxiosCls () extends Axios {
    def this(config: AxiosRequestConfig[Any]) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("axios", "default.Cancel")
  @js.native
  open class CancelCls ()
    extends StObject
       with Cancel {
    def this(message: String) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("axios", "default.CancelToken")
  @js.native
  open class CancelTokenCls protected ()
    extends StObject
       with CancelToken {
    def this(executor: js.Function1[/* cancel */ Canceler, Unit]) = this()
    
    /* CompleteClass */
    var promise: js.Promise[Cancel] = js.native
    
    /* CompleteClass */
    override def throwIfRequested(): Unit = js.native
  }
  
  type _To = AxiosStatic
  
  /* This means you don't have to write `^`, but can instead just say `default.foo` */
  override def _to: AxiosStatic = ^
}
