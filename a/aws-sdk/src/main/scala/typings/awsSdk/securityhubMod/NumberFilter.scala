package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberFilter extends js.Object {
  /**
    * The equal-to condition to be applied to a single field when querying for findings.
    */
  var Eq: js.UndefOr[Double] = js.native
  /**
    * The greater-than-equal condition to be applied to a single field when querying for findings. 
    */
  var Gte: js.UndefOr[Double] = js.native
  /**
    * The less-than-equal condition to be applied to a single field when querying for findings. 
    */
  var Lte: js.UndefOr[Double] = js.native
}

object NumberFilter {
  @scala.inline
  def apply(): NumberFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberFilter]
  }
  @scala.inline
  implicit class NumberFilterOps[Self <: NumberFilter] (val x: Self) extends AnyVal {
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
    def setEq(value: Double): Self = this.set("Eq", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEq: Self = this.set("Eq", js.undefined)
    @scala.inline
    def setGte(value: Double): Self = this.set("Gte", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGte: Self = this.set("Gte", js.undefined)
    @scala.inline
    def setLte(value: Double): Self = this.set("Lte", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLte: Self = this.set("Lte", js.undefined)
  }
  
}

