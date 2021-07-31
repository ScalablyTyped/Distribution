package typings.cordovarduino

import typings.cordovarduino.Cordovardunio.Serial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  // Plugin will be surfaced as window.serial
  @JSGlobal("serial")
  @js.native
  def serial: Serial = js.native
  @scala.inline
  def serial_=(x: Serial): Unit = js.Dynamic.global.updateDynamic("serial")(x.asInstanceOf[js.Any])
}
