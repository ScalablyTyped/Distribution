package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Definitions
  extends StObject
     with BaseElement {
  
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
  
  inline def apply(
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
  
  extension [Self <: Definitions](x: Self) {
    
    inline def setDiagrams(value: BPMNDiagram): Self = StObject.set(x, "diagrams", value.asInstanceOf[js.Any])
    
    inline def setEr(value: String): Self = StObject.set(x, "er", value.asInstanceOf[js.Any])
    
    inline def setErVersion(value: String): Self = StObject.set(x, "erVersion", value.asInstanceOf[js.Any])
    
    inline def setExpressionLanguage(value: String): Self = StObject.set(x, "expressionLanguage", value.asInstanceOf[js.Any])
    
    inline def setExtensions(value: js.Array[Extension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    inline def setImports(value: js.Array[Import]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsVarargs(value: Import*): Self = StObject.set(x, "imports", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRelationship(value: js.Array[Relationship]): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def setRelationshipVarargs(value: Relationship*): Self = StObject.set(x, "relationship", js.Array(value :_*))
    
    inline def setRootElements(value: js.Array[RootElement]): Self = StObject.set(x, "rootElements", value.asInstanceOf[js.Any])
    
    inline def setRootElementsVarargs(value: RootElement*): Self = StObject.set(x, "rootElements", js.Array(value :_*))
    
    inline def setTargetNamespace(value: String): Self = StObject.set(x, "targetNamespace", value.asInstanceOf[js.Any])
    
    inline def setTypeLanguage(value: String): Self = StObject.set(x, "typeLanguage", value.asInstanceOf[js.Any])
  }
}
