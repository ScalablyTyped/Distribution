package typings.chainsafeLibp2pGossipsub.distSrcMetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToSendGroupCount extends StObject {
  
  var direct: Double
  
  var fanout: Double
  
  var floodsub: Double
  
  var mesh: Double
}
object ToSendGroupCount {
  
  inline def apply(direct: Double, fanout: Double, floodsub: Double, mesh: Double): ToSendGroupCount = {
    val __obj = js.Dynamic.literal(direct = direct.asInstanceOf[js.Any], fanout = fanout.asInstanceOf[js.Any], floodsub = floodsub.asInstanceOf[js.Any], mesh = mesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToSendGroupCount]
  }
  
  extension [Self <: ToSendGroupCount](x: Self) {
    
    inline def setDirect(value: Double): Self = StObject.set(x, "direct", value.asInstanceOf[js.Any])
    
    inline def setFanout(value: Double): Self = StObject.set(x, "fanout", value.asInstanceOf[js.Any])
    
    inline def setFloodsub(value: Double): Self = StObject.set(x, "floodsub", value.asInstanceOf[js.Any])
    
    inline def setMesh(value: Double): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
  }
}
