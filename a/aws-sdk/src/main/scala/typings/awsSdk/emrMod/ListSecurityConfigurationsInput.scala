package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSecurityConfigurationsInput extends js.Object {
  /**
    * The pagination token that indicates the set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.emrMod.Marker] = js.native
}

object ListSecurityConfigurationsInput {
  @scala.inline
  def apply(): ListSecurityConfigurationsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecurityConfigurationsInput]
  }
  @scala.inline
  implicit class ListSecurityConfigurationsInputOps[Self <: ListSecurityConfigurationsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
  
}

