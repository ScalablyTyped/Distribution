package typings
package connectDashPgDashSimpleLib.connectDashPgDashSimpleMod.connectPgSimpleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PGStore
  extends expressDashSessionLib.expressDashSessionMod.Store {
  def close(): scala.Unit = js.native
  def pruneSessions(): scala.Unit = js.native
  def pruneSessions(callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
}

