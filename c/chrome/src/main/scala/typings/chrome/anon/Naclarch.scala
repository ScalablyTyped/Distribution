package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Naclarch extends StObject {
  
  var nacl_arch: js.UndefOr[String] = js.undefined
  
  var sub_package_path: String
}
object Naclarch {
  
  inline def apply(sub_package_path: String): Naclarch = {
    val __obj = js.Dynamic.literal(sub_package_path = sub_package_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Naclarch]
  }
  
  extension [Self <: Naclarch](x: Self) {
    
    inline def setNacl_arch(value: String): Self = StObject.set(x, "nacl_arch", value.asInstanceOf[js.Any])
    
    inline def setNacl_archUndefined: Self = StObject.set(x, "nacl_arch", js.undefined)
    
    inline def setSub_package_path(value: String): Self = StObject.set(x, "sub_package_path", value.asInstanceOf[js.Any])
  }
}
