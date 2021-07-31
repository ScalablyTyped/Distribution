package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemDefinition
  extends StObject
     with BaseElement {
  
  var `import`: Import
  
  /** @default false */
  var isCollection: Boolean
  
  var itemKind: ItemKind
  
  var structureRef: String
}
object ItemDefinition {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    `import`: Import,
    isCollection: Boolean,
    itemKind: ItemKind,
    structureRef: String
  ): ItemDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isCollection = isCollection.asInstanceOf[js.Any], itemKind = itemKind.asInstanceOf[js.Any], structureRef = structureRef.asInstanceOf[js.Any])
    __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemDefinition]
  }
  
  @scala.inline
  implicit class ItemDefinitionMutableBuilder[Self <: ItemDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImport(value: Import): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCollection(value: Boolean): Self = StObject.set(x, "isCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemKind(value: ItemKind): Self = StObject.set(x, "itemKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureRef(value: String): Self = StObject.set(x, "structureRef", value.asInstanceOf[js.Any])
  }
}
