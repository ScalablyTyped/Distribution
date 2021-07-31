package typings.cordovaPluginMediaCapture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Encapsulates a set of media capture parameters that a device supports. */
trait ConfigurationData extends StObject {
  
  /** The height of the image or video in pixels. The value is zero for sound clips. */
  var height: Double
  
  /** The ASCII-encoded lowercase string representing the media type. */
  var `type`: String
  
  /** The width of the image or video in pixels. The value is zero for sound clips. */
  var width: Double
}
object ConfigurationData {
  
  @scala.inline
  def apply(height: Double, `type`: String, width: Double): ConfigurationData = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationData]
  }
  
  @scala.inline
  implicit class ConfigurationDataMutableBuilder[Self <: ConfigurationData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
