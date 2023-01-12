package typings.awsSdk.clientsXrayMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceARNDetail] (val x: Self) extends AnyVal {
    
    inline def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
  }
}
