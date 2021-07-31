package typings.cryptiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cryptiles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fixedTimeComparison(a: String, b: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedTimeComparison")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def randomDigits(size: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomDigits")(size.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def randomString(size: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomString")(size.asInstanceOf[js.Any]).asInstanceOf[String]
}
