package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2DistanceInput extends StObject {
  
  /**
    * Proxy A
    **/
  var proxyA: b2DistanceProxy
  
  /**
    * Proxy B
    **/
  var proxyB: b2DistanceProxy
  
  /**
    * Transform A
    **/
  var transformA: b2Transform
  
  /**
    * Transform B
    **/
  var transformB: b2Transform
  
  /**
    * Use shape radii in computation?
    **/
  var useRadii: Boolean
}
object b2DistanceInput {
  
  inline def apply(
    proxyA: b2DistanceProxy,
    proxyB: b2DistanceProxy,
    transformA: b2Transform,
    transformB: b2Transform,
    useRadii: Boolean
  ): b2DistanceInput = {
    val __obj = js.Dynamic.literal(proxyA = proxyA.asInstanceOf[js.Any], proxyB = proxyB.asInstanceOf[js.Any], transformA = transformA.asInstanceOf[js.Any], transformB = transformB.asInstanceOf[js.Any], useRadii = useRadii.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2DistanceInput]
  }
  
  extension [Self <: b2DistanceInput](x: Self) {
    
    inline def setProxyA(value: b2DistanceProxy): Self = StObject.set(x, "proxyA", value.asInstanceOf[js.Any])
    
    inline def setProxyB(value: b2DistanceProxy): Self = StObject.set(x, "proxyB", value.asInstanceOf[js.Any])
    
    inline def setTransformA(value: b2Transform): Self = StObject.set(x, "transformA", value.asInstanceOf[js.Any])
    
    inline def setTransformB(value: b2Transform): Self = StObject.set(x, "transformB", value.asInstanceOf[js.Any])
    
    inline def setUseRadii(value: Boolean): Self = StObject.set(x, "useRadii", value.asInstanceOf[js.Any])
  }
}
