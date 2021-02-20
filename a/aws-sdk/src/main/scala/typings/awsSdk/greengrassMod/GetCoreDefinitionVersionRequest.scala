package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCoreDefinitionVersionRequest extends StObject {
  
  /**
    * The ID of the core definition.
    */
  var CoreDefinitionId: string = js.native
  
  /**
    * The ID of the core definition version. This value maps to the ''Version'' property of the corresponding ''VersionInformation'' object, which is returned by ''ListCoreDefinitionVersions'' requests. If the version is the last one that was associated with a core definition, the value also maps to the ''LatestVersion'' property of the corresponding ''DefinitionInformation'' object.
    */
  var CoreDefinitionVersionId: string = js.native
}
object GetCoreDefinitionVersionRequest {
  
  @scala.inline
  def apply(CoreDefinitionId: string, CoreDefinitionVersionId: string): GetCoreDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(CoreDefinitionId = CoreDefinitionId.asInstanceOf[js.Any], CoreDefinitionVersionId = CoreDefinitionVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCoreDefinitionVersionRequest]
  }
  
  @scala.inline
  implicit class GetCoreDefinitionVersionRequestMutableBuilder[Self <: GetCoreDefinitionVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoreDefinitionId(value: string): Self = StObject.set(x, "CoreDefinitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoreDefinitionVersionId(value: string): Self = StObject.set(x, "CoreDefinitionVersionId", value.asInstanceOf[js.Any])
  }
}
