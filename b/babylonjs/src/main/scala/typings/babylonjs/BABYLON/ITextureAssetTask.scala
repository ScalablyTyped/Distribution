package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITextureAssetTask[TEX /* <: BaseTexture */] extends StObject {
  
  /**
    * Gets the loaded texture
    */
  var texture: TEX = js.native
}
object ITextureAssetTask {
  
  @scala.inline
  def apply[TEX /* <: BaseTexture */](texture: TEX): ITextureAssetTask[TEX] = {
    val __obj = js.Dynamic.literal(texture = texture.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextureAssetTask[TEX]]
  }
  
  @scala.inline
  implicit class ITextureAssetTaskMutableBuilder[Self <: ITextureAssetTask[_], TEX /* <: BaseTexture */] (val x: Self with ITextureAssetTask[TEX]) extends AnyVal {
    
    @scala.inline
    def setTexture(value: TEX): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
  }
}
