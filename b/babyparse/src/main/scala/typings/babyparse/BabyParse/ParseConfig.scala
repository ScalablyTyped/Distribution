package typings.babyparse.BabyParse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseConfig extends js.Object {
                // default: false
  var comments: js.UndefOr[Boolean] = js.native
    // default: undefined
  var complete: js.UndefOr[js.Function1[/* results */ ParseResult, Unit]] = js.native
  var delimiter: js.UndefOr[String] = js.native
              // default: false
  var download: js.UndefOr[Boolean] = js.native
                // default: false
  var dynamicTyping: js.UndefOr[Boolean] = js.native
                // default: 0
  var encoding: js.UndefOr[String] = js.native
        // default: false
  var fastMode: js.UndefOr[Boolean] = js.native
                // default: ""
  var header: js.UndefOr[Boolean] = js.native
              // default: ""
  var newline: js.UndefOr[String] = js.native
         // default: false
  var preview: js.UndefOr[Double] = js.native
              // default: false
  var skipEmptyLines: js.UndefOr[Boolean] = js.native
              // default: undefined
  // Callbacks
  var step: js.UndefOr[js.Function2[/* results */ ParseResult, /* parser */ Parser, Unit]] = js.native
               // default: ""
  var worker: js.UndefOr[Boolean] = js.native
}

object ParseConfig {
  @scala.inline
  def apply(): ParseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseConfig]
  }
  @scala.inline
  implicit class ParseConfigOps[Self <: ParseConfig] (val x: Self) extends AnyVal {
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
    def setComments(value: Boolean): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    @scala.inline
    def setComplete(value: /* results */ ParseResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    @scala.inline
    def setDownload(value: Boolean): Self = this.set("download", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    @scala.inline
    def setDynamicTyping(value: Boolean): Self = this.set("dynamicTyping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicTyping: Self = this.set("dynamicTyping", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setFastMode(value: Boolean): Self = this.set("fastMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFastMode: Self = this.set("fastMode", js.undefined)
    @scala.inline
    def setHeader(value: Boolean): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setNewline(value: String): Self = this.set("newline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewline: Self = this.set("newline", js.undefined)
    @scala.inline
    def setPreview(value: Double): Self = this.set("preview", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreview: Self = this.set("preview", js.undefined)
    @scala.inline
    def setSkipEmptyLines(value: Boolean): Self = this.set("skipEmptyLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipEmptyLines: Self = this.set("skipEmptyLines", js.undefined)
    @scala.inline
    def setStep(value: (/* results */ ParseResult, /* parser */ Parser) => Unit): Self = this.set("step", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setWorker(value: Boolean): Self = this.set("worker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorker: Self = this.set("worker", js.undefined)
  }
  
}

