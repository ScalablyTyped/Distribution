package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceDefinitionVersion extends StObject {
  
  /**
    * A list of resources.
    */
  var Resources: js.UndefOr[listOfResource] = js.undefined
}
object ResourceDefinitionVersion {
  
  @scala.inline
  def apply(): ResourceDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDefinitionVersion]
  }
  
  @scala.inline
  implicit class ResourceDefinitionVersionMutableBuilder[Self <: ResourceDefinitionVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResources(value: listOfResource): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: Resource*): Self = StObject.set(x, "Resources", js.Array(value :_*))
  }
}
