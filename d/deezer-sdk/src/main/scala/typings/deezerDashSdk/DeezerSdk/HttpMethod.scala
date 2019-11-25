package typings.deezerDashSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See:\
  * {@link https://developers.deezer.com/sdk/javascript/api | DZ.api}\
  * {@link https://developers.deezer.com/api | API}
  */
/* Rewritten from type alias, can be one of: 
  - typings.deezerDashSdk.deezerDashSdkStrings.GET
  - typings.deezerDashSdk.deezerDashSdkStrings.POST
  - typings.deezerDashSdk.deezerDashSdkStrings.DELETE
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def DELETE: typings.deezerDashSdk.deezerDashSdkStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.deezerDashSdk.deezerDashSdkStrings.GET = this.cast("GET")
  @scala.inline
  def POST: typings.deezerDashSdk.deezerDashSdkStrings.POST = this.cast("POST")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

