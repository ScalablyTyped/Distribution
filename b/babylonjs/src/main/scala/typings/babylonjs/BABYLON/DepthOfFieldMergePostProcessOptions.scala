package typings.babylonjs.BABYLON

import typings.babylonjs.anon.CircleOfConfusion
import typings.babylonjs.anon.Weight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DepthOfFieldMergePostProcessOptions extends StObject {
  
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
  implicit class DepthOfFieldMergePostProcessOptionsMutableBuilder[Self <: DepthOfFieldMergePostProcessOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBloom(value: Weight): Self = StObject.set(x, "bloom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBloomUndefined: Self = StObject.set(x, "bloom", js.undefined)
    
    @scala.inline
    def setDepthOfField(value: CircleOfConfusion): Self = StObject.set(x, "depthOfField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthOfFieldUndefined: Self = StObject.set(x, "depthOfField", js.undefined)
    
    @scala.inline
    def setOriginalFromInput(value: PostProcess): Self = StObject.set(x, "originalFromInput", value.asInstanceOf[js.Any])
  }
}
