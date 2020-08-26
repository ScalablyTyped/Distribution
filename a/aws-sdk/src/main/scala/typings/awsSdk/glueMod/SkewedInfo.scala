package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkewedInfo extends js.Object {
  /**
    * A list of names of columns that contain skewed values.
    */
  var SkewedColumnNames: js.UndefOr[NameStringList] = js.native
  /**
    * A mapping of skewed values to the columns that contain them.
    */
  var SkewedColumnValueLocationMaps: js.UndefOr[LocationMap] = js.native
  /**
    * A list of values that appear so frequently as to be considered skewed.
    */
  var SkewedColumnValues: js.UndefOr[ColumnValueStringList] = js.native
}

object SkewedInfo {
  @scala.inline
  def apply(): SkewedInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkewedInfo]
  }
  @scala.inline
  implicit class SkewedInfoOps[Self <: SkewedInfo] (val x: Self) extends AnyVal {
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
    def setSkewedColumnNamesVarargs(value: NameString*): Self = this.set("SkewedColumnNames", js.Array(value :_*))
    @scala.inline
    def setSkewedColumnNames(value: NameStringList): Self = this.set("SkewedColumnNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkewedColumnNames: Self = this.set("SkewedColumnNames", js.undefined)
    @scala.inline
    def setSkewedColumnValueLocationMaps(value: LocationMap): Self = this.set("SkewedColumnValueLocationMaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkewedColumnValueLocationMaps: Self = this.set("SkewedColumnValueLocationMaps", js.undefined)
    @scala.inline
    def setSkewedColumnValuesVarargs(value: ColumnValuesString*): Self = this.set("SkewedColumnValues", js.Array(value :_*))
    @scala.inline
    def setSkewedColumnValues(value: ColumnValueStringList): Self = this.set("SkewedColumnValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkewedColumnValues: Self = this.set("SkewedColumnValues", js.undefined)
  }
  
}

