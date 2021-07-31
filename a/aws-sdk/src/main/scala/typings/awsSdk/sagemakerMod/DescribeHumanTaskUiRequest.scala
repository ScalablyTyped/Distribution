package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHumanTaskUiRequest extends StObject {
  
  /**
    * The name of the human task user interface (worker task template) you want information about.
    */
  var HumanTaskUiName: typings.awsSdk.sagemakerMod.HumanTaskUiName
}
object DescribeHumanTaskUiRequest {
  
  @scala.inline
  def apply(HumanTaskUiName: HumanTaskUiName): DescribeHumanTaskUiRequest = {
    val __obj = js.Dynamic.literal(HumanTaskUiName = HumanTaskUiName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHumanTaskUiRequest]
  }
  
  @scala.inline
  implicit class DescribeHumanTaskUiRequestMutableBuilder[Self <: DescribeHumanTaskUiRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHumanTaskUiName(value: HumanTaskUiName): Self = StObject.set(x, "HumanTaskUiName", value.asInstanceOf[js.Any])
  }
}
