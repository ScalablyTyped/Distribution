package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag extends StObject {
  
  /**
    * The required name of the tag. The string value can be from 1 to 128 Unicode characters in length.
    */
  var key: TagKey
  
  /**
    * The optional value of the tag. The string value can be from 1 to 256 Unicode characters in length.
    */
  var value: TagValue
}
object Tag {
  
  inline def apply(key: TagKey, value: TagValue): Tag = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  extension [Self <: Tag](x: Self) {
    
    inline def setKey(value: TagKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TagValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
