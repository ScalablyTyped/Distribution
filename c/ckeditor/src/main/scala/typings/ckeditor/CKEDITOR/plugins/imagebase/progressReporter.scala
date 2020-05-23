package typings.ckeditor.CKEDITOR.plugins.imagebase

import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.fileTools.fileLoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait progressReporter extends js.Object {
  var wrapper: element
  def aborted(): Unit
  def bindLoader(loader: fileLoader): Unit
  def done(): Unit
  def failed(): Unit
  def remove(): Unit
  def updated(progress: Double): Unit
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
}

