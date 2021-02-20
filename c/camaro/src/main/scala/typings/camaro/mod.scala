package typings.camaro

import typings.camaro.anon.IndentSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("camaro", "prettyPrint")
  @js.native
  def prettyPrint(xml: String): js.Promise[String] = js.native
  @JSImport("camaro", "prettyPrint")
  @js.native
  def prettyPrint(xml: String, opts: IndentSize): js.Promise[String] = js.native
  
  @JSImport("camaro", "toJson")
  @js.native
  def toJson(xml: String): js.Promise[_] = js.native
  
  @JSImport("camaro", "transform")
  @js.native
  def transform(xml: String, template: js.Object): js.Promise[_] = js.native
}
