package typings.coreJs

import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof core.String` */
object coreStringMod {
  
  @JSImport("core-js/library/core/string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def at(text: java.lang.String, index: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("at")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  inline def codePointAt(text: java.lang.String, pos: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("codePointAt")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def endsWith(text: java.lang.String, searchString: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(text.asInstanceOf[js.Any], searchString.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def endsWith(text: java.lang.String, searchString: java.lang.String, endPosition: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(text.asInstanceOf[js.Any], searchString.asInstanceOf[js.Any], endPosition.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def escapeHTML(text: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeHTML")(text.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  inline def fromCodePoint(codePoints: Double*): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCodePoint")(codePoints.asInstanceOf[Seq[js.Any]]*).asInstanceOf[java.lang.String]
  
  inline def includes(text: java.lang.String, searchString: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(text.asInstanceOf[js.Any], searchString.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def includes(text: java.lang.String, searchString: java.lang.String, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(text.asInstanceOf[js.Any], searchString.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def padEnd(text: java.lang.String, length: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("padEnd")(text.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def padEnd(text: java.lang.String, length: Double, fillStr: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("padEnd")(text.asInstanceOf[js.Any], length.asInstanceOf[js.Any], fillStr.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  inline def padStart(text: java.lang.String, length: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("padStart")(text.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def padStart(text: java.lang.String, length: Double, fillStr: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("padStart")(text.asInstanceOf[js.Any], length.asInstanceOf[js.Any], fillStr.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  inline def raw(template: TemplateStringsArray, substitutions: Any*): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("raw")(scala.List(template.asInstanceOf[js.Any]).`++`(substitutions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[java.lang.String]
  
  inline def repeat(text: java.lang.String, count: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(text.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  inline def startsWith(text: java.lang.String, searchString: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(text.asInstanceOf[js.Any], searchString.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def startsWith(text: java.lang.String, searchString: java.lang.String, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(text.asInstanceOf[js.Any], searchString.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def unescapeHTML(text: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeHTML")(text.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
}
