package typings.babylonjs.assetsManagerMod

import typings.babylonjs.baseTextureMod.BaseTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITextureAssetTask[TEX /* <: BaseTexture */] extends js.Object {
  
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
  implicit class ITextureAssetTaskOps[Self <: ITextureAssetTask[_], TEX /* <: BaseTexture */] (val x: Self with ITextureAssetTask[TEX]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTexture(value: TEX): Self = this.set("texture", value.asInstanceOf[js.Any])
  }
}
