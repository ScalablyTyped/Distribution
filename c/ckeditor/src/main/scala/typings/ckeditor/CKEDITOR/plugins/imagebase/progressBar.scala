package typings.ckeditor.CKEDITOR.plugins.imagebase

import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.fileTools.fileLoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait progressBar extends progressReporter {
  var bar: element
}

object progressBar {
  @scala.inline
  def apply(
    aborted: () => Unit,
    bar: element,
    bindLoader: fileLoader => Unit,
    done: () => Unit,
    failed: () => Unit,
    remove: () => Unit,
    updated: Double => Unit,
    wrapper: element
  ): progressBar = {
    val __obj = js.Dynamic.literal(aborted = js.Any.fromFunction0(aborted), bar = bar.asInstanceOf[js.Any], bindLoader = js.Any.fromFunction1(bindLoader), done = js.Any.fromFunction0(done), failed = js.Any.fromFunction0(failed), remove = js.Any.fromFunction0(remove), updated = js.Any.fromFunction1(updated), wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[progressBar]
  }
}

