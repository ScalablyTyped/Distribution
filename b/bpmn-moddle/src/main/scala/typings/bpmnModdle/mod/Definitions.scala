package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Definitions extends BaseElement {
  var diagrams: BPMNDiagram = js.native
  var er: String = js.native
  var erVersion: String = js.native
  var expressionLanguage: String = js.native
  var extensions: js.Array[Extension] = js.native
  var imports: js.Array[Import] = js.native
  var name: String = js.native
  var relationship: js.Array[Relationship] = js.native
  var rootElements: js.Array[RootElement] = js.native
  var targetNamespace: String = js.native
  var typeLanguage: String = js.native
}

object Definitions {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    diagrams: BPMNDiagram,
    er: String,
    erVersion: String,
    expressionLanguage: String,
    extensions: js.Array[Extension],
    id: String,
    imports: js.Array[Import],
    name: String,
    relationship: js.Array[Relationship],
    rootElements: js.Array[RootElement],
    targetNamespace: String,
    typeLanguage: String
  ): Definitions = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], diagrams = diagrams.asInstanceOf[js.Any], er = er.asInstanceOf[js.Any], erVersion = erVersion.asInstanceOf[js.Any], expressionLanguage = expressionLanguage.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any], rootElements = rootElements.asInstanceOf[js.Any], targetNamespace = targetNamespace.asInstanceOf[js.Any], typeLanguage = typeLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definitions]
  }
  @scala.inline
  implicit class DefinitionsOps[Self <: Definitions] (val x: Self) extends AnyVal {
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
    def setDiagrams(value: BPMNDiagram): Self = this.set("diagrams", value.asInstanceOf[js.Any])
    @scala.inline
    def setEr(value: String): Self = this.set("er", value.asInstanceOf[js.Any])
    @scala.inline
    def setErVersion(value: String): Self = this.set("erVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpressionLanguage(value: String): Self = this.set("expressionLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[Extension]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setImportsVarargs(value: Import*): Self = this.set("imports", js.Array(value :_*))
    @scala.inline
    def setImports(value: js.Array[Import]): Self = this.set("imports", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelationshipVarargs(value: Relationship*): Self = this.set("relationship", js.Array(value :_*))
    @scala.inline
    def setRelationship(value: js.Array[Relationship]): Self = this.set("relationship", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootElementsVarargs(value: RootElement*): Self = this.set("rootElements", js.Array(value :_*))
    @scala.inline
    def setRootElements(value: js.Array[RootElement]): Self = this.set("rootElements", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetNamespace(value: String): Self = this.set("targetNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeLanguage(value: String): Self = this.set("typeLanguage", value.asInstanceOf[js.Any])
  }
  
}

