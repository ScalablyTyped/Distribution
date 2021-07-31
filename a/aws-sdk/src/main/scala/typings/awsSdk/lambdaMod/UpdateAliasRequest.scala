package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAliasRequest extends StObject {
  
  /**
    * A description of the alias.
    */
  var Description: js.UndefOr[typings.awsSdk.lambdaMod.Description] = js.undefined
  
  /**
    * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typings.awsSdk.lambdaMod.FunctionName
  
  /**
    * The function version that the alias invokes.
    */
  var FunctionVersion: js.UndefOr[Version] = js.undefined
  
  /**
    * The name of the alias.
    */
  var Name: Alias
  
  /**
    * Only update the alias if the revision ID matches the ID that's specified. Use this option to avoid modifying an alias that has changed since you last read it.
    */
  var RevisionId: js.UndefOr[String] = js.undefined
  
  /**
    * The routing configuration of the alias.
    */
  var RoutingConfig: js.UndefOr[AliasRoutingConfiguration] = js.undefined
}
object UpdateAliasRequest {
  
  @scala.inline
  def apply(FunctionName: FunctionName, Name: Alias): UpdateAliasRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAliasRequest]
  }
  
  @scala.inline
  implicit class UpdateAliasRequestMutableBuilder[Self <: UpdateAliasRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setFunctionName(value: FunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionVersion(value: Version): Self = StObject.set(x, "FunctionVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionVersionUndefined: Self = StObject.set(x, "FunctionVersion", js.undefined)
    
    @scala.inline
    def setName(value: Alias): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionId(value: String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
    
    @scala.inline
    def setRoutingConfig(value: AliasRoutingConfiguration): Self = StObject.set(x, "RoutingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingConfigUndefined: Self = StObject.set(x, "RoutingConfig", js.undefined)
  }
}
