package typings.babelPluginJestHoist.anon

import typings.babelTypes.mod.Identifier_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclareJestObjGetterIdentifier extends js.Object {
  
  def declareJestObjGetterIdentifier(): Identifier_ = js.native
  
  var jestObjGetterIdentifier: js.UndefOr[Identifier_] = js.native
}
object DeclareJestObjGetterIdentifier {
  
  @scala.inline
  def apply(declareJestObjGetterIdentifier: () => Identifier_): DeclareJestObjGetterIdentifier = {
    val __obj = js.Dynamic.literal(declareJestObjGetterIdentifier = js.Any.fromFunction0(declareJestObjGetterIdentifier))
    __obj.asInstanceOf[DeclareJestObjGetterIdentifier]
  }
  
  @scala.inline
  implicit class DeclareJestObjGetterIdentifierOps[Self <: DeclareJestObjGetterIdentifier] (val x: Self) extends AnyVal {
    
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
    def setDeclareJestObjGetterIdentifier(value: () => Identifier_): Self = this.set("declareJestObjGetterIdentifier", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJestObjGetterIdentifier(value: Identifier_): Self = this.set("jestObjGetterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJestObjGetterIdentifier: Self = this.set("jestObjGetterIdentifier", js.undefined)
  }
}
