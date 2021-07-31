package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityProfileTarget extends StObject {
  
  /**
    * The ARN of the security profile.
    */
  var arn: SecurityProfileTargetArn
}
object SecurityProfileTarget {
  
  @scala.inline
  def apply(arn: SecurityProfileTargetArn): SecurityProfileTarget = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityProfileTarget]
  }
  
  @scala.inline
  implicit class SecurityProfileTargetMutableBuilder[Self <: SecurityProfileTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: SecurityProfileTargetArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
