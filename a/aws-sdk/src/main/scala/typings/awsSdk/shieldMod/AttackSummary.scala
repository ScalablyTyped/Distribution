package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttackSummary extends StObject {
  
  /**
    * The unique identifier (ID) of the attack.
    */
  var AttackId: js.UndefOr[String] = js.native
  
  /**
    * The list of attacks for a specified time period.
    */
  var AttackVectors: js.UndefOr[AttackVectorDescriptionList] = js.native
  
  /**
    * The end time of the attack, in Unix time in seconds. For more information see timestamp.
    */
  var EndTime: js.UndefOr[AttackTimestamp] = js.native
  
  /**
    * The ARN (Amazon Resource Name) of the resource that was attacked.
    */
  var ResourceArn: js.UndefOr[String] = js.native
  
  /**
    * The start time of the attack, in Unix time in seconds. For more information see timestamp.
    */
  var StartTime: js.UndefOr[AttackTimestamp] = js.native
}
object AttackSummary {
  
  @scala.inline
  def apply(): AttackSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttackSummary]
  }
  
  @scala.inline
  implicit class AttackSummaryMutableBuilder[Self <: AttackSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttackId(value: String): Self = StObject.set(x, "AttackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttackIdUndefined: Self = StObject.set(x, "AttackId", js.undefined)
    
    @scala.inline
    def setAttackVectors(value: AttackVectorDescriptionList): Self = StObject.set(x, "AttackVectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttackVectorsUndefined: Self = StObject.set(x, "AttackVectors", js.undefined)
    
    @scala.inline
    def setAttackVectorsVarargs(value: AttackVectorDescription*): Self = StObject.set(x, "AttackVectors", js.Array(value :_*))
    
    @scala.inline
    def setEndTime(value: AttackTimestamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    @scala.inline
    def setStartTime(value: AttackTimestamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
