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
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type, diagrams = diagrams, er = er, erVersion = erVersion, expressionLanguage = expressionLanguage, extensions = extensions, id = id, imports = imports, name = name, relationship = relationship, rootElements = rootElements, targetNamespace = targetNamespace, typeLanguage = typeLanguage)
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions)
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements)
    __obj.asInstanceOf[Definitions]
  }
}

