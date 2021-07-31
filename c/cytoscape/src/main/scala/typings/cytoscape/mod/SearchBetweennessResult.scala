package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#eles.betweennessCentrality
  */
trait SearchBetweennessResult extends StObject {
  
  /** returns the betweenness centrality of the specified node */
  def betweenness(node: NodeSingular): Double
  
  def betweennessNormalised(node: NodeSingular): Double
  
  /** returns the normalised betweenness centrality of the specified node */
  def betweennessNormalized(node: NodeSingular): Double
}
object SearchBetweennessResult {
  
  @scala.inline
  def apply(
    betweenness: NodeSingular => Double,
    betweennessNormalised: NodeSingular => Double,
    betweennessNormalized: NodeSingular => Double
  ): SearchBetweennessResult = {
    val __obj = js.Dynamic.literal(betweenness = js.Any.fromFunction1(betweenness), betweennessNormalised = js.Any.fromFunction1(betweennessNormalised), betweennessNormalized = js.Any.fromFunction1(betweennessNormalized))
    __obj.asInstanceOf[SearchBetweennessResult]
  }
  
  @scala.inline
  implicit class SearchBetweennessResultMutableBuilder[Self <: SearchBetweennessResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBetweenness(value: NodeSingular => Double): Self = StObject.set(x, "betweenness", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBetweennessNormalised(value: NodeSingular => Double): Self = StObject.set(x, "betweennessNormalised", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBetweennessNormalized(value: NodeSingular => Double): Self = StObject.set(x, "betweennessNormalized", js.Any.fromFunction1(value))
  }
}
