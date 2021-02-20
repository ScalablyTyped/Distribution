package typings.deoxxaContentType

import org.scalablytyped.runtime.Shortcut
import typings.deoxxaContentType.ContentType.MediaType
import typings.deoxxaContentType.ContentType.MediaTypeStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("content-type", JSImport.Namespace)
  @js.native
  class ^ protected () extends MediaType {
    def this(s: String) = this()
    def this(s: String, p: js.Any) = this()
  }
  @JSImport("content-type", JSImport.Namespace)
  @js.native
  val ^ : MediaTypeStatic = js.native
  
  type _To = MediaTypeStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: MediaTypeStatic = ^
}
