package typings.babelPluginReactHtmlAttrs.mod

import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuspenseProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /** A fallback react tree to show when a Suspense child (like React.lazy) suspends */
  var fallback: NonNullable[ReactNode] | Null
  
  /**
    * Tells React whether to “skip” revealing this boundary during the initial load.
    * This API will likely be removed in a future release.
    */
  // NOTE: this is unflagged and is respected even in stable builds
  var unstable_avoidThisFallback: js.UndefOr[Boolean] = js.undefined
}
object SuspenseProps {
  
  @scala.inline
  def apply(): SuspenseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuspenseProps]
  }
  
  @scala.inline
  implicit class SuspensePropsMutableBuilder[Self <: SuspenseProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenNull: Self = StObject.set(x, "children", null)
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setFallback(value: NonNullable[ReactNode]): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackNull: Self = StObject.set(x, "fallback", null)
    
    @scala.inline
    def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    @scala.inline
    def setUnstable_avoidThisFallback(value: Boolean): Self = StObject.set(x, "unstable_avoidThisFallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnstable_avoidThisFallbackUndefined: Self = StObject.set(x, "unstable_avoidThisFallback", js.undefined)
  }
}
