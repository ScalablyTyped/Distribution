package typings.ccap.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Captcha extends js.Object {
  def get(): js.Tuple2[String, Buffer]
}

object Captcha {
  @scala.inline
  def apply(get: () => js.Tuple2[String, Buffer]): Captcha = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get))
    __obj.asInstanceOf[Captcha]
  }
}

