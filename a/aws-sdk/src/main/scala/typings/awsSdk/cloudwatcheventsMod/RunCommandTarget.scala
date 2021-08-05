package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunCommandTarget extends StObject {
  
  /**
    * Can be either tag: tag-key or InstanceIds.
    */
  var Key: RunCommandTargetKey
  
  /**
    * If Key is tag: tag-key, Values is a list of tag values. If Key is InstanceIds, Values is a list of Amazon EC2 instance IDs.
    */
  var Values: RunCommandTargetValues
}
object RunCommandTarget {
  
  inline def apply(Key: RunCommandTargetKey, Values: RunCommandTargetValues): RunCommandTarget = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunCommandTarget]
  }
  
  extension [Self <: RunCommandTarget](x: Self) {
    
    inline def setKey(value: RunCommandTargetKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValues(value: RunCommandTargetValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: RunCommandTargetValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
