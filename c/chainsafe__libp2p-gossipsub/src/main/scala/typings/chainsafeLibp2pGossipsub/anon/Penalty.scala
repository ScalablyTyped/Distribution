package typings.chainsafeLibp2pGossipsub.anon

import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.ScorePenalty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Penalty extends StObject {
  
  var penalty: ScorePenalty
}
object Penalty {
  
  inline def apply(penalty: ScorePenalty): Penalty = {
    val __obj = js.Dynamic.literal(penalty = penalty.asInstanceOf[js.Any])
    __obj.asInstanceOf[Penalty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Penalty] (val x: Self) extends AnyVal {
    
    inline def setPenalty(value: ScorePenalty): Self = StObject.set(x, "penalty", value.asInstanceOf[js.Any])
  }
}
