package typings.bpmnDashModdle.bpmnDashModdleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Definitions extends BaseElement {
  var diagrams: BPMNDiagram
  var er: String
  var erVersion: String
  var expressionLanguage: String
  var extensions: js.Array[Extension]
  var imports: js.Array[Import]
  var name: String
  var relationship: js.Array[Relationship]
  var rootElements: js.Array[RootElement]
  var targetNamespace: String
  var typeLanguage: String
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
    typeLanguage: String,
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): Definitions = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], diagrams = diagrams.asInstanceOf[js.Any], er = er.asInstanceOf[js.Any], erVersion = erVersion.asInstanceOf[js.Any], expressionLanguage = expressionLanguage.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any], rootElements = rootElements.asInstanceOf[js.Any], targetNamespace = targetNamespace.asInstanceOf[js.Any], typeLanguage = typeLanguage.asInstanceOf[js.Any])
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions.asInstanceOf[js.Any])
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definitions]
  }
}

