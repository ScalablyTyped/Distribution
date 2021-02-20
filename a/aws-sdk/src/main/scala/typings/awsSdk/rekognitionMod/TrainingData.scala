package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrainingData extends StObject {
  
  /**
    * A Sagemaker GroundTruth manifest file that contains the training images (assets).
    */
  var Assets: js.UndefOr[typings.awsSdk.rekognitionMod.Assets] = js.native
}
object TrainingData {
  
  @scala.inline
  def apply(): TrainingData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingData]
  }
  
  @scala.inline
  implicit class TrainingDataMutableBuilder[Self <: TrainingData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssets(value: Assets): Self = StObject.set(x, "Assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetsUndefined: Self = StObject.set(x, "Assets", js.undefined)
    
    @scala.inline
    def setAssetsVarargs(value: Asset*): Self = StObject.set(x, "Assets", js.Array(value :_*))
  }
}
