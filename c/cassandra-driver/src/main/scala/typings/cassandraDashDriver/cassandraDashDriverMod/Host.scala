package typings.cassandraDashDriver.cassandraDashDriverMod

import typings.cassandraDashDriver.libTypesMod.types.Uuid
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Host extends EventEmitter {
  var address: String = js.native
  var cassandraVersion: String = js.native
  var datacenter: String = js.native
  var hostId: Uuid = js.native
  var rack: String = js.native
  var tokens: js.Array[String] = js.native
  def canBeConsideredAsUp(): Boolean = js.native
  def getCassandraVersion(): js.Array[Double] = js.native
  def isUp(): Boolean = js.native
}

