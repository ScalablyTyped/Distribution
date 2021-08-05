package typings.awsSdk.elasticinferenceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyValuePair extends StObject {
  
  /**
    *  The throughput value of the Elastic Inference Accelerator type. It can assume the following values: TFLOPS16bit: the throughput expressed in 16bit TeraFLOPS. TFLOPS32bit: the throughput expressed in 32bit TeraFLOPS. 
    */
  var key: js.UndefOr[Key] = js.undefined
  
  /**
    *  The throughput value of the Elastic Inference Accelerator type. 
    */
  var value: js.UndefOr[Value] = js.undefined
}
object KeyValuePair {
  
  inline def apply(): KeyValuePair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyValuePair]
  }
  
  extension [Self <: KeyValuePair](x: Self) {
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
