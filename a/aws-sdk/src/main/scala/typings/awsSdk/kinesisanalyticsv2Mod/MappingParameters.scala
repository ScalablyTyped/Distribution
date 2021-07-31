package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingParameters extends StObject {
  
  /**
    * Provides additional mapping information when the record format uses delimiters (for example, CSV).
    */
  var CSVMappingParameters: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CSVMappingParameters] = js.undefined
  
  /**
    * Provides additional mapping information when JSON is the record format on the streaming source.
    */
  var JSONMappingParameters: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.JSONMappingParameters] = js.undefined
}
object MappingParameters {
  
  @scala.inline
  def apply(): MappingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MappingParameters]
  }
  
  @scala.inline
  implicit class MappingParametersMutableBuilder[Self <: MappingParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCSVMappingParameters(value: CSVMappingParameters): Self = StObject.set(x, "CSVMappingParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSVMappingParametersUndefined: Self = StObject.set(x, "CSVMappingParameters", js.undefined)
    
    @scala.inline
    def setJSONMappingParameters(value: JSONMappingParameters): Self = StObject.set(x, "JSONMappingParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSONMappingParametersUndefined: Self = StObject.set(x, "JSONMappingParameters", js.undefined)
  }
}
