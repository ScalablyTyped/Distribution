package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiRegionKey extends StObject {
  
  /**
    * Displays the key ARN of a primary or replica key of a multi-Region key.
    */
  var Arn: js.UndefOr[ArnType] = js.undefined
  
  /**
    * Displays the Amazon Web Services Region of a primary or replica key in a multi-Region key.
    */
  var Region: js.UndefOr[RegionType] = js.undefined
}
object MultiRegionKey {
  
  inline def apply(): MultiRegionKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiRegionKey]
  }
  
  extension [Self <: MultiRegionKey](x: Self) {
    
    inline def setArn(value: ArnType): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setRegion(value: RegionType): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
  }
}
