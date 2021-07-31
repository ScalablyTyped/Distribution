package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLoggerDefinitionVersionResponse extends StObject {
  
  /**
    * The ARN of the logger definition version.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the logger definition version was created.
    */
  var CreationTimestamp: js.UndefOr[string] = js.undefined
  
  /**
    * Information about the logger definition version.
    */
  var Definition: js.UndefOr[LoggerDefinitionVersion] = js.undefined
  
  /**
    * The ID of the logger definition version.
    */
  var Id: js.UndefOr[string] = js.undefined
  
  /**
    * The version of the logger definition version.
    */
  var Version: js.UndefOr[string] = js.undefined
}
object GetLoggerDefinitionVersionResponse {
  
  @scala.inline
  def apply(): GetLoggerDefinitionVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLoggerDefinitionVersionResponse]
  }
  
  @scala.inline
  implicit class GetLoggerDefinitionVersionResponseMutableBuilder[Self <: GetLoggerDefinitionVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: string): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    @scala.inline
    def setDefinition(value: LoggerDefinitionVersion): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionUndefined: Self = StObject.set(x, "Definition", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setVersion(value: string): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
