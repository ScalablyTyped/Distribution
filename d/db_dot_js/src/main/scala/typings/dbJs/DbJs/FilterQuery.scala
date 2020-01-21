package typings.dbJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterQuery[T]
  extends KeyableQuery[T]
     with ExecutableQuery[T]
     with FilterableQuery[T]
     with DescableQuery[T]
     with DistinctableQuery[T]
     with ModifiableQuery[T]
     with LimitableQuery[T]
     with MappableQuery[T]

