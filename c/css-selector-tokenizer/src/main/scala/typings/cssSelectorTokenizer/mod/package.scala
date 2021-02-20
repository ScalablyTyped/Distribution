package typings.cssSelectorTokenizer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def parse(selectors: java.lang.String): typings.cssSelectorTokenizer.mod.SelectorsNode = typings.cssSelectorTokenizer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(selectors.asInstanceOf[js.Any]).asInstanceOf[typings.cssSelectorTokenizer.mod.SelectorsNode]
  
  @scala.inline
  def parseValues(values: java.lang.String): typings.cssSelectorTokenizer.mod.ValuesNode = typings.cssSelectorTokenizer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseValues")(values.asInstanceOf[js.Any]).asInstanceOf[typings.cssSelectorTokenizer.mod.ValuesNode]
  
  @scala.inline
  def stringify(node: typings.cssSelectorTokenizer.mod.SelectorsNode): java.lang.String = typings.cssSelectorTokenizer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def stringifyValues(node: typings.cssSelectorTokenizer.mod.ValuesNode): java.lang.String = typings.cssSelectorTokenizer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stringifyValues")(node.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
}
