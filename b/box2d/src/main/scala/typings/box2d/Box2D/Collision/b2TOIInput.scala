package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Sweep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2TOIInput extends StObject {
  
  /**
    * Proxy A
    **/
  var proxyA: b2DistanceProxy
  
  /**
    * Proxy B
    **/
  var proxyB: b2DistanceProxy
  
  /**
    * Sweep A
    **/
  var sweepA: b2Sweep
  
  /**
    * Sweep B
    **/
  var sweepB: b2Sweep
  
  /**
    * Tolerance
    **/
  var tolerance: Double
}
object b2TOIInput {
  
  inline def apply(
    proxyA: b2DistanceProxy,
    proxyB: b2DistanceProxy,
    sweepA: b2Sweep,
    sweepB: b2Sweep,
    tolerance: Double
  ): b2TOIInput = {
    val __obj = js.Dynamic.literal(proxyA = proxyA.asInstanceOf[js.Any], proxyB = proxyB.asInstanceOf[js.Any], sweepA = sweepA.asInstanceOf[js.Any], sweepB = sweepB.asInstanceOf[js.Any], tolerance = tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2TOIInput]
  }
  
  extension [Self <: b2TOIInput](x: Self) {
    
    inline def setProxyA(value: b2DistanceProxy): Self = StObject.set(x, "proxyA", value.asInstanceOf[js.Any])
    
    inline def setProxyB(value: b2DistanceProxy): Self = StObject.set(x, "proxyB", value.asInstanceOf[js.Any])
    
    inline def setSweepA(value: b2Sweep): Self = StObject.set(x, "sweepA", value.asInstanceOf[js.Any])
    
    inline def setSweepB(value: b2Sweep): Self = StObject.set(x, "sweepB", value.asInstanceOf[js.Any])
    
    inline def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
  }
}
