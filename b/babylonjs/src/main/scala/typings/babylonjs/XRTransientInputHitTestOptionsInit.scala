package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRTransientInputHitTestOptionsInit extends StObject {
  
  var entityTypes: js.UndefOr[js.Array[XRHitTestTrackableType]] = js.native
  
  var offsetRay: js.UndefOr[XRRay] = js.native
  
  var profile: String = js.native
}
object XRTransientInputHitTestOptionsInit {
  
  @scala.inline
  def apply(profile: String): XRTransientInputHitTestOptionsInit = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRTransientInputHitTestOptionsInit]
  }
  
  @scala.inline
  implicit class XRTransientInputHitTestOptionsInitMutableBuilder[Self <: XRTransientInputHitTestOptionsInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityTypes(value: js.Array[XRHitTestTrackableType]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    @scala.inline
    def setEntityTypesVarargs(value: XRHitTestTrackableType*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
    
    @scala.inline
    def setOffsetRay(value: XRRay): Self = StObject.set(x, "offsetRay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetRayUndefined: Self = StObject.set(x, "offsetRay", js.undefined)
    
    @scala.inline
    def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
  }
}
