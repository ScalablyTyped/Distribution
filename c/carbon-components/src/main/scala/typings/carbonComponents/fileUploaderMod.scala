package typings.carbonComponents

import typings.carbonComponents.anon.ClassDragOver
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("carbon-components/components/file-uploader/file-uploader", JSImport.Namespace)
@js.native
object fileUploaderMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait FileUploader extends js.Object {
    def _changeState(state: js.Any, detail: js.Any, callback: js.Any): Unit = js.native
    def _checkmarkHTML(): String = js.native
    def _closeButtonHTML(): String = js.native
    def _displayFilenames(): Unit = js.native
    def _displayFilenames(files: js.Any): Unit = js.native
    def _filenamesHTML(name: js.Any, id: js.Any): String = js.native
    def _getStateContainers(): js.Array[_] = js.native
    def _handleDeleteButton(evt: js.Any): Unit = js.native
    def _handleDragDrop(evt: js.Any): Unit = js.native
    def _handleStateChange(elements: js.Any, selectIndex: js.Any, html: js.Any): Unit = js.native
    def _removeState(element: js.Any): Unit = js.native
    def _uploadHTML(): String = js.native
    def setState(state: js.Any, selectIndex: js.Any): Unit = js.native
  }
  
  @js.native
  class default protected () extends FileUploader {
    def this(element: js.Any) = this()
    def this(element: js.Any, options: js.Object) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var components: WeakMap[js.Object, _] = js.native
    def options: ClassDragOver = js.native
  }
  
}

