package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketInventoryConfigurationOutput extends StObject {
  
  /**
    * Specifies the inventory configuration.
    */
  var InventoryConfiguration: js.UndefOr[typings.awsSdk.s3Mod.InventoryConfiguration] = js.native
}
object GetBucketInventoryConfigurationOutput {
  
  @scala.inline
  def apply(): GetBucketInventoryConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketInventoryConfigurationOutput]
  }
  
  @scala.inline
  implicit class GetBucketInventoryConfigurationOutputMutableBuilder[Self <: GetBucketInventoryConfigurationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInventoryConfiguration(value: InventoryConfiguration): Self = StObject.set(x, "InventoryConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventoryConfigurationUndefined: Self = StObject.set(x, "InventoryConfiguration", js.undefined)
  }
}
