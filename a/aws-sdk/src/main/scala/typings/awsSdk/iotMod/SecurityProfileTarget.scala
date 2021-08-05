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
  
  inline def apply(arn: SecurityProfileTargetArn): SecurityProfileTarget = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityProfileTarget]
  }
  
  extension [Self <: SecurityProfileTarget](x: Self) {
    
    inline def setArn(value: SecurityProfileTargetArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
