package typings.babylonWalk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait es2015Visitors[V] extends js.Object {
  var ArrayPattern: js.UndefOr[V] = js.native
  var ArrowFunctionExpression: js.UndefOr[V] = js.native
  var AssignmentPattern: js.UndefOr[V] = js.native
  var AwaitExpression: js.UndefOr[V] = js.native
  var BindExpression: js.UndefOr[V] = js.native
  var ClassBody: js.UndefOr[V] = js.native
  var ClassDeclaration: js.UndefOr[V] = js.native
  var ClassExpression: js.UndefOr[V] = js.native
  var ClassMethod: js.UndefOr[V] = js.native
  var ClassProperty: js.UndefOr[V] = js.native
  var Decorator: js.UndefOr[V] = js.native
  var DoExpression: js.UndefOr[V] = js.native
  var ExportAllDeclaration: js.UndefOr[V] = js.native
  var ExportDefaultDeclaration: js.UndefOr[V] = js.native
  var ExportDefaultSpecifier: js.UndefOr[V] = js.native
  var ExportNamedDeclaration: js.UndefOr[V] = js.native
  var ExportNamespaceSpecifier: js.UndefOr[V] = js.native
  var ExportSpecifier: js.UndefOr[V] = js.native
  var ForOfStatement: js.UndefOr[V] = js.native
  var ImportDeclaration: js.UndefOr[V] = js.native
  var ImportDefaultSpecifier: js.UndefOr[V] = js.native
  var ImportNamespaceSpecifier: js.UndefOr[V] = js.native
  var ImportSpecifier: js.UndefOr[V] = js.native
  var MetaProperty: js.UndefOr[V] = js.native
  var ObjectPattern: js.UndefOr[V] = js.native
  var SpreadElement: js.UndefOr[V] = js.native
  var Super: js.UndefOr[V] = js.native
  var TaggedTemplateExpression: js.UndefOr[V] = js.native
  var TemplateElement: js.UndefOr[V] = js.native
  var TemplateLiteral: js.UndefOr[V] = js.native
  var YieldExpression: js.UndefOr[V] = js.native
}

object es2015Visitors {
  @scala.inline
  def apply[V](): es2015Visitors[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[es2015Visitors[V]]
  }
  @scala.inline
  implicit class es2015VisitorsOps[Self <: es2015Visitors[_], V] (val x: Self with es2015Visitors[V]) extends AnyVal {
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
    def setArrayPattern(value: V): Self = this.set("ArrayPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrayPattern: Self = this.set("ArrayPattern", js.undefined)
    @scala.inline
    def setArrowFunctionExpression(value: V): Self = this.set("ArrowFunctionExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowFunctionExpression: Self = this.set("ArrowFunctionExpression", js.undefined)
    @scala.inline
    def setAssignmentPattern(value: V): Self = this.set("AssignmentPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignmentPattern: Self = this.set("AssignmentPattern", js.undefined)
    @scala.inline
    def setAwaitExpression(value: V): Self = this.set("AwaitExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwaitExpression: Self = this.set("AwaitExpression", js.undefined)
    @scala.inline
    def setBindExpression(value: V): Self = this.set("BindExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindExpression: Self = this.set("BindExpression", js.undefined)
    @scala.inline
    def setClassBody(value: V): Self = this.set("ClassBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassBody: Self = this.set("ClassBody", js.undefined)
    @scala.inline
    def setClassDeclaration(value: V): Self = this.set("ClassDeclaration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassDeclaration: Self = this.set("ClassDeclaration", js.undefined)
    @scala.inline
    def setClassExpression(value: V): Self = this.set("ClassExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassExpression: Self = this.set("ClassExpression", js.undefined)
    @scala.inline
    def setClassMethod(value: V): Self = this.set("ClassMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassMethod: Self = this.set("ClassMethod", js.undefined)
    @scala.inline
    def setClassProperty(value: V): Self = this.set("ClassProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassProperty: Self = this.set("ClassProperty", js.undefined)
    @scala.inline
    def setDecorator(value: V): Self = this.set("Decorator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecorator: Self = this.set("Decorator", js.undefined)
    @scala.inline
    def setDoExpression(value: V): Self = this.set("DoExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoExpression: Self = this.set("DoExpression", js.undefined)
    @scala.inline
    def setExportAllDeclaration(value: V): Self = this.set("ExportAllDeclaration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportAllDeclaration: Self = this.set("ExportAllDeclaration", js.undefined)
    @scala.inline
    def setExportDefaultDeclaration(value: V): Self = this.set("ExportDefaultDeclaration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportDefaultDeclaration: Self = this.set("ExportDefaultDeclaration", js.undefined)
    @scala.inline
    def setExportDefaultSpecifier(value: V): Self = this.set("ExportDefaultSpecifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportDefaultSpecifier: Self = this.set("ExportDefaultSpecifier", js.undefined)
    @scala.inline
    def setExportNamedDeclaration(value: V): Self = this.set("ExportNamedDeclaration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportNamedDeclaration: Self = this.set("ExportNamedDeclaration", js.undefined)
    @scala.inline
    def setExportNamespaceSpecifier(value: V): Self = this.set("ExportNamespaceSpecifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportNamespaceSpecifier: Self = this.set("ExportNamespaceSpecifier", js.undefined)
    @scala.inline
    def setExportSpecifier(value: V): Self = this.set("ExportSpecifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportSpecifier: Self = this.set("ExportSpecifier", js.undefined)
    @scala.inline
    def setForOfStatement(value: V): Self = this.set("ForOfStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForOfStatement: Self = this.set("ForOfStatement", js.undefined)
    @scala.inline
    def setImportDeclaration(value: V): Self = this.set("ImportDeclaration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportDeclaration: Self = this.set("ImportDeclaration", js.undefined)
    @scala.inline
    def setImportDefaultSpecifier(value: V): Self = this.set("ImportDefaultSpecifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportDefaultSpecifier: Self = this.set("ImportDefaultSpecifier", js.undefined)
    @scala.inline
    def setImportNamespaceSpecifier(value: V): Self = this.set("ImportNamespaceSpecifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportNamespaceSpecifier: Self = this.set("ImportNamespaceSpecifier", js.undefined)
    @scala.inline
    def setImportSpecifier(value: V): Self = this.set("ImportSpecifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportSpecifier: Self = this.set("ImportSpecifier", js.undefined)
    @scala.inline
    def setMetaProperty(value: V): Self = this.set("MetaProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetaProperty: Self = this.set("MetaProperty", js.undefined)
    @scala.inline
    def setObjectPattern(value: V): Self = this.set("ObjectPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectPattern: Self = this.set("ObjectPattern", js.undefined)
    @scala.inline
    def setSpreadElement(value: V): Self = this.set("SpreadElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpreadElement: Self = this.set("SpreadElement", js.undefined)
    @scala.inline
    def setSuper(value: V): Self = this.set("Super", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuper: Self = this.set("Super", js.undefined)
    @scala.inline
    def setTaggedTemplateExpression(value: V): Self = this.set("TaggedTemplateExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaggedTemplateExpression: Self = this.set("TaggedTemplateExpression", js.undefined)
    @scala.inline
    def setTemplateElement(value: V): Self = this.set("TemplateElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateElement: Self = this.set("TemplateElement", js.undefined)
    @scala.inline
    def setTemplateLiteral(value: V): Self = this.set("TemplateLiteral", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateLiteral: Self = this.set("TemplateLiteral", js.undefined)
    @scala.inline
    def setYieldExpression(value: V): Self = this.set("YieldExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYieldExpression: Self = this.set("YieldExpression", js.undefined)
  }
  
}

