package typings.cronValidate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResultMod {
  
  @JSImport("cron-validate/lib/result", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cron-validate/lib/result", "Err")
  @js.native
  open class Err_[T, E] protected ()
    extends StObject
       with Result[T, E] {
    def this(error: E) = this()
    
    val error: E = js.native
    
    def getError(): E = js.native
    
    def getValue(): T = js.native
    
    def isError(): /* is cron-validate.cron-validate/lib/result.Err<T, E> */ Boolean = js.native
    
    def isValid(): /* is cron-validate.cron-validate/lib/result.Valid<T, E> */ Boolean = js.native
    
    def map[A](func: js.Function1[/* t */ T, A]): Result[A, E] = js.native
    
    def mapErr[U](func: js.Function1[/* e */ E, U]): Result[T, U] = js.native
  }
  
  @JSImport("cron-validate/lib/result", "Valid")
  @js.native
  open class Valid_[T, E] protected ()
    extends StObject
       with Result[T, E] {
    def this(value: T) = this()
    
    def getError(): E = js.native
    
    def getValue(): T = js.native
    
    def isError(): /* is cron-validate.cron-validate/lib/result.Err<T, E> */ Boolean = js.native
    
    def isValid(): /* is cron-validate.cron-validate/lib/result.Valid<T, E> */ Boolean = js.native
    
    def map[A](func: js.Function1[/* t */ T, A]): Result[A, E] = js.native
    
    def mapErr[U](func: js.Function1[/* e */ E, U]): Result[T, U] = js.native
    
    val value: T = js.native
  }
  
  inline def err[T, E](error: E): Err_[T, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("err")(error.asInstanceOf[js.Any]).asInstanceOf[Err_[T, E]]
  
  inline def valid[T, E](value: T): Valid_[T, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("valid")(value.asInstanceOf[js.Any]).asInstanceOf[Valid_[T, E]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.cronValidate.libResultMod.Valid_[T, E]
    - typings.cronValidate.libResultMod.Err_[T, E]
  */
  trait Result[T, E] extends StObject
}
