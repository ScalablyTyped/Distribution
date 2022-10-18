package typings.cucumberMessages

import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.IDuration
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTimeConversionMod {
  
  @JSImport("cucumber-messages/dist/src/TimeConversion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def durationToMilliseconds(duration: IDuration): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("durationToMilliseconds")(duration.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def millisecondsSinceEpochToTimestamp(millisecondsSinceEpoch: Double): ITimestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("millisecondsSinceEpochToTimestamp")(millisecondsSinceEpoch.asInstanceOf[js.Any]).asInstanceOf[ITimestamp]
  
  inline def millisecondsToDuration(durationInMilliseconds: Double): IDuration = ^.asInstanceOf[js.Dynamic].applyDynamic("millisecondsToDuration")(durationInMilliseconds.asInstanceOf[js.Any]).asInstanceOf[IDuration]
  
  inline def timestampToMillisecondsSinceEpoch(timestamp: ITimestamp): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("timestampToMillisecondsSinceEpoch")(timestamp.asInstanceOf[js.Any]).asInstanceOf[Double]
}
