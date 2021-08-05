package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttackSummary extends StObject {
  
  /**
    * The unique identifier (ID) of the attack.
    */
  var AttackId: js.UndefOr[String] = js.undefined
  
  /**
    * The list of attacks for a specified time period.
    */
  var AttackVectors: js.UndefOr[AttackVectorDescriptionList] = js.undefined
  
  /**
    * The end time of the attack, in Unix time in seconds. For more information see timestamp.
    */
  var EndTime: js.UndefOr[AttackTimestamp] = js.undefined
  
  /**
    * The ARN (Amazon Resource Name) of the resource that was attacked.
    */
  var ResourceArn: js.UndefOr[String] = js.undefined
  
  /**
    * The start time of the attack, in Unix time in seconds. For more information see timestamp.
    */
  var StartTime: js.UndefOr[AttackTimestamp] = js.undefined
}
object AttackSummary {
  
  inline def apply(): AttackSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttackSummary]
  }
  
  extension [Self <: AttackSummary](x: Self) {
    
    inline def setAttackId(value: String): Self = StObject.set(x, "AttackId", value.asInstanceOf[js.Any])
    
    inline def setAttackIdUndefined: Self = StObject.set(x, "AttackId", js.undefined)
    
    inline def setAttackVectors(value: AttackVectorDescriptionList): Self = StObject.set(x, "AttackVectors", value.asInstanceOf[js.Any])
    
    inline def setAttackVectorsUndefined: Self = StObject.set(x, "AttackVectors", js.undefined)
    
    inline def setAttackVectorsVarargs(value: AttackVectorDescription*): Self = StObject.set(x, "AttackVectors", js.Array(value :_*))
    
    inline def setEndTime(value: AttackTimestamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setStartTime(value: AttackTimestamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
