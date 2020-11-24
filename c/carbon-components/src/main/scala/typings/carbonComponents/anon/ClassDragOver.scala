package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassDragOver extends js.Object {
  
  var classDragOver: String = js.native
  
  var classFileClose: String = js.native
  
  var classFileComplete: String = js.native
  
  var classFileName: String = js.native
  
  var classLoading: String = js.native
  
  var classLoadingAnimation: String = js.native
  
  var classLoadingBackground: String = js.native
  
  var classLoadingStroke: String = js.native
  
  var classLoadingSvg: String = js.native
  
  var classSelectedFile: String = js.native
  
  var classStateContainer: String = js.native
  
  var eventAfterDeleteFilenameFileuploader: String = js.native
  
  var eventBeforeDeleteFilenameFileuploader: String = js.native
  
  var selectorCloseButton: String = js.native
  
  var selectorContainer: String = js.native
  
  var selectorDropContainer: String = js.native
  
  var selectorInit: String = js.native
  
  var selectorInput: String = js.native
  
  var selectorOtherDropContainers: String = js.native
  
  var selectorSelectedFile: String = js.native
}
object ClassDragOver {
  
  @scala.inline
  def apply(
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
  ): ClassDragOver = {
    val __obj = js.Dynamic.literal(classDragOver = classDragOver.asInstanceOf[js.Any], classFileClose = classFileClose.asInstanceOf[js.Any], classFileComplete = classFileComplete.asInstanceOf[js.Any], classFileName = classFileName.asInstanceOf[js.Any], classLoading = classLoading.asInstanceOf[js.Any], classLoadingAnimation = classLoadingAnimation.asInstanceOf[js.Any], classLoadingBackground = classLoadingBackground.asInstanceOf[js.Any], classLoadingStroke = classLoadingStroke.asInstanceOf[js.Any], classLoadingSvg = classLoadingSvg.asInstanceOf[js.Any], classSelectedFile = classSelectedFile.asInstanceOf[js.Any], classStateContainer = classStateContainer.asInstanceOf[js.Any], eventAfterDeleteFilenameFileuploader = eventAfterDeleteFilenameFileuploader.asInstanceOf[js.Any], eventBeforeDeleteFilenameFileuploader = eventBeforeDeleteFilenameFileuploader.asInstanceOf[js.Any], selectorCloseButton = selectorCloseButton.asInstanceOf[js.Any], selectorContainer = selectorContainer.asInstanceOf[js.Any], selectorDropContainer = selectorDropContainer.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorInput = selectorInput.asInstanceOf[js.Any], selectorOtherDropContainers = selectorOtherDropContainers.asInstanceOf[js.Any], selectorSelectedFile = selectorSelectedFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassDragOver]
  }
  
  @scala.inline
  implicit class ClassDragOverOps[Self <: ClassDragOver] (val x: Self) extends AnyVal {
    
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
    def setClassDragOver(value: String): Self = this.set("classDragOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassFileClose(value: String): Self = this.set("classFileClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassFileComplete(value: String): Self = this.set("classFileComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassFileName(value: String): Self = this.set("classFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassLoading(value: String): Self = this.set("classLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassLoadingAnimation(value: String): Self = this.set("classLoadingAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassLoadingBackground(value: String): Self = this.set("classLoadingBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassLoadingStroke(value: String): Self = this.set("classLoadingStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassLoadingSvg(value: String): Self = this.set("classLoadingSvg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassSelectedFile(value: String): Self = this.set("classSelectedFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassStateContainer(value: String): Self = this.set("classStateContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventAfterDeleteFilenameFileuploader(value: String): Self = this.set("eventAfterDeleteFilenameFileuploader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventBeforeDeleteFilenameFileuploader(value: String): Self = this.set("eventBeforeDeleteFilenameFileuploader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorCloseButton(value: String): Self = this.set("selectorCloseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorContainer(value: String): Self = this.set("selectorContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorDropContainer(value: String): Self = this.set("selectorDropContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorInit(value: String): Self = this.set("selectorInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorInput(value: String): Self = this.set("selectorInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorOtherDropContainers(value: String): Self = this.set("selectorOtherDropContainers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorSelectedFile(value: String): Self = this.set("selectorSelectedFile", value.asInstanceOf[js.Any])
  }
}
