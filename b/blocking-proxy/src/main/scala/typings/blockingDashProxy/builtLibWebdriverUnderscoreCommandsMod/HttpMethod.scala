package typings.blockingDashProxy.builtLibWebdriverUnderscoreCommandsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.blockingDashProxy.blockingDashProxyStrings.GET
  - typings.blockingDashProxy.blockingDashProxyStrings.POST
  - typings.blockingDashProxy.blockingDashProxyStrings.DELETE
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def DELETE: typings.blockingDashProxy.blockingDashProxyStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.blockingDashProxy.blockingDashProxyStrings.GET = this.cast("GET")
  @scala.inline
  def POST: typings.blockingDashProxy.blockingDashProxyStrings.POST = this.cast("POST")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

