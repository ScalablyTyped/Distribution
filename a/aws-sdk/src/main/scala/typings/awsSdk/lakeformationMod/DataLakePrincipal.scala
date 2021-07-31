package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataLakePrincipal extends StObject {
  
  /**
    * An identifier for the AWS Lake Formation principal.
    */
  var DataLakePrincipalIdentifier: js.UndefOr[DataLakePrincipalString] = js.undefined
}
object DataLakePrincipal {
  
  @scala.inline
  def apply(): DataLakePrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataLakePrincipal]
  }
  
  @scala.inline
  implicit class DataLakePrincipalMutableBuilder[Self <: DataLakePrincipal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataLakePrincipalIdentifier(value: DataLakePrincipalString): Self = StObject.set(x, "DataLakePrincipalIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLakePrincipalIdentifierUndefined: Self = StObject.set(x, "DataLakePrincipalIdentifier", js.undefined)
  }
}
