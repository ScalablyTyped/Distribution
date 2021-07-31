package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContainerServicePowersResult extends StObject {
  
  /**
    * An array of objects that describe the powers that can be specified for a container service.
    */
  var powers: js.UndefOr[ContainerServicePowerList] = js.undefined
}
object GetContainerServicePowersResult {
  
  @scala.inline
  def apply(): GetContainerServicePowersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContainerServicePowersResult]
  }
  
  @scala.inline
  implicit class GetContainerServicePowersResultMutableBuilder[Self <: GetContainerServicePowersResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPowers(value: ContainerServicePowerList): Self = StObject.set(x, "powers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowersUndefined: Self = StObject.set(x, "powers", js.undefined)
    
    @scala.inline
    def setPowersVarargs(value: ContainerServicePower*): Self = StObject.set(x, "powers", js.Array(value :_*))
  }
}
