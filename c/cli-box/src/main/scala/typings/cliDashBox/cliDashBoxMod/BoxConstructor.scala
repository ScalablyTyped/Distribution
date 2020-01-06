package typings.cliDashBox.cliDashBoxMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.cliDashBox.Anon_Marks
import typings.cliDashBox.Anon_Stringify
import typings.cliDashBox.cliDashBoxStrings.stringify
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxConstructor
  extends Instantiable1[(/* options */ Options) | (/* options */ String), Box]
     with Instantiable2[
      (/* options */ Options) | (/* options */ String), 
      (/* text */ String) | (/* text */ Text), 
      Box
    ] {
  var defaults: Anon_Marks = js.native
  def apply(options: (Exclude[Options, stringify]) with Anon_Stringify): String = js.native
  def apply(options: (Exclude[Options, stringify]) with Anon_Stringify, text: String): String = js.native
  def apply(options: (Exclude[Options, stringify]) with Anon_Stringify, text: Text): String = js.native
  def apply(options: String): Box = js.native
  def apply(options: String, text: String): Box = js.native
  def apply(options: String, text: Text): Box = js.native
}

