package typings.canvg

import typings.canvg.distTypesMod.MatrixValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringMod {
  
  @JSImport("canvg/dist/util/string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compressSpaces(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("compressSpaces")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeAttributeName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeAttributeName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeColor(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeColor")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseExternalUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseExternalUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toMatrixValue(str: String): MatrixValue = ^.asInstanceOf[js.Dynamic].applyDynamic("toMatrixValue")(str.asInstanceOf[js.Any]).asInstanceOf[MatrixValue]
  
  inline def toNumbers(str: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toNumbers")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def trimLeft(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimLeft")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def trimRight(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimRight")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
