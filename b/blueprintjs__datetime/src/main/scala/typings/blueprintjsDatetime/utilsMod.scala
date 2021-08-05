package typings.blueprintjsDatetime

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def measureTextWidth(text: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("measureTextWidth")(text.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def measureTextWidth(text: String, className: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("measureTextWidth")(text.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def measureTextWidth(text: String, className: String, containerElement: HTMLElement): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("measureTextWidth")(text.asInstanceOf[js.Any], className.asInstanceOf[js.Any], containerElement.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def measureTextWidth(text: String, className: Unit, containerElement: HTMLElement): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("measureTextWidth")(text.asInstanceOf[js.Any], className.asInstanceOf[js.Any], containerElement.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def padWithZeroes(str: String, minLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padWithZeroes")(str.asInstanceOf[js.Any], minLength.asInstanceOf[js.Any])).asInstanceOf[String]
}
