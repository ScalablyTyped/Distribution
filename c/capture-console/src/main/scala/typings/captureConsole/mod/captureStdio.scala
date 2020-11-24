package typings.captureConsole.mod

import typings.captureConsole.anon.Stderr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("capture-console", "captureStdio")
@js.native
object captureStdio extends js.Object {
  
  def apply(exec: js.Function0[Unit]): Stderr = js.native
  def apply(opts: CaptureOptions, exec: js.Function0[Unit]): Stderr = js.native
}
