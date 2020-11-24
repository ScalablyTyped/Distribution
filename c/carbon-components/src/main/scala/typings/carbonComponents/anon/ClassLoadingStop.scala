package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassLoadingStop extends js.Object {
  
  var classLoadingStop: String = js.native
  
  var selectorError: String = js.native
  
  var selectorFinished: String = js.native
  
  var selectorInit: String = js.native
  
  var selectorSpinner: String = js.native
  
  var selectorTextActive: String = js.native
  
  var selectorTextError: String = js.native
  
  var selectorTextFinished: String = js.native
}
object ClassLoadingStop {
  
  @scala.inline
  def apply(
    classLoadingStop: String,
    selectorError: String,
    selectorFinished: String,
    selectorInit: String,
    selectorSpinner: String,
    selectorTextActive: String,
    selectorTextError: String,
    selectorTextFinished: String
  ): ClassLoadingStop = {
    val __obj = js.Dynamic.literal(classLoadingStop = classLoadingStop.asInstanceOf[js.Any], selectorError = selectorError.asInstanceOf[js.Any], selectorFinished = selectorFinished.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorSpinner = selectorSpinner.asInstanceOf[js.Any], selectorTextActive = selectorTextActive.asInstanceOf[js.Any], selectorTextError = selectorTextError.asInstanceOf[js.Any], selectorTextFinished = selectorTextFinished.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassLoadingStop]
  }
  
  @scala.inline
  implicit class ClassLoadingStopOps[Self <: ClassLoadingStop] (val x: Self) extends AnyVal {
    
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
    def setClassLoadingStop(value: String): Self = this.set("classLoadingStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorError(value: String): Self = this.set("selectorError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorFinished(value: String): Self = this.set("selectorFinished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorInit(value: String): Self = this.set("selectorInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorSpinner(value: String): Self = this.set("selectorSpinner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorTextActive(value: String): Self = this.set("selectorTextActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorTextError(value: String): Self = this.set("selectorTextError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorTextFinished(value: String): Self = this.set("selectorTextFinished", value.asInstanceOf[js.Any])
  }
}
