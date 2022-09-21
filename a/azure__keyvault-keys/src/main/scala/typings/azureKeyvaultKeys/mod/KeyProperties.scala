package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyProperties extends StObject {
  
  /**
    * Creation time in UTC.
    * **NOTE: This property will not be serialized. It can only be populated by
    * the server.**
    */
  val createdOn: js.UndefOr[js.Date] = js.undefined
  
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
    * Key identifier.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * True if the secret's lifetime is managed by
    * key vault. If this is a secret backing a certificate, then managed will be
    * true.
    * **NOTE: This property will not be serialized. It can only be populated by
    * the server.**
    */
  val managed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the key.
    */
  var name: String
  
  /**
    * Not before date in UTC.
    */
  var notBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The retention dates of the softDelete data.
    * The value should be `>=7` and `<=90` when softDelete enabled.
    * **NOTE: This property will not be serialized. It can only be populated by the server.**
    */
  var recoverableDays: js.UndefOr[Double] = js.undefined
  
  /**
    * Reflects the deletion recovery level currently in effect for keys in the current vault.
    * If it contains 'Purgeable' the key can be permanently deleted by a privileged
    * user; otherwise, only the system can purge the key, at the end of the
    * retention interval. Possible values include: 'Purgeable',
    * 'Recoverable+Purgeable', 'Recoverable',
    * 'Recoverable+ProtectedSubscription'
    * **NOTE: This property will not be serialized. It can only be populated by
    * the server.**
    */
  val recoveryLevel: js.UndefOr[DeletionRecoveryLevel] = js.undefined
  
  /**
    * A {@link KeyReleasePolicy} object specifying the rules under which the key can be exported.
    */
  var releasePolicy: js.UndefOr[KeyReleasePolicy] = js.undefined
  
  /**
    * Application specific metadata in the form of key-value pairs.
    */
  var tags: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Last updated time in UTC.
    * **NOTE: This property will not be serialized. It can only be populated by
    * the server.**
    */
  val updatedOn: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The vault URI.
    */
  var vaultUrl: String
  
  /**
    * The version of the key. May be undefined.
    */
  var version: js.UndefOr[String] = js.undefined
}
object KeyProperties {
  
  inline def apply(name: String, vaultUrl: String): KeyProperties = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], vaultUrl = vaultUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyProperties]
  }
  
  extension [Self <: KeyProperties](x: Self) {
    
    inline def setCreatedOn(value: js.Date): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    inline def setCreatedOnUndefined: Self = StObject.set(x, "createdOn", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setExpiresOn(value: js.Date): Self = StObject.set(x, "expiresOn", value.asInstanceOf[js.Any])
    
    inline def setExpiresOnUndefined: Self = StObject.set(x, "expiresOn", js.undefined)
    
    inline def setExportable(value: Boolean): Self = StObject.set(x, "exportable", value.asInstanceOf[js.Any])
    
    inline def setExportableUndefined: Self = StObject.set(x, "exportable", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setManaged(value: Boolean): Self = StObject.set(x, "managed", value.asInstanceOf[js.Any])
    
    inline def setManagedUndefined: Self = StObject.set(x, "managed", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNotBefore(value: js.Date): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
    
    inline def setRecoverableDays(value: Double): Self = StObject.set(x, "recoverableDays", value.asInstanceOf[js.Any])
    
    inline def setRecoverableDaysUndefined: Self = StObject.set(x, "recoverableDays", js.undefined)
    
    inline def setRecoveryLevel(value: DeletionRecoveryLevel): Self = StObject.set(x, "recoveryLevel", value.asInstanceOf[js.Any])
    
    inline def setRecoveryLevelUndefined: Self = StObject.set(x, "recoveryLevel", js.undefined)
    
    inline def setReleasePolicy(value: KeyReleasePolicy): Self = StObject.set(x, "releasePolicy", value.asInstanceOf[js.Any])
    
    inline def setReleasePolicyUndefined: Self = StObject.set(x, "releasePolicy", js.undefined)
    
    inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setUpdatedOn(value: js.Date): Self = StObject.set(x, "updatedOn", value.asInstanceOf[js.Any])
    
    inline def setUpdatedOnUndefined: Self = StObject.set(x, "updatedOn", js.undefined)
    
    inline def setVaultUrl(value: String): Self = StObject.set(x, "vaultUrl", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
