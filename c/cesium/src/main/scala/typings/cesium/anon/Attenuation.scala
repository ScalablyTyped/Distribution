package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attenuation extends js.Object {
  var attenuation: js.UndefOr[Boolean] = js.native
  var backFaceCulling: js.UndefOr[Boolean] = js.native
  var baseResolution: js.UndefOr[Double] = js.native
  var eyeDomeLighting: js.UndefOr[Boolean] = js.native
  var eyeDomeLightingRadius: js.UndefOr[Double] = js.native
  var eyeDomeLightingStrength: js.UndefOr[Double] = js.native
  var geometricErrorScale: js.UndefOr[Double] = js.native
  var maximumAttenuation: js.UndefOr[Double] = js.native
  var normalShading: js.UndefOr[Boolean] = js.native
}

object Attenuation {
  @scala.inline
  def apply(): Attenuation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attenuation]
  }
  @scala.inline
  implicit class AttenuationOps[Self <: Attenuation] (val x: Self) extends AnyVal {
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
    def setAttenuation(value: Boolean): Self = this.set("attenuation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttenuation: Self = this.set("attenuation", js.undefined)
    @scala.inline
    def setBackFaceCulling(value: Boolean): Self = this.set("backFaceCulling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackFaceCulling: Self = this.set("backFaceCulling", js.undefined)
    @scala.inline
    def setBaseResolution(value: Double): Self = this.set("baseResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseResolution: Self = this.set("baseResolution", js.undefined)
    @scala.inline
    def setEyeDomeLighting(value: Boolean): Self = this.set("eyeDomeLighting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEyeDomeLighting: Self = this.set("eyeDomeLighting", js.undefined)
    @scala.inline
    def setEyeDomeLightingRadius(value: Double): Self = this.set("eyeDomeLightingRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEyeDomeLightingRadius: Self = this.set("eyeDomeLightingRadius", js.undefined)
    @scala.inline
    def setEyeDomeLightingStrength(value: Double): Self = this.set("eyeDomeLightingStrength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEyeDomeLightingStrength: Self = this.set("eyeDomeLightingStrength", js.undefined)
    @scala.inline
    def setGeometricErrorScale(value: Double): Self = this.set("geometricErrorScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometricErrorScale: Self = this.set("geometricErrorScale", js.undefined)
    @scala.inline
    def setMaximumAttenuation(value: Double): Self = this.set("maximumAttenuation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumAttenuation: Self = this.set("maximumAttenuation", js.undefined)
    @scala.inline
    def setNormalShading(value: Boolean): Self = this.set("normalShading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalShading: Self = this.set("normalShading", js.undefined)
  }
  
}

