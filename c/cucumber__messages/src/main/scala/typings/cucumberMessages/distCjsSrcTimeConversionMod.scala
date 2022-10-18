package typings.cucumberMessages

import typings.cucumberMessages.distCjsSrcMessagesMod.Duration
import typings.cucumberMessages.distCjsSrcMessagesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSrcTimeConversionMod {
  
  @JSImport("@cucumber/messages/dist/cjs/src/TimeConversion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addDurations(durationA: Duration, durationB: Duration): Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("addDurations")(durationA.asInstanceOf[js.Any], durationB.asInstanceOf[js.Any])).asInstanceOf[Duration]
  
  inline def durationToMilliseconds(duration: Duration): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("durationToMilliseconds")(duration.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def millisecondsSinceEpochToTimestamp(millisecondsSinceEpoch: Double): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("millisecondsSinceEpochToTimestamp")(millisecondsSinceEpoch.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
  
  inline def millisecondsToDuration(durationInMilliseconds: Double): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("millisecondsToDuration")(durationInMilliseconds.asInstanceOf[js.Any]).asInstanceOf[Duration]
  
  inline def timestampToMillisecondsSinceEpoch(timestamp: Timestamp): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("timestampToMillisecondsSinceEpoch")(timestamp.asInstanceOf[js.Any]).asInstanceOf[Double]
}
