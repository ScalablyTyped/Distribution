package typings.azureArmResource.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomHeadersTop extends js.Object {
  var customHeaders: js.UndefOr[StringDictionary[String]] = js.native
  var top: js.UndefOr[Double] = js.native
}

object CustomHeadersTop {
  @scala.inline
  def apply(): CustomHeadersTop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomHeadersTop]
  }
  @scala.inline
  implicit class CustomHeadersTopOps[Self <: CustomHeadersTop] (val x: Self) extends AnyVal {
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
    def setCustomHeaders(value: StringDictionary[String]): Self = this.set("customHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomHeaders: Self = this.set("customHeaders", js.undefined)
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
  
}

