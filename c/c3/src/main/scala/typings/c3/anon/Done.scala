package typings.c3.anon

import typings.c3.mod.ArrayOrString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Done extends StObject {
  
  /** Called after data is loaded, but not after rendering. This is because rendering will finish after some transition and there is some time lag between loading and rendering. */
  var done: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var ids: js.UndefOr[ArrayOrString] = js.undefined
}
object Done {
  
  @scala.inline
  def apply(): Done = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Done]
  }
  
  @scala.inline
  implicit class DoneMutableBuilder[Self <: Done] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDone(value: () => Unit): Self = StObject.set(x, "done", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    @scala.inline
    def setIds(value: ArrayOrString): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
  }
}
