package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DidChangeLanguageFlavorParams extends js.Object {
  var flavor: String = js.native
  var language: String = js.native
  var uri: String = js.native
}

object DidChangeLanguageFlavorParams {
  @scala.inline
  def apply(flavor: String, language: String, uri: String): DidChangeLanguageFlavorParams = {
    val __obj = js.Dynamic.literal(flavor = flavor.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidChangeLanguageFlavorParams]
  }
  @scala.inline
  implicit class DidChangeLanguageFlavorParamsOps[Self <: DidChangeLanguageFlavorParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFlavor(value: String): Self = this.set("flavor", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
  }
  
}

