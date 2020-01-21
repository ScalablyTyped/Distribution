package typings.config.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfig extends js.Object {
  var util: IUtil
  def get[T](setting: String): T
  def has(setting: String): Boolean
}

object IConfig {
  @scala.inline
  def apply(get: String => js.Any, has: String => Boolean, util: IUtil): IConfig = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), util = util.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IConfig]
  }
}

