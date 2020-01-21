package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationActionOption extends js.Object {
  var transformOrigin: String
  var transition: AnimationTransition
}

object AnimationActionOption {
  @scala.inline
  def apply(transformOrigin: String, transition: AnimationTransition): AnimationActionOption = {
    val __obj = js.Dynamic.literal(transformOrigin = transformOrigin.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnimationActionOption]
  }
}

