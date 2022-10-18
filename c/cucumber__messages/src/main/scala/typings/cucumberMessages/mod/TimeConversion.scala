package typings.cucumberMessages.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimeConversion {
  
  @JSImport("@cucumber/messages", "TimeConversion")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addDurations(
    durationA: typings.cucumberMessages.distCjsSrcMessagesMod.Duration,
    durationB: typings.cucumberMessages.distCjsSrcMessagesMod.Duration
  ): typings.cucumberMessages.distCjsSrcMessagesMod.Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("addDurations")(durationA.asInstanceOf[js.Any], durationB.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.distCjsSrcMessagesMod.Duration]
  
  inline def durationToMilliseconds(duration: typings.cucumberMessages.distCjsSrcMessagesMod.Duration): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("durationToMilliseconds")(duration.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def millisecondsSinceEpochToTimestamp(millisecondsSinceEpoch: Double): typings.cucumberMessages.distCjsSrcMessagesMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("millisecondsSinceEpochToTimestamp")(millisecondsSinceEpoch.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distCjsSrcMessagesMod.Timestamp]
  
  inline def millisecondsToDuration(durationInMilliseconds: Double): typings.cucumberMessages.distCjsSrcMessagesMod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("millisecondsToDuration")(durationInMilliseconds.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.distCjsSrcMessagesMod.Duration]
  
  inline def timestampToMillisecondsSinceEpoch(timestamp: typings.cucumberMessages.distCjsSrcMessagesMod.Timestamp): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("timestampToMillisecondsSinceEpoch")(timestamp.asInstanceOf[js.Any]).asInstanceOf[Double]
}
