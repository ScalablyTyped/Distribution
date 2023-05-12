package typings.bitcoinComputerLib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecretOutput extends StObject {
  
  var data: String
}
object SecretOutput {
  
  inline def apply(data: String): SecretOutput = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecretOutput] (val x: Self) extends AnyVal {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
