package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AliasListEntry extends StObject {
  
  /**
    * <p>String that contains the key ARN.</p>
    */
  var AliasArn: js.UndefOr[String] = js.undefined
  
  /**
    * <p>String that contains the alias. This value begins with <code>alias/</code>.</p>
    */
  var AliasName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Date and time that the alias was most recently created in the account and Region.
    *       Formatted as Unix time.</p>
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * <p>Date and time that the alias was most recently associated with a KMS key in the account
    *       and Region. Formatted as Unix time.</p>
    */
  var LastUpdatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * <p>String that contains the key identifier of the KMS key associated with the alias.</p>
    */
  var TargetKeyId: js.UndefOr[String] = js.undefined
}
object AliasListEntry {
  
  inline def apply(): AliasListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasListEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AliasListEntry] (val x: Self) extends AnyVal {
    
    inline def setAliasArn(value: String): Self = StObject.set(x, "AliasArn", value.asInstanceOf[js.Any])
    
    inline def setAliasArnUndefined: Self = StObject.set(x, "AliasArn", js.undefined)
    
    inline def setAliasName(value: String): Self = StObject.set(x, "AliasName", value.asInstanceOf[js.Any])
    
    inline def setAliasNameUndefined: Self = StObject.set(x, "AliasName", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setLastUpdatedDate(value: js.Date): Self = StObject.set(x, "LastUpdatedDate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateUndefined: Self = StObject.set(x, "LastUpdatedDate", js.undefined)
    
    inline def setTargetKeyId(value: String): Self = StObject.set(x, "TargetKeyId", value.asInstanceOf[js.Any])
    
    inline def setTargetKeyIdUndefined: Self = StObject.set(x, "TargetKeyId", js.undefined)
  }
}
