package typings.dc.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextFilterWidget extends BaseMixin[TextFilterWidget] {
  @JSName("filterFunctionFactory")
  var filterFunctionFactory_Original: IGetSet[js.Function, TextFilterWidget] = js.native
  @JSName("normalize")
  var normalize_Original: IGetSet[js.Function, TextFilterWidget] = js.native
  @JSName("placeHolder")
  var placeHolder_Original: IGetSet[js.Function, TextFilterWidget] = js.native
  def filterFunctionFactory(): js.Function = js.native
  def filterFunctionFactory(t: js.Function): TextFilterWidget = js.native
  def normalize(): js.Function = js.native
  def normalize(t: js.Function): TextFilterWidget = js.native
  def placeHolder(): js.Function = js.native
  def placeHolder(t: js.Function): TextFilterWidget = js.native
}

