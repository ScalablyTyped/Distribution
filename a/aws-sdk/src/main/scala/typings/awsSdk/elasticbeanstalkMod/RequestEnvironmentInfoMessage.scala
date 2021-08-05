package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestEnvironmentInfoMessage extends StObject {
  
  /**
    * The ID of the environment of the requested data. If no such environment is found, RequestEnvironmentInfo returns an InvalidParameterValue error.  Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
    */
  var EnvironmentId: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentId] = js.undefined
  
  /**
    * The name of the environment of the requested data. If no such environment is found, RequestEnvironmentInfo returns an InvalidParameterValue error.  Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
    */
  var EnvironmentName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.undefined
  
  /**
    * The type of information to request.
    */
  var InfoType: EnvironmentInfoType
}
object RequestEnvironmentInfoMessage {
  
  inline def apply(InfoType: EnvironmentInfoType): RequestEnvironmentInfoMessage = {
    val __obj = js.Dynamic.literal(InfoType = InfoType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestEnvironmentInfoMessage]
  }
  
  extension [Self <: RequestEnvironmentInfoMessage](x: Self) {
    
    inline def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdUndefined: Self = StObject.set(x, "EnvironmentId", js.undefined)
    
    inline def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNameUndefined: Self = StObject.set(x, "EnvironmentName", js.undefined)
    
    inline def setInfoType(value: EnvironmentInfoType): Self = StObject.set(x, "InfoType", value.asInstanceOf[js.Any])
  }
}
