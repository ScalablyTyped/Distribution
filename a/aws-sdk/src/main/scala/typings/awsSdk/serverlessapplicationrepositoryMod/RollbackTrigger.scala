package typings.awsSdk.serverlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollbackTrigger extends StObject {
  
  /**
    * This property corresponds to the content of the same name for the AWS CloudFormation RollbackTrigger
    Data Type.
    */
  var Arn: string
  
  /**
    * This property corresponds to the content of the same name for the AWS CloudFormation RollbackTrigger
    Data Type.
    */
  var Type: string
}
object RollbackTrigger {
  
  @scala.inline
  def apply(Arn: string, Type: string): RollbackTrigger = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollbackTrigger]
  }
  
  @scala.inline
  implicit class RollbackTriggerMutableBuilder[Self <: RollbackTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: string): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
