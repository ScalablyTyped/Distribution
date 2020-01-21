package typings.blockingProxy.webdriverCommandsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.blockingProxy.blockingProxyStrings.sessionId
  - typings.blockingProxy.blockingProxyStrings.elementId
  - typings.blockingProxy.blockingProxyStrings.name
  - typings.blockingProxy.blockingProxyStrings.propertyName
*/
trait paramKey extends js.Object

object paramKey {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def elementId: typings.blockingProxy.blockingProxyStrings.elementId = this.cast("elementId")
  @scala.inline
  def name: typings.blockingProxy.blockingProxyStrings.name = this.cast("name")
  @scala.inline
  def propertyName: typings.blockingProxy.blockingProxyStrings.propertyName = this.cast("propertyName")
  @scala.inline
  def sessionId: typings.blockingProxy.blockingProxyStrings.sessionId = this.cast("sessionId")
}

