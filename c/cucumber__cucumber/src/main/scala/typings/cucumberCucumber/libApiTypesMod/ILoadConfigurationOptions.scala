package typings.cucumberCucumber.libApiTypesMod

import typings.cucumberCucumber.anon.PartialIConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILoadConfigurationOptions extends StObject {
  
  /**
    * Path to load configuration file from (defaults to `cucumber.(js|cjs|mjs|json)` if omitted).
    */
  var file: js.UndefOr[String] = js.undefined
  
  /**
    * Zero or more profile names from which to source configuration (if omitted or empty, the `default` profile will be used).
    */
  var profiles: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Ad-hoc configuration options to be applied over the top of whatever is loaded from the configuration file/profiles.
    */
  var provided: js.UndefOr[PartialIConfiguration] = js.undefined
}
object ILoadConfigurationOptions {
  
  inline def apply(): ILoadConfigurationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILoadConfigurationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILoadConfigurationOptions] (val x: Self) extends AnyVal {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setProfiles(value: js.Array[String]): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
    
    inline def setProfilesUndefined: Self = StObject.set(x, "profiles", js.undefined)
    
    inline def setProfilesVarargs(value: String*): Self = StObject.set(x, "profiles", js.Array(value*))
    
    inline def setProvided(value: PartialIConfiguration): Self = StObject.set(x, "provided", value.asInstanceOf[js.Any])
    
    inline def setProvidedUndefined: Self = StObject.set(x, "provided", js.undefined)
  }
}
