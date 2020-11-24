package typings.connectPgSimple.mod

import typings.expressSession.mod.SessionData
import typings.expressSession.mod.Store
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("connect-pg-simple", "PGStore")
@js.native
class PGStore () extends Store {
  def this(options: PGStoreOptions) = this()
  
  def close(): Unit = js.native
  
  def pruneSessions(): Unit = js.native
  def pruneSessions(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSName("touch")
  def touch_MPGStore(sid: String, session: SessionData): Unit = js.native
  @JSName("touch")
  def touch_MPGStore(sid: String, session: SessionData, callback: js.Function0[Unit]): Unit = js.native
}
