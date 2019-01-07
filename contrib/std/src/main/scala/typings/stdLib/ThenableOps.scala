package typings.stdLib

import scala.language.higherKinds
import scala.scalajs.js
import scala.scalajs.js.Thenable

object ThenableOps {
  /** A lot could be said about this.
    * I say that it has less maddening type inference than `Thenable.then`
    */
  @inline implicit final class ThenableOps[M[t] <: Thenable[t], T](val mt: M[T]) extends AnyVal {
    @inline def flatMap[U](f: js.Function1[T, Thenable[U]]): M[U] =
      mt.asInstanceOf[js.Dynamic].`then`(f).asInstanceOf[M[U]]

    @inline def map[U](f: js.Function1[T, U]): M[U] =
      mt.asInstanceOf[js.Dynamic].`then`(f).asInstanceOf[M[U]]

    @inline def foreach(f: js.Function1[T, Unit]): Unit =
      mt.asInstanceOf[js.Dynamic].`then`(f)

    @inline def assertType[U]: M[U] = mt.asInstanceOf[M[U]]
  }
}
