package typings.axiosDashCurlirize

import typings.axios.axiosMod.AxiosStatic
import typings.axiosDashCurlirize.axiosDashCurlirizeMod.Callback
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("axios-curlirize", JSImport.Namespace)
@js.native
object axiosDashCurlirizeMod extends js.Object {
  def apply(instance: AxiosStatic): Unit = js.native
  def apply(instance: AxiosStatic, callback: Callback): Unit = js.native
  type Callback = js.Function2[/* error */ Error, /* result */ js.UndefOr[Double], Unit]
}

