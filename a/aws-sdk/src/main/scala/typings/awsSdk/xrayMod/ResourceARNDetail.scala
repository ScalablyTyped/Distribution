package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceARNDetail extends StObject {
  
  /**
    * The ARN of a corresponding resource.
    */
  var ARN: js.UndefOr[String] = js.undefined
}
object ResourceARNDetail {
  
  inline def apply(): ResourceARNDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceARNDetail]
  }
  
  extension [Self <: ResourceARNDetail](x: Self) {
    
    inline def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
  }
}
