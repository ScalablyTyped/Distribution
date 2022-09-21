package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersRequest extends StObject {
  
  /**
    * Names of the parameters for which you want to query information. To query by parameter label, use "Name": "name:label". To query by parameter version, use "Name": "name:version".
    */
  var Names: ParameterNameList
  
  /**
    * Return decrypted secure string value. Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.
    */
  var WithDecryption: js.UndefOr[Boolean] = js.undefined
}
object GetParametersRequest {
  
  inline def apply(Names: ParameterNameList): GetParametersRequest = {
    val __obj = js.Dynamic.literal(Names = Names.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersRequest]
  }
  
  extension [Self <: GetParametersRequest](x: Self) {
    
    inline def setNames(value: ParameterNameList): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: PSParameterName*): Self = StObject.set(x, "Names", js.Array(value*))
    
    inline def setWithDecryption(value: Boolean): Self = StObject.set(x, "WithDecryption", value.asInstanceOf[js.Any])
    
    inline def setWithDecryptionUndefined: Self = StObject.set(x, "WithDecryption", js.undefined)
  }
}
