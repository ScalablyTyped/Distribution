package typings.babylonWalk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait jsxVisitors[V] extends js.Object {
  
  var JSXAttribute: js.UndefOr[V] = js.native
  
  var JSXClosingElement: js.UndefOr[V] = js.native
  
  var JSXElement: js.UndefOr[V] = js.native
  
  var JSXEmptyExpression: js.UndefOr[V] = js.native
  
  var JSXExpressionContainer: js.UndefOr[V] = js.native
  
  var JSXIdentifier: js.UndefOr[V] = js.native
  
  var JSXMemberExpression: js.UndefOr[V] = js.native
  
  var JSXNamespacedName: js.UndefOr[V] = js.native
  
  var JSXOpeningElement: js.UndefOr[V] = js.native
  
  var JSXSpreadAttribute: js.UndefOr[V] = js.native
  
  var JSXText: js.UndefOr[V] = js.native
}
object jsxVisitors {
  
  @scala.inline
  def apply[V](): jsxVisitors[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[jsxVisitors[V]]
  }
  
  @scala.inline
  implicit class jsxVisitorsOps[Self <: jsxVisitors[_], V] (val x: Self with jsxVisitors[V]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJSXAttribute(value: V): Self = this.set("JSXAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJSXAttribute: Self = this.set("JSXAttribute", js.undefined)
    
    @scala.inline
    def setJSXClosingElement(value: V): Self = this.set("JSXClosingElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJSXClosingElement: Self = this.set("JSXClosingElement", js.undefined)
    
    @scala.inline
    def setJSXElement(value: V): Self = this.set("JSXElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJSXElement: Self = this.set("JSXElement", js.undefined)
    
    @scala.inline
    def setJSXEmptyExpression(value: V): Self = this.set("JSXEmptyExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJSXEmptyExpression: Self = this.set("JSXEmptyExpression", js.undefined)
    
    @scala.inline
    def setJSXExpressionContainer(value: V): Self = this.set("JSXExpressionContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJSXExpressionContainer: Self = this.set("JSXExpressionContainer", js.undefined)
    
    @scala.inline
    def setJSXIdentifier(value: V): Self = this.set("JSXIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJSXIdentifier: Self = this.set("JSXIdentifier", js.undefined)
    
    @scala.inline
    def setJSXMemberExpression(value: V): Self = this.set("JSXMemberExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJSXMemberExpression: Self = this.set("JSXMemberExpression", js.undefined)
    
    @scala.inline
    def setJSXNamespacedName(value: V): Self = this.set("JSXNamespacedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJSXNamespacedName: Self = this.set("JSXNamespacedName", js.undefined)
    
    @scala.inline
    def setJSXOpeningElement(value: V): Self = this.set("JSXOpeningElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJSXOpeningElement: Self = this.set("JSXOpeningElement", js.undefined)
    
    @scala.inline
    def setJSXSpreadAttribute(value: V): Self = this.set("JSXSpreadAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJSXSpreadAttribute: Self = this.set("JSXSpreadAttribute", js.undefined)
    
    @scala.inline
    def setJSXText(value: V): Self = this.set("JSXText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJSXText: Self = this.set("JSXText", js.undefined)
  }
}
