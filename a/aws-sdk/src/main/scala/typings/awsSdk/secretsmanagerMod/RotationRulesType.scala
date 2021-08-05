package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotationRulesType extends StObject {
  
  /**
    * Specifies the number of days between automatic scheduled rotations of the secret. Secrets Manager schedules the next rotation when the previous one is complete. Secrets Manager schedules the date by adding the rotation interval (number of days) to the actual date of the last rotation. The service chooses the hour within that 24-hour date window randomly. The minute is also chosen somewhat randomly, but weighted towards the top of the hour and influenced by a variety of factors that help distribute load.
    */
  var AutomaticallyAfterDays: js.UndefOr[AutomaticallyRotateAfterDaysType] = js.undefined
}
object RotationRulesType {
  
  inline def apply(): RotationRulesType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotationRulesType]
  }
  
  extension [Self <: RotationRulesType](x: Self) {
    
    inline def setAutomaticallyAfterDays(value: AutomaticallyRotateAfterDaysType): Self = StObject.set(x, "AutomaticallyAfterDays", value.asInstanceOf[js.Any])
    
    inline def setAutomaticallyAfterDaysUndefined: Self = StObject.set(x, "AutomaticallyAfterDays", js.undefined)
  }
}
