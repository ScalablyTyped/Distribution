package typings
package bugsnagDashJsLib.typesClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlugin extends js.Object {
  var configSchema: js.UndefOr[org.scalablytyped.runtime.StringDictionary[IConfigSchemaEntry]] = js.undefined
  var destroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  def init(client: Client): js.Any
}

