package typings.cesium.anon

import typings.cesium.mod.Cartesian2
import typings.cesium.mod.Cartesian3
import typings.cesium.mod.ClippingPlaneCollection
import typings.cesium.mod.ColorBlendMode
import typings.cesium.mod.HeightReference
import typings.cesium.mod.Property
import typings.cesium.mod.PropertyBag
import typings.cesium.mod.ShadowMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Articulations extends js.Object {
  
  var articulations: js.UndefOr[PropertyBag] = js.native
  
  var clampAnimations: js.UndefOr[Property | Boolean] = js.native
  
  var clippingPlanes: js.UndefOr[Property | ClippingPlaneCollection] = js.native
  
  var color: js.UndefOr[Property | typings.cesium.mod.Color] = js.native
  
  var colorBlendAmount: js.UndefOr[Property | Double] = js.native
  
  var colorBlendMode: js.UndefOr[Property | ColorBlendMode] = js.native
  
  var distanceDisplayCondition: js.UndefOr[Property | typings.cesium.mod.DistanceDisplayCondition] = js.native
  
  var heightReference: js.UndefOr[Property | HeightReference] = js.native
  
  var imageBasedLightingFactor: js.UndefOr[Property | Cartesian2] = js.native
  
  var incrementallyLoadTextures: js.UndefOr[Property | Boolean] = js.native
  
  var lightColor: js.UndefOr[Property | Cartesian3] = js.native
  
  var maximumScale: js.UndefOr[Property | Double] = js.native
  
  var minimumPixelSize: js.UndefOr[Property | Double] = js.native
  
  var nodeTransformations: js.UndefOr[PropertyBag] = js.native
  
  var runAnimations: js.UndefOr[Property | Boolean] = js.native
  
  var scale: js.UndefOr[Property | Double] = js.native
  
  var shadows: js.UndefOr[Property | ShadowMode] = js.native
  
  var show: js.UndefOr[Property | Boolean] = js.native
  
  var silhouetteColor: js.UndefOr[Property | typings.cesium.mod.Color] = js.native
  
  var silhouetteSize: js.UndefOr[Property | Double] = js.native
  
  var uri: js.UndefOr[Property | String] = js.native
}
object Articulations {
  
  @scala.inline
  def apply(): Articulations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Articulations]
  }
  
  @scala.inline
  implicit class ArticulationsOps[Self <: Articulations] (val x: Self) extends AnyVal {
    
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
    def setArticulations(value: PropertyBag): Self = this.set("articulations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArticulations: Self = this.set("articulations", js.undefined)
    
    @scala.inline
    def setClampAnimations(value: Property | Boolean): Self = this.set("clampAnimations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClampAnimations: Self = this.set("clampAnimations", js.undefined)
    
    @scala.inline
    def setClippingPlanes(value: Property | ClippingPlaneCollection): Self = this.set("clippingPlanes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClippingPlanes: Self = this.set("clippingPlanes", js.undefined)
    
    @scala.inline
    def setColor(value: Property | typings.cesium.mod.Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColorBlendAmount(value: Property | Double): Self = this.set("colorBlendAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorBlendAmount: Self = this.set("colorBlendAmount", js.undefined)
    
    @scala.inline
    def setColorBlendMode(value: Property | ColorBlendMode): Self = this.set("colorBlendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorBlendMode: Self = this.set("colorBlendMode", js.undefined)
    
    @scala.inline
    def setDistanceDisplayCondition(value: Property | typings.cesium.mod.DistanceDisplayCondition): Self = this.set("distanceDisplayCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistanceDisplayCondition: Self = this.set("distanceDisplayCondition", js.undefined)
    
    @scala.inline
    def setHeightReference(value: Property | HeightReference): Self = this.set("heightReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightReference: Self = this.set("heightReference", js.undefined)
    
    @scala.inline
    def setImageBasedLightingFactor(value: Property | Cartesian2): Self = this.set("imageBasedLightingFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageBasedLightingFactor: Self = this.set("imageBasedLightingFactor", js.undefined)
    
    @scala.inline
    def setIncrementallyLoadTextures(value: Property | Boolean): Self = this.set("incrementallyLoadTextures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncrementallyLoadTextures: Self = this.set("incrementallyLoadTextures", js.undefined)
    
    @scala.inline
    def setLightColor(value: Property | Cartesian3): Self = this.set("lightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLightColor: Self = this.set("lightColor", js.undefined)
    
    @scala.inline
    def setMaximumScale(value: Property | Double): Self = this.set("maximumScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumScale: Self = this.set("maximumScale", js.undefined)
    
    @scala.inline
    def setMinimumPixelSize(value: Property | Double): Self = this.set("minimumPixelSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumPixelSize: Self = this.set("minimumPixelSize", js.undefined)
    
    @scala.inline
    def setNodeTransformations(value: PropertyBag): Self = this.set("nodeTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeTransformations: Self = this.set("nodeTransformations", js.undefined)
    
    @scala.inline
    def setRunAnimations(value: Property | Boolean): Self = this.set("runAnimations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunAnimations: Self = this.set("runAnimations", js.undefined)
    
    @scala.inline
    def setScale(value: Property | Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setShadows(value: Property | ShadowMode): Self = this.set("shadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadows: Self = this.set("shadows", js.undefined)
    
    @scala.inline
    def setShow(value: Property | Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setSilhouetteColor(value: Property | typings.cesium.mod.Color): Self = this.set("silhouetteColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilhouetteColor: Self = this.set("silhouetteColor", js.undefined)
    
    @scala.inline
    def setSilhouetteSize(value: Property | Double): Self = this.set("silhouetteSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilhouetteSize: Self = this.set("silhouetteSize", js.undefined)
    
    @scala.inline
    def setUri(value: Property | String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}
