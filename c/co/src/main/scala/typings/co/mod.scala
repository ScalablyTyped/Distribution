package typings.co

import org.scalablytyped.runtime.Shortcut
import typings.std.Iterator
import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("co", JSImport.Namespace)
  @js.native
  val ^ : Co = js.native
  
  @js.native
  trait Co extends StObject {
    
    def apply[F /* <: js.Function1[/* repeated */ js.Any, Iterator[_, _, js.UndefOr[scala.Nothing]]] */](
      fn: F,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<F> is not an array type */ args: Parameters[F]
    ): js.Promise[ExtractType[ReturnType[F]]] = js.native
    
    def default[F /* <: js.Function1[/* repeated */ js.Any, Iterator[_, _, js.UndefOr[scala.Nothing]]] */](
      fn: F,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<F> is not an array type */ args: Parameters[F]
    ): js.Promise[ExtractType[ReturnType[F]]] = js.native
    
    def co[F /* <: js.Function1[/* repeated */ js.Any, Iterator[_, _, js.UndefOr[scala.Nothing]]] */](
      fn: F,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<F> is not an array type */ args: Parameters[F]
    ): js.Promise[ExtractType[ReturnType[F]]] = js.native
    @JSName("co")
    var co_Original: Co = js.native
    
    @JSName("default")
    var default_Original: Co = js.native
    
    def wrap[F /* <: js.Function1[/* repeated */ js.Any, Iterator[_, _, js.UndefOr[scala.Nothing]]] */](fn: F): js.Function1[/* args */ Parameters[F], js.Promise[ExtractType[ReturnType[F]]]] = js.native
  }
  
  type ExtractType[T] = js.Any
  
  type _To = Co
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Co = ^
}
