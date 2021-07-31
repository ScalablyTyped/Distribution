package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessingConfiguration extends StObject {
  
  /**
    * Enables or disables data processing.
    */
  var Enabled: js.UndefOr[BooleanObject] = js.undefined
  
  /**
    * The data processors.
    */
  var Processors: js.UndefOr[ProcessorList] = js.undefined
}
object ProcessingConfiguration {
  
  @scala.inline
  def apply(): ProcessingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessingConfiguration]
  }
  
  @scala.inline
  implicit class ProcessingConfigurationMutableBuilder[Self <: ProcessingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: BooleanObject): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setProcessors(value: ProcessorList): Self = StObject.set(x, "Processors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessorsUndefined: Self = StObject.set(x, "Processors", js.undefined)
    
    @scala.inline
    def setProcessorsVarargs(value: Processor*): Self = StObject.set(x, "Processors", js.Array(value :_*))
  }
}
