package typings.babelTraverse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisitNodeObject[T] extends js.Object {
  
  var enter: js.UndefOr[js.Function2[/* path */ NodePath[T], /* state */ js.Any, Unit]] = js.native
  
  var exit: js.UndefOr[js.Function2[/* path */ NodePath[T], /* state */ js.Any, Unit]] = js.native
}
object VisitNodeObject {
  
  @scala.inline
  def apply[T](): VisitNodeObject[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisitNodeObject[T]]
  }
  
  @scala.inline
  implicit class VisitNodeObjectOps[Self <: VisitNodeObject[_], T] (val x: Self with VisitNodeObject[T]) extends AnyVal {
    
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
    def setEnter(value: (/* path */ NodePath[T], /* state */ js.Any) => Unit): Self = this.set("enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* path */ NodePath[T], /* state */ js.Any) => Unit): Self = this.set("exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteExit: Self = this.set("exit", js.undefined)
  }
}
