package typings.chosenJs

import typings.chosenJs.Chosen.OnEvent
import typings.chosenJs.Chosen.TriggerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chosenJsStrings {
  
  @js.native
  sealed trait change extends StObject
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  
  @js.native
  sealed trait chosenColonactivate
    extends StObject
       with TriggerEvent
  @scala.inline
  def chosenColonactivate: chosenColonactivate = "chosen:activate".asInstanceOf[chosenColonactivate]
  
  @js.native
  sealed trait chosenColonclose
    extends StObject
       with TriggerEvent
  @scala.inline
  def chosenColonclose: chosenColonclose = "chosen:close".asInstanceOf[chosenColonclose]
  
  @js.native
  sealed trait chosenColonhiding_dropdown
    extends StObject
       with OnEvent
  @scala.inline
  def chosenColonhiding_dropdown: chosenColonhiding_dropdown = "chosen:hiding_dropdown".asInstanceOf[chosenColonhiding_dropdown]
  
  @js.native
  sealed trait chosenColonmaxselected
    extends StObject
       with OnEvent
  @scala.inline
  def chosenColonmaxselected: chosenColonmaxselected = "chosen:maxselected".asInstanceOf[chosenColonmaxselected]
  
  @js.native
  sealed trait chosenColonno_results
    extends StObject
       with OnEvent
  @scala.inline
  def chosenColonno_results: chosenColonno_results = "chosen:no_results".asInstanceOf[chosenColonno_results]
  
  @js.native
  sealed trait chosenColonopen
    extends StObject
       with TriggerEvent
  @scala.inline
  def chosenColonopen: chosenColonopen = "chosen:open".asInstanceOf[chosenColonopen]
  
  @js.native
  sealed trait chosenColonready
    extends StObject
       with OnEvent
  @scala.inline
  def chosenColonready: chosenColonready = "chosen:ready".asInstanceOf[chosenColonready]
  
  @js.native
  sealed trait chosenColonshowing_dropdown
    extends StObject
       with OnEvent
  @scala.inline
  def chosenColonshowing_dropdown: chosenColonshowing_dropdown = "chosen:showing_dropdown".asInstanceOf[chosenColonshowing_dropdown]
  
  @js.native
  sealed trait chosenColonupdated
    extends StObject
       with TriggerEvent
  @scala.inline
  def chosenColonupdated: chosenColonupdated = "chosen:updated".asInstanceOf[chosenColonupdated]
  
  @js.native
  sealed trait destroy extends StObject
  @scala.inline
  def destroy: destroy = "destroy".asInstanceOf[destroy]
}
