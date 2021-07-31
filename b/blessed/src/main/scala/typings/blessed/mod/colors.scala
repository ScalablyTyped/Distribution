package typings.blessed.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colors {
  
  @JSImport("blessed", "colors")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def `match`(hexColor: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(hexColor.asInstanceOf[js.Any]).asInstanceOf[String]
}
