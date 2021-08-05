package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetGroup extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var Arn: js.UndefOr[String] = js.undefined
}
object TargetGroup {
  
  inline def apply(): TargetGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetGroup]
  }
  
  extension [Self <: TargetGroup](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
