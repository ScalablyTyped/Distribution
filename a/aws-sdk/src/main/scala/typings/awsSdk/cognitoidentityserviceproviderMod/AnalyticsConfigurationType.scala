package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsConfigurationType extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an Amazon Pinpoint project. You can use the Amazon Pinpoint project to integrate with the chosen user pool Client. Amazon Cognito publishes events to the Amazon Pinpoint project that the app ARN declares.
    */
  var ApplicationArn: js.UndefOr[ArnType] = js.undefined
  
  /**
    * The application ID for an Amazon Pinpoint application.
    */
  var ApplicationId: js.UndefOr[HexStringType] = js.undefined
  
  /**
    * The external ID.
    */
  var ExternalId: js.UndefOr[StringType] = js.undefined
  
  /**
    * The ARN of an Identity and Access Management role that authorizes Amazon Cognito to publish events to Amazon Pinpoint analytics.
    */
  var RoleArn: js.UndefOr[ArnType] = js.undefined
  
  /**
    * If UserDataShared is true, Amazon Cognito includes user data in the events that it publishes to Amazon Pinpoint analytics.
    */
  var UserDataShared: js.UndefOr[BooleanType] = js.undefined
}
object AnalyticsConfigurationType {
  
  inline def apply(): AnalyticsConfigurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsConfigurationType]
  }
  
  extension [Self <: AnalyticsConfigurationType](x: Self) {
    
    inline def setApplicationArn(value: ArnType): Self = StObject.set(x, "ApplicationArn", value.asInstanceOf[js.Any])
    
    inline def setApplicationArnUndefined: Self = StObject.set(x, "ApplicationArn", js.undefined)
    
    inline def setApplicationId(value: HexStringType): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    inline def setExternalId(value: StringType): Self = StObject.set(x, "ExternalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "ExternalId", js.undefined)
    
    inline def setRoleArn(value: ArnType): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setUserDataShared(value: BooleanType): Self = StObject.set(x, "UserDataShared", value.asInstanceOf[js.Any])
    
    inline def setUserDataSharedUndefined: Self = StObject.set(x, "UserDataShared", js.undefined)
  }
}
