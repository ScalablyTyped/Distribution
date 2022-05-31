package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INodeMaterialOptions extends StObject {
  
  /**
    * Defines if blocks should emit comments
    */
  var emitComments: Boolean
}
object INodeMaterialOptions {
  
  inline def apply(emitComments: Boolean): INodeMaterialOptions = {
    val __obj = js.Dynamic.literal(emitComments = emitComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[INodeMaterialOptions]
  }
  
  extension [Self <: INodeMaterialOptions](x: Self) {
    
    inline def setEmitComments(value: Boolean): Self = StObject.set(x, "emitComments", value.asInstanceOf[js.Any])
  }
}
