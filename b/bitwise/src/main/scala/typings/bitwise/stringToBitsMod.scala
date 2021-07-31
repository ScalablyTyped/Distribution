package typings.bitwise

import typings.bitwise.bitwiseTypesMod.Bit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringToBitsMod {
  
  @JSImport("bitwise/string/to-bits", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(string: String): js.Array[Bit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[Bit]]
}
