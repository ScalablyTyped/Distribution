package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PolyhedronData")
@js.native
open class PolyhedronData protected ()
  extends StObject
     with typings.babylonjs.BABYLON.PolyhedronData {
  def this(
    name: String,
    category: String,
    vertex: js.Array[js.Array[Double]],
    face: js.Array[js.Array[Double]]
  ) = this()
  
  /* CompleteClass */
  var category: String = js.native
  
  /* CompleteClass */
  var edgematch: js.Array[js.Array[Double | String]] = js.native
  
  /* CompleteClass */
  var face: js.Array[js.Array[Double]] = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var vertex: js.Array[js.Array[Double]] = js.native
}
