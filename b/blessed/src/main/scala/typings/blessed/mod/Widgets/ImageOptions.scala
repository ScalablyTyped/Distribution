package typings.blessed.mod.Widgets

import typings.blessed.blessedStrings.ansi
import typings.blessed.blessedStrings.overlay
import typings.blessed.blessedStrings.w3m
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageOptions
  extends StObject
     with BoxOptions {
  
  /**
    * path to image.
    */
  var file: String
  
  /**
    * path to w3mimgdisplay. if a proper w3mimgdisplay path is not given, blessed will search the
    * entire disk for the binary.
    */
  var `type`: ansi | overlay | w3m
}
object ImageOptions {
  
  inline def apply(file: String, `type`: ansi | overlay | w3m): ImageOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageOptions]
  }
  
  extension [Self <: ImageOptions](x: Self) {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setType(value: ansi | overlay | w3m): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
