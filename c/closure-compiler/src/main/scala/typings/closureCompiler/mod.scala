package typings.closureCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("closure-compiler", "compile")
  @js.native
  def compile(src: String, callback: Callback): Unit = js.native
  @JSImport("closure-compiler", "compile")
  @js.native
  def compile(src: String, options: StringDictionary[String | js.Array[String]], callback: Callback): Unit = js.native
  
  type Callback = js.Function3[/* err */ Error, /* stdout */ String, /* stderr */ String, js.Any]
}
