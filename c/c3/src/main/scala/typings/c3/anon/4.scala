package typings.c3.anon

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `4` extends js.Object {
  var max: js.UndefOr[
    Double | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in c3.c3.AxisName ]:? number}
    */ typings.c3.c3Strings.`4` with TopLevel[js.Any])
  ] = js.native
  var min: js.UndefOr[
    Double | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in c3.c3.AxisName ]:? number}
    */ typings.c3.c3Strings.`4` with TopLevel[js.Any])
  ] = js.native
}

object `4` {
  @scala.inline
  def apply(): `4` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`4`]
  }
  @scala.inline
  implicit class `4Ops`[Self <: `4`] (val x: Self) extends AnyVal {
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
    def setMax(
      value: Double | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in c3.c3.AxisName ]:? number}
      */ typings.c3.c3Strings.`4` with TopLevel[js.Any])
    ): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(
      value: Double | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in c3.c3.AxisName ]:? number}
      */ typings.c3.c3Strings.`4` with TopLevel[js.Any])
    ): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
  
}

