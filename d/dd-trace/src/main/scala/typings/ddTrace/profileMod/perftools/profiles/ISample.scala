package typings.ddTrace.profileMod.perftools.profiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Sample. */
@js.native
trait ISample extends js.Object {
  /** Sample label */
  var label: js.UndefOr[js.Array[ILabel] | Null] = js.native
  /** Sample locationId */
  var locationId: js.UndefOr[
    (js.Array[
      Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ _)
    ]) | Null
  ] = js.native
  /** Sample value */
  var value: js.UndefOr[
    (js.Array[
      Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ _)
    ]) | Null
  ] = js.native
}

object ISample {
  @scala.inline
  def apply(): ISample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISample]
  }
  @scala.inline
  implicit class ISampleOps[Self <: ISample] (val x: Self) extends AnyVal {
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
    def setLabelVarargs(value: ILabel*): Self = this.set("label", js.Array(value :_*))
    @scala.inline
    def setLabel(value: js.Array[ILabel]): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelNull: Self = this.set("label", null)
    @scala.inline
    def setLocationIdVarargs(value: (Double | js.Any)*): Self = this.set("locationId", js.Array(value :_*))
    @scala.inline
    def setLocationId(
      value: js.Array[
          Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ _)
        ]
    ): Self = this.set("locationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationId: Self = this.set("locationId", js.undefined)
    @scala.inline
    def setLocationIdNull: Self = this.set("locationId", null)
    @scala.inline
    def setValueVarargs(value: (Double | js.Any)*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(
      value: js.Array[
          Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ _)
        ]
    ): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

