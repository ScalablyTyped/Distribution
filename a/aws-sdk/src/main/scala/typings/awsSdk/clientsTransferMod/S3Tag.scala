package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Tag extends StObject {
  
  /**
    * The name assigned to the tag that you create.
    */
  var Key: S3TagKey
  
  /**
    * The value that corresponds to the key.
    */
  var Value: S3TagValue
}
object S3Tag {
  
  inline def apply(Key: S3TagKey, Value: S3TagValue): S3Tag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Tag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3Tag] (val x: Self) extends AnyVal {
    
    inline def setKey(value: S3TagKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: S3TagValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
