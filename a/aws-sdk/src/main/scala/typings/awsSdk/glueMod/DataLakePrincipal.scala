package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataLakePrincipal extends StObject {
  
  /**
    * An identifier for the Lake Formation principal.
    */
  var DataLakePrincipalIdentifier: js.UndefOr[DataLakePrincipalString] = js.undefined
}
object DataLakePrincipal {
  
  inline def apply(): DataLakePrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataLakePrincipal]
  }
  
  extension [Self <: DataLakePrincipal](x: Self) {
    
    inline def setDataLakePrincipalIdentifier(value: DataLakePrincipalString): Self = StObject.set(x, "DataLakePrincipalIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDataLakePrincipalIdentifierUndefined: Self = StObject.set(x, "DataLakePrincipalIdentifier", js.undefined)
  }
}
