package typings.bunyanConfig.mod

import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration.
  * @interface
  */
@js.native
trait Configuration extends js.Object {
  var level: js.UndefOr[String | Double] = js.native
  var name: String = js.native
  var serializers: js.UndefOr[js.Object] = js.native
  var src: js.UndefOr[Boolean] = js.native
  var stream: js.UndefOr[WritableStream] = js.native
  var streams: js.UndefOr[js.Array[Stream]] = js.native
}

object Configuration {
  @scala.inline
  def apply(name: String): Configuration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(value: String | Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setSerializers(value: js.Object): Self = this.set("serializers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerializers: Self = this.set("serializers", js.undefined)
    @scala.inline
    def setSrc(value: Boolean): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setStream(value: WritableStream): Self = this.set("stream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    @scala.inline
    def setStreamsVarargs(value: Stream*): Self = this.set("streams", js.Array(value :_*))
    @scala.inline
    def setStreams(value: js.Array[Stream]): Self = this.set("streams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreams: Self = this.set("streams", js.undefined)
  }
  
}

