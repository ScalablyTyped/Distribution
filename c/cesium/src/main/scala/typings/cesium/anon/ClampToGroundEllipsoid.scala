package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClampToGroundEllipsoid extends StObject {
  
  var clampToGround: js.UndefOr[Boolean] = js.undefined
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  
  var sourceUri: js.UndefOr[String] = js.undefined
}
object ClampToGroundEllipsoid {
  
  @scala.inline
  def apply(): ClampToGroundEllipsoid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClampToGroundEllipsoid]
  }
  
  @scala.inline
  implicit class ClampToGroundEllipsoidMutableBuilder[Self <: ClampToGroundEllipsoid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClampToGround(value: Boolean): Self = StObject.set(x, "clampToGround", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClampToGroundUndefined: Self = StObject.set(x, "clampToGround", js.undefined)
    
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    @scala.inline
    def setSourceUri(value: String): Self = StObject.set(x, "sourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUriUndefined: Self = StObject.set(x, "sourceUri", js.undefined)
  }
}
