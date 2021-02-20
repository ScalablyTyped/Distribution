package typings.blessed.mod.Widgets

import typings.blessed.blessedStrings.ansi
import typings.blessed.blessedStrings.overlay
import typings.blessed.blessedStrings.w3m
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageOptions extends BoxOptions {
  
  /**
    * path to image.
    */
  var file: String = js.native
  
  /**
    * path to w3mimgdisplay. if a proper w3mimgdisplay path is not given, blessed will search the
    * entire disk for the binary.
    */
  var `type`: ansi | overlay | w3m = js.native
}
object ImageOptions {
  
  @scala.inline
  def apply(file: String, `type`: ansi | overlay | w3m): ImageOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageOptions]
  }
  
  @scala.inline
  implicit class ImageOptionsMutableBuilder[Self <: ImageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ansi | overlay | w3m): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
