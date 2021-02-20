package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.setHeight()
@js.native
trait SetHeightConfig extends StObject {
  
  var full: js.UndefOr[Boolean] = js.native
  
  var fullViewport: js.UndefOr[Boolean] = js.native
  
  var growOnly: js.UndefOr[Boolean] = js.native
  
  var height: Double = js.native
}
object SetHeightConfig {
  
  @scala.inline
  def apply(height: Double): SetHeightConfig = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetHeightConfig]
  }
  
  @scala.inline
  implicit class SetHeightConfigMutableBuilder[Self <: SetHeightConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
    
    @scala.inline
    def setFullViewport(value: Boolean): Self = StObject.set(x, "fullViewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullViewportUndefined: Self = StObject.set(x, "fullViewport", js.undefined)
    
    @scala.inline
    def setGrowOnly(value: Boolean): Self = StObject.set(x, "growOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrowOnlyUndefined: Self = StObject.set(x, "growOnly", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
  }
}
