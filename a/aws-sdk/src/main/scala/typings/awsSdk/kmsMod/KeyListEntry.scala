package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyListEntry extends StObject {
  
  /**
    * ARN of the key.
    */
  var KeyArn: js.UndefOr[ArnType] = js.undefined
  
  /**
    * Unique identifier of the key.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.undefined
}
object KeyListEntry {
  
  @scala.inline
  def apply(): KeyListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyListEntry]
  }
  
  @scala.inline
  implicit class KeyListEntryMutableBuilder[Self <: KeyListEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyArn(value: ArnType): Self = StObject.set(x, "KeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyArnUndefined: Self = StObject.set(x, "KeyArn", js.undefined)
    
    @scala.inline
    def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
  }
}
