package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Keyword_ extends StObject {
  
  val basename: String
  
  val custom: Boolean
  
  val name: String
  
  val prefix: String
  
  val vendor: String
}
object Keyword_ {
  
  inline def apply(basename: String, custom: Boolean, name: String, prefix: String, vendor: String): Keyword_ = {
    val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyword_]
  }
  
  extension [Self <: Keyword_](x: Self) {
    
    inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
    
    inline def setCustom(value: Boolean): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
  }
}
