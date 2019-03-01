package typings
package chosenDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object chosenDashJsLibStrings {
  @js.native
  sealed trait change extends js.Object
  
  @js.native
  sealed trait `chosen:activate`
    extends chosenDashJsLib.ChosenNs.TriggerEvent
  
  @js.native
  sealed trait `chosen:close`
    extends chosenDashJsLib.ChosenNs.TriggerEvent
  
  @js.native
  sealed trait `chosen:hiding_dropdown`
    extends chosenDashJsLib.ChosenNs.OnEvent
  
  @js.native
  sealed trait `chosen:maxselected`
    extends chosenDashJsLib.ChosenNs.OnEvent
  
  @js.native
  sealed trait `chosen:no_results`
    extends chosenDashJsLib.ChosenNs.OnEvent
  
  @js.native
  sealed trait `chosen:open`
    extends chosenDashJsLib.ChosenNs.TriggerEvent
  
  @js.native
  sealed trait `chosen:ready`
    extends chosenDashJsLib.ChosenNs.OnEvent
  
  @js.native
  sealed trait `chosen:showing_dropdown`
    extends chosenDashJsLib.ChosenNs.OnEvent
  
  @js.native
  sealed trait `chosen:updated`
    extends chosenDashJsLib.ChosenNs.TriggerEvent
  
  @js.native
  sealed trait destroy extends js.Object
  
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  @scala.inline
  def `chosen:activate`: `chosen:activate` = "chosen:activate".asInstanceOf[`chosen:activate`]
  @scala.inline
  def `chosen:close`: `chosen:close` = "chosen:close".asInstanceOf[`chosen:close`]
  @scala.inline
  def `chosen:hiding_dropdown`: `chosen:hiding_dropdown` = "chosen:hiding_dropdown".asInstanceOf[`chosen:hiding_dropdown`]
  @scala.inline
  def `chosen:maxselected`: `chosen:maxselected` = "chosen:maxselected".asInstanceOf[`chosen:maxselected`]
  @scala.inline
  def `chosen:no_results`: `chosen:no_results` = "chosen:no_results".asInstanceOf[`chosen:no_results`]
  @scala.inline
  def `chosen:open`: `chosen:open` = "chosen:open".asInstanceOf[`chosen:open`]
  @scala.inline
  def `chosen:ready`: `chosen:ready` = "chosen:ready".asInstanceOf[`chosen:ready`]
  @scala.inline
  def `chosen:showing_dropdown`: `chosen:showing_dropdown` = "chosen:showing_dropdown".asInstanceOf[`chosen:showing_dropdown`]
  @scala.inline
  def `chosen:updated`: `chosen:updated` = "chosen:updated".asInstanceOf[`chosen:updated`]
  @scala.inline
  def destroy: destroy = "destroy".asInstanceOf[destroy]
}

