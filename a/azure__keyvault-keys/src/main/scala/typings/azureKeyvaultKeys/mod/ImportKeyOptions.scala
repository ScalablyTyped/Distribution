package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StringDictionary
import typings.azureCoreClient.mod.OperationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportKeyOptions
  extends StObject
     with OperationOptions {
  
  /**
    * Determines whether the object is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Expiry date in UTC.
    */
  var expiresOn: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates whether the private key can be exported.
    */
  var exportable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to import as a hardware key (HSM) or software key.
    */
  var hardwareProtected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Not before date in UTC.
    */
  var notBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A {@link KeyReleasePolicy} object specifying the rules under which the key can be exported.
    */
  var releasePolicy: js.UndefOr[KeyReleasePolicy] = js.undefined
  
  /**
    * Application specific metadata in the form of key-value pairs.
    */
  var tags: js.UndefOr[StringDictionary[String]] = js.undefined
}
object ImportKeyOptions {
  
  inline def apply(): ImportKeyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportKeyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportKeyOptions] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setExpiresOn(value: js.Date): Self = StObject.set(x, "expiresOn", value.asInstanceOf[js.Any])
    
    inline def setExpiresOnUndefined: Self = StObject.set(x, "expiresOn", js.undefined)
    
    inline def setExportable(value: Boolean): Self = StObject.set(x, "exportable", value.asInstanceOf[js.Any])
    
    inline def setExportableUndefined: Self = StObject.set(x, "exportable", js.undefined)
    
    inline def setHardwareProtected(value: Boolean): Self = StObject.set(x, "hardwareProtected", value.asInstanceOf[js.Any])
    
    inline def setHardwareProtectedUndefined: Self = StObject.set(x, "hardwareProtected", js.undefined)
    
    inline def setNotBefore(value: js.Date): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
    
    inline def setReleasePolicy(value: KeyReleasePolicy): Self = StObject.set(x, "releasePolicy", value.asInstanceOf[js.Any])
    
    inline def setReleasePolicyUndefined: Self = StObject.set(x, "releasePolicy", js.undefined)
    
    inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
