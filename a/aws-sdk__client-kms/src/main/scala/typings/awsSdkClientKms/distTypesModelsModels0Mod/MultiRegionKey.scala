package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiRegionKey extends StObject {
  
  /**
    * <p>Displays the key ARN of a primary or replica key of a multi-Region key.</p>
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Displays the Amazon Web Services Region of a primary or replica key in a multi-Region key.</p>
    */
  var Region: js.UndefOr[String] = js.undefined
}
object MultiRegionKey {
  
  inline def apply(): MultiRegionKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiRegionKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiRegionKey] (val x: Self) extends AnyVal {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
  }
}
