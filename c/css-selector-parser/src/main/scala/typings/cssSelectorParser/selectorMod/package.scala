package typings.cssSelectorParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object selectorMod {
  
  type RuleAttr = typings.cssSelectorParser.anon.Name with (js.Object | typings.cssSelectorParser.anon.Operator)
  
  type RulePseudo = typings.cssSelectorParser.anon.Name with (typings.cssSelectorParser.anon.Value | typings.cssSelectorParser.anon.ValueType)
}
