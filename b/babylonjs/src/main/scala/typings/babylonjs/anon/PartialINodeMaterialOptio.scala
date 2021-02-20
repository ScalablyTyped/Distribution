package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.BABYLON.INodeMaterialOptions> */
@js.native
trait PartialINodeMaterialOptio extends StObject {
  
  var emitComments: js.UndefOr[Boolean] = js.native
}
object PartialINodeMaterialOptio {
  
  @scala.inline
  def apply(): PartialINodeMaterialOptio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialINodeMaterialOptio]
  }
  
  @scala.inline
  implicit class PartialINodeMaterialOptioMutableBuilder[Self <: PartialINodeMaterialOptio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmitComments(value: Boolean): Self = StObject.set(x, "emitComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmitCommentsUndefined: Self = StObject.set(x, "emitComments", js.undefined)
  }
}
