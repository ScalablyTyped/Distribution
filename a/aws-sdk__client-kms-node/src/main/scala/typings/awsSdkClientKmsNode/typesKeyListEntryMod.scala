package typings.awsSdkClientKmsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKeyListEntryMod {
  
  @js.native
  trait KeyListEntry extends StObject {
    
    /**
      * <p>ARN of the key.</p>
      */
    var KeyArn: js.UndefOr[String] = js.native
    
    /**
      * <p>Unique identifier of the key.</p>
      */
    var KeyId: js.UndefOr[String] = js.native
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
      def setKeyArn(value: String): Self = StObject.set(x, "KeyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyArnUndefined: Self = StObject.set(x, "KeyArn", js.undefined)
      
      @scala.inline
      def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    }
  }
  
  type UnmarshalledKeyListEntry = KeyListEntry
}
