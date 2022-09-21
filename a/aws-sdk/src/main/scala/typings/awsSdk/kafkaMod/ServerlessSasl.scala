package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerlessSasl extends StObject {
  
  /**
    * 
    Indicates whether IAM access control is enabled.
    
    */
  var Iam: js.UndefOr[typings.awsSdk.kafkaMod.Iam] = js.undefined
}
object ServerlessSasl {
  
  inline def apply(): ServerlessSasl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerlessSasl]
  }
  
  extension [Self <: ServerlessSasl](x: Self) {
    
    inline def setIam(value: Iam): Self = StObject.set(x, "Iam", value.asInstanceOf[js.Any])
    
    inline def setIamUndefined: Self = StObject.set(x, "Iam", js.undefined)
  }
}
