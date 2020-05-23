package typings.babelTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Computed extends js.Object {
  var computed: Boolean | Null
}

object Computed {
  @scala.inline
  def apply(computed: Boolean = null.asInstanceOf[Boolean]): Computed = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Computed]
  }
}

