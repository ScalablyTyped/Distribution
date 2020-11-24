package typings.cliBox.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.cliBox.anon.Stringify
import typings.cliBox.cliBoxStrings.stringify
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoxConstructor
  extends Instantiable1[(/* options */ Options) | (/* options */ String), Box]
     with Instantiable2[
      (/* options */ Options) | (/* options */ String), 
      (/* text */ String) | (/* text */ Text), 
      Box
    ] {
  
  def apply(options: (Exclude[Options, stringify]) with Stringify): String = js.native
  def apply(options: (Exclude[Options, stringify]) with Stringify, text: String): String = js.native
  def apply(options: (Exclude[Options, stringify]) with Stringify, text: Text): String = js.native
  def apply(options: String): Box = js.native
  def apply(options: String, text: String): Box = js.native
  def apply(options: String, text: Text): Box = js.native
  
  var defaults: typings.cliBox.anon.Marks = js.native
}
