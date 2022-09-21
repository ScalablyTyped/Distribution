package typings.awsSdk.gamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SectionModification extends StObject {
  
  /**
    * The operation to be performed on a configuration section.  Content can be added, deleted, or replaced within a section. 
    */
  var Operation: typings.awsSdk.gamesparksMod.Operation
  
  /**
    * The path within the section content to be modified.
    */
  var Path: typings.awsSdk.gamesparksMod.Path
  
  /**
    * The name of the section to be modified.
    */
  var Section: SectionName
  
  /**
    * For add and replace operations, this is the value that will be used.  This field should be omitted for delete operations. 
    */
  var Value: js.UndefOr[Document] = js.undefined
}
object SectionModification {
  
  inline def apply(Operation: Operation, Path: Path, Section: SectionName): SectionModification = {
    val __obj = js.Dynamic.literal(Operation = Operation.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Section = Section.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionModification]
  }
  
  extension [Self <: SectionModification](x: Self) {
    
    inline def setOperation(value: Operation): Self = StObject.set(x, "Operation", value.asInstanceOf[js.Any])
    
    inline def setPath(value: Path): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setSection(value: SectionName): Self = StObject.set(x, "Section", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Document): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
