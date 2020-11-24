package typings.carbonComponents.codeSnippetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait CodeSnippet extends js.Object {
  
  def _handleClick(): Unit = js.native
  
  def _initCodeSnippet(): Unit = js.native
}
object CodeSnippet {
  
  @scala.inline
  def apply(_handleClick: () => Unit, _initCodeSnippet: () => Unit): CodeSnippet = {
    val __obj = js.Dynamic.literal(_handleClick = js.Any.fromFunction0(_handleClick), _initCodeSnippet = js.Any.fromFunction0(_initCodeSnippet))
    __obj.asInstanceOf[CodeSnippet]
  }
  
  @scala.inline
  implicit class CodeSnippetOps[Self <: CodeSnippet] (val x: Self) extends AnyVal {
    
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
    def set_handleClick(value: () => Unit): Self = this.set("_handleClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_initCodeSnippet(value: () => Unit): Self = this.set("_initCodeSnippet", js.Any.fromFunction0(value))
  }
}
