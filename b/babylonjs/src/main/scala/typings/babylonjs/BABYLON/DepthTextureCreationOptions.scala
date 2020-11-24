package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DepthTextureCreationOptions extends js.Object {
  
  /** Specifies whether or not bilinear filtering is enable on the texture */
  var bilinearFiltering: js.UndefOr[Boolean] = js.native
  
  /** Specifies the comparison function to set on the texture. If 0 or undefined, the texture is not in comparison mode */
  var comparisonFunction: js.UndefOr[Double] = js.native
  
  /** Specifies whether or not a stencil should be allocated in the texture */
  var generateStencil: js.UndefOr[Boolean] = js.native
  
  /** Specifies if the created texture is a cube texture */
  var isCube: js.UndefOr[Boolean] = js.native
}
object DepthTextureCreationOptions {
  
  @scala.inline
  def apply(): DepthTextureCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DepthTextureCreationOptions]
  }
  
  @scala.inline
  implicit class DepthTextureCreationOptionsOps[Self <: DepthTextureCreationOptions] (val x: Self) extends AnyVal {
    
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
    def setBilinearFiltering(value: Boolean): Self = this.set("bilinearFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBilinearFiltering: Self = this.set("bilinearFiltering", js.undefined)
    
    @scala.inline
    def setComparisonFunction(value: Double): Self = this.set("comparisonFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparisonFunction: Self = this.set("comparisonFunction", js.undefined)
    
    @scala.inline
    def setGenerateStencil(value: Boolean): Self = this.set("generateStencil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerateStencil: Self = this.set("generateStencil", js.undefined)
    
    @scala.inline
    def setIsCube(value: Boolean): Self = this.set("isCube", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCube: Self = this.set("isCube", js.undefined)
  }
}
