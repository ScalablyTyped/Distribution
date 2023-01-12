package typings.chainsafeLibp2pGossipsub.distSrcMetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToAddGroupCount extends StObject {
  
  var fanout: Double
  
  var random: Double
}
object ToAddGroupCount {
  
  inline def apply(fanout: Double, random: Double): ToAddGroupCount = {
    val __obj = js.Dynamic.literal(fanout = fanout.asInstanceOf[js.Any], random = random.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToAddGroupCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToAddGroupCount] (val x: Self) extends AnyVal {
    
    inline def setFanout(value: Double): Self = StObject.set(x, "fanout", value.asInstanceOf[js.Any])
    
    inline def setRandom(value: Double): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
  }
}
