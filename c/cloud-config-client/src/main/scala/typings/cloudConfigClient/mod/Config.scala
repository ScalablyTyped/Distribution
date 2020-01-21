package typings.cloudConfigClient.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cloud-config-client", "Config")
@js.native
abstract class Config protected () extends js.Object {
  def this(data: ConfigData, context: StringDictionary[js.Any]) = this()
  def forEach(callback: js.Function2[/* property */ String, /* value */ String, Unit]): Unit = js.native
  def forEach(
    callback: js.Function2[/* property */ String, /* value */ String, Unit],
    includeOverridden: Boolean
  ): Unit = js.native
  def get(keyParts: String): js.Any = js.native
  def properties(): StringDictionary[js.Any] = js.native
  def raw(): StringDictionary[js.Any] = js.native
  def toObject(): StringDictionary[js.Any] = js.native
  def toString(spaces: Double): String = js.native
}

