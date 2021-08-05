package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelSchema extends StObject {
  
  /**
    * The label mapper maps the Amazon Fraud Detector supported model classification labels (FRAUD, LEGIT) to the appropriate event type labels. For example, if "FRAUD" and "LEGIT" are Amazon Fraud Detector supported labels, this mapper could be: {"FRAUD" =&gt; ["0"], "LEGIT" =&gt; ["1"]} or {"FRAUD" =&gt; ["false"], "LEGIT" =&gt; ["true"]} or {"FRAUD" =&gt; ["fraud", "abuse"], "LEGIT" =&gt; ["legit", "safe"]}. The value part of the mapper is a list, because you may have multiple label variants from your event type for a single Amazon Fraud Detector label. 
    */
  var labelMapper: typings.awsSdk.frauddetectorMod.labelMapper
}
object LabelSchema {
  
  inline def apply(labelMapper: labelMapper): LabelSchema = {
    val __obj = js.Dynamic.literal(labelMapper = labelMapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelSchema]
  }
  
  extension [Self <: LabelSchema](x: Self) {
    
    inline def setLabelMapper(value: labelMapper): Self = StObject.set(x, "labelMapper", value.asInstanceOf[js.Any])
  }
}
