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
  
  @scala.inline
  def apply(): AwsRdsDbStatusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbStatusInfo]
  }
  
  @scala.inline
  implicit class AwsRdsDbStatusInfoMutableBuilder[Self <: AwsRdsDbStatusInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: NonEmptyString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setNormal(value: Boolean): Self = StObject.set(x, "Normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalUndefined: Self = StObject.set(x, "Normal", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusType(value: NonEmptyString): Self = StObject.set(x, "StatusType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusTypeUndefined: Self = StObject.set(x, "StatusType", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
