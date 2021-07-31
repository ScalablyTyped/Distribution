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
  
  @scala.inline
  def apply(Type: ProcessorType): Processor = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Processor]
  }
  
  @scala.inline
  implicit class ProcessorMutableBuilder[Self <: Processor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ProcessorParameterList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: ProcessorParameter*): Self = StObject.set(x, "Parameters", js.Array(value :_*))
    
    @scala.inline
    def setType(value: ProcessorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
