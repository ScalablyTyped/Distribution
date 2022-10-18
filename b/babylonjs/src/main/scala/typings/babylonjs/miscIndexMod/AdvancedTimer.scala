package typings.babylonjs.miscIndexMod

import typings.babylonjs.miscTimerMod.ITimerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "AdvancedTimer")
@js.native
open class AdvancedTimer[T] protected ()
  extends typings.babylonjs.miscTimerMod.AdvancedTimer[T] {
  /**
    * Will construct a new advanced timer based on the options provided. Timer will not start until start() is called.
    * @param options construction options for this advanced timer
    */
  def this(options: ITimerOptions[T]) = this()
}
