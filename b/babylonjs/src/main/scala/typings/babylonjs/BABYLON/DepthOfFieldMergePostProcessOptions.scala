package typings.babylonjs.BABYLON

import typings.babylonjs.anon.CircleOfConfusion
import typings.babylonjs.anon.Weight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DepthOfFieldMergePostProcessOptions extends StObject {
  
  /**
    * Parameters to perform the merge of bloom effect
    */
  var bloom: js.UndefOr[Weight] = js.undefined
  
  /**
    * Parameters to perform the merge of the depth of field effect
    */
  var depthOfField: js.UndefOr[CircleOfConfusion] = js.undefined
  
  /**
    * The original image to merge on top of
    */
  var originalFromInput: PostProcess
}
object DepthOfFieldMergePostProcessOptions {
  
  inline def apply(originalFromInput: PostProcess): DepthOfFieldMergePostProcessOptions = {
    val __obj = js.Dynamic.literal(originalFromInput = originalFromInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthOfFieldMergePostProcessOptions]
  }
  
  extension [Self <: DepthOfFieldMergePostProcessOptions](x: Self) {
    
    inline def setBloom(value: Weight): Self = StObject.set(x, "bloom", value.asInstanceOf[js.Any])
    
    inline def setBloomUndefined: Self = StObject.set(x, "bloom", js.undefined)
    
    inline def setDepthOfField(value: CircleOfConfusion): Self = StObject.set(x, "depthOfField", value.asInstanceOf[js.Any])
    
    inline def setDepthOfFieldUndefined: Self = StObject.set(x, "depthOfField", js.undefined)
    
    inline def setOriginalFromInput(value: PostProcess): Self = StObject.set(x, "originalFromInput", value.asInstanceOf[js.Any])
  }
}
