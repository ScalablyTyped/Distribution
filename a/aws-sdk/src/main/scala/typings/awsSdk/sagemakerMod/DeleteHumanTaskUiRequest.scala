package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteHumanTaskUiRequest extends StObject {
  
  /**
    * The name of the human task user interface (work task template) you want to delete.
    */
  var HumanTaskUiName: typings.awsSdk.sagemakerMod.HumanTaskUiName
}
object DeleteHumanTaskUiRequest {
  
  @scala.inline
  def apply(HumanTaskUiName: HumanTaskUiName): DeleteHumanTaskUiRequest = {
    val __obj = js.Dynamic.literal(HumanTaskUiName = HumanTaskUiName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHumanTaskUiRequest]
  }
  
  @scala.inline
  implicit class DeleteHumanTaskUiRequestMutableBuilder[Self <: DeleteHumanTaskUiRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHumanTaskUiName(value: HumanTaskUiName): Self = StObject.set(x, "HumanTaskUiName", value.asInstanceOf[js.Any])
  }
}
