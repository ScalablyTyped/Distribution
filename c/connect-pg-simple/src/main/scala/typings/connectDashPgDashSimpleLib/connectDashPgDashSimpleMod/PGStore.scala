package typings
package connectDashPgDashSimpleLib.connectDashPgDashSimpleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-pg-simple", "PGStore")
@js.native
class PGStore ()
  extends expressDashSessionLib.expressDashSessionMod.Store {
  def this(options: PGStoreOptions) = this()
  def close(): scala.Unit = js.native
  def pruneSessions(): scala.Unit = js.native
  def pruneSessions(callback: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
}

