package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceARNDetail extends StObject {
  
  /**
    * The ARN of a corresponding resource.
    */
  var ARN: js.UndefOr[String] = js.native
}
object ResourceARNDetail {
  
  @scala.inline
  def apply(): ResourceARNDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceARNDetail]
  }
  
  @scala.inline
  implicit class ResourceARNDetailMutableBuilder[Self <: ResourceARNDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
  }
}
