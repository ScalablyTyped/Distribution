package typings.awsSdk.serverlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutApplicationPolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationId: string
  
  /**
    * An array of policy statements applied to the application.
    */
  var Statements: listOfApplicationPolicyStatement
}
object PutApplicationPolicyRequest {
  
  inline def apply(ApplicationId: string, Statements: listOfApplicationPolicyStatement): PutApplicationPolicyRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], Statements = Statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutApplicationPolicyRequest]
  }
  
  extension [Self <: PutApplicationPolicyRequest](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setStatements(value: listOfApplicationPolicyStatement): Self = StObject.set(x, "Statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsVarargs(value: ApplicationPolicyStatement*): Self = StObject.set(x, "Statements", js.Array(value :_*))
  }
}
