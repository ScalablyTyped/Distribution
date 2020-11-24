package typings.dbJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexQuery[T]
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
  
  def all(): Query[T] = js.native
  
  def bound(lowerBound: js.Any, upperBound: js.Any): Query[T] = js.native
  
  def lowerBound(lowerBound: js.Any): Query[T] = js.native
  
  def only(args: js.Any*): Query[T] = js.native
  
  def range(opts: js.Any): Query[T] = js.native
  
  def upperBound(upperBound: js.Any): Query[T] = js.native
}
