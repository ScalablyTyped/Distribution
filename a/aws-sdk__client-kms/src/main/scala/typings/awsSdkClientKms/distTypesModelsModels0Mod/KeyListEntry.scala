package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyListEntry extends StObject {
  
  /**
    * <p>ARN of the key.</p>
    */
  var KeyArn: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Unique identifier of the key.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
}
object KeyListEntry {
  
  inline def apply(): KeyListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyListEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyListEntry] (val x: Self) extends AnyVal {
    
    inline def setKeyArn(value: String): Self = StObject.set(x, "KeyArn", value.asInstanceOf[js.Any])
    
    inline def setKeyArnUndefined: Self = StObject.set(x, "KeyArn", js.undefined)
    
    inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
  }
}
