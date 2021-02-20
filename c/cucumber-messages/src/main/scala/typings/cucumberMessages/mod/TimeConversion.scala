package typings.cucumberMessages.mod

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IDuration
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimeConversion {
  
  @JSImport("cucumber-messages", "TimeConversion.durationToMilliseconds")
  @js.native
  def durationToMilliseconds(duration: IDuration): Double = js.native
  
  @JSImport("cucumber-messages", "TimeConversion.millisecondsSinceEpochToTimestamp")
  @js.native
  def millisecondsSinceEpochToTimestamp(millisecondsSinceEpoch: Double): ITimestamp = js.native
  
  @JSImport("cucumber-messages", "TimeConversion.millisecondsToDuration")
  @js.native
  def millisecondsToDuration(durationInMilliseconds: Double): IDuration = js.native
  
  @JSImport("cucumber-messages", "TimeConversion.timestampToMillisecondsSinceEpoch")
  @js.native
  def timestampToMillisecondsSinceEpoch(timestamp: ITimestamp): Double = js.native
}
