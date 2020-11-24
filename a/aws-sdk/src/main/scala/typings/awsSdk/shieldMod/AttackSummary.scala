package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttackSummary extends js.Object {
  
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
  implicit class AttackSummaryOps[Self <: AttackSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttackId(value: String): Self = this.set("AttackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttackId: Self = this.set("AttackId", js.undefined)
    
    @scala.inline
    def setAttackVectorsVarargs(value: AttackVectorDescription*): Self = this.set("AttackVectors", js.Array(value :_*))
    
    @scala.inline
    def setAttackVectors(value: AttackVectorDescriptionList): Self = this.set("AttackVectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttackVectors: Self = this.set("AttackVectors", js.undefined)
    
    @scala.inline
    def setEndTime(value: AttackTimestamp): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    
    @scala.inline
    def setResourceArn(value: String): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceArn: Self = this.set("ResourceArn", js.undefined)
    
    @scala.inline
    def setStartTime(value: AttackTimestamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
  }
}
