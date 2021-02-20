package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLoggerDefinitionVersionRequest extends StObject {
  
  /**
    * The ID of the logger definition.
    */
  var LoggerDefinitionId: string = js.native
  
  /**
    * The ID of the logger definition version. This value maps to the ''Version'' property of the corresponding ''VersionInformation'' object, which is returned by ''ListLoggerDefinitionVersions'' requests. If the version is the last one that was associated with a logger definition, the value also maps to the ''LatestVersion'' property of the corresponding ''DefinitionInformation'' object.
    */
  var LoggerDefinitionVersionId: string = js.native
  
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object GetLoggerDefinitionVersionRequest {
  
  @scala.inline
  def apply(LoggerDefinitionId: string, LoggerDefinitionVersionId: string): GetLoggerDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(LoggerDefinitionId = LoggerDefinitionId.asInstanceOf[js.Any], LoggerDefinitionVersionId = LoggerDefinitionVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoggerDefinitionVersionRequest]
  }
  
  @scala.inline
  implicit class GetLoggerDefinitionVersionRequestMutableBuilder[Self <: GetLoggerDefinitionVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoggerDefinitionId(value: string): Self = StObject.set(x, "LoggerDefinitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggerDefinitionVersionId(value: string): Self = StObject.set(x, "LoggerDefinitionVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
