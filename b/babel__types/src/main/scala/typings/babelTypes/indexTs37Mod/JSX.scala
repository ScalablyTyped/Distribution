package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.JSXAttribute
import typings.babelTypes.babelTypesStrings.JSXClosingElement
import typings.babelTypes.babelTypesStrings.JSXClosingFragment
import typings.babelTypes.babelTypesStrings.JSXElement
import typings.babelTypes.babelTypesStrings.JSXEmptyExpression
import typings.babelTypes.babelTypesStrings.JSXExpressionContainer
import typings.babelTypes.babelTypesStrings.JSXFragment
import typings.babelTypes.babelTypesStrings.JSXIdentifier
import typings.babelTypes.babelTypesStrings.JSXMemberExpression
import typings.babelTypes.babelTypesStrings.JSXNamespacedName
import typings.babelTypes.babelTypesStrings.JSXOpeningElement
import typings.babelTypes.babelTypesStrings.JSXOpeningFragment
import typings.babelTypes.babelTypesStrings.JSXSpreadAttribute
import typings.babelTypes.babelTypesStrings.JSXSpreadChild
import typings.babelTypes.babelTypesStrings.JSXText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.indexTs37Mod.JSXAttribute_
  - typings.babelTypes.indexTs37Mod.JSXClosingElement_
  - typings.babelTypes.indexTs37Mod.JSXElement_
  - typings.babelTypes.indexTs37Mod.JSXEmptyExpression_
  - typings.babelTypes.indexTs37Mod.JSXExpressionContainer_
  - typings.babelTypes.indexTs37Mod.JSXSpreadChild_
  - typings.babelTypes.indexTs37Mod.JSXIdentifier_
  - typings.babelTypes.indexTs37Mod.JSXMemberExpression_
  - typings.babelTypes.indexTs37Mod.JSXNamespacedName_
  - typings.babelTypes.indexTs37Mod.JSXOpeningElement_
  - typings.babelTypes.indexTs37Mod.JSXSpreadAttribute_
  - typings.babelTypes.indexTs37Mod.JSXText_
  - typings.babelTypes.indexTs37Mod.JSXFragment_
  - typings.babelTypes.indexTs37Mod.JSXOpeningFragment_
  - typings.babelTypes.indexTs37Mod.JSXClosingFragment_
*/
trait JSX extends _Node
object JSX {
  
  @scala.inline
  def JSXAttribute_(name: JSXIdentifier_ | JSXNamespacedName_, `type`: JSXAttribute): typings.babelTypes.indexTs37Mod.JSXAttribute_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXAttribute_]
  }
  
  @scala.inline
  def JSXClosingElement_(name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_, `type`: JSXClosingElement): typings.babelTypes.indexTs37Mod.JSXClosingElement_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXClosingElement_]
  }
  
  @scala.inline
  def JSXClosingFragment_(`type`: JSXClosingFragment): typings.babelTypes.indexTs37Mod.JSXClosingFragment_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXClosingFragment_]
  }
  
  @scala.inline
  def JSXElement_(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | typings.babelTypes.indexTs37Mod.JSXElement_ | JSXFragment_
    ],
    openingElement: JSXOpeningElement_,
    `type`: JSXElement
  ): typings.babelTypes.indexTs37Mod.JSXElement_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXElement_]
  }
  
  @scala.inline
  def JSXEmptyExpression_(`type`: JSXEmptyExpression): typings.babelTypes.indexTs37Mod.JSXEmptyExpression_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXEmptyExpression_]
  }
  
  @scala.inline
  def JSXExpressionContainer_(expression: Expression | JSXEmptyExpression_, `type`: JSXExpressionContainer): typings.babelTypes.indexTs37Mod.JSXExpressionContainer_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXExpressionContainer_]
  }
  
  @scala.inline
  def JSXFragment_(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | typings.babelTypes.indexTs37Mod.JSXFragment_
    ],
    closingFragment: JSXClosingFragment_,
    openingFragment: JSXOpeningFragment_,
    `type`: JSXFragment
  ): typings.babelTypes.indexTs37Mod.JSXFragment_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXFragment_]
  }
  
  @scala.inline
  def JSXIdentifier_(name: String, `type`: JSXIdentifier): typings.babelTypes.indexTs37Mod.JSXIdentifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXIdentifier_]
  }
  
  @scala.inline
  def JSXMemberExpression_(
    `object`: typings.babelTypes.indexTs37Mod.JSXMemberExpression_ | JSXIdentifier_,
    property: JSXIdentifier_,
    `type`: JSXMemberExpression
  ): typings.babelTypes.indexTs37Mod.JSXMemberExpression_ = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXMemberExpression_]
  }
  
  @scala.inline
  def JSXNamespacedName_(name: JSXIdentifier_, namespace: JSXIdentifier_, `type`: JSXNamespacedName): typings.babelTypes.indexTs37Mod.JSXNamespacedName_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXNamespacedName_]
  }
  
  @scala.inline
  def JSXOpeningElement_(
    attributes: js.Array[JSXAttribute_ | JSXSpreadAttribute_],
    name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_,
    selfClosing: Boolean,
    `type`: JSXOpeningElement
  ): typings.babelTypes.indexTs37Mod.JSXOpeningElement_ = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXOpeningElement_]
  }
  
  @scala.inline
  def JSXOpeningFragment_(`type`: JSXOpeningFragment): typings.babelTypes.indexTs37Mod.JSXOpeningFragment_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXOpeningFragment_]
  }
  
  @scala.inline
  def JSXSpreadAttribute_(argument: Expression, `type`: JSXSpreadAttribute): typings.babelTypes.indexTs37Mod.JSXSpreadAttribute_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXSpreadAttribute_]
  }
  
  @scala.inline
  def JSXSpreadChild_(expression: Expression, `type`: JSXSpreadChild): typings.babelTypes.indexTs37Mod.JSXSpreadChild_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXSpreadChild_]
  }
  
  @scala.inline
  def JSXText_(`type`: JSXText, value: String): typings.babelTypes.indexTs37Mod.JSXText_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXText_]
  }
}
