package typings.cucumberMessages.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimeConversion {
  
  @JSImport("@cucumber/messages", "TimeConversion")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addDurations(
    durationA: typings.cucumberMessages.messagesMod.Duration,
    durationB: typings.cucumberMessages.messagesMod.Duration
  ): typings.cucumberMessages.messagesMod.Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("addDurations")(durationA.asInstanceOf[js.Any], durationB.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.messagesMod.Duration]
  
  inline def durationToMilliseconds(duration: typings.cucumberMessages.messagesMod.Duration): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("durationToMilliseconds")(duration.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def millisecondsSinceEpochToTimestamp(millisecondsSinceEpoch: Double): typings.cucumberMessages.messagesMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("millisecondsSinceEpochToTimestamp")(millisecondsSinceEpoch.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.messagesMod.Timestamp]
  
  inline def millisecondsToDuration(durationInMilliseconds: Double): typings.cucumberMessages.messagesMod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("millisecondsToDuration")(durationInMilliseconds.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.messagesMod.Duration]
  
  inline def timestampToMillisecondsSinceEpoch(timestamp: typings.cucumberMessages.messagesMod.Timestamp): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("timestampToMillisecondsSinceEpoch")(timestamp.asInstanceOf[js.Any]).asInstanceOf[Double]
}
