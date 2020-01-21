package typings.dbJs.DbJs

import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query[T]
  extends Promise[T]
     with KeyableQuery[T]
     with ExecutableQuery[T]
     with FilterableQuery[T]
     with DescableQuery[T]
     with DistinctableQuery[T]
     with ModifiableQuery[T]
     with LimitableQuery[T]
     with MappableQuery[T]
     with CountableQuery[T]

