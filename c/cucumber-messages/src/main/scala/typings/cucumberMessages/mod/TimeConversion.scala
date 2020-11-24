package typings.cucumberMessages.mod

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IDuration
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ITimestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cucumber-messages", "TimeConversion")
@js.native
object TimeConversion extends js.Object {
  
  def durationToMilliseconds(duration: IDuration): Double = js.native
  
  def millisecondsSinceEpochToTimestamp(millisecondsSinceEpoch: Double): ITimestamp = js.native
  
  def millisecondsToDuration(durationInMilliseconds: Double): IDuration = js.native
  
  def timestampToMillisecondsSinceEpoch(timestamp: ITimestamp): Double = js.native
}
