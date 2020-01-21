package typings.camundaExternalTaskClientJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicSubscription extends js.Object {
  def unsubscribe(): Unit
}

object TopicSubscription {
  @scala.inline
  def apply(unsubscribe: () => Unit): TopicSubscription = {
    val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
  
    __obj.asInstanceOf[TopicSubscription]
  }
}

