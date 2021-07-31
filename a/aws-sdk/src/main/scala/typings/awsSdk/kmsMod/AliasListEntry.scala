package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AliasListEntry extends StObject {
  
  /**
    * String that contains the key ARN.
    */
  var AliasArn: js.UndefOr[ArnType] = js.undefined
  
  /**
    * String that contains the alias. This value begins with alias/.
    */
  var AliasName: js.UndefOr[AliasNameType] = js.undefined
  
  /**
    * String that contains the key identifier referred to by the alias.
    */
  var TargetKeyId: js.UndefOr[KeyIdType] = js.undefined
}
object AliasListEntry {
  
  @scala.inline
  def apply(): AliasListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasListEntry]
  }
  
  @scala.inline
  implicit class AliasListEntryMutableBuilder[Self <: AliasListEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasArn(value: ArnType): Self = StObject.set(x, "AliasArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasArnUndefined: Self = StObject.set(x, "AliasArn", js.undefined)
    
    @scala.inline
    def setAliasName(value: AliasNameType): Self = StObject.set(x, "AliasName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasNameUndefined: Self = StObject.set(x, "AliasName", js.undefined)
    
    @scala.inline
    def setTargetKeyId(value: KeyIdType): Self = StObject.set(x, "TargetKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetKeyIdUndefined: Self = StObject.set(x, "TargetKeyId", js.undefined)
  }
}
