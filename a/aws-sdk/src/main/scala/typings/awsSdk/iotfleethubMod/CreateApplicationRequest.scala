package typings.awsSdk.iotfleethubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationRequest extends StObject {
  
  /**
    * An optional description of the web application.
    */
  var applicationDescription: js.UndefOr[Description] = js.undefined
  
  /**
    * The name of the web application.
    */
  var applicationName: Name
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientRequestToken] = js.undefined
  
  /**
    * The ARN of the role that the web application assumes when it interacts with AWS IoT Core.  The name of the role must be in the form AWSIotFleetHub_random_string . 
    */
  var roleArn: Arn
  
  /**
    * A set of key/value pairs that you can use to manage the web application resource.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateApplicationRequest {
  
  inline def apply(applicationName: Name, roleArn: Arn): CreateApplicationRequest = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationRequest]
  }
  
  extension [Self <: CreateApplicationRequest](x: Self) {
    
    inline def setApplicationDescription(value: Description): Self = StObject.set(x, "applicationDescription", value.asInstanceOf[js.Any])
    
    inline def setApplicationDescriptionUndefined: Self = StObject.set(x, "applicationDescription", js.undefined)
    
    inline def setApplicationName(value: Name): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientRequestToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
