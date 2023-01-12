package typings.cathoQuantum

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infiniteScrollMod {
  
  @JSImport("@catho/quantum/InfiniteScroll", JSImport.Default)
  @js.native
  open class default ()
    extends Component[InfiniteScrollProps, js.Object, Any]
  
  type InfiniteScroll = Component[InfiniteScrollProps, js.Object, Any]
  
  trait InfiniteScrollProps extends StObject {
    
    var children: (js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReactNode */ Any
      ]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReactNode */ Any)
    
    var onScrollEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
  }
  object InfiniteScrollProps {
    
    inline def apply(
      children: (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReactNode */ Any
        ]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReactNode */ Any)
    ): InfiniteScrollProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[InfiniteScrollProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InfiniteScrollProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(
        value: (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReactNode */ Any
            ]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReactNode */ Any)
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReactNode */ Any)*
      ): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setOnScrollEnd(value: () => Unit): Self = StObject.set(x, "onScrollEnd", js.Any.fromFunction0(value))
      
      inline def setOnScrollEndUndefined: Self = StObject.set(x, "onScrollEnd", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    }
  }
}
