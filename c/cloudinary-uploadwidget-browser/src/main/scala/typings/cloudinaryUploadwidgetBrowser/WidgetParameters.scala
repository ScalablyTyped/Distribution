package typings.cloudinaryUploadwidgetBrowser

import typings.cloudinaryUploadwidgetBrowser.anon.Iv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WidgetParameters extends StObject {
  
  var defaultSource: js.UndefOr[Source] = js.undefined
  
  var encryption: js.UndefOr[Iv] = js.undefined
  
  var maxFiles: js.UndefOr[Double] = js.undefined
  
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  var secure: js.UndefOr[Boolean] = js.undefined
  
  var sources: js.UndefOr[js.Array[Source]] = js.undefined
}
object WidgetParameters {
  
  inline def apply(): WidgetParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidgetParameters]
  }
  
  extension [Self <: WidgetParameters](x: Self) {
    
    inline def setDefaultSource(value: Source): Self = StObject.set(x, "defaultSource", value.asInstanceOf[js.Any])
    
    inline def setDefaultSourceUndefined: Self = StObject.set(x, "defaultSource", js.undefined)
    
    inline def setEncryption(value: Iv): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
    
    inline def setMaxFiles(value: Double): Self = StObject.set(x, "maxFiles", value.asInstanceOf[js.Any])
    
    inline def setMaxFilesUndefined: Self = StObject.set(x, "maxFiles", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    inline def setSources(value: js.Array[Source]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: Source*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
