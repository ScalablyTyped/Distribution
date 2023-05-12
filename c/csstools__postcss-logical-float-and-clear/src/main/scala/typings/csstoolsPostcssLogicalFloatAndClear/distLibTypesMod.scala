package typings.csstoolsPostcssLogicalFloatAndClear

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibTypesMod {
  
  @js.native
  sealed trait Axes extends StObject
  @JSImport("@csstools/postcss-logical-float-and-clear/dist/lib/types", "Axes")
  @js.native
  object Axes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Axes & String] = js.native
    
    @js.native
    sealed trait Bottom
      extends StObject
         with Axes
    /* "bottom" */ val Bottom: typings.csstoolsPostcssLogicalFloatAndClear.distLibTypesMod.Axes.Bottom & String = js.native
    
    @js.native
    sealed trait Left
      extends StObject
         with Axes
    /* "left" */ val Left: typings.csstoolsPostcssLogicalFloatAndClear.distLibTypesMod.Axes.Left & String = js.native
    
    @js.native
    sealed trait Right
      extends StObject
         with Axes
    /* "right" */ val Right: typings.csstoolsPostcssLogicalFloatAndClear.distLibTypesMod.Axes.Right & String = js.native
    
    @js.native
    sealed trait Top
      extends StObject
         with Axes
    /* "top" */ val Top: typings.csstoolsPostcssLogicalFloatAndClear.distLibTypesMod.Axes.Top & String = js.native
  }
  
  @js.native
  sealed trait DirectionFlow extends StObject
  @JSImport("@csstools/postcss-logical-float-and-clear/dist/lib/types", "DirectionFlow")
  @js.native
  object DirectionFlow extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DirectionFlow & String] = js.native
    
    @js.native
    sealed trait BottomToTop
      extends StObject
         with DirectionFlow
    /* "bottom-to-top" */ val BottomToTop: typings.csstoolsPostcssLogicalFloatAndClear.distLibTypesMod.DirectionFlow.BottomToTop & String = js.native
    
    @js.native
    sealed trait LeftToRight
      extends StObject
         with DirectionFlow
    /* "left-to-right" */ val LeftToRight: typings.csstoolsPostcssLogicalFloatAndClear.distLibTypesMod.DirectionFlow.LeftToRight & String = js.native
    
    @js.native
    sealed trait RightToLeft
      extends StObject
         with DirectionFlow
    /* "right-to-left" */ val RightToLeft: typings.csstoolsPostcssLogicalFloatAndClear.distLibTypesMod.DirectionFlow.RightToLeft & String = js.native
    
    @js.native
    sealed trait TopToBottom
      extends StObject
         with DirectionFlow
    /* "top-to-bottom" */ val TopToBottom: typings.csstoolsPostcssLogicalFloatAndClear.distLibTypesMod.DirectionFlow.TopToBottom & String = js.native
  }
  
  object DirectionValues {
    
    @JSImport("@csstools/postcss-logical-float-and-clear/dist/lib/types", "DirectionValues")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@csstools/postcss-logical-float-and-clear/dist/lib/types", "DirectionValues.BlockEnd")
    @js.native
    def BlockEnd: String = js.native
    inline def BlockEnd_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BlockEnd")(x.asInstanceOf[js.Any])
    
    @JSImport("@csstools/postcss-logical-float-and-clear/dist/lib/types", "DirectionValues.BlockStart")
    @js.native
    def BlockStart: String = js.native
    inline def BlockStart_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BlockStart")(x.asInstanceOf[js.Any])
    
    @JSImport("@csstools/postcss-logical-float-and-clear/dist/lib/types", "DirectionValues.InlineEnd")
    @js.native
    def InlineEnd: String = js.native
    inline def InlineEnd_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InlineEnd")(x.asInstanceOf[js.Any])
    
    @JSImport("@csstools/postcss-logical-float-and-clear/dist/lib/types", "DirectionValues.InlineStart")
    @js.native
    def InlineStart: String = js.native
    inline def InlineStart_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InlineStart")(x.asInstanceOf[js.Any])
  }
}
