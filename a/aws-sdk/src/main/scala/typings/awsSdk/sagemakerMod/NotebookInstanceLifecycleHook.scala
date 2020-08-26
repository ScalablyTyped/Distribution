package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotebookInstanceLifecycleHook extends js.Object {
  /**
    * A base64-encoded string that contains a shell script for a notebook instance lifecycle configuration.
    */
  var Content: js.UndefOr[NotebookInstanceLifecycleConfigContent] = js.native
}

object NotebookInstanceLifecycleHook {
  @scala.inline
  def apply(): NotebookInstanceLifecycleHook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookInstanceLifecycleHook]
  }
  @scala.inline
  implicit class NotebookInstanceLifecycleHookOps[Self <: NotebookInstanceLifecycleHook] (val x: Self) extends AnyVal {
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
    def setContent(value: NotebookInstanceLifecycleConfigContent): Self = this.set("Content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("Content", js.undefined)
  }
  
}

