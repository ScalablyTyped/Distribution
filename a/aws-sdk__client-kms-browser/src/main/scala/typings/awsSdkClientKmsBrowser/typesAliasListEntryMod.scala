package typings.awsSdkClientKmsBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAliasListEntryMod {
  
  @js.native
  trait AliasListEntry extends StObject {
    
    /**
      * <p>String that contains the key ARN.</p>
      */
    var AliasArn: js.UndefOr[String] = js.native
    
    /**
      * <p>String that contains the alias.</p>
      */
    var AliasName: js.UndefOr[String] = js.native
    
    /**
      * <p>String that contains the key identifier referred to by the alias.</p>
      */
    var TargetKeyId: js.UndefOr[String] = js.native
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
      def setAliasArn(value: String): Self = StObject.set(x, "AliasArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasArnUndefined: Self = StObject.set(x, "AliasArn", js.undefined)
      
      @scala.inline
      def setAliasName(value: String): Self = StObject.set(x, "AliasName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasNameUndefined: Self = StObject.set(x, "AliasName", js.undefined)
      
      @scala.inline
      def setTargetKeyId(value: String): Self = StObject.set(x, "TargetKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetKeyIdUndefined: Self = StObject.set(x, "TargetKeyId", js.undefined)
    }
  }
  
  type UnmarshalledAliasListEntry = AliasListEntry
}
