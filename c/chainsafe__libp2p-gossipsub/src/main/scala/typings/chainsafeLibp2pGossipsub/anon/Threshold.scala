package typings.chainsafeLibp2pGossipsub.anon

import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ScoreThreshold
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Threshold extends StObject {
  
  var threshold: ScoreThreshold
}
object Threshold {
  
  inline def apply(threshold: ScoreThreshold): Threshold = {
    val __obj = js.Dynamic.literal(threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Threshold]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Threshold] (val x: Self) extends AnyVal {
    
    inline def setThreshold(value: ScoreThreshold): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
  }
}
