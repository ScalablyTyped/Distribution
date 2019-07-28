package typings.babylonDashWalk.babylonDashWalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait jsxVisitors[V] extends js.Object {
  var JSXAttribute: js.UndefOr[V] = js.undefined
  var JSXClosingElement: js.UndefOr[V] = js.undefined
  var JSXElement: js.UndefOr[V] = js.undefined
  var JSXEmptyExpression: js.UndefOr[V] = js.undefined
  var JSXExpressionContainer: js.UndefOr[V] = js.undefined
  var JSXIdentifier: js.UndefOr[V] = js.undefined
  var JSXMemberExpression: js.UndefOr[V] = js.undefined
  var JSXNamespacedName: js.UndefOr[V] = js.undefined
  var JSXOpeningElement: js.UndefOr[V] = js.undefined
  var JSXSpreadAttribute: js.UndefOr[V] = js.undefined
  var JSXText: js.UndefOr[V] = js.undefined
}

object jsxVisitors {
  @scala.inline
  def apply[V](
    JSXAttribute: V = null,
    JSXClosingElement: V = null,
    JSXElement: V = null,
    JSXEmptyExpression: V = null,
    JSXExpressionContainer: V = null,
    JSXIdentifier: V = null,
    JSXMemberExpression: V = null,
    JSXNamespacedName: V = null,
    JSXOpeningElement: V = null,
    JSXSpreadAttribute: V = null,
    JSXText: V = null
  ): jsxVisitors[V] = {
    val __obj = js.Dynamic.literal()
    if (JSXAttribute != null) __obj.updateDynamic("JSXAttribute")(JSXAttribute.asInstanceOf[js.Any])
    if (JSXClosingElement != null) __obj.updateDynamic("JSXClosingElement")(JSXClosingElement.asInstanceOf[js.Any])
    if (JSXElement != null) __obj.updateDynamic("JSXElement")(JSXElement.asInstanceOf[js.Any])
    if (JSXEmptyExpression != null) __obj.updateDynamic("JSXEmptyExpression")(JSXEmptyExpression.asInstanceOf[js.Any])
    if (JSXExpressionContainer != null) __obj.updateDynamic("JSXExpressionContainer")(JSXExpressionContainer.asInstanceOf[js.Any])
    if (JSXIdentifier != null) __obj.updateDynamic("JSXIdentifier")(JSXIdentifier.asInstanceOf[js.Any])
    if (JSXMemberExpression != null) __obj.updateDynamic("JSXMemberExpression")(JSXMemberExpression.asInstanceOf[js.Any])
    if (JSXNamespacedName != null) __obj.updateDynamic("JSXNamespacedName")(JSXNamespacedName.asInstanceOf[js.Any])
    if (JSXOpeningElement != null) __obj.updateDynamic("JSXOpeningElement")(JSXOpeningElement.asInstanceOf[js.Any])
    if (JSXSpreadAttribute != null) __obj.updateDynamic("JSXSpreadAttribute")(JSXSpreadAttribute.asInstanceOf[js.Any])
    if (JSXText != null) __obj.updateDynamic("JSXText")(JSXText.asInstanceOf[js.Any])
    __obj.asInstanceOf[jsxVisitors[V]]
  }
}

