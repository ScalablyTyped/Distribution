package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRdsDbParameterGroup extends StObject {
  
  /**
    * 
    */
  var DbParameterGroupName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * 
    */
  var ParameterApplyStatus: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRdsDbParameterGroup {
  
  @scala.inline
  def apply(): AwsRdsDbParameterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbParameterGroup]
  }
  
  @scala.inline
  implicit class AwsRdsDbParameterGroupMutableBuilder[Self <: AwsRdsDbParameterGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDbParameterGroupName(value: NonEmptyString): Self = StObject.set(x, "DbParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbParameterGroupNameUndefined: Self = StObject.set(x, "DbParameterGroupName", js.undefined)
    
    @scala.inline
    def setParameterApplyStatus(value: NonEmptyString): Self = StObject.set(x, "ParameterApplyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterApplyStatusUndefined: Self = StObject.set(x, "ParameterApplyStatus", js.undefined)
  }
}
