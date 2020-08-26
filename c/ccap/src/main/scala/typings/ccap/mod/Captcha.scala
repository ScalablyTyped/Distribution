package typings.ccap.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Captcha extends js.Object {
  def get(): js.Tuple2[String, Buffer] = js.native
}

object Captcha {
  @scala.inline
  def apply(get: () => js.Tuple2[String, Buffer]): Captcha = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get))
    __obj.asInstanceOf[Captcha]
  }
  @scala.inline
  implicit class CaptchaOps[Self <: Captcha] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: () => js.Tuple2[String, Buffer]): Self = this.set("get", js.Any.fromFunction0(value))
  }
  
}

