package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegistrySummary extends js.Object {
  /**
    * The ARN of the registry.
    */
  var RegistryArn: js.UndefOr[string] = js.native
  /**
    * The name of the registry.
    */
  var RegistryName: js.UndefOr[string] = js.native
  /**
    * Tags associated with the registry.
    */
  var Tags: js.UndefOr[typings.awsSdk.schemasMod.Tags] = js.native
}

object RegistrySummary {
  @scala.inline
  def apply(): RegistrySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistrySummary]
  }
  @scala.inline
  implicit class RegistrySummaryOps[Self <: RegistrySummary] (val x: Self) extends AnyVal {
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
    def setRegistryArn(value: string): Self = this.set("RegistryArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistryArn: Self = this.set("RegistryArn", js.undefined)
    @scala.inline
    def setRegistryName(value: string): Self = this.set("RegistryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistryName: Self = this.set("RegistryName", js.undefined)
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

