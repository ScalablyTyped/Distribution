package typings.tslintXANLscI2

import typings.std.Partial
import typings.std.Set
import typings.tslintXANLscI2.completedDocsRuleDTsMod.All
import typings.tslintXANLscI2.exclusionDescriptorsDTsMod.ExclusionDescriptor
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exclusionDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/completed-docs/exclusion.d.ts", "Exclusion")
  @js.native
  abstract class Exclusion[TDescriptor /* <: ExclusionDescriptor */] () extends StObject {
    def this(descriptor: Partial[TDescriptor]) = this()
    
    /* protected */ def createSet[T /* <: All | String */](): Set[T] = js.native
    /* protected */ def createSet[T /* <: All | String */](values: js.Array[T]): Set[T] = js.native
    
    /* protected */ val descriptor: Partial[TDescriptor] = js.native
    
    def excludes(node: Node): Boolean = js.native
  }
}
