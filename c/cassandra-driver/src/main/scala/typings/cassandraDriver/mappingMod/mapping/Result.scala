package typings.cassandraDriver.mappingMod.mapping

import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result[T]
  extends Iterator[T, js.Any, js.UndefOr[scala.Nothing]] {
  
  def first(): T | Null = js.native
  
  def forEach(callback: js.Function2[/* currentValue */ T, /* index */ Double, Unit]): Unit = js.native
  def forEach(callback: js.Function2[/* currentValue */ T, /* index */ Double, Unit], thisArg: js.Any): Unit = js.native
  
  def toArray(): js.Array[T] = js.native
  
  def wasApplied(): Boolean = js.native
}
