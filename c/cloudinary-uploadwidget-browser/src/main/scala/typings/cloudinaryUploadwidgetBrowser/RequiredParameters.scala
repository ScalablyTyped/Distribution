package typings.cloudinaryUploadwidgetBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequiredParameters extends StObject {
  
  var cloudName: String
  
  var uploadPreset: js.UndefOr[String] = js.undefined
}
object RequiredParameters {
  
  inline def apply(cloudName: String): RequiredParameters = {
    val __obj = js.Dynamic.literal(cloudName = cloudName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequiredParameters] (val x: Self) extends AnyVal {
    
    inline def setCloudName(value: String): Self = StObject.set(x, "cloudName", value.asInstanceOf[js.Any])
    
    inline def setUploadPreset(value: String): Self = StObject.set(x, "uploadPreset", value.asInstanceOf[js.Any])
    
    inline def setUploadPresetUndefined: Self = StObject.set(x, "uploadPreset", js.undefined)
  }
}
