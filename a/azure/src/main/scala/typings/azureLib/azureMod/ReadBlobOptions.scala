package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadBlobOptions extends GetBlobPropertiesOptions {
  var disableContentMD5Validation: js.UndefOr[scala.Boolean] = js.undefined
  var rangeEnd: js.UndefOr[java.lang.String] = js.undefined
  var rangeStart: js.UndefOr[java.lang.String] = js.undefined
  var useTransactionalMD5: js.UndefOr[scala.Boolean] = js.undefined
}

