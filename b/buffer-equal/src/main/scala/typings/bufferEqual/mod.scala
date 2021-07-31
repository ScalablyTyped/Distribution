package typings.bufferEqual

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(actual: Buffer, expected: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].apply(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("buffer-equal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
