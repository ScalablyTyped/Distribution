package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#eles.floydWarshall
  */
@js.native
trait SearchFloydWarshallOptions extends js.Object {
  
  var directed: js.UndefOr[Boolean] = js.native
  
  def weight(edge: EdgeCollection): Double = js.native
  @JSName("weight")
  var weight_Original: WeightFn = js.native
}
