package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "MergeMeshesOptimization")
@js.native
/**
  * Creates the SceneOptimization object
  * @param priority defines the priority of this optimization (0 by default which means first in the list)
  */
open class MergeMeshesOptimization ()
  extends typings.babylonjs.indexMod.MergeMeshesOptimization {
  def this(/**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: Double) = this()
}
/* static members */
object MergeMeshesOptimization {
  
  @JSImport("babylonjs/Legacy/legacy", "MergeMeshesOptimization")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "MergeMeshesOptimization._UpdateSelectionTree")
  @js.native
  def _UpdateSelectionTree: Any = js.native
  inline def _UpdateSelectionTree_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_UpdateSelectionTree")(x.asInstanceOf[js.Any])
}
