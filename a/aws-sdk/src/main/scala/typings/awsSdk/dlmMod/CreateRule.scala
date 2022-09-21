package typings.awsSdk.dlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRule extends StObject {
  
  /**
    * The schedule, as a Cron expression. The schedule interval must be between 1 hour and 1 year. For more information, see Cron expressions in the Amazon CloudWatch User Guide.
    */
  var CronExpression: js.UndefOr[typings.awsSdk.dlmMod.CronExpression] = js.undefined
  
  /**
    * The interval between snapshots. The supported values are 1, 2, 3, 4, 6, 8, 12, and 24.
    */
  var Interval: js.UndefOr[typings.awsSdk.dlmMod.Interval] = js.undefined
  
  /**
    * The interval unit.
    */
  var IntervalUnit: js.UndefOr[IntervalUnitValues] = js.undefined
  
  /**
    *  [Snapshot policies only] Specifies the destination for snapshots created by the policy. To create snapshots in the same Region as the source resource, specify CLOUD. To create snapshots on the same Outpost as the source resource, specify OUTPOST_LOCAL. If you omit this parameter, CLOUD is used by default. If the policy targets resources in an Amazon Web Services Region, then you must create snapshots in the same Region as the source resource. If the policy targets resources on an Outpost, then you can create snapshots on the same Outpost as the source resource, or in the Region of that Outpost.
    */
  var Location: js.UndefOr[LocationValues] = js.undefined
  
  /**
    * The time, in UTC, to start the operation. The supported format is hh:mm. The operation occurs within a one-hour window following the specified time. If you do not specify a time, Amazon DLM selects a time within the next 24 hours.
    */
  var Times: js.UndefOr[TimesList] = js.undefined
}
object CreateRule {
  
  inline def apply(): CreateRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRule]
  }
  
  extension [Self <: CreateRule](x: Self) {
    
    inline def setCronExpression(value: CronExpression): Self = StObject.set(x, "CronExpression", value.asInstanceOf[js.Any])
    
    inline def setCronExpressionUndefined: Self = StObject.set(x, "CronExpression", js.undefined)
    
    inline def setInterval(value: Interval): Self = StObject.set(x, "Interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "Interval", js.undefined)
    
    inline def setIntervalUnit(value: IntervalUnitValues): Self = StObject.set(x, "IntervalUnit", value.asInstanceOf[js.Any])
    
    inline def setIntervalUnitUndefined: Self = StObject.set(x, "IntervalUnit", js.undefined)
    
    inline def setLocation(value: LocationValues): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    inline def setTimes(value: TimesList): Self = StObject.set(x, "Times", value.asInstanceOf[js.Any])
    
    inline def setTimesUndefined: Self = StObject.set(x, "Times", js.undefined)
    
    inline def setTimesVarargs(value: Time*): Self = StObject.set(x, "Times", js.Array(value*))
  }
}
