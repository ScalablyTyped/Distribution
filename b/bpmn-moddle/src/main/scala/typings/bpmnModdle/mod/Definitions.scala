package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class DefinitionsMutableBuilder[Self <: Definitions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiagrams(value: BPMNDiagram): Self = StObject.set(x, "diagrams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEr(value: String): Self = StObject.set(x, "er", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErVersion(value: String): Self = StObject.set(x, "erVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionLanguage(value: String): Self = StObject.set(x, "expressionLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensions(value: js.Array[Extension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setImports(value: js.Array[Import]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportsVarargs(value: Import*): Self = StObject.set(x, "imports", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationship(value: js.Array[Relationship]): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipVarargs(value: Relationship*): Self = StObject.set(x, "relationship", js.Array(value :_*))
    
    @scala.inline
    def setRootElements(value: js.Array[RootElement]): Self = StObject.set(x, "rootElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootElementsVarargs(value: RootElement*): Self = StObject.set(x, "rootElements", js.Array(value :_*))
    
    @scala.inline
    def setTargetNamespace(value: String): Self = StObject.set(x, "targetNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeLanguage(value: String): Self = StObject.set(x, "typeLanguage", value.asInstanceOf[js.Any])
  }
}
