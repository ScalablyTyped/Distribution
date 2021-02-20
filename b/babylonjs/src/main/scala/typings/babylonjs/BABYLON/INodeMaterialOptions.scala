package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INodeMaterialOptions extends StObject {
  
  /**
    * Defines if blocks should emit comments
    */
  var emitComments: Boolean = js.native
}
object INodeMaterialOptions {
  
  @scala.inline
  def apply(emitComments: Boolean): INodeMaterialOptions = {
    val __obj = js.Dynamic.literal(emitComments = emitComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[INodeMaterialOptions]
  }
  
  @scala.inline
  implicit class INodeMaterialOptionsMutableBuilder[Self <: INodeMaterialOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmitComments(value: Boolean): Self = StObject.set(x, "emitComments", value.asInstanceOf[js.Any])
  }
}
