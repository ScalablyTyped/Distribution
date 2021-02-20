package typings.awsSdk.serverlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutApplicationPolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationId: string = js.native
  
  /**
    * An array of policy statements applied to the application.
    */
  var Statements: listOfApplicationPolicyStatement = js.native
}
object PutApplicationPolicyRequest {
  
  @scala.inline
  def apply(ApplicationId: string, Statements: listOfApplicationPolicyStatement): PutApplicationPolicyRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], Statements = Statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutApplicationPolicyRequest]
  }
  
  @scala.inline
  implicit class PutApplicationPolicyRequestMutableBuilder[Self <: PutApplicationPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatements(value: listOfApplicationPolicyStatement): Self = StObject.set(x, "Statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsVarargs(value: ApplicationPolicyStatement*): Self = StObject.set(x, "Statements", js.Array(value :_*))
  }
}
