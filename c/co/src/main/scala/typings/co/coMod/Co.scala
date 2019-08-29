package typings.co.coMod

import typings.std.Iterator
import typings.std.Parameters
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Co extends js.Object {
  @JSName("co")
  var co_Original: Co = js.native
  @JSName("default")
  var default_Original: Co = js.native
  def apply[F /* <: js.Function1[/* repeated */ js.Any, Iterator[_, _, js.UndefOr[scala.Nothing]]] */](
    fn: F,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<F> is not an array type */ args: Parameters[F]
  ): js.Promise[ExtractType[ReturnType[F]]] = js.native
  def co[F /* <: js.Function1[/* repeated */ js.Any, Iterator[_, _, js.UndefOr[scala.Nothing]]] */](
    fn: F,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<F> is not an array type */ args: Parameters[F]
  ): js.Promise[ExtractType[ReturnType[F]]] = js.native
  def default[F /* <: js.Function1[/* repeated */ js.Any, Iterator[_, _, js.UndefOr[scala.Nothing]]] */](
    fn: F,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<F> is not an array type */ args: Parameters[F]
  ): js.Promise[ExtractType[ReturnType[F]]] = js.native
  def wrap[F /* <: js.Function1[/* repeated */ js.Any, Iterator[_, _, js.UndefOr[scala.Nothing]]] */](fn: F): js.Function1[/* args */ Parameters[F], js.Promise[ExtractType[ReturnType[F]]]] = js.native
}

