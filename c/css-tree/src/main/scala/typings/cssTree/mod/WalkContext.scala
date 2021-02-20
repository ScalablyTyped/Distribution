package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WalkContext extends StObject {
  
  var atrule: Atrule | Null = js.native
  
  var atrulePrelude: AtrulePrelude | Null = js.native
  
  var block: Block | Null = js.native
  
  var declaration: Declaration | Null = js.native
  
  var function: FunctionNode | PseudoClassSelector | PseudoElementSelector | Null = js.native
  
  var root: CssNode = js.native
  
  var rule: Rule | Null = js.native
  
  var selector: SelectorList | Null = js.native
  
  var stylesheet: StyleSheet | Null = js.native
}
object WalkContext {
  
  @scala.inline
  def apply(root: CssNode): WalkContext = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalkContext]
  }
  
  @scala.inline
  implicit class WalkContextMutableBuilder[Self <: WalkContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAtrule(value: Atrule): Self = StObject.set(x, "atrule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtruleNull: Self = StObject.set(x, "atrule", null)
    
    @scala.inline
    def setAtrulePrelude(value: AtrulePrelude): Self = StObject.set(x, "atrulePrelude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtrulePreludeNull: Self = StObject.set(x, "atrulePrelude", null)
    
    @scala.inline
    def setBlock(value: Block): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockNull: Self = StObject.set(x, "block", null)
    
    @scala.inline
    def setDeclaration(value: Declaration): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclarationNull: Self = StObject.set(x, "declaration", null)
    
    @scala.inline
    def setFunction(value: FunctionNode | PseudoClassSelector | PseudoElementSelector): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionNull: Self = StObject.set(x, "function", null)
    
    @scala.inline
    def setRoot(value: CssNode): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRule(value: Rule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleNull: Self = StObject.set(x, "rule", null)
    
    @scala.inline
    def setSelector(value: SelectorList): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorNull: Self = StObject.set(x, "selector", null)
    
    @scala.inline
    def setStylesheet(value: StyleSheet): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesheetNull: Self = StObject.set(x, "stylesheet", null)
  }
}
