package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.DOMHighResTimeStamp
import typings.typescriptNn5FuAjk.GamepadMappingType
import typings.typescriptNn5FuAjk.ReadonlyArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Gamepad")
@js.native
open class Gamepad ()
  extends StObject
     with typings.typescriptNn5FuAjk.Gamepad {
  
  /* CompleteClass */
  override val axes: ReadonlyArray[Double] = js.native
  
  /* CompleteClass */
  override val buttons: ReadonlyArray[typings.typescriptNn5FuAjk.GamepadButton] = js.native
  
  /* CompleteClass */
  override val connected: scala.Boolean = js.native
  
  /* CompleteClass */
  override val hapticActuators: ReadonlyArray[typings.typescriptNn5FuAjk.GamepadHapticActuator] = js.native
  
  /* CompleteClass */
  override val id: java.lang.String = js.native
  
  /* CompleteClass */
  override val index: Double = js.native
  
  /* CompleteClass */
  override val mapping: GamepadMappingType = js.native
  
  /* CompleteClass */
  override val timestamp: DOMHighResTimeStamp = js.native
}
