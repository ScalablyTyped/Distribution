package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorDocument extends StObject {
  
  /**
    * The object key name to use when a 4XX class error occurs.
    */
  var Key: ObjectKey = js.native
}
object ErrorDocument {
  
  @scala.inline
  def apply(Key: ObjectKey): ErrorDocument = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorDocument]
  }
  
  @scala.inline
  implicit class ErrorDocumentMutableBuilder[Self <: ErrorDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: ObjectKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
  }
}
