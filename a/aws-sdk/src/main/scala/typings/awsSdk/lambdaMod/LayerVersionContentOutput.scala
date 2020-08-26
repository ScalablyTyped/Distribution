package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerVersionContentOutput extends js.Object {
  /**
    * The SHA-256 hash of the layer archive.
    */
  var CodeSha256: js.UndefOr[String] = js.native
  /**
    * The size of the layer archive in bytes.
    */
  var CodeSize: js.UndefOr[Long] = js.native
  /**
    * A link to the layer archive in Amazon S3 that is valid for 10 minutes.
    */
  var Location: js.UndefOr[String] = js.native
}

object LayerVersionContentOutput {
  @scala.inline
  def apply(): LayerVersionContentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerVersionContentOutput]
  }
  @scala.inline
  implicit class LayerVersionContentOutputOps[Self <: LayerVersionContentOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCodeSha256(value: String): Self = this.set("CodeSha256", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeSha256: Self = this.set("CodeSha256", js.undefined)
    @scala.inline
    def setCodeSize(value: Long): Self = this.set("CodeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeSize: Self = this.set("CodeSize", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("Location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("Location", js.undefined)
  }
  
}

