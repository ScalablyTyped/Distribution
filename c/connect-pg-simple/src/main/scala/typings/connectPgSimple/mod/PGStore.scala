package typings.connectPgSimple.mod

import typings.expressSession.mod.Store
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-pg-simple", "PGStore")
@js.native
class PGStore () extends Store {
  def this(options: PGStoreOptions) = this()
  def close(): Unit = js.native
  def pruneSessions(): Unit = js.native
  def pruneSessions(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

