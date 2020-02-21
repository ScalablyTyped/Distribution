package typings.camundaExternalTaskClientJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.subscribe
  - typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.unsubscribe
*/
trait TopicEvent extends js.Object

object TopicEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def subscribe: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.subscribe = this.cast("subscribe")
  @scala.inline
  def unsubscribe: typings.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.unsubscribe = this.cast("unsubscribe")
}

