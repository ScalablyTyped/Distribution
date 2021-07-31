package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKernelInfo extends StObject {
  
  var display_name: js.UndefOr[String] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var name: String
}
object IKernelInfo {
  
  @scala.inline
  def apply(name: String): IKernelInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKernelInfo]
  }
  
  @scala.inline
  implicit class IKernelInfoMutableBuilder[Self <: IKernelInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay_nameUndefined: Self = StObject.set(x, "display_name", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
