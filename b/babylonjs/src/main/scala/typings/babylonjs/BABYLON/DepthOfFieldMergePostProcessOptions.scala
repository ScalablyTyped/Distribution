package typings.babylonjs.BABYLON

import typings.babylonjs.anon.CircleOfConfusion
import typings.babylonjs.anon.Weight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DepthOfFieldMergePostProcessOptions extends js.Object {
  
  /**
    * Parameters to perform the merge of bloom effect
    */
  var bloom: js.UndefOr[Weight] = js.native
  
  /**
    * Parameters to perform the merge of the depth of field effect
    */
  var depthOfField: js.UndefOr[CircleOfConfusion] = js.native
  
  /**
    * The original image to merge on top of
    */
  var originalFromInput: PostProcess = js.native
}
object DepthOfFieldMergePostProcessOptions {
  
  @scala.inline
  def apply(originalFromInput: PostProcess): DepthOfFieldMergePostProcessOptions = {
    val __obj = js.Dynamic.literal(originalFromInput = originalFromInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthOfFieldMergePostProcessOptions]
  }
  
  @scala.inline
  implicit class DepthOfFieldMergePostProcessOptionsOps[Self <: DepthOfFieldMergePostProcessOptions] (val x: Self) extends AnyVal {
    
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
    def setOriginalFromInput(value: PostProcess): Self = this.set("originalFromInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBloom(value: Weight): Self = this.set("bloom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBloom: Self = this.set("bloom", js.undefined)
    
    @scala.inline
    def setDepthOfField(value: CircleOfConfusion): Self = this.set("depthOfField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepthOfField: Self = this.set("depthOfField", js.undefined)
  }
}
