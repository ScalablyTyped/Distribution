package typings.babelTypes.indexTs37Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait JSX
  extends StObject
     with _Node
object JSX {
  
  inline def JSXAttribute_(name: JSXIdentifier_ | JSXNamespacedName_): typings.babelTypes.indexTs37Mod.JSXAttribute_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, value = null)
    __obj.updateDynamic("type")("JSXAttribute")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXAttribute_]
  }
  
  inline def JSXClosingElement_(name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_): typings.babelTypes.indexTs37Mod.JSXClosingElement_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXClosingElement")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXClosingElement_]
  }
  
  inline def JSXClosingFragment_(): typings.babelTypes.indexTs37Mod.JSXClosingFragment_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXClosingFragment")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXClosingFragment_]
  }
  
  inline def JSXElement_(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | typings.babelTypes.indexTs37Mod.JSXElement_ | JSXFragment_
    ],
    openingElement: JSXOpeningElement_
  ): typings.babelTypes.indexTs37Mod.JSXElement_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], closingElement = null, end = null, innerComments = null, leadingComments = null, loc = null, selfClosing = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXElement_]
  }
  
  inline def JSXEmptyExpression_(): typings.babelTypes.indexTs37Mod.JSXEmptyExpression_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXEmptyExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXEmptyExpression_]
  }
  
  inline def JSXExpressionContainer_(expression: Expression | JSXEmptyExpression_): typings.babelTypes.indexTs37Mod.JSXExpressionContainer_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXExpressionContainer")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXExpressionContainer_]
  }
  
  inline def JSXFragment_(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | typings.babelTypes.indexTs37Mod.JSXFragment_
    ],
    closingFragment: JSXClosingFragment_,
    openingFragment: JSXOpeningFragment_
  ): typings.babelTypes.indexTs37Mod.JSXFragment_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXFragment")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXFragment_]
  }
  
  inline def JSXIdentifier_(name: String): typings.babelTypes.indexTs37Mod.JSXIdentifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXIdentifier")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXIdentifier_]
  }
  
  inline def JSXMemberExpression_(
    `object`: typings.babelTypes.indexTs37Mod.JSXMemberExpression_ | JSXIdentifier_,
    property: JSXIdentifier_
  ): typings.babelTypes.indexTs37Mod.JSXMemberExpression_ = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXMemberExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXMemberExpression_]
  }
  
  inline def JSXNamespacedName_(name: JSXIdentifier_, namespace: JSXIdentifier_): typings.babelTypes.indexTs37Mod.JSXNamespacedName_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXNamespacedName")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXNamespacedName_]
  }
  
  inline def JSXOpeningElement_(
    attributes: js.Array[JSXAttribute_ | JSXSpreadAttribute_],
    name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_,
    selfClosing: Boolean
  ): typings.babelTypes.indexTs37Mod.JSXOpeningElement_ = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("JSXOpeningElement")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXOpeningElement_]
  }
  
  inline def JSXOpeningFragment_(): typings.babelTypes.indexTs37Mod.JSXOpeningFragment_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXOpeningFragment")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXOpeningFragment_]
  }
  
  inline def JSXSpreadAttribute_(argument: Expression): typings.babelTypes.indexTs37Mod.JSXSpreadAttribute_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXSpreadAttribute")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXSpreadAttribute_]
  }
  
  inline def JSXSpreadChild_(expression: Expression): typings.babelTypes.indexTs37Mod.JSXSpreadChild_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXSpreadChild")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXSpreadChild_]
  }
  
  inline def JSXText_(value: String): typings.babelTypes.indexTs37Mod.JSXText_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXText_]
  }
}
