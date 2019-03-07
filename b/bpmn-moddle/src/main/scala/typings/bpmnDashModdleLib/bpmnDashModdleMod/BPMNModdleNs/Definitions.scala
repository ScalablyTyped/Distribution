package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Definitions extends BaseElement {
  var diagrams: BPMNDiagram
  var er: java.lang.String
  var erVersion: java.lang.String
  var expressionLanguage: java.lang.String
  var extensions: js.Array[Extension]
  var imports: js.Array[Import]
  var name: java.lang.String
  var relationship: js.Array[Relationship]
  var rootElements: js.Array[RootElement]
  var targetNamespace: java.lang.String
  var typeLanguage: java.lang.String
}

object Definitions {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    diagrams: BPMNDiagram,
    er: java.lang.String,
    erVersion: java.lang.String,
    expressionLanguage: java.lang.String,
    extensions: js.Array[Extension],
    id: java.lang.String,
    imports: js.Array[Import],
    name: java.lang.String,
    relationship: js.Array[Relationship],
    rootElements: js.Array[RootElement],
    targetNamespace: java.lang.String,
    typeLanguage: java.lang.String,
    $attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
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

