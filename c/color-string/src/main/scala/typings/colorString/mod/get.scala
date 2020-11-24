package typings.colorString.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("color-string", "get")
@js.native
object get extends js.Object {
  
  def apply(colorString: String): ColorDescriptor | Null = js.native
  
  def hsl(colorString: String): Color | Null = js.native
  
  def hwb(colorString: String): Color | Null = js.native
  
  def rgb(colorString: String): Color | Null = js.native
}
