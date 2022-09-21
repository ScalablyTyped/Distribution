package typings.awsSdk.identitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  /**
    * The family name of the user.
    */
  var FamilyName: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * A string containing a formatted version of the name for display.
    */
  var Formatted: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * The given name of the user.
    */
  var GivenName: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * The honorific prefix of the user. For example, "Dr."
    */
  var HonorificPrefix: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * The honorific suffix of the user. For example, "M.D."
    */
  var HonorificSuffix: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * The middle name of the user.
    */
  var MiddleName: js.UndefOr[SensitiveStringType] = js.undefined
}
object Name {
  
  inline def apply(): Name = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setFamilyName(value: SensitiveStringType): Self = StObject.set(x, "FamilyName", value.asInstanceOf[js.Any])
    
    inline def setFamilyNameUndefined: Self = StObject.set(x, "FamilyName", js.undefined)
    
    inline def setFormatted(value: SensitiveStringType): Self = StObject.set(x, "Formatted", value.asInstanceOf[js.Any])
    
    inline def setFormattedUndefined: Self = StObject.set(x, "Formatted", js.undefined)
    
    inline def setGivenName(value: SensitiveStringType): Self = StObject.set(x, "GivenName", value.asInstanceOf[js.Any])
    
    inline def setGivenNameUndefined: Self = StObject.set(x, "GivenName", js.undefined)
    
    inline def setHonorificPrefix(value: SensitiveStringType): Self = StObject.set(x, "HonorificPrefix", value.asInstanceOf[js.Any])
    
    inline def setHonorificPrefixUndefined: Self = StObject.set(x, "HonorificPrefix", js.undefined)
    
    inline def setHonorificSuffix(value: SensitiveStringType): Self = StObject.set(x, "HonorificSuffix", value.asInstanceOf[js.Any])
    
    inline def setHonorificSuffixUndefined: Self = StObject.set(x, "HonorificSuffix", js.undefined)
    
    inline def setMiddleName(value: SensitiveStringType): Self = StObject.set(x, "MiddleName", value.asInstanceOf[js.Any])
    
    inline def setMiddleNameUndefined: Self = StObject.set(x, "MiddleName", js.undefined)
  }
}
