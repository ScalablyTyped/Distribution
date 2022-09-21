package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alarm extends StObject {
  
  /**
    * The name of a CloudWatch alarm in your account.
    */
  var AlarmName: js.UndefOr[typings.awsSdk.sagemakerMod.AlarmName] = js.undefined
}
object Alarm {
  
  inline def apply(): Alarm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alarm]
  }
  
  extension [Self <: Alarm](x: Self) {
    
    inline def setAlarmName(value: AlarmName): Self = StObject.set(x, "AlarmName", value.asInstanceOf[js.Any])
    
    inline def setAlarmNameUndefined: Self = StObject.set(x, "AlarmName", js.undefined)
  }
}
