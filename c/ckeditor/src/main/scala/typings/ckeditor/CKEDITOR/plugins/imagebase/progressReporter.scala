package typings.ckeditor.CKEDITOR.plugins.imagebase

import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.fileTools.fileLoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait progressReporter extends js.Object {
  var wrapper: element = js.native
  def aborted(): Unit = js.native
  def bindLoader(loader: fileLoader): Unit = js.native
  def done(): Unit = js.native
  def failed(): Unit = js.native
  def remove(): Unit = js.native
  def updated(progress: Double): Unit = js.native
}

object progressReporter {
  @scala.inline
  def apply(
    aborted: () => Unit,
    bindLoader: fileLoader => Unit,
    done: () => Unit,
    failed: () => Unit,
    remove: () => Unit,
    updated: Double => Unit,
    wrapper: element
  ): progressReporter = {
    val __obj = js.Dynamic.literal(aborted = js.Any.fromFunction0(aborted), bindLoader = js.Any.fromFunction1(bindLoader), done = js.Any.fromFunction0(done), failed = js.Any.fromFunction0(failed), remove = js.Any.fromFunction0(remove), updated = js.Any.fromFunction1(updated), wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[progressReporter]
  }
  @scala.inline
  implicit class progressReporterOps[Self <: progressReporter] (val x: Self) extends AnyVal {
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
    def setAborted(value: () => Unit): Self = this.set("aborted", js.Any.fromFunction0(value))
    @scala.inline
    def setBindLoader(value: fileLoader => Unit): Self = this.set("bindLoader", js.Any.fromFunction1(value))
    @scala.inline
    def setDone(value: () => Unit): Self = this.set("done", js.Any.fromFunction0(value))
    @scala.inline
    def setFailed(value: () => Unit): Self = this.set("failed", js.Any.fromFunction0(value))
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdated(value: Double => Unit): Self = this.set("updated", js.Any.fromFunction1(value))
    @scala.inline
    def setWrapper(value: element): Self = this.set("wrapper", value.asInstanceOf[js.Any])
  }
  
}

