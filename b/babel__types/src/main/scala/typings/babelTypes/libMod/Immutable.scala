package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.libMod.StringLiteral_
  - typings.babelTypes.libMod.NumericLiteral_
  - typings.babelTypes.libMod.NullLiteral_
  - typings.babelTypes.libMod.BooleanLiteral_
  - typings.babelTypes.libMod.BigIntLiteral_
  - typings.babelTypes.libMod.JSXAttribute__
  - typings.babelTypes.libMod.JSXClosingElement__
  - typings.babelTypes.libMod.JSXElement__
  - typings.babelTypes.libMod.JSXExpressionContainer__
  - typings.babelTypes.libMod.JSXSpreadChild__
  - typings.babelTypes.libMod.JSXOpeningElement__
  - typings.babelTypes.libMod.JSXText__
  - typings.babelTypes.libMod.JSXFragment__
  - typings.babelTypes.libMod.JSXOpeningFragment__
  - typings.babelTypes.libMod.JSXClosingFragment__
  - typings.babelTypes.libMod.DecimalLiteral_
*/
trait Immutable extends StObject
object Immutable {
  
  inline def BigIntLiteral_(value: String): typings.babelTypes.libMod.BigIntLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.BigIntLiteral_]
  }
  
  inline def BooleanLiteral_(value: Boolean): typings.babelTypes.libMod.BooleanLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.BooleanLiteral_]
  }
  
  inline def DecimalLiteral_(value: String): typings.babelTypes.libMod.DecimalLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DecimalLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.DecimalLiteral_]
  }
  
  inline def JSXAttribute__(name: JSXIdentifier__ | JSXNamespacedName__): typings.babelTypes.libMod.JSXAttribute__ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXAttribute")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXAttribute__]
  }
  
  inline def JSXClosingElement__(name: JSXIdentifier__ | JSXMemberExpression__ | JSXNamespacedName__): typings.babelTypes.libMod.JSXClosingElement__ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXClosingElement")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXClosingElement__]
  }
  
  inline def JSXClosingFragment__(): typings.babelTypes.libMod.JSXClosingFragment__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXClosingFragment")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXClosingFragment__]
  }
  
  inline def JSXElement__(
    children: js.Array[
      JSXText__ | JSXExpressionContainer__ | JSXSpreadChild__ | typings.babelTypes.libMod.JSXElement__ | JSXFragment__
    ],
    openingElement: JSXOpeningElement__
  ): typings.babelTypes.libMod.JSXElement__ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXElement__]
  }
  
  inline def JSXExpressionContainer__(expression: Expression | JSXEmptyExpression__): typings.babelTypes.libMod.JSXExpressionContainer__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXExpressionContainer")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXExpressionContainer__]
  }
  
  inline def JSXFragment__(
    children: js.Array[
      JSXText__ | JSXExpressionContainer__ | JSXSpreadChild__ | JSXElement__ | typings.babelTypes.libMod.JSXFragment__
    ],
    closingFragment: JSXClosingFragment__,
    openingFragment: JSXOpeningFragment__
  ): typings.babelTypes.libMod.JSXFragment__ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXFragment")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXFragment__]
  }
  
  inline def JSXOpeningElement__(
    attributes: js.Array[JSXAttribute__ | JSXSpreadAttribute__],
    name: JSXIdentifier__ | JSXMemberExpression__ | JSXNamespacedName__,
    selfClosing: Boolean
  ): typings.babelTypes.libMod.JSXOpeningElement__ = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXOpeningElement")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXOpeningElement__]
  }
  
  inline def JSXOpeningFragment__(): typings.babelTypes.libMod.JSXOpeningFragment__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXOpeningFragment")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXOpeningFragment__]
  }
  
  inline def JSXSpreadChild__(expression: Expression): typings.babelTypes.libMod.JSXSpreadChild__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXSpreadChild")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXSpreadChild__]
  }
  
  inline def JSXText__(value: String): typings.babelTypes.libMod.JSXText__ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXText__]
  }
  
  inline def NullLiteral_(): typings.babelTypes.libMod.NullLiteral_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.NullLiteral_]
  }
  
  inline def NumericLiteral_(value: Double): typings.babelTypes.libMod.NumericLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.NumericLiteral_]
  }
  
  inline def StringLiteral_(value: String): typings.babelTypes.libMod.StringLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.StringLiteral_]
  }
}
