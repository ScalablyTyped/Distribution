package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DidChangeLanguageFlavorParams extends js.Object {
  var flavor: String
  var language: String
  var uri: String
}

object DidChangeLanguageFlavorParams {
  @scala.inline
  def apply(flavor: String, language: String, uri: String): DidChangeLanguageFlavorParams = {
    val __obj = js.Dynamic.literal(flavor = flavor.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DidChangeLanguageFlavorParams]
  }
}

