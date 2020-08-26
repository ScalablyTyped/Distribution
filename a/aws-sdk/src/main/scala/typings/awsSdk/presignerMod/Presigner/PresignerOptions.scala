package typings.awsSdk.presignerMod.Presigner

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.pollyMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PresignerOptions extends js.Object {
  /**
    * An optional map of parameters to bind to every request sent by this service object. 
    */
  var params: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * An optional pre-configured instance of the AWS.Polly service object to use for requests. The object may bound parameters used by the presigner.
    */
  var service: js.UndefOr[^] = js.native
}

object PresignerOptions {
  @scala.inline
  def apply(): PresignerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PresignerOptions]
  }
  @scala.inline
  implicit class PresignerOptionsOps[Self <: PresignerOptions] (val x: Self) extends AnyVal {
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
    def setParams(value: StringDictionary[js.Any]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setService(value: ^): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
  
}

