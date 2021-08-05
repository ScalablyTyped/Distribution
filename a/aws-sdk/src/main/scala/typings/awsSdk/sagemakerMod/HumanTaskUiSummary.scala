package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HumanTaskUiSummary extends StObject {
  
  /**
    * A timestamp when SageMaker created the human task user interface.
    */
  var CreationTime: Timestamp
  
  /**
    * The Amazon Resource Name (ARN) of the human task user interface.
    */
  var HumanTaskUiArn: typings.awsSdk.sagemakerMod.HumanTaskUiArn
  
  /**
    * The name of the human task user interface.
    */
  var HumanTaskUiName: typings.awsSdk.sagemakerMod.HumanTaskUiName
}
object HumanTaskUiSummary {
  
  inline def apply(CreationTime: Timestamp, HumanTaskUiArn: HumanTaskUiArn, HumanTaskUiName: HumanTaskUiName): HumanTaskUiSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], HumanTaskUiArn = HumanTaskUiArn.asInstanceOf[js.Any], HumanTaskUiName = HumanTaskUiName.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanTaskUiSummary]
  }
  
  extension [Self <: HumanTaskUiSummary](x: Self) {
    
    inline def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setHumanTaskUiArn(value: HumanTaskUiArn): Self = StObject.set(x, "HumanTaskUiArn", value.asInstanceOf[js.Any])
    
    inline def setHumanTaskUiName(value: HumanTaskUiName): Self = StObject.set(x, "HumanTaskUiName", value.asInstanceOf[js.Any])
  }
}
