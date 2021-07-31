package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCoreDefinitionVersionRequest extends StObject {
  
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the core definition.
    */
  var CoreDefinitionId: string
  
  /**
    * A list of cores in the core definition version.
    */
  var Cores: js.UndefOr[listOfCore] = js.undefined
}
object CreateCoreDefinitionVersionRequest {
  
  @scala.inline
  def apply(CoreDefinitionId: string): CreateCoreDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(CoreDefinitionId = CoreDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCoreDefinitionVersionRequest]
  }
  
  @scala.inline
  implicit class CreateCoreDefinitionVersionRequestMutableBuilder[Self <: CreateCoreDefinitionVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmznClientToken(value: string): Self = StObject.set(x, "AmznClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmznClientTokenUndefined: Self = StObject.set(x, "AmznClientToken", js.undefined)
    
    @scala.inline
    def setCoreDefinitionId(value: string): Self = StObject.set(x, "CoreDefinitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCores(value: listOfCore): Self = StObject.set(x, "Cores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoresUndefined: Self = StObject.set(x, "Cores", js.undefined)
    
    @scala.inline
    def setCoresVarargs(value: Core*): Self = StObject.set(x, "Cores", js.Array(value :_*))
  }
}
