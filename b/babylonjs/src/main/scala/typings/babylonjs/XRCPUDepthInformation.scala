package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRCPUDepthInformation
  extends StObject
     with XRDepthInformation {
  
  val data: js.typedarray.ArrayBuffer
  
  def getDepthInMeters(x: Double, y: Double): Double
}
object XRCPUDepthInformation {
  
  inline def apply(
    data: js.typedarray.ArrayBuffer,
    getDepthInMeters: (Double, Double) => Double,
    height: Double,
    normDepthBufferFromNormView: XRRigidTransform,
    rawValueToMeters: Double,
    width: Double
  ): XRCPUDepthInformation = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getDepthInMeters = js.Any.fromFunction2(getDepthInMeters), height = height.asInstanceOf[js.Any], normDepthBufferFromNormView = normDepthBufferFromNormView.asInstanceOf[js.Any], rawValueToMeters = rawValueToMeters.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRCPUDepthInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRCPUDepthInformation] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setGetDepthInMeters(value: (Double, Double) => Double): Self = StObject.set(x, "getDepthInMeters", js.Any.fromFunction2(value))
  }
}
