package typings.cosmiconfig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cosmiconfig", "defaultLoaders")
@js.native
object defaultLoaders extends js.Object {
  @JSName(".js")
  def Dotjs(filepath: String, content: String): LoaderResult = js.native
  @JSName(".json")
  def Dotjson(filepath: String, content: String): LoaderResult = js.native
  @JSName(".yaml")
  def Dotyaml(filepath: String, content: String): LoaderResult = js.native
  @JSName(".yml")
  def Dotyml(filepath: String, content: String): LoaderResult = js.native
  def noExt(filepath: String, content: String): LoaderResult = js.native
}

