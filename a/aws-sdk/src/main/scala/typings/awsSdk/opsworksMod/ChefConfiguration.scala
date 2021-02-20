package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChefConfiguration extends StObject {
  
  /**
    * The Berkshelf version.
    */
  var BerkshelfVersion: js.UndefOr[String] = js.native
  
  /**
    * Whether to enable Berkshelf.
    */
  var ManageBerkshelf: js.UndefOr[Boolean] = js.native
}
object ChefConfiguration {
  
  @scala.inline
  def apply(): ChefConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChefConfiguration]
  }
  
  @scala.inline
  implicit class ChefConfigurationMutableBuilder[Self <: ChefConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBerkshelfVersion(value: String): Self = StObject.set(x, "BerkshelfVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBerkshelfVersionUndefined: Self = StObject.set(x, "BerkshelfVersion", js.undefined)
    
    @scala.inline
    def setManageBerkshelf(value: Boolean): Self = StObject.set(x, "ManageBerkshelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManageBerkshelfUndefined: Self = StObject.set(x, "ManageBerkshelf", js.undefined)
  }
}
