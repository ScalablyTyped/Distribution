package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollbackTrigger extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the rollback trigger. If a specified trigger is missing, the entire stack operation fails and is rolled back. 
    */
  var Arn: typings.awsSdk.cloudformationMod.Arn
  
  /**
    * The resource type of the rollback trigger. Currently, AWS::CloudWatch::Alarm is the only supported resource type.
    */
  var Type: typings.awsSdk.cloudformationMod.Type
}
object RollbackTrigger {
  
  @scala.inline
  def apply(Arn: Arn, Type: Type): RollbackTrigger = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollbackTrigger]
  }
  
  @scala.inline
  implicit class RollbackTriggerMutableBuilder[Self <: RollbackTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
