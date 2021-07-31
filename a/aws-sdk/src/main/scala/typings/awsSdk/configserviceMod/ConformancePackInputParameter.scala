package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConformancePackInputParameter extends StObject {
  
  /**
    * One part of a key-value pair.
    */
  var ParameterName: typings.awsSdk.configserviceMod.ParameterName
  
  /**
    * Another part of the key-value pair. 
    */
  var ParameterValue: typings.awsSdk.configserviceMod.ParameterValue
}
object ConformancePackInputParameter {
  
  @scala.inline
  def apply(ParameterName: ParameterName, ParameterValue: ParameterValue): ConformancePackInputParameter = {
    val __obj = js.Dynamic.literal(ParameterName = ParameterName.asInstanceOf[js.Any], ParameterValue = ParameterValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformancePackInputParameter]
  }
  
  @scala.inline
  implicit class ConformancePackInputParameterMutableBuilder[Self <: ConformancePackInputParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameterName(value: ParameterName): Self = StObject.set(x, "ParameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterValue(value: ParameterValue): Self = StObject.set(x, "ParameterValue", value.asInstanceOf[js.Any])
  }
}
