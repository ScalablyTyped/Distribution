package typings.cyclonedx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hash extends StObject {
  
  var alg: HashAlgoritm
  
  var content: String
}
object Hash {
  
  inline def apply(alg: HashAlgoritm, content: String): Hash = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hash] (val x: Self) extends AnyVal {
    
    inline def setAlg(value: HashAlgoritm): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
