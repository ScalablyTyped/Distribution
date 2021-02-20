package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationData extends StObject {
  
  /**
    * The assets that comprise the validation data. 
    */
  var Assets: js.UndefOr[typings.awsSdk.rekognitionMod.Assets] = js.native
}
object ValidationData {
  
  @scala.inline
  def apply(): ValidationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationData]
  }
  
  @scala.inline
  implicit class ValidationDataMutableBuilder[Self <: ValidationData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssets(value: Assets): Self = StObject.set(x, "Assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetsUndefined: Self = StObject.set(x, "Assets", js.undefined)
    
    @scala.inline
    def setAssetsVarargs(value: Asset*): Self = StObject.set(x, "Assets", js.Array(value :_*))
  }
}
