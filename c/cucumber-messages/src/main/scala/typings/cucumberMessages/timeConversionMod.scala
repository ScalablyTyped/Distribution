package typings.cucumberMessages

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IDuration
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeConversionMod {
  
  @JSImport("cucumber-messages/dist/src/TimeConversion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def durationToMilliseconds(duration: IDuration): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("durationToMilliseconds")(duration.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def millisecondsSinceEpochToTimestamp(millisecondsSinceEpoch: Double): ITimestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("millisecondsSinceEpochToTimestamp")(millisecondsSinceEpoch.asInstanceOf[js.Any]).asInstanceOf[ITimestamp]
  
  @scala.inline
  def millisecondsToDuration(durationInMilliseconds: Double): IDuration = ^.asInstanceOf[js.Dynamic].applyDynamic("millisecondsToDuration")(durationInMilliseconds.asInstanceOf[js.Any]).asInstanceOf[IDuration]
  
  @scala.inline
  def timestampToMillisecondsSinceEpoch(timestamp: ITimestamp): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("timestampToMillisecondsSinceEpoch")(timestamp.asInstanceOf[js.Any]).asInstanceOf[Double]
}
