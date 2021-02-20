package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#eles.floydWarshall
  */
@js.native
trait SearchFloydWarshallOptions extends StObject {
  
  var directed: js.UndefOr[Boolean] = js.native
  
  def weight(edge: EdgeCollection): Double = js.native
  @JSName("weight")
  var weight_Original: WeightFn = js.native
}
