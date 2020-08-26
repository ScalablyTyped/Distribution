package typings.azureArmResource.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureResult extends js.Object {
  /**
    * The resource ID of the feature.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The name of the feature.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Properties of the previewed feature.
    */
  var properties: js.UndefOr[FeatureProperties] = js.native
  /**
    * The resource type of the feature.
    */
  var `type`: js.UndefOr[String] = js.native
}

object FeatureResult {
  @scala.inline
  def apply(): FeatureResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureResult]
  }
  @scala.inline
  implicit class FeatureResultOps[Self <: FeatureResult] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProperties(value: FeatureProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

