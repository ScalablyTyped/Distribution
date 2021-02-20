package typings.carbonComponents

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileUploaderMod {
  
  @JSImport("carbon-components/components/file-uploader/file-uploader", JSImport.Default)
  @js.native
  class default protected () extends FileUploader {
    def this(element: js.Any) = this()
    def this(element: js.Any, options: js.Object) = this()
  }
  object default {
    
    @JSImport("carbon-components/components/file-uploader/file-uploader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/file-uploader/file-uploader", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    @scala.inline
    def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait FileUploader extends StObject {
    
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
}
