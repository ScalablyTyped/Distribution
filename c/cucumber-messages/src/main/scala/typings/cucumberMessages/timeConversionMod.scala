package typings.cucumberMessages

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IDuration
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeConversionMod {
  
  @JSImport("cucumber-messages/dist/src/TimeConversion", "durationToMilliseconds")
  @js.native
  def durationToMilliseconds(duration: IDuration): Double = js.native
  
  @JSImport("cucumber-messages/dist/src/TimeConversion", "millisecondsSinceEpochToTimestamp")
  @js.native
  def millisecondsSinceEpochToTimestamp(millisecondsSinceEpoch: Double): ITimestamp = js.native
  
  @JSImport("cucumber-messages/dist/src/TimeConversion", "millisecondsToDuration")
  @js.native
  def millisecondsToDuration(durationInMilliseconds: Double): IDuration = js.native
  
  @JSImport("cucumber-messages/dist/src/TimeConversion", "timestampToMillisecondsSinceEpoch")
  @js.native
  def timestampToMillisecondsSinceEpoch(timestamp: ITimestamp): Double = js.native
}
