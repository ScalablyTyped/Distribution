package typings.chainsafeLibp2pGossipsub.distSrcMetricsMod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScoreWeights[T] extends StObject {
  
  var byTopic: Map[TopicLabel, TopicScoreWeights[T]]
  
  var p5w: T
  
  var p6w: T
  
  var p7w: T
  
  var score: T
}
object ScoreWeights {
  
  inline def apply[T](byTopic: Map[TopicLabel, TopicScoreWeights[T]], p5w: T, p6w: T, p7w: T, score: T): ScoreWeights[T] = {
    val __obj = js.Dynamic.literal(byTopic = byTopic.asInstanceOf[js.Any], p5w = p5w.asInstanceOf[js.Any], p6w = p6w.asInstanceOf[js.Any], p7w = p7w.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScoreWeights[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScoreWeights[?], T] (val x: Self & ScoreWeights[T]) extends AnyVal {
    
    inline def setByTopic(value: Map[TopicLabel, TopicScoreWeights[T]]): Self = StObject.set(x, "byTopic", value.asInstanceOf[js.Any])
    
    inline def setP5w(value: T): Self = StObject.set(x, "p5w", value.asInstanceOf[js.Any])
    
    inline def setP6w(value: T): Self = StObject.set(x, "p6w", value.asInstanceOf[js.Any])
    
    inline def setP7w(value: T): Self = StObject.set(x, "p7w", value.asInstanceOf[js.Any])
    
    inline def setScore(value: T): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
  }
}
