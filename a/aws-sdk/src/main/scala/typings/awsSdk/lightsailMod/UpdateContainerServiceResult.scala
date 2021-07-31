package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContainerServiceResult extends StObject {
  
  /**
    * An object that describes a container service.
    */
  var containerService: js.UndefOr[ContainerService] = js.undefined
}
object UpdateContainerServiceResult {
  
  @scala.inline
  def apply(): UpdateContainerServiceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateContainerServiceResult]
  }
  
  @scala.inline
  implicit class UpdateContainerServiceResultMutableBuilder[Self <: UpdateContainerServiceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerService(value: ContainerService): Self = StObject.set(x, "containerService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerServiceUndefined: Self = StObject.set(x, "containerService", js.undefined)
  }
}
