package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.ts36Mod.JSXAttribute_
  - typings.babelTypes.ts36Mod.JSXClosingElement_
  - typings.babelTypes.ts36Mod.JSXElement_
  - typings.babelTypes.ts36Mod.JSXEmptyExpression_
  - typings.babelTypes.ts36Mod.JSXExpressionContainer_
  - typings.babelTypes.ts36Mod.JSXIdentifier_
  - typings.babelTypes.ts36Mod.JSXMemberExpression_
  - typings.babelTypes.ts36Mod.JSXNamespacedName_
  - typings.babelTypes.ts36Mod.JSXOpeningElement_
  - typings.babelTypes.ts36Mod.JSXSpreadAttribute_
  - typings.babelTypes.ts36Mod.JSXText_
*/
trait JSX extends StObject
object JSX {
  
  inline def JSXAttribute_(end: Double, loc: SourceLocation, name: JSXIdentifier_ | JSXNamespacedName_, start: Double): typings.babelTypes.ts36Mod.JSXAttribute_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = null)
    __obj.updateDynamic("type")("JSXAttribute")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.JSXAttribute_]
  }
  
  inline def JSXClosingElement_(end: Double, loc: SourceLocation, name: JSXIdentifier_ | JSXMemberExpression_, start: Double): typings.babelTypes.ts36Mod.JSXClosingElement_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXClosingElement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.JSXClosingElement_]
  }
  
  inline def JSXElement_(
    children: js.Array[typings.babelTypes.ts36Mod.JSXElement_ | JSXExpressionContainer_ | JSXText_],
    closingElement: JSXClosingElement_,
    end: Double,
    loc: SourceLocation,
    openingElement: JSXOpeningElement_,
    start: Double
  ): typings.babelTypes.ts36Mod.JSXElement_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingElement = closingElement.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.JSXElement_]
  }
  
  inline def JSXEmptyExpression_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.JSXEmptyExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXEmptyExpression")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.JSXEmptyExpression_]
  }
  
  inline def JSXExpressionContainer_(end: Double, expression: Expression, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.JSXExpressionContainer_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXExpressionContainer")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.JSXExpressionContainer_]
  }
  
  inline def JSXIdentifier_(end: Double, loc: SourceLocation, name: String, start: Double): typings.babelTypes.ts36Mod.JSXIdentifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXIdentifier")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.JSXIdentifier_]
  }
  
  inline def JSXMemberExpression_(
    end: Double,
    loc: SourceLocation,
    `object`: typings.babelTypes.ts36Mod.JSXMemberExpression_ | JSXIdentifier_,
    property: JSXIdentifier_,
    start: Double
  ): typings.babelTypes.ts36Mod.JSXMemberExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXMemberExpression")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.JSXMemberExpression_]
  }
  
  inline def JSXNamespacedName_(end: Double, loc: SourceLocation, name: JSXIdentifier_, namespace: JSXIdentifier_, start: Double): typings.babelTypes.ts36Mod.JSXNamespacedName_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXNamespacedName")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.JSXNamespacedName_]
  }
  
  inline def JSXOpeningElement_(
    attributes: js.Array[JSXAttribute_],
    end: Double,
    loc: SourceLocation,
    name: JSXIdentifier_ | JSXMemberExpression_,
    selfClosing: Boolean,
    start: Double
  ): typings.babelTypes.ts36Mod.JSXOpeningElement_ = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXOpeningElement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.JSXOpeningElement_]
  }
  
  inline def JSXSpreadAttribute_(argument: Expression, end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.JSXSpreadAttribute_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXSpreadAttribute")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.JSXSpreadAttribute_]
  }
  
  inline def JSXText_(end: Double, loc: SourceLocation, start: Double, value: String): typings.babelTypes.ts36Mod.JSXText_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.JSXText_]
  }
}
