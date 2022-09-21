package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Processor extends StObject {
  
  /**
    * The processor parameters.
    */
  var Parameters: js.UndefOr[ProcessorParameterList] = js.undefined
  
  /**
    * The type of processor.
    */
  var Type: ProcessorType
}
object Processor {
  
  inline def apply(Type: ProcessorType): Processor = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Processor]
  }
  
  extension [Self <: Processor](x: Self) {
    
    inline def setParameters(value: ProcessorParameterList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: ProcessorParameter*): Self = StObject.set(x, "Parameters", js.Array(value*))
    
    inline def setType(value: ProcessorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
