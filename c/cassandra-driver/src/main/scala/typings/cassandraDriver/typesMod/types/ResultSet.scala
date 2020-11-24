package typings.cassandraDriver.typesMod.types

import typings.cassandraDriver.anon.AchievedConsistency
import typings.cassandraDriver.anon.Type
import typings.std.AsyncIterable
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultSet
  extends Iterable[Row]
     with AsyncIterable[Row] {
  
  var columns: js.Array[Type] = js.native
  
  def first(): Row = js.native
  
  var info: AchievedConsistency = js.native
  
  var nextPage: js.Function0[Unit] | Null = js.native
  
  var pageState: String = js.native
  
  var rowLength: Double = js.native
  
  var rows: js.Array[Row] = js.native
  
  def wasApplied(): Boolean = js.native
}
