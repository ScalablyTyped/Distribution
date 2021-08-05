package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRdsDbStatusInfo extends StObject {
  
  /**
    * If the read replica is currently in an error state, provides the error details.
    */
  var Message: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether the read replica instance is operating normally.
    */
  var Normal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The status of the read replica instance.
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The type of status. For a read replica, the status type is read replication.
    */
  var StatusType: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRdsDbStatusInfo {
  
  inline def apply(): AwsRdsDbStatusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbStatusInfo]
  }
  
  extension [Self <: AwsRdsDbStatusInfo](x: Self) {
    
    inline def setMessage(value: NonEmptyString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setNormal(value: Boolean): Self = StObject.set(x, "Normal", value.asInstanceOf[js.Any])
    
    inline def setNormalUndefined: Self = StObject.set(x, "Normal", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusType(value: NonEmptyString): Self = StObject.set(x, "StatusType", value.asInstanceOf[js.Any])
    
    inline def setStatusTypeUndefined: Self = StObject.set(x, "StatusType", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
