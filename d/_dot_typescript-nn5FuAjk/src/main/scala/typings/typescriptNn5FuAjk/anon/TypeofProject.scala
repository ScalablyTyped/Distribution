package typings.typescriptNn5FuAjk.anon

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ServerHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofProject extends StObject {
  
  /* static member */
  def resolveModule(
    moduleName: String,
    initialDir: String,
    host: ServerHost,
    log: js.Function1[/* message */ String, Unit]
  ): js.UndefOr[js.Object] = js.native
  def resolveModule(
    moduleName: String,
    initialDir: String,
    host: ServerHost,
    log: js.Function1[/* message */ String, Unit],
    logErrors: js.Function1[/* message */ String, Unit]
  ): js.UndefOr[js.Object] = js.native
}
