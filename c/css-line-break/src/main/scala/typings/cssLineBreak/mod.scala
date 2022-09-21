package typings.cssLineBreak

import typings.cssLineBreak.lineBreakMod.ILineBreakIterator
import typings.cssLineBreak.lineBreakMod.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("css-line-break", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def LineBreaker(str: String): ILineBreakIterator = ^.asInstanceOf[js.Dynamic].applyDynamic("LineBreaker")(str.asInstanceOf[js.Any]).asInstanceOf[ILineBreakIterator]
  inline def LineBreaker(str: String, options: IOptions): ILineBreakIterator = (^.asInstanceOf[js.Dynamic].applyDynamic("LineBreaker")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ILineBreakIterator]
  
  inline def fromCodePoint(codePoints: Double*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCodePoint")(codePoints.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def toCodePoints(str: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toCodePoints")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
}
