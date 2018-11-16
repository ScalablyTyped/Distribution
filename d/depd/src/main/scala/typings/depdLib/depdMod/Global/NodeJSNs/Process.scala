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

