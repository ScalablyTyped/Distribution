package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelNameCondition extends StObject {
  
  /**
    * The label name that a log record must contain in order to meet the condition. This must be a fully qualified label name. Fully qualified labels have a prefix, optional namespaces, and label name. The prefix identifies the rule group or web ACL context of the rule that added the label. 
    */
  var LabelName: typings.awsSdk.wafv2Mod.LabelName
}
object LabelNameCondition {
  
  inline def apply(LabelName: LabelName): LabelNameCondition = {
    val __obj = js.Dynamic.literal(LabelName = LabelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelNameCondition]
  }
  
  extension [Self <: LabelNameCondition](x: Self) {
    
    inline def setLabelName(value: LabelName): Self = StObject.set(x, "LabelName", value.asInstanceOf[js.Any])
  }
}
