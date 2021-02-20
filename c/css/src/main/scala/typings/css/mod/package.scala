package typings.css

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def parse(code: java.lang.String): typings.css.mod.Stylesheet = typings.css.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any]).asInstanceOf[typings.css.mod.Stylesheet]
  @scala.inline
  def parse(code: java.lang.String, options: typings.css.mod.ParserOptions): typings.css.mod.Stylesheet = (typings.css.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.css.mod.Stylesheet]
  
  @scala.inline
  def stringify(stylesheet: typings.css.mod.Stylesheet): java.lang.String = typings.css.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(stylesheet.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(stylesheet: typings.css.mod.Stylesheet, options: typings.css.mod.StringifyOptions): java.lang.String = (typings.css.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(stylesheet.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
}
