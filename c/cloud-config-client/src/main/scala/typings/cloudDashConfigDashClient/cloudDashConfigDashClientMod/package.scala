package typings.cloudDashConfigDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cloudDashConfigDashClientMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Error

  type ConfigSource = StringDictionary[js.Any]
  type LoadCallback = js.Function2[/* error */ Error, /* config */ js.UndefOr[Config], Unit]
}
