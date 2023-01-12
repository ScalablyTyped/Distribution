package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.BABYLON.INodeMaterialOptions> */
trait PartialINodeMaterialOptio extends StObject {
  
  var emitComments: js.UndefOr[Boolean] = js.undefined
}
object PartialINodeMaterialOptio {
  
  inline def apply(): PartialINodeMaterialOptio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialINodeMaterialOptio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialINodeMaterialOptio] (val x: Self) extends AnyVal {
    
    inline def setEmitComments(value: Boolean): Self = StObject.set(x, "emitComments", value.asInstanceOf[js.Any])
    
    inline def setEmitCommentsUndefined: Self = StObject.set(x, "emitComments", js.undefined)
  }
}
