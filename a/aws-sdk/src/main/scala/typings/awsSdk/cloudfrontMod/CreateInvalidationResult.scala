package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInvalidationResult extends js.Object {
  /**
    * The invalidation's information.
    */
  var Invalidation: js.UndefOr[typings.awsSdk.cloudfrontMod.Invalidation] = js.native
  /**
    * The fully qualified URI of the distribution and invalidation batch request, including the Invalidation ID.
    */
  var Location: js.UndefOr[String] = js.native
}

object CreateInvalidationResult {
  @scala.inline
  def apply(): CreateInvalidationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInvalidationResult]
  }
  @scala.inline
  implicit class CreateInvalidationResultOps[Self <: CreateInvalidationResult] (val x: Self) extends AnyVal {
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
    def setInvalidation(value: Invalidation): Self = this.set("Invalidation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidation: Self = this.set("Invalidation", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("Location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("Location", js.undefined)
  }
  
}

