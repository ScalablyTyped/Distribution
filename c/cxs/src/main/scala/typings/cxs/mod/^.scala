package typings.cxs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cxs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(styles: CSSObject): String = js.native
  
  /** Returns cached CSS as a string for server-side rendering */
  def css(): String = js.native
  
  /** Sets a custom className prefix */
  def prefix(`val`: String): Unit = js.native
  
  /** Resets the CSS cache for future renders */
  def reset(): Unit = js.native
}
