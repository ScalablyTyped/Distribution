package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentInfoDescription extends StObject {
  
  /**
    * The Amazon EC2 Instance ID for this information.
    */
  var Ec2InstanceId: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Ec2InstanceId] = js.undefined
  
  /**
    * The type of information retrieved.
    */
  var InfoType: js.UndefOr[EnvironmentInfoType] = js.undefined
  
  /**
    * The retrieved information. Currently contains a presigned Amazon S3 URL. The files are deleted after 15 minutes. Anyone in possession of this URL can access the files before they are deleted. Make the URL available only to trusted parties.
    */
  var Message: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Message] = js.undefined
  
  /**
    * The time stamp when this information was retrieved.
    */
  var SampleTimestamp: js.UndefOr[js.Date] = js.undefined
}
object EnvironmentInfoDescription {
  
  inline def apply(): EnvironmentInfoDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentInfoDescription]
  }
  
  extension [Self <: EnvironmentInfoDescription](x: Self) {
    
    inline def setEc2InstanceId(value: Ec2InstanceId): Self = StObject.set(x, "Ec2InstanceId", value.asInstanceOf[js.Any])
    
    inline def setEc2InstanceIdUndefined: Self = StObject.set(x, "Ec2InstanceId", js.undefined)
    
    inline def setInfoType(value: EnvironmentInfoType): Self = StObject.set(x, "InfoType", value.asInstanceOf[js.Any])
    
    inline def setInfoTypeUndefined: Self = StObject.set(x, "InfoType", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setSampleTimestamp(value: js.Date): Self = StObject.set(x, "SampleTimestamp", value.asInstanceOf[js.Any])
    
    inline def setSampleTimestampUndefined: Self = StObject.set(x, "SampleTimestamp", js.undefined)
  }
}
