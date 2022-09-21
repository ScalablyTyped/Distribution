package typings.awsSdk.emrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerProvider extends StObject {
  
  /**
    * The ID of the container cluster.
    */
  var id: ClusterId
  
  /**
    * The information about the container cluster.
    */
  var info: js.UndefOr[ContainerInfo] = js.undefined
  
  /**
    * The type of the container provider. EKS is the only supported type as of now.
    */
  var `type`: ContainerProviderType
}
object ContainerProvider {
  
  inline def apply(id: ClusterId, `type`: ContainerProviderType): ContainerProvider = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerProvider]
  }
  
  extension [Self <: ContainerProvider](x: Self) {
    
    inline def setId(value: ClusterId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: ContainerInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setType(value: ContainerProviderType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
