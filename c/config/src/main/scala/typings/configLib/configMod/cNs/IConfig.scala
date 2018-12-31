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

