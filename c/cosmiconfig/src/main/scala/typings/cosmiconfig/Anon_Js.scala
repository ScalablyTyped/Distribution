package typings.cosmiconfig

import typings.cosmiconfig.cosmiconfigMod.LoaderResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Js extends js.Object {
  def `.js`(filepath: String, content: String): LoaderResult
  def `.json`(filepath: String, content: String): LoaderResult
  def `.yaml`(filepath: String, content: String): LoaderResult
  def `.yml`(filepath: String, content: String): LoaderResult
  def noExt(filepath: String, content: String): LoaderResult
}

object Anon_Js {
  @scala.inline
  def apply(
    `.js`: (String, String) => LoaderResult,
    `.json`: (String, String) => LoaderResult,
    `.yaml`: (String, String) => LoaderResult,
    `.yml`: (String, String) => LoaderResult,
    noExt: (String, String) => LoaderResult
  ): Anon_Js = {
    val __obj = js.Dynamic.literal(noExt = js.Any.fromFunction2(noExt))
    __obj.updateDynamic(".js")(js.Any.fromFunction2(`.js`))
    __obj.updateDynamic(".json")(js.Any.fromFunction2(`.json`))
    __obj.updateDynamic(".yaml")(js.Any.fromFunction2(`.yaml`))
    __obj.updateDynamic(".yml")(js.Any.fromFunction2(`.yml`))
    __obj.asInstanceOf[Anon_Js]
  }
}

