package typings.bson.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BSONRegExpExtendedLegacy extends StObject {
  
  @JSName("$options")
  var $options: String
  
  @JSName("$regex")
  var $regex: String | BSONRegExp
}
object BSONRegExpExtendedLegacy {
  
  inline def apply($options: String, $regex: String | BSONRegExp): BSONRegExpExtendedLegacy = {
    val __obj = js.Dynamic.literal($options = $options.asInstanceOf[js.Any], $regex = $regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[BSONRegExpExtendedLegacy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BSONRegExpExtendedLegacy] (val x: Self) extends AnyVal {
    
    inline def set$options(value: String): Self = StObject.set(x, "$options", value.asInstanceOf[js.Any])
    
    inline def set$regex(value: String | BSONRegExp): Self = StObject.set(x, "$regex", value.asInstanceOf[js.Any])
  }
}
