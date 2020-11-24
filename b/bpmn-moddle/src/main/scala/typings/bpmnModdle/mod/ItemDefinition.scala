package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemDefinition extends BaseElement {
  
  var `import`: Import = js.native
  
  /** @default false */
  var isCollection: Boolean = js.native
  
  var itemKind: ItemKind = js.native
  
  var structureRef: String = js.native
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
  implicit class ItemDefinitionOps[Self <: ItemDefinition] (val x: Self) extends AnyVal {
    
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
    def setImport(value: Import): Self = this.set("import", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCollection(value: Boolean): Self = this.set("isCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemKind(value: ItemKind): Self = this.set("itemKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureRef(value: String): Self = this.set("structureRef", value.asInstanceOf[js.Any])
  }
}
