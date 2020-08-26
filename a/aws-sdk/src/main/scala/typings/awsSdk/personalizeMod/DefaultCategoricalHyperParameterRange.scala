package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultCategoricalHyperParameterRange extends js.Object {
  /**
    * Whether the hyperparameter is tunable.
    */
  var isTunable: js.UndefOr[Tunable] = js.native
  /**
    * The name of the hyperparameter.
    */
  var name: js.UndefOr[ParameterName] = js.native
  /**
    * A list of the categories for the hyperparameter.
    */
  var values: js.UndefOr[CategoricalValues] = js.native
}

object DefaultCategoricalHyperParameterRange {
  @scala.inline
  def apply(): DefaultCategoricalHyperParameterRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultCategoricalHyperParameterRange]
  }
  @scala.inline
  implicit class DefaultCategoricalHyperParameterRangeOps[Self <: DefaultCategoricalHyperParameterRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsTunable(value: Tunable): Self = this.set("isTunable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTunable: Self = this.set("isTunable", js.undefined)
    @scala.inline
    def setName(value: ParameterName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setValuesVarargs(value: CategoricalValue*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: CategoricalValues): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

