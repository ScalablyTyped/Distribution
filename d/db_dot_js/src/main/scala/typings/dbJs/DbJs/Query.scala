package typings.dbJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
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
     with CountableQuery[T]
