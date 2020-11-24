package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/pivotTools", JSImport.Namespace)
@js.native
object pivotToolsMod extends js.Object {
  
  @js.native
  class PivotTools () extends js.Object
  /* static members */
  @js.native
  object PivotTools extends js.Object {
    
    var _OldPivotPoint: js.Any = js.native
    
    var _PivotCached: js.Any = js.native
    
    var _PivotPostMultiplyPivotMatrix: js.Any = js.native
    
    var _PivotTmpVector: js.Any = js.native
    
    var _PivotTranslation: js.Any = js.native
    
    /** @hidden */
    def _RemoveAndStorePivotPoint(mesh: AbstractMesh): Unit = js.native
    
    /** @hidden */
    def _RestorePivotPoint(mesh: AbstractMesh): Unit = js.native
  }
}
