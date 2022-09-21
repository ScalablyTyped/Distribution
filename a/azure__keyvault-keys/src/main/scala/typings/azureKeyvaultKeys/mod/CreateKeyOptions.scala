package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StringDictionary
import typings.azureCoreClient.mod.OperationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateKeyOptions
  extends StObject
     with OperationOptions {
  
  /**
    * Elliptic curve name. For valid values, see KeyCurveName.
    * Possible values include: 'P-256', 'P-384', 'P-521', 'P-256K'
    */
  var curve: js.UndefOr[KeyCurveName] = js.undefined
  
  /**
    * Determines whether the object is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Expiry date in UTC.
    */
  val expiresOn: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates whether the private key can be exported.
    */
  var exportable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to import as a hardware key (HSM) or software key.
    */
  var hsm: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Json web key operations. For more
    * information on possible key operations, see KeyOperation.
    */
  var keyOps: js.UndefOr[js.Array[KeyOperation]] = js.undefined
  
  /**
    * The key size in bits. For example: 2048, 3072, or 4096 for RSA.
    */
  var keySize: js.UndefOr[Double] = js.undefined
  
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
object CreateKeyOptions {
  
  inline def apply(): CreateKeyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateKeyOptions]
  }
  
  extension [Self <: CreateKeyOptions](x: Self) {
    
    inline def setCurve(value: KeyCurveName): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    inline def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setExpiresOn(value: js.Date): Self = StObject.set(x, "expiresOn", value.asInstanceOf[js.Any])
    
    inline def setExpiresOnUndefined: Self = StObject.set(x, "expiresOn", js.undefined)
    
    inline def setExportable(value: Boolean): Self = StObject.set(x, "exportable", value.asInstanceOf[js.Any])
    
    inline def setExportableUndefined: Self = StObject.set(x, "exportable", js.undefined)
    
    inline def setHsm(value: Boolean): Self = StObject.set(x, "hsm", value.asInstanceOf[js.Any])
    
    inline def setHsmUndefined: Self = StObject.set(x, "hsm", js.undefined)
    
    inline def setKeyOps(value: js.Array[KeyOperation]): Self = StObject.set(x, "keyOps", value.asInstanceOf[js.Any])
    
    inline def setKeyOpsUndefined: Self = StObject.set(x, "keyOps", js.undefined)
    
    inline def setKeyOpsVarargs(value: KeyOperation*): Self = StObject.set(x, "keyOps", js.Array(value*))
    
    inline def setKeySize(value: Double): Self = StObject.set(x, "keySize", value.asInstanceOf[js.Any])
    
    inline def setKeySizeUndefined: Self = StObject.set(x, "keySize", js.undefined)
    
    inline def setNotBefore(value: js.Date): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
    
    inline def setReleasePolicy(value: KeyReleasePolicy): Self = StObject.set(x, "releasePolicy", value.asInstanceOf[js.Any])
    
    inline def setReleasePolicyUndefined: Self = StObject.set(x, "releasePolicy", js.undefined)
    
    inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
