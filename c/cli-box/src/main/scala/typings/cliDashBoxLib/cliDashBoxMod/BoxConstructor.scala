package typings
package cliDashBoxLib.cliDashBoxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxConstructor
  extends org.scalablytyped.runtime.Instantiable2[
      (/* options */ Options) | (/* options */ java.lang.String), 
      (/* text */ java.lang.String) | (/* text */ Text), 
      Box
    ]
     with org.scalablytyped.runtime.Instantiable1[(/* options */ Options) | (/* options */ java.lang.String), Box] {
  var defaults: cliDashBoxLib.Anon_Marks_532567740 = js.native
  def apply(
    options: (stdLib.Exclude[Options, cliDashBoxLib.cliDashBoxLibStrings.stringify]) with cliDashBoxLib.Anon_Stringify
  ): java.lang.String = js.native
  def apply(
    options: (stdLib.Exclude[Options, cliDashBoxLib.cliDashBoxLibStrings.stringify]) with cliDashBoxLib.Anon_Stringify,
    text: Text
  ): java.lang.String = js.native
  def apply(
    options: (stdLib.Exclude[Options, cliDashBoxLib.cliDashBoxLibStrings.stringify]) with cliDashBoxLib.Anon_Stringify,
    text: java.lang.String
  ): java.lang.String = js.native
  def apply(options: Options): Box = js.native
  def apply(options: Options, text: Text): Box = js.native
  def apply(options: Options, text: java.lang.String): Box = js.native
  def apply(options: java.lang.String): Box = js.native
  def apply(options: java.lang.String, text: Text): Box = js.native
  def apply(options: java.lang.String, text: java.lang.String): Box = js.native
}

