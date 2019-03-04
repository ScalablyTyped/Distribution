package typings
package configLib.configMod.cNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfig extends js.Object {
  var util: IUtil
  def get[T](setting: java.lang.String): T
  def has(setting: java.lang.String): scala.Boolean
}

object IConfig {
  @scala.inline
  def apply(
    get: js.Function1[java.lang.String, js.Any],
    has: js.Function1[java.lang.String, scala.Boolean],
    util: IUtil
  ): IConfig = {
    val __obj = js.Dynamic.literal(get = get, has = has, util = util)
  
    __obj.asInstanceOf[IConfig]
  }
}

