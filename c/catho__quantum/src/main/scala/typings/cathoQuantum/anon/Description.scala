package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var imageDescription: js.UndefOr[String] = js.undefined
  
  var imagePath: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object Description {
  
  inline def apply(): Description = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Description]
  }
  
  extension [Self <: Description](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setImageDescription(value: String): Self = StObject.set(x, "imageDescription", value.asInstanceOf[js.Any])
    
    inline def setImageDescriptionUndefined: Self = StObject.set(x, "imageDescription", js.undefined)
    
    inline def setImagePath(value: String): Self = StObject.set(x, "imagePath", value.asInstanceOf[js.Any])
    
    inline def setImagePathUndefined: Self = StObject.set(x, "imagePath", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
