package typings
package cliDashSpinnerLib.cliDashSpinnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cli-spinner", "Spinner")
@js.native
class Spinner () extends js.Object {
  def this(titleOrOptions: Options) = this()
  def this(titleOrOptions: java.lang.String) = this()
  val stream: nodeLib.NodeJSNs.WritableStream = js.native
  def clearLine(stream: nodeLib.NodeJSNs.WritableStream): this.type = js.native
  def isSpinning(): scala.Boolean = js.native
  def setSpinnerDelay(spinnerDelay: scala.Double): this.type = js.native
  def setSpinnerString(spinnerString: java.lang.String): this.type = js.native
  def setSpinnerString(spinnerString: scala.Double): this.type = js.native
  def setSpinnerTitle(title: java.lang.String): this.type = js.native
  def start(): this.type = js.native
  def stop(): this.type = js.native
  def stop(clear: scala.Boolean): this.type = js.native
}

@JSImport("cli-spinner", "Spinner")
@js.native
object Spinner extends js.Object {
  def setDefaultSpinnerDelay(spinnerDelay: scala.Double): ScalablyTyped.runtime.Instantiable1[
    /* titleOrOptions */ js.UndefOr[
      /* titleOrOptions */ java.lang.String | cliDashSpinnerLib.cliDashSpinnerMod.Options
    ], 
    cliDashSpinnerLib.cliDashSpinnerMod.Spinner
  ] = js.native
  def setDefaultSpinnerString(spinnerString: java.lang.String): ScalablyTyped.runtime.Instantiable1[
    /* titleOrOptions */ js.UndefOr[
      /* titleOrOptions */ java.lang.String | cliDashSpinnerLib.cliDashSpinnerMod.Options
    ], 
    cliDashSpinnerLib.cliDashSpinnerMod.Spinner
  ] = js.native
  def setDefaultSpinnerString(spinnerString: scala.Double): ScalablyTyped.runtime.Instantiable1[
    /* titleOrOptions */ js.UndefOr[
      /* titleOrOptions */ java.lang.String | cliDashSpinnerLib.cliDashSpinnerMod.Options
    ], 
    cliDashSpinnerLib.cliDashSpinnerMod.Spinner
  ] = js.native
}

