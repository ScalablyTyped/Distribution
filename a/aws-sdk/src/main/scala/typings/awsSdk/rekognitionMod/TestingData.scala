package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestingData extends StObject {
  
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
  implicit class TestingDataMutableBuilder[Self <: TestingData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssets(value: Assets): Self = StObject.set(x, "Assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetsUndefined: Self = StObject.set(x, "Assets", js.undefined)
    
    @scala.inline
    def setAssetsVarargs(value: Asset*): Self = StObject.set(x, "Assets", js.Array(value :_*))
    
    @scala.inline
    def setAutoCreate(value: Boolean): Self = StObject.set(x, "AutoCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCreateUndefined: Self = StObject.set(x, "AutoCreate", js.undefined)
  }
}
