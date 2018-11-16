package typings
package confitLib.confitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigFactory extends js.Object {
  def addDefault(filepathOrSettingsObj: java.lang.String): this.type = js.native
  def addDefault(filepathOrSettingsObj: js.Object): this.type = js.native
  def addOverride(filepathOrSettingsObj: java.lang.String): this.type = js.native
  def addOverride(filepathOrSettingsObj: js.Object): this.type = js.native
  def create(callback: js.Function2[/* err */ js.Any, /* config */ ConfigStore, _]): scala.Unit = js.native
}

