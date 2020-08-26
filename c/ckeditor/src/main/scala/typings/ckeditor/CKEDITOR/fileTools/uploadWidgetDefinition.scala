package typings.ckeditor.CKEDITOR.fileTools

import typings.ckeditor.CKEDITOR.plugins.widget.definition
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait uploadWidgetDefinition extends definition {
  var additionalRequestParameters: js.Any = js.native
  var loadMethod: String = js.native
  var loaderType: js.Any = js.native
  var skipNotifications: Boolean = js.native
  var supportedTypes: String = js.native
  var uploadUrl: String = js.native
  def fileToElement(pastedFile: js.Any): HTMLElement = js.native
  def onAbort(): Boolean = js.native
  def onError(): Boolean = js.native
  def onLoaded(): Boolean = js.native
  def onUploaded(): Boolean = js.native
  def onUploading(): Boolean = js.native
  def replaceWith(): js.Any = js.native
}

object uploadWidgetDefinition {
  @scala.inline
  def apply(
    additionalRequestParameters: js.Any,
    fileToElement: js.Any => HTMLElement,
    loadMethod: String,
    loaderType: js.Any,
    onAbort: () => Boolean,
    onError: () => Boolean,
    onLoaded: () => Boolean,
    onUploaded: () => Boolean,
    onUploading: () => Boolean,
    replaceWith: () => js.Any,
    skipNotifications: Boolean,
    supportedTypes: String,
    uploadUrl: String
  ): uploadWidgetDefinition = {
    val __obj = js.Dynamic.literal(additionalRequestParameters = additionalRequestParameters.asInstanceOf[js.Any], fileToElement = js.Any.fromFunction1(fileToElement), loadMethod = loadMethod.asInstanceOf[js.Any], loaderType = loaderType.asInstanceOf[js.Any], onAbort = js.Any.fromFunction0(onAbort), onError = js.Any.fromFunction0(onError), onLoaded = js.Any.fromFunction0(onLoaded), onUploaded = js.Any.fromFunction0(onUploaded), onUploading = js.Any.fromFunction0(onUploading), replaceWith = js.Any.fromFunction0(replaceWith), skipNotifications = skipNotifications.asInstanceOf[js.Any], supportedTypes = supportedTypes.asInstanceOf[js.Any], uploadUrl = uploadUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[uploadWidgetDefinition]
  }
  @scala.inline
  implicit class uploadWidgetDefinitionOps[Self <: uploadWidgetDefinition] (val x: Self) extends AnyVal {
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
    def setAdditionalRequestParameters(value: js.Any): Self = this.set("additionalRequestParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileToElement(value: js.Any => HTMLElement): Self = this.set("fileToElement", js.Any.fromFunction1(value))
    @scala.inline
    def setLoadMethod(value: String): Self = this.set("loadMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoaderType(value: js.Any): Self = this.set("loaderType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnAbort(value: () => Boolean): Self = this.set("onAbort", js.Any.fromFunction0(value))
    @scala.inline
    def setOnError(value: () => Boolean): Self = this.set("onError", js.Any.fromFunction0(value))
    @scala.inline
    def setOnLoaded(value: () => Boolean): Self = this.set("onLoaded", js.Any.fromFunction0(value))
    @scala.inline
    def setOnUploaded(value: () => Boolean): Self = this.set("onUploaded", js.Any.fromFunction0(value))
    @scala.inline
    def setOnUploading(value: () => Boolean): Self = this.set("onUploading", js.Any.fromFunction0(value))
    @scala.inline
    def setReplaceWith(value: () => js.Any): Self = this.set("replaceWith", js.Any.fromFunction0(value))
    @scala.inline
    def setSkipNotifications(value: Boolean): Self = this.set("skipNotifications", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportedTypes(value: String): Self = this.set("supportedTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploadUrl(value: String): Self = this.set("uploadUrl", value.asInstanceOf[js.Any])
  }
  
}

