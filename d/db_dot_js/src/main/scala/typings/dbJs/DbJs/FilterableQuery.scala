package typings.dbJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterableQuery[T] extends js.Object {
  
  def filter(filter: js.Function1[/* value */ T, Boolean]): FilterQuery[T] = js.native
  def filter[TValue](index: String, value: TValue): FilterQuery[T] = js.native
}
