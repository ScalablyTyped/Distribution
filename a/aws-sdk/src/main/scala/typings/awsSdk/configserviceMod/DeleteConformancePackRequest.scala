package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteConformancePackRequest extends StObject {
  
  /**
    * Name of the conformance pack you want to delete.
    */
  var ConformancePackName: typings.awsSdk.configserviceMod.ConformancePackName = js.native
}
object DeleteConformancePackRequest {
  
  @scala.inline
  def apply(ConformancePackName: ConformancePackName): DeleteConformancePackRequest = {
    val __obj = js.Dynamic.literal(ConformancePackName = ConformancePackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConformancePackRequest]
  }
  
  @scala.inline
  implicit class DeleteConformancePackRequestMutableBuilder[Self <: DeleteConformancePackRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConformancePackName(value: ConformancePackName): Self = StObject.set(x, "ConformancePackName", value.asInstanceOf[js.Any])
  }
}
