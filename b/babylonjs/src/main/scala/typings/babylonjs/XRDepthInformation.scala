package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRDepthInformation extends StObject {
  
  val height: Double
  
  val normDepthBufferFromNormView: XRRigidTransform
  
  val rawValueToMeters: Double
  
  val width: Double
}
object XRDepthInformation {
  
  inline def apply(
    height: Double,
    normDepthBufferFromNormView: XRRigidTransform,
    rawValueToMeters: Double,
    width: Double
  ): XRDepthInformation = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], normDepthBufferFromNormView = normDepthBufferFromNormView.asInstanceOf[js.Any], rawValueToMeters = rawValueToMeters.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRDepthInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRDepthInformation] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setNormDepthBufferFromNormView(value: XRRigidTransform): Self = StObject.set(x, "normDepthBufferFromNormView", value.asInstanceOf[js.Any])
    
    inline def setRawValueToMeters(value: Double): Self = StObject.set(x, "rawValueToMeters", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
