package typings.baseui

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait SkeletonOverrides extends StObject {
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Row: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
  }
  object SkeletonOverrides {
    
    @scala.inline
    def apply(): SkeletonOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonOverrides]
    }
    
    @scala.inline
    implicit class SkeletonOverridesMutableBuilder[Self <: SkeletonOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      @scala.inline
      def setRow(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowUndefined: Self = StObject.set(x, "Row", js.undefined)
    }
  }
  
  @js.native
  trait SkeletonPropsT extends StObject {
    
    var animation: js.UndefOr[Boolean] = js.native
    
    var height: js.UndefOr[String] = js.native
    
    var overrides: js.UndefOr[SkeletonOverrides] = js.native
    
    var rows: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[String] = js.native
  }
  object SkeletonPropsT {
    
    @scala.inline
    def apply(): SkeletonPropsT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonPropsT]
    }
    
    @scala.inline
    implicit class SkeletonPropsTMutableBuilder[Self <: SkeletonPropsT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setOverrides(value: SkeletonOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
