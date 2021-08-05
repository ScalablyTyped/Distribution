package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPipelineInput extends StObject {
  
  /**
    * The name of the pipeline for which you want to get information. Pipeline names must be unique under an AWS user account.
    */
  var name: PipelineName
  
  /**
    * The version number of the pipeline. If you do not specify a version, defaults to the current version.
    */
  var version: js.UndefOr[PipelineVersion] = js.undefined
}
object GetPipelineInput {
  
  inline def apply(name: PipelineName): GetPipelineInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPipelineInput]
  }
  
  extension [Self <: GetPipelineInput](x: Self) {
    
    inline def setName(value: PipelineName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: PipelineVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
