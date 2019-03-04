package typings
package ccapLib.ccapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Captcha extends js.Object {
  def get(): js.Tuple2[java.lang.String, nodeLib.Buffer]
}

object Captcha {
  @scala.inline
  def apply(get: js.Function0[js.Tuple2[java.lang.String, nodeLib.Buffer]]): Captcha = {
    val __obj = js.Dynamic.literal(get = get)
  
    __obj.asInstanceOf[Captcha]
  }
}

