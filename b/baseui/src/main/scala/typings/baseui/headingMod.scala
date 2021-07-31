package typings.baseui

import typings.baseui.blockMod.BlockProps
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headingMod {
  
  @JSImport("baseui/heading", "Heading")
  @js.native
  val Heading: FC[HeadingProps] = js.native
  
  @JSImport("baseui/heading", "HeadingLevel")
  @js.native
  val HeadingLevel: FC[HeadingLevelProps] = js.native
  
  trait HeadingLevelProps extends StObject {
    
    var children: ReactNode
  }
  object HeadingLevelProps {
    
    @scala.inline
    def apply(): HeadingLevelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeadingLevelProps]
    }
    
    @scala.inline
    implicit class HeadingLevelPropsMutableBuilder[Self <: HeadingLevelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait HeadingProps
    extends StObject
       with BlockProps {
    
    var styleLevel: js.UndefOr[Double] = js.undefined
  }
  object HeadingProps {
    
    @scala.inline
    def apply(): HeadingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeadingProps]
    }
    
    @scala.inline
    implicit class HeadingPropsMutableBuilder[Self <: HeadingProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyleLevel(value: Double): Self = StObject.set(x, "styleLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleLevelUndefined: Self = StObject.set(x, "styleLevel", js.undefined)
    }
  }
}
