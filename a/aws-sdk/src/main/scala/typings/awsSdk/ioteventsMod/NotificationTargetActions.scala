package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationTargetActions extends StObject {
  
  var lambdaAction: js.UndefOr[LambdaAction] = js.undefined
}
object NotificationTargetActions {
  
  inline def apply(): NotificationTargetActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationTargetActions]
  }
  
  extension [Self <: NotificationTargetActions](x: Self) {
    
    inline def setLambdaAction(value: LambdaAction): Self = StObject.set(x, "lambdaAction", value.asInstanceOf[js.Any])
    
    inline def setLambdaActionUndefined: Self = StObject.set(x, "lambdaAction", js.undefined)
  }
}
