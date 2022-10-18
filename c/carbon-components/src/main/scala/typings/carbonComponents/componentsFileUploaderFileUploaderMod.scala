package typings.carbonComponents

import typings.carbonComponents.anon.FilenameElement
import typings.carbonComponents.anon.PartialFileUploaderOption
import typings.carbonComponents.carbonComponentsStrings.complete
import typings.carbonComponents.carbonComponentsStrings.edit
import typings.carbonComponents.carbonComponentsStrings.update
import typings.std.Event
import typings.std.FileList
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsFileUploaderFileUploaderMod {
  
  @JSImport("carbon-components/components/file-uploader/file-uploader", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with FileUploader {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialFileUploaderOption) = this()
  }
  object default {
    
    @JSImport("carbon-components/components/file-uploader/file-uploader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/file-uploader/file-uploader", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait FileUploader extends StObject {
    
    def _changeState(state: String, detail: FilenameElement): Unit = js.native
    def _changeState(state: String, detail: FilenameElement, callback: js.Function0[Unit]): Unit = js.native
    
    def _checkmarkHTML(): String = js.native
    
    def _closeButtonHTML(): String = js.native
    
    def _displayFilenames(): Unit = js.native
    def _displayFilenames(files: FileList): Unit = js.native
    
    def _filenamesHTML(name: String, id: String): String = js.native
    
    def _getStateContainers(): js.Array[HTMLElement] = js.native
    
    def _handleDeleteButton(evt: Event): Unit = js.native
    
    def _handleDragDrop(evt: MouseEvent): Unit = js.native
    
    def _handleStateChange(elements: js.Array[HTMLElement]): Unit = js.native
    def _handleStateChange(elements: js.Array[HTMLElement], selectIndex: Double): Unit = js.native
    def _handleStateChange(elements: js.Array[HTMLElement], selectIndex: Double, html: String): Unit = js.native
    def _handleStateChange(elements: js.Array[HTMLElement], selectIndex: Unit, html: String): Unit = js.native
    
    def _removeState(): Unit = js.native
    def _removeState(element: HTMLElement): Unit = js.native
    
    def _uploadHTML(): String = js.native
    
    def setState(state: edit | update | complete, selectIndex: Double): Unit = js.native
  }
  
  trait FileUploaderOptions extends StObject {
    
    var classDragOver: String
    
    var classFileClose: String
    
    var classFileComplete: String
    
    var classFileName: String
    
    var classLoading: String
    
    var classLoadingAnimation: String
    
    var classLoadingBackground: String
    
    var classLoadingStroke: String
    
    var classLoadingSvg: String
    
    var classSelectedFile: String
    
    var classStateContainer: String
    
    var eventAfterDeleteFilenameFileuploader: String
    
    var eventBeforeDeleteFilenameFileuploader: String
    
    var selectorCloseButton: String
    
    var selectorContainer: String
    
    var selectorDropContainer: String
    
    var selectorInit: String
    
    var selectorInput: String
    
    var selectorOtherDropContainers: String
    
    var selectorSelectedFile: String
  }
  object FileUploaderOptions {
    
    inline def apply(
      classDragOver: String,
      classFileClose: String,
      classFileComplete: String,
      classFileName: String,
      classLoading: String,
      classLoadingAnimation: String,
      classLoadingBackground: String,
      classLoadingStroke: String,
      classLoadingSvg: String,
      classSelectedFile: String,
      classStateContainer: String,
      eventAfterDeleteFilenameFileuploader: String,
      eventBeforeDeleteFilenameFileuploader: String,
      selectorCloseButton: String,
      selectorContainer: String,
      selectorDropContainer: String,
      selectorInit: String,
      selectorInput: String,
      selectorOtherDropContainers: String,
      selectorSelectedFile: String
    ): FileUploaderOptions = {
      val __obj = js.Dynamic.literal(classDragOver = classDragOver.asInstanceOf[js.Any], classFileClose = classFileClose.asInstanceOf[js.Any], classFileComplete = classFileComplete.asInstanceOf[js.Any], classFileName = classFileName.asInstanceOf[js.Any], classLoading = classLoading.asInstanceOf[js.Any], classLoadingAnimation = classLoadingAnimation.asInstanceOf[js.Any], classLoadingBackground = classLoadingBackground.asInstanceOf[js.Any], classLoadingStroke = classLoadingStroke.asInstanceOf[js.Any], classLoadingSvg = classLoadingSvg.asInstanceOf[js.Any], classSelectedFile = classSelectedFile.asInstanceOf[js.Any], classStateContainer = classStateContainer.asInstanceOf[js.Any], eventAfterDeleteFilenameFileuploader = eventAfterDeleteFilenameFileuploader.asInstanceOf[js.Any], eventBeforeDeleteFilenameFileuploader = eventBeforeDeleteFilenameFileuploader.asInstanceOf[js.Any], selectorCloseButton = selectorCloseButton.asInstanceOf[js.Any], selectorContainer = selectorContainer.asInstanceOf[js.Any], selectorDropContainer = selectorDropContainer.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorInput = selectorInput.asInstanceOf[js.Any], selectorOtherDropContainers = selectorOtherDropContainers.asInstanceOf[js.Any], selectorSelectedFile = selectorSelectedFile.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUploaderOptions]
    }
    
    extension [Self <: FileUploaderOptions](x: Self) {
      
      inline def setClassDragOver(value: String): Self = StObject.set(x, "classDragOver", value.asInstanceOf[js.Any])
      
      inline def setClassFileClose(value: String): Self = StObject.set(x, "classFileClose", value.asInstanceOf[js.Any])
      
      inline def setClassFileComplete(value: String): Self = StObject.set(x, "classFileComplete", value.asInstanceOf[js.Any])
      
      inline def setClassFileName(value: String): Self = StObject.set(x, "classFileName", value.asInstanceOf[js.Any])
      
      inline def setClassLoading(value: String): Self = StObject.set(x, "classLoading", value.asInstanceOf[js.Any])
      
      inline def setClassLoadingAnimation(value: String): Self = StObject.set(x, "classLoadingAnimation", value.asInstanceOf[js.Any])
      
      inline def setClassLoadingBackground(value: String): Self = StObject.set(x, "classLoadingBackground", value.asInstanceOf[js.Any])
      
      inline def setClassLoadingStroke(value: String): Self = StObject.set(x, "classLoadingStroke", value.asInstanceOf[js.Any])
      
      inline def setClassLoadingSvg(value: String): Self = StObject.set(x, "classLoadingSvg", value.asInstanceOf[js.Any])
      
      inline def setClassSelectedFile(value: String): Self = StObject.set(x, "classSelectedFile", value.asInstanceOf[js.Any])
      
      inline def setClassStateContainer(value: String): Self = StObject.set(x, "classStateContainer", value.asInstanceOf[js.Any])
      
      inline def setEventAfterDeleteFilenameFileuploader(value: String): Self = StObject.set(x, "eventAfterDeleteFilenameFileuploader", value.asInstanceOf[js.Any])
      
      inline def setEventBeforeDeleteFilenameFileuploader(value: String): Self = StObject.set(x, "eventBeforeDeleteFilenameFileuploader", value.asInstanceOf[js.Any])
      
      inline def setSelectorCloseButton(value: String): Self = StObject.set(x, "selectorCloseButton", value.asInstanceOf[js.Any])
      
      inline def setSelectorContainer(value: String): Self = StObject.set(x, "selectorContainer", value.asInstanceOf[js.Any])
      
      inline def setSelectorDropContainer(value: String): Self = StObject.set(x, "selectorDropContainer", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
      
      inline def setSelectorInput(value: String): Self = StObject.set(x, "selectorInput", value.asInstanceOf[js.Any])
      
      inline def setSelectorOtherDropContainers(value: String): Self = StObject.set(x, "selectorOtherDropContainers", value.asInstanceOf[js.Any])
      
      inline def setSelectorSelectedFile(value: String): Self = StObject.set(x, "selectorSelectedFile", value.asInstanceOf[js.Any])
    }
  }
}
