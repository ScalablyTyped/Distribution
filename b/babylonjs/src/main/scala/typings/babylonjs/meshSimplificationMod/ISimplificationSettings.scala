package typings.babylonjs.meshSimplificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISimplificationSettings extends js.Object {
  
  /**
    * Gets or sets the distance when this optimized version should be used
    */
  var distance: Double = js.native
  
  /**
    * Gets an already optimized mesh
    */
  var optimizeMesh: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets the expected quality
    */
  var quality: Double = js.native
}
object ISimplificationSettings {
  
  @scala.inline
  def apply(distance: Double, quality: Double): ISimplificationSettings = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISimplificationSettings]
  }
  
  @scala.inline
  implicit class ISimplificationSettingsOps[Self <: ISimplificationSettings] (val x: Self) extends AnyVal {
    
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
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizeMesh(value: Boolean): Self = this.set("optimizeMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimizeMesh: Self = this.set("optimizeMesh", js.undefined)
  }
}
