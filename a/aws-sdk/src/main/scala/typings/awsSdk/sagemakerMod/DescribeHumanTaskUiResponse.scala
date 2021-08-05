package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHumanTaskUiResponse extends StObject {
  
  /**
    * The timestamp when the human task user interface was created.
    */
  var CreationTime: Timestamp
  
  /**
    * The Amazon Resource Name (ARN) of the human task user interface (worker task template).
    */
  var HumanTaskUiArn: typings.awsSdk.sagemakerMod.HumanTaskUiArn
  
  /**
    * The name of the human task user interface (worker task template).
    */
  var HumanTaskUiName: typings.awsSdk.sagemakerMod.HumanTaskUiName
  
  /**
    * The status of the human task user interface (worker task template). Valid values are listed below.
    */
  var HumanTaskUiStatus: js.UndefOr[typings.awsSdk.sagemakerMod.HumanTaskUiStatus] = js.undefined
  
  var UiTemplate: UiTemplateInfo
}
object DescribeHumanTaskUiResponse {
  
  inline def apply(
    CreationTime: Timestamp,
    HumanTaskUiArn: HumanTaskUiArn,
    HumanTaskUiName: HumanTaskUiName,
    UiTemplate: UiTemplateInfo
  ): DescribeHumanTaskUiResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], HumanTaskUiArn = HumanTaskUiArn.asInstanceOf[js.Any], HumanTaskUiName = HumanTaskUiName.asInstanceOf[js.Any], UiTemplate = UiTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHumanTaskUiResponse]
  }
  
  extension [Self <: DescribeHumanTaskUiResponse](x: Self) {
    
    inline def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setHumanTaskUiArn(value: HumanTaskUiArn): Self = StObject.set(x, "HumanTaskUiArn", value.asInstanceOf[js.Any])
    
    inline def setHumanTaskUiName(value: HumanTaskUiName): Self = StObject.set(x, "HumanTaskUiName", value.asInstanceOf[js.Any])
    
    inline def setHumanTaskUiStatus(value: HumanTaskUiStatus): Self = StObject.set(x, "HumanTaskUiStatus", value.asInstanceOf[js.Any])
    
    inline def setHumanTaskUiStatusUndefined: Self = StObject.set(x, "HumanTaskUiStatus", js.undefined)
    
    inline def setUiTemplate(value: UiTemplateInfo): Self = StObject.set(x, "UiTemplate", value.asInstanceOf[js.Any])
  }
}
