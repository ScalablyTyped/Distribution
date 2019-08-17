package typings.cliDashBox.cliDashBoxMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.cliDashBox.Anon_Marks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxConstructor
  extends Instantiable2[
      (/* options */ Options) | (/* options */ String), 
      (/* text */ String) | (/* text */ Text), 
      Box
    ]
     with Instantiable1[(/* options */ Options) | (/* options */ String), Box] {
  var defaults: Anon_Marks = js.native
  def apply(options: String): Box = js.native
  def apply(options: String, text: String): Box = js.native
  def apply(options: String, text: Text): Box = js.native
  def apply(options: Options): Box = js.native
  def apply(options: Options, text: String): Box = js.native
  def apply(options: Options, text: Text): Box = js.native
}

