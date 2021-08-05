package typings.baseui

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonMod {
  
  @JSImport("baseui/skeleton", "Skeleton")
  @js.native
  class Skeleton protected ()
    extends Component[SkeletonPropsT, js.Object, js.Any] {
    def this(props: SkeletonPropsT) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SkeletonPropsT, context: js.Any) = this()
  }
  
  trait SkeletonOverrides extends StObject {
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Row: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
  }
  object SkeletonOverrides {
    
    inline def apply(): SkeletonOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonOverrides]
    }
    
    extension [Self <: SkeletonOverrides](x: Self) {
      
      inline def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setRow(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "Row", js.undefined)
    }
  }
  
  trait SkeletonPropsT extends StObject {
    
    var animation: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var overrides: js.UndefOr[SkeletonOverrides] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object SkeletonPropsT {
    
    inline def apply(): SkeletonPropsT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonPropsT]
    }
    
    extension [Self <: SkeletonPropsT](x: Self) {
      
      inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setOverrides(value: SkeletonOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
