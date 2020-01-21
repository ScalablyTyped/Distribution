package typings.blockingProxy.webdriverCommandsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.blockingProxy.blockingProxyStrings.GET
  - typings.blockingProxy.blockingProxyStrings.POST
  - typings.blockingProxy.blockingProxyStrings.DELETE
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def DELETE: typings.blockingProxy.blockingProxyStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.blockingProxy.blockingProxyStrings.GET = this.cast("GET")
  @scala.inline
  def POST: typings.blockingProxy.blockingProxyStrings.POST = this.cast("POST")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

