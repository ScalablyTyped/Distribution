package typings.crossFetch.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import typings.crossFetch.anon.Error
import typings.std.BodyInit
import typings.std.ResponseInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("_Response")
@js.native
class Response ()
  extends typings.std.Response {
  def this(body: BodyInit) = this()
  def this(body: js.UndefOr[BodyInit], init: ResponseInit) = this()
  def this(body: Null, init: ResponseInit) = this()
}
@JSGlobal("_Response")
@js.native
object Response
  extends TopLevel[Error with Instantiable0[typings.std.global.Response]]
