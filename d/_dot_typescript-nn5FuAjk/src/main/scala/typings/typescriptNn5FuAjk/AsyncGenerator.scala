package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncGenerator[T, TReturn, TNext]
  extends StObject
     with AsyncIterator[T, TReturn, TNext] {
  
  @JSName("return")
  def return_MAsyncGenerator(value: TReturn): Promise[IteratorResult[T, TReturn]] = js.native
  @JSName("return")
  def return_MAsyncGenerator(value: PromiseLike[TReturn]): Promise[IteratorResult[T, TReturn]] = js.native
  
  @JSName("throw")
  def throw_MAsyncGenerator(e: Any): Promise[IteratorResult[T, TReturn]] = js.native
}
