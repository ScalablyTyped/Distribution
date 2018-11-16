package typings
package cassandraDashDriverLib.cassandraDashDriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Host
  extends nodeLib.eventsMod.EventEmitter {
  var address: java.lang.String = js.native
  var cassandraVersion: java.lang.String = js.native
  var dataCenter: java.lang.String = js.native
  var rack: java.lang.String = js.native
  var tokens: js.Array[java.lang.String] = js.native
  def canBeConsideredAsUp(): scala.Boolean = js.native
  def getCassandraVersion(): js.Array[scala.Double] = js.native
  def isUp(): scala.Boolean = js.native
}

