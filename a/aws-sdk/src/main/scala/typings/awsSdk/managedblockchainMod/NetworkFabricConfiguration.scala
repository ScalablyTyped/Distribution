package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkFabricConfiguration extends StObject {
  
  /**
    * The edition of Amazon Managed Blockchain that the network uses. For more information, see Amazon Managed Blockchain Pricing.
    */
  var Edition: typings.awsSdk.managedblockchainMod.Edition = js.native
}
object NetworkFabricConfiguration {
  
  @scala.inline
  def apply(Edition: Edition): NetworkFabricConfiguration = {
    val __obj = js.Dynamic.literal(Edition = Edition.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkFabricConfiguration]
  }
  
  @scala.inline
  implicit class NetworkFabricConfigurationMutableBuilder[Self <: NetworkFabricConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdition(value: Edition): Self = StObject.set(x, "Edition", value.asInstanceOf[js.Any])
  }
}
