package typings.cliBox.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.cliBox.AnonMarks
import typings.cliBox.ExcludeOptionsstringifyst
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
  var defaults: AnonMarks = js.native
  def apply(options: String): Box = js.native
  def apply(options: String, text: String): Box = js.native
  def apply(options: String, text: Text): Box = js.native
  def apply(options: ExcludeOptionsstringifyst): String = js.native
  def apply(options: ExcludeOptionsstringifyst, text: String): String = js.native
  def apply(options: ExcludeOptionsstringifyst, text: Text): String = js.native
  def apply(options: Options): Box = js.native
  def apply(options: Options, text: String): Box = js.native
  def apply(options: Options, text: Text): Box = js.native
}

