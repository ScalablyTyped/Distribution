package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISimplificationSettings extends StObject {
  
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
  implicit class ISimplificationSettingsMutableBuilder[Self <: ISimplificationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizeMesh(value: Boolean): Self = StObject.set(x, "optimizeMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizeMeshUndefined: Self = StObject.set(x, "optimizeMesh", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
  }
}
