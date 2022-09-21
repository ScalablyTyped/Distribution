package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StringDictionary
import typings.azureCoreClient.mod.OperationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateKeyPropertiesOptions
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
    * Json web key operations. For more
    * information on possible key operations, see KeyOperation.
    */
  var keyOps: js.UndefOr[js.Array[KeyOperation]] = js.undefined
  
  /**
    * Not before date in UTC.
    */
  var notBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A {@link KeyReleasePolicy} object specifying the rules under which the key can be exported.
    * Only valid if the key is marked exportable, which cannot be changed after key creation.
    */
  var releasePolicy: js.UndefOr[KeyReleasePolicy] = js.undefined
  
  /**
    * Application specific metadata in the form of key-value pairs.
    */
  var tags: js.UndefOr[StringDictionary[String]] = js.undefined
}
object UpdateKeyPropertiesOptions {
  
  inline def apply(): UpdateKeyPropertiesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateKeyPropertiesOptions]
  }
  
  extension [Self <: UpdateKeyPropertiesOptions](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setExpiresOn(value: js.Date): Self = StObject.set(x, "expiresOn", value.asInstanceOf[js.Any])
    
    inline def setExpiresOnUndefined: Self = StObject.set(x, "expiresOn", js.undefined)
    
    inline def setKeyOps(value: js.Array[KeyOperation]): Self = StObject.set(x, "keyOps", value.asInstanceOf[js.Any])
    
    inline def setKeyOpsUndefined: Self = StObject.set(x, "keyOps", js.undefined)
    
    inline def setKeyOpsVarargs(value: KeyOperation*): Self = StObject.set(x, "keyOps", js.Array(value*))
    
    inline def setNotBefore(value: js.Date): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
    
    inline def setReleasePolicy(value: KeyReleasePolicy): Self = StObject.set(x, "releasePolicy", value.asInstanceOf[js.Any])
    
    inline def setReleasePolicyUndefined: Self = StObject.set(x, "releasePolicy", js.undefined)
    
    inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
