package typings.dbJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeysQuery[T]
  extends DescableQuery[T]
     with ExecutableQuery[T]
     with FilterableQuery[T]
     with DistinctableQuery[T]
     with MappableQuery[T]

