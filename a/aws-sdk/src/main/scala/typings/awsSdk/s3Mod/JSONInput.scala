package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONInput extends StObject {
  
  /**
    * The type of JSON. Valid values: Document, Lines.
    */
  var Type: js.UndefOr[JSONType] = js.native
}
object JSONInput {
  
  @scala.inline
  def apply(): JSONInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONInput]
  }
  
  @scala.inline
  implicit class JSONInputMutableBuilder[Self <: JSONInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: JSONType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
