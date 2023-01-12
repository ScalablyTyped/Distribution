package typings.awsSdkClientKmsBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAliasListEntryMod {
  
  trait AliasListEntry extends StObject {
    
    /**
      * <p>String that contains the key ARN.</p>
      */
    var AliasArn: js.UndefOr[String] = js.undefined
    
    /**
      * <p>String that contains the alias.</p>
      */
    var AliasName: js.UndefOr[String] = js.undefined
    
    /**
      * <p>String that contains the key identifier referred to by the alias.</p>
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
      
      inline def setTargetKeyId(value: String): Self = StObject.set(x, "TargetKeyId", value.asInstanceOf[js.Any])
      
      inline def setTargetKeyIdUndefined: Self = StObject.set(x, "TargetKeyId", js.undefined)
    }
  }
  
  type UnmarshalledAliasListEntry = AliasListEntry
}
