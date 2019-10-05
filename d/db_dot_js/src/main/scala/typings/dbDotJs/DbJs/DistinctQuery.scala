package typings.dbDotJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistinctQuery[T]
  extends KeyableQuery[T]
     with ExecutableQuery[T]
     with FilterableQuery[T]
     with DescableQuery[T]
     with ModifiableQuery[T]
     with MappableQuery[T]
     with CountableQuery[T]

