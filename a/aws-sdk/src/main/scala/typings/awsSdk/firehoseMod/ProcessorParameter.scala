package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessorParameter extends StObject {
  
  /**
    * The name of the parameter.
    */
  var ParameterName: ProcessorParameterName
  
  /**
    * The parameter value.
    */
  var ParameterValue: ProcessorParameterValue
}
object ProcessorParameter {
  
  @scala.inline
  def apply(ParameterName: ProcessorParameterName, ParameterValue: ProcessorParameterValue): ProcessorParameter = {
    val __obj = js.Dynamic.literal(ParameterName = ParameterName.asInstanceOf[js.Any], ParameterValue = ParameterValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessorParameter]
  }
  
  @scala.inline
  implicit class ProcessorParameterMutableBuilder[Self <: ProcessorParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameterName(value: ProcessorParameterName): Self = StObject.set(x, "ParameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterValue(value: ProcessorParameterValue): Self = StObject.set(x, "ParameterValue", value.asInstanceOf[js.Any])
  }
}
