package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestingData extends js.Object {
  
  /**
    * The assets used for testing.
    */
  var Assets: js.UndefOr[typings.awsSdk.rekognitionMod.Assets] = js.native
  
  /**
    * If specified, Amazon Rekognition Custom Labels creates a testing dataset with an 80/20 split of the training dataset.
    */
  var AutoCreate: js.UndefOr[Boolean] = js.native
}
object TestingData {
  
  @scala.inline
  def apply(): TestingData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestingData]
  }
  
  @scala.inline
  implicit class TestingDataOps[Self <: TestingData] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setAutoCreate(value: Boolean): Self = this.set("AutoCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCreate: Self = this.set("AutoCreate", js.undefined)
  }
}
