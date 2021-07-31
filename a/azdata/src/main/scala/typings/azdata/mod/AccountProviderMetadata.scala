package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountProviderMetadata extends StObject {
  
  /**
    * Any arguments that identify an instantiation of the provider
    */
  var args: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Display name of the provider
    */
  var displayName: String
  
  /**
    * The identifier of the provider
    */
  var id: String
  
  /**
    * Optional settings that identify an instantiation of a provider
    */
  var settings: js.UndefOr[js.Object] = js.undefined
}
object AccountProviderMetadata {
  
  @scala.inline
  def apply(displayName: String, id: String): AccountProviderMetadata = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountProviderMetadata]
  }
  
  @scala.inline
  implicit class AccountProviderMetadataMutableBuilder[Self <: AccountProviderMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: js.Object): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
  }
}
