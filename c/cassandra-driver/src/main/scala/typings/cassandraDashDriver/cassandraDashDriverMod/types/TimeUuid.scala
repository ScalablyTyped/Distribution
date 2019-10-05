package typings.cassandraDashDriver.cassandraDashDriverMod.types

import org.scalablytyped.runtime.TopLevel
import typings.cassandraDashDriver.Anon_Clockseq
import typings.cassandraDashDriver.Anon_Date
import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeUuid extends Uuid {
  def getDate(): Date
  def getDatePrecision(): Anon_Date
  def getNodeId(): Buffer
  def getNodeIdString(): String
}

@JSImport("cassandra-driver", "types.TimeUuid")
@js.native
object TimeUuid extends TopLevel[TimeUuidStatic]

@JSImport("cassandra-driver", "types.timeuuid")
@js.native
object timeuuid extends js.Object {
  def apply(): String = js.native
  def apply(options: Anon_Clockseq): String = js.native
  def apply(options: Anon_Clockseq, buffer: Buffer): String = js.native
  def apply(options: Anon_Clockseq, buffer: Buffer, offset: Double): String = js.native
}

