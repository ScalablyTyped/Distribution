package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConformancePackInputParameter extends js.Object {
  
  /**
    * One part of a key-value pair.
    */
  var ParameterName: typings.awsSdk.configserviceMod.ParameterName = js.native
  
  /**
    * Another part of the key-value pair. 
    */
  var ParameterValue: typings.awsSdk.configserviceMod.ParameterValue = js.native
}
object ConformancePackInputParameter {
  
  @scala.inline
  def apply(ParameterName: ParameterName, ParameterValue: ParameterValue): ConformancePackInputParameter = {
    val __obj = js.Dynamic.literal(ParameterName = ParameterName.asInstanceOf[js.Any], ParameterValue = ParameterValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformancePackInputParameter]
  }
  
  @scala.inline
  implicit class ConformancePackInputParameterOps[Self <: ConformancePackInputParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameterName(value: ParameterName): Self = this.set("ParameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterValue(value: ParameterValue): Self = this.set("ParameterValue", value.asInstanceOf[js.Any])
  }
}
