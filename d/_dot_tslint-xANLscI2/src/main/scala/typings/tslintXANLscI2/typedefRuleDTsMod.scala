package typings.tslintXANLscI2

import typings.tslintXANLscI2.mod.Rules.AbstractRule
import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.IRuleMetadata
import typings.typescript.mod.Node
import typings.typescript.mod.NodeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typedefRuleDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/typedefRule.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".tslint-xANLscI2/lib/rules/typedefRule.d.ts", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport(".tslint-xANLscI2/lib/rules/typedefRule.d.ts", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".tslint-xANLscI2/lib/rules/typedefRule.d.ts", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
  
  inline def isNodeArray(nodeOrArray: Node): /* is typescript.typescript.NodeArray<typescript.typescript.Node> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodeArray")(nodeOrArray.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.NodeArray<typescript.typescript.Node> */ Boolean]
  inline def isNodeArray(nodeOrArray: NodeArray[Node]): /* is typescript.typescript.NodeArray<typescript.typescript.Node> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodeArray")(nodeOrArray.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.NodeArray<typescript.typescript.Node> */ Boolean]
}
