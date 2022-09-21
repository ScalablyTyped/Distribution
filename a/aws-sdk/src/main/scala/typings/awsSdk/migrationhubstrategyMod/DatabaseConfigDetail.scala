package typings.awsSdk.migrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseConfigDetail extends StObject {
  
  /**
    *  AWS Secrets Manager key that holds the credentials that you use to connect to a database. 
    */
  var secretName: js.UndefOr[String] = js.undefined
}
object DatabaseConfigDetail {
  
  inline def apply(): DatabaseConfigDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseConfigDetail]
  }
  
  extension [Self <: DatabaseConfigDetail](x: Self) {
    
    inline def setSecretName(value: String): Self = StObject.set(x, "secretName", value.asInstanceOf[js.Any])
    
    inline def setSecretNameUndefined: Self = StObject.set(x, "secretName", js.undefined)
  }
}
