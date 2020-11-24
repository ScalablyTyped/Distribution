package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrainingData extends js.Object {
  
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
  implicit class TrainingDataOps[Self <: TrainingData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssetsVarargs(value: Asset*): Self = this.set("Assets", js.Array(value :_*))
    
    @scala.inline
    def setAssets(value: Assets): Self = this.set("Assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssets: Self = this.set("Assets", js.undefined)
  }
}
