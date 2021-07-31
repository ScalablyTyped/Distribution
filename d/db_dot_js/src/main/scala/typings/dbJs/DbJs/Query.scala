package typings.dbJs.DbJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query[T]
  extends js.Promise[T]
     with KeyableQuery[T]
     with ExecutableQuery[T]
     with FilterableQuery[T]
     with DescableQuery[T]
     with DistinctableQuery[T]
     with ModifiableQuery[T]
     with LimitableQuery[T]
     with MappableQuery[T]
     with CountableQuery[T] {
  
  /* InferMemberOverrides */
  override def `then`[B](
    onFulfilled: js.Function1[T, B | js.Thenable[B]],
    onRejected: js.UndefOr[js.Function1[Any, B | js.Thenable[B]]]
  ): js.Thenable[B] & js.Promise[B] = js.native
  /* InferMemberOverrides */
  override def `then`[B](onFulfilled: Unit, onRejected: js.UndefOr[js.Function1[Any, B | js.Thenable[B]]]): js.Thenable[B] & js.Promise[B] = js.native
}
