package typings.bodyParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsUrlencoded extends Options {
  /**
    * The extended option allows to choose between parsing the URL-encoded data
    * with the querystring library (when `false`) or the qs library (when `true`).
    */
  var extended: js.UndefOr[Boolean] = js.native
  /**
    * The parameterLimit option controls the maximum number of parameters
    * that are allowed in the URL-encoded data. If a request contains more parameters than this value,
    * a 413 will be returned to the client. Defaults to 1000.
    */
  var parameterLimit: js.UndefOr[Double] = js.native
}

object OptionsUrlencoded {
  @scala.inline
  def apply(): OptionsUrlencoded = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsUrlencoded]
  }
  @scala.inline
  implicit class OptionsUrlencodedOps[Self <: OptionsUrlencoded] (val x: Self) extends AnyVal {
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
    def setExtended(value: Boolean): Self = this.set("extended", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtended: Self = this.set("extended", js.undefined)
    @scala.inline
    def setParameterLimit(value: Double): Self = this.set("parameterLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterLimit: Self = this.set("parameterLimit", js.undefined)
  }
  
}

