package typings.cesium.anon

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildTileMask extends js.Object {
  
  var buffer: ArrayBuffer = js.native
  
  var childTileMask: js.UndefOr[Double] = js.native
  
  var createdByUpsampling: js.UndefOr[Boolean] = js.native
  
  var credits: js.UndefOr[js.Array[typings.cesium.mod.Credit]] = js.native
  
  var negativeAltitudeExponentBias: Double = js.native
  
  var negativeElevationThreshold: Double = js.native
}
object ChildTileMask {
  
  @scala.inline
  def apply(buffer: ArrayBuffer, negativeAltitudeExponentBias: Double, negativeElevationThreshold: Double): ChildTileMask = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], negativeAltitudeExponentBias = negativeAltitudeExponentBias.asInstanceOf[js.Any], negativeElevationThreshold = negativeElevationThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildTileMask]
  }
  
  @scala.inline
  implicit class ChildTileMaskOps[Self <: ChildTileMask] (val x: Self) extends AnyVal {
    
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
    def setBuffer(value: ArrayBuffer): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeAltitudeExponentBias(value: Double): Self = this.set("negativeAltitudeExponentBias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeElevationThreshold(value: Double): Self = this.set("negativeElevationThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildTileMask(value: Double): Self = this.set("childTileMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildTileMask: Self = this.set("childTileMask", js.undefined)
    
    @scala.inline
    def setCreatedByUpsampling(value: Boolean): Self = this.set("createdByUpsampling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedByUpsampling: Self = this.set("createdByUpsampling", js.undefined)
    
    @scala.inline
    def setCreditsVarargs(value: typings.cesium.mod.Credit*): Self = this.set("credits", js.Array(value :_*))
    
    @scala.inline
    def setCredits(value: js.Array[typings.cesium.mod.Credit]): Self = this.set("credits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredits: Self = this.set("credits", js.undefined)
  }
}
