package typings.cosmiconfig

import typings.cosmiconfig.mod.LoaderResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJs extends js.Object {
  @JSName(".js")
  def Dotjs(filepath: String, content: String): LoaderResult
  @JSName(".json")
  def Dotjson(filepath: String, content: String): LoaderResult
  @JSName(".yaml")
  def Dotyaml(filepath: String, content: String): LoaderResult
  @JSName(".yml")
  def Dotyml(filepath: String, content: String): LoaderResult
  def noExt(filepath: String, content: String): LoaderResult
}

object AnonJs {
  @scala.inline
  def apply(
    Dotjs: (String, String) => LoaderResult,
    Dotjson: (String, String) => LoaderResult,
    Dotyaml: (String, String) => LoaderResult,
    Dotyml: (String, String) => LoaderResult,
    noExt: (String, String) => LoaderResult
  ): AnonJs = {
    val __obj = js.Dynamic.literal(noExt = js.Any.fromFunction2(noExt))
    __obj.updateDynamic(".js")(js.Any.fromFunction2(Dotjs))
    __obj.updateDynamic(".json")(js.Any.fromFunction2(Dotjson))
    __obj.updateDynamic(".yaml")(js.Any.fromFunction2(Dotyaml))
    __obj.updateDynamic(".yml")(js.Any.fromFunction2(Dotyml))
    __obj.asInstanceOf[AnonJs]
  }
}

