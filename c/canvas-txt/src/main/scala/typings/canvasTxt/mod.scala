package typings.canvasTxt

import typings.canvasTxt.canvasTxtStrings.bottom
import typings.canvasTxt.canvasTxtStrings.center
import typings.canvasTxt.canvasTxtStrings.left
import typings.canvasTxt.canvasTxtStrings.middle
import typings.canvasTxt.canvasTxtStrings.right
import typings.canvasTxt.canvasTxtStrings.top
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("canvas-txt", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  var align: center | left | right = js.native
  
  var debug: Boolean = js.native
  
  def drawText(ctx: CanvasRenderingContext2D, text: String, x: Double, y: Double, width: Double, height: Double): js.Any = js.native
  
  var font: String = js.native
  
  var fontSize: Double = js.native
  
  var fontStyle: String = js.native
  
  var fontVariant: String = js.native
  
  var fontWeight: String | Double = js.native
  
  var justify: Boolean = js.native
  
  var lineHeight: Double | Null = js.native
  
  var vAlign: middle | top | bottom = js.native
}
