package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// This should be "infer SS" but can't use it yet
@js.native
trait NewLifecycle[P, S, SS] extends StObject {
  
  /**
    * Called immediately after updating occurs. Not called for the initial render.
    *
    * The snapshot is only present if getSnapshotBeforeUpdate is present and returns non-null.
    */
  var componentDidUpdate: js.UndefOr[
    js.Function3[/* prevProps */ P, /* prevState */ S, /* snapshot */ js.UndefOr[SS], Unit]
  ] = js.native
  
  /**
    * Runs before React applies the result of `render` to the document, and
    * returns an object to be given to componentDidUpdate. Useful for saving
    * things such as scroll position before `render` causes changes to it.
    *
    * Note: the presence of getSnapshotBeforeUpdate prevents any of the deprecated
    * lifecycle events from running.
    */
  var getSnapshotBeforeUpdate: js.UndefOr[js.Function2[/* prevProps */ P, /* prevState */ S, SS | Null]] = js.native
}
object NewLifecycle {
  
  @scala.inline
  def apply[P, S, SS](): NewLifecycle[P, S, SS] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewLifecycle[P, S, SS]]
  }
  
  @scala.inline
  implicit class NewLifecycleMutableBuilder[Self <: NewLifecycle[_, _, _], P, S, SS] (val x: Self with (NewLifecycle[P, S, SS])) extends AnyVal {
    
    @scala.inline
    def setComponentDidUpdate(value: (/* prevProps */ P, /* prevState */ S, /* snapshot */ js.UndefOr[SS]) => Unit): Self = StObject.set(x, "componentDidUpdate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setComponentDidUpdateUndefined: Self = StObject.set(x, "componentDidUpdate", js.undefined)
    
    @scala.inline
    def setGetSnapshotBeforeUpdate(value: (/* prevProps */ P, /* prevState */ S) => SS | Null): Self = StObject.set(x, "getSnapshotBeforeUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetSnapshotBeforeUpdateUndefined: Self = StObject.set(x, "getSnapshotBeforeUpdate", js.undefined)
  }
}
