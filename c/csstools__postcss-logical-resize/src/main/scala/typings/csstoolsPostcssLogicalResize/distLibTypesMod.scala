package typings.csstoolsPostcssLogicalResize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibTypesMod {
  
  @js.native
  sealed trait Axes extends StObject
  @JSImport("@csstools/postcss-logical-resize/dist/lib/types", "Axes")
  @js.native
  object Axes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Axes & String] = js.native
    
    @js.native
    sealed trait Bottom
      extends StObject
         with Axes
    /* "bottom" */ val Bottom: typings.csstoolsPostcssLogicalResize.distLibTypesMod.Axes.Bottom & String = js.native
    
    @js.native
    sealed trait Left
      extends StObject
         with Axes
    /* "left" */ val Left: typings.csstoolsPostcssLogicalResize.distLibTypesMod.Axes.Left & String = js.native
    
    @js.native
    sealed trait Right
      extends StObject
         with Axes
    /* "right" */ val Right: typings.csstoolsPostcssLogicalResize.distLibTypesMod.Axes.Right & String = js.native
    
    @js.native
    sealed trait Top
      extends StObject
         with Axes
    /* "top" */ val Top: typings.csstoolsPostcssLogicalResize.distLibTypesMod.Axes.Top & String = js.native
  }
  
  @js.native
  sealed trait Direction extends StObject
  @JSImport("@csstools/postcss-logical-resize/dist/lib/types", "Direction")
  @js.native
  object Direction extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Direction & String] = js.native
    
    @js.native
    sealed trait Block
      extends StObject
         with Direction
    /* "block" */ val Block: typings.csstoolsPostcssLogicalResize.distLibTypesMod.Direction.Block & String = js.native
    
    @js.native
    sealed trait Inline
      extends StObject
         with Direction
    /* "inline" */ val Inline: typings.csstoolsPostcssLogicalResize.distLibTypesMod.Direction.Inline & String = js.native
  }
  
  @js.native
  sealed trait DirectionFlow extends StObject
  @JSImport("@csstools/postcss-logical-resize/dist/lib/types", "DirectionFlow")
  @js.native
  object DirectionFlow extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DirectionFlow & String] = js.native
    
    @js.native
    sealed trait BottomToTop
      extends StObject
         with DirectionFlow
    /* "bottom-to-top" */ val BottomToTop: typings.csstoolsPostcssLogicalResize.distLibTypesMod.DirectionFlow.BottomToTop & String = js.native
    
    @js.native
    sealed trait LeftToRight
      extends StObject
         with DirectionFlow
    /* "left-to-right" */ val LeftToRight: typings.csstoolsPostcssLogicalResize.distLibTypesMod.DirectionFlow.LeftToRight & String = js.native
    
    @js.native
    sealed trait RightToLeft
      extends StObject
         with DirectionFlow
    /* "right-to-left" */ val RightToLeft: typings.csstoolsPostcssLogicalResize.distLibTypesMod.DirectionFlow.RightToLeft & String = js.native
    
    @js.native
    sealed trait TopToBottom
      extends StObject
         with DirectionFlow
    /* "top-to-bottom" */ val TopToBottom: typings.csstoolsPostcssLogicalResize.distLibTypesMod.DirectionFlow.TopToBottom & String = js.native
  }
  
  @js.native
  sealed trait DirectionValue extends StObject
  @JSImport("@csstools/postcss-logical-resize/dist/lib/types", "DirectionValue")
  @js.native
  object DirectionValue extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DirectionValue & String] = js.native
    
    @js.native
    sealed trait End
      extends StObject
         with DirectionValue
    /* "end" */ val End: typings.csstoolsPostcssLogicalResize.distLibTypesMod.DirectionValue.End & String = js.native
    
    @js.native
    sealed trait Start
      extends StObject
         with DirectionValue
    /* "start" */ val Start: typings.csstoolsPostcssLogicalResize.distLibTypesMod.DirectionValue.Start & String = js.native
  }
  
  object DirectionValues {
    
    @JSImport("@csstools/postcss-logical-resize/dist/lib/types", "DirectionValues")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@csstools/postcss-logical-resize/dist/lib/types", "DirectionValues.BlockEnd")
    @js.native
    def BlockEnd: String = js.native
    inline def BlockEnd_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BlockEnd")(x.asInstanceOf[js.Any])
    
    @JSImport("@csstools/postcss-logical-resize/dist/lib/types", "DirectionValues.BlockStart")
    @js.native
    def BlockStart: String = js.native
    inline def BlockStart_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BlockStart")(x.asInstanceOf[js.Any])
    
    @JSImport("@csstools/postcss-logical-resize/dist/lib/types", "DirectionValues.InlineEnd")
    @js.native
    def InlineEnd: String = js.native
    inline def InlineEnd_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InlineEnd")(x.asInstanceOf[js.Any])
    
    @JSImport("@csstools/postcss-logical-resize/dist/lib/types", "DirectionValues.InlineStart")
    @js.native
    def InlineStart: String = js.native
    inline def InlineStart_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InlineStart")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DirectionConfig extends StObject {
    
    var inlineIsHorizontal: Boolean = js.native
  }
}
