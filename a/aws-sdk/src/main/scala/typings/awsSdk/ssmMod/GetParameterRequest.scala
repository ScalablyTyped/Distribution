package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameterRequest extends StObject {
  
  /**
    * The name of the parameter you want to query.
    */
  var Name: PSParameterName
  
  /**
    * Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.
    */
  var WithDecryption: js.UndefOr[Boolean] = js.undefined
}
object GetParameterRequest {
  
  inline def apply(Name: PSParameterName): GetParameterRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameterRequest]
  }
  
  extension [Self <: GetParameterRequest](x: Self) {
    
    inline def setName(value: PSParameterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setWithDecryption(value: Boolean): Self = StObject.set(x, "WithDecryption", value.asInstanceOf[js.Any])
    
    inline def setWithDecryptionUndefined: Self = StObject.set(x, "WithDecryption", js.undefined)
  }
}
