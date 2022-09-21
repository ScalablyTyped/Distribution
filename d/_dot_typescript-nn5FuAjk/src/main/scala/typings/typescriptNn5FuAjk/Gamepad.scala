package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Gamepad API interface defines an individual gamepad or other controller, allowing access to information such as button presses, axis positions, and id.
  * Available only in secure contexts.
  */
trait Gamepad extends StObject {
  
  val axes: ReadonlyArray[Double]
  
  val buttons: ReadonlyArray[GamepadButton]
  
  val connected: scala.Boolean
  
  val hapticActuators: ReadonlyArray[GamepadHapticActuator]
  
  val id: java.lang.String
  
  val index: Double
  
  val mapping: GamepadMappingType
  
  val timestamp: DOMHighResTimeStamp
}
object Gamepad {
  
  inline def apply(
    axes: ReadonlyArray[Double],
    buttons: ReadonlyArray[GamepadButton],
    connected: scala.Boolean,
    hapticActuators: ReadonlyArray[GamepadHapticActuator],
    id: java.lang.String,
    index: Double,
    mapping: GamepadMappingType,
    timestamp: DOMHighResTimeStamp
  ): Gamepad = {
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], hapticActuators = hapticActuators.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], mapping = mapping.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gamepad]
  }
  
  extension [Self <: Gamepad](x: Self) {
    
    inline def setAxes(value: ReadonlyArray[Double]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    inline def setButtons(value: ReadonlyArray[GamepadButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setConnected(value: scala.Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    
    inline def setHapticActuators(value: ReadonlyArray[GamepadHapticActuator]): Self = StObject.set(x, "hapticActuators", value.asInstanceOf[js.Any])
    
    inline def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMapping(value: GamepadMappingType): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: DOMHighResTimeStamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
