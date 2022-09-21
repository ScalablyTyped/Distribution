package typings.css.mod

import typings.css.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def parse(code: String): Stylesheet = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any]).asInstanceOf[Stylesheet]
inline def parse(code: String, options: ParserOptions): Stylesheet = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Stylesheet]

inline def stringify(stylesheet: Stylesheet): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(stylesheet.asInstanceOf[js.Any]).asInstanceOf[String]
inline def stringify(stylesheet: Stylesheet, options: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(stylesheet.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
