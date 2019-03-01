package typings
package depdLib.depdMod.Global.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Process extends js.Object {
  @JSName("addListener")
  def addListener_deprecation(
    event: depdLib.depdLibStrings.deprecation,
    listener: js.Function1[/* deprecationError */ depdLib.depdMod.depdNs.DeprecationError, scala.Unit]
  ): this.type
  @JSName("emit")
  def emit_deprecation(event: depdLib.depdLibStrings.deprecation, code: depdLib.depdMod.depdNs.DeprecationError): scala.Boolean
  @JSName("listeners")
  def listeners_deprecation(event: depdLib.depdLibStrings.deprecation): js.Array[depdLib.depdMod.depdNs.DeprecationError]
  @JSName("on")
  def on_deprecation(
    event: depdLib.depdLibStrings.deprecation,
    listener: js.Function1[/* deprecationError */ depdLib.depdMod.depdNs.DeprecationError, scala.Unit]
  ): this.type
  @JSName("once")
  def once_deprecation(
    event: depdLib.depdLibStrings.deprecation,
    listener: js.Function1[/* deprecationError */ depdLib.depdMod.depdNs.DeprecationError, scala.Unit]
  ): this.type
  @JSName("prependListener")
  def prependListener_deprecation(
    event: depdLib.depdLibStrings.deprecation,
    listener: js.Function1[/* deprecationError */ depdLib.depdMod.depdNs.DeprecationError, scala.Unit]
  ): this.type
  @JSName("prependOnceListener")
  def prependOnceListener_deprecation(
    event: depdLib.depdLibStrings.deprecation,
    listener: js.Function1[/* deprecationError */ depdLib.depdMod.depdNs.DeprecationError, scala.Unit]
  ): this.type
}

object Process {
  @scala.inline
  def apply(
    addListener_deprecation: js.Function2[
      depdLib.depdLibStrings.deprecation, 
      js.Function1[/* deprecationError */ depdLib.depdMod.depdNs.DeprecationError, scala.Unit], 
      Process
    ],
    emit_deprecation: js.Function2[
      depdLib.depdLibStrings.deprecation, 
      depdLib.depdMod.depdNs.DeprecationError, 
      scala.Boolean
    ],
    listeners_deprecation: js.Function1[
      depdLib.depdLibStrings.deprecation, 
      js.Array[depdLib.depdMod.depdNs.DeprecationError]
    ],
    on_deprecation: js.Function2[
      depdLib.depdLibStrings.deprecation, 
      js.Function1[/* deprecationError */ depdLib.depdMod.depdNs.DeprecationError, scala.Unit], 
      Process
    ],
    once_deprecation: js.Function2[
      depdLib.depdLibStrings.deprecation, 
      js.Function1[/* deprecationError */ depdLib.depdMod.depdNs.DeprecationError, scala.Unit], 
      Process
    ],
    prependListener_deprecation: js.Function2[
      depdLib.depdLibStrings.deprecation, 
      js.Function1[/* deprecationError */ depdLib.depdMod.depdNs.DeprecationError, scala.Unit], 
      Process
    ],
    prependOnceListener_deprecation: js.Function2[
      depdLib.depdLibStrings.deprecation, 
      js.Function1[/* deprecationError */ depdLib.depdMod.depdNs.DeprecationError, scala.Unit], 
      Process
    ]
  ): Process = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addListener")(addListener_deprecation)
    __obj.updateDynamic("emit")(emit_deprecation)
    __obj.updateDynamic("listeners")(listeners_deprecation)
    __obj.updateDynamic("on")(on_deprecation)
    __obj.updateDynamic("once")(once_deprecation)
    __obj.updateDynamic("prependListener")(prependListener_deprecation)
    __obj.updateDynamic("prependOnceListener")(prependOnceListener_deprecation)
    __obj.asInstanceOf[Process]
  }
}

