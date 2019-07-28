package typings.closureDashCompiler.closureDashCompilerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("closure-compiler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compile(src: String, callback: Callback): Unit = js.native
  def compile(src: String, options: StringDictionary[String | js.Array[String]], callback: Callback): Unit = js.native
}

