package typings.baseui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationUtilsMod {
  
  @JSImport("baseui/pagination/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clamp(num: Double, minNum: Double, maxNum: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(num.asInstanceOf[js.Any], minNum.asInstanceOf[js.Any], maxNum.asInstanceOf[js.Any])).asInstanceOf[Double]
}
