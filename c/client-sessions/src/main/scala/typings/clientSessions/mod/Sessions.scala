package typings.clientSessions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sessions extends js.Object {
  
  def apply(options: SessionOptions): RequestHandler = js.native
  
  var util: Util = js.native
}
