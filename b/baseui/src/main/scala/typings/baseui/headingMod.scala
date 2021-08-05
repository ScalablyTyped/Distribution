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
    
    inline def apply(): HeadingLevelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeadingLevelProps]
    }
    
    extension [Self <: HeadingLevelProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait HeadingProps
    extends StObject
       with BlockProps {
    
    var styleLevel: js.UndefOr[Double] = js.undefined
  }
  object HeadingProps {
    
    inline def apply(): HeadingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeadingProps]
    }
    
    extension [Self <: HeadingProps](x: Self) {
      
      inline def setStyleLevel(value: Double): Self = StObject.set(x, "styleLevel", value.asInstanceOf[js.Any])
      
      inline def setStyleLevelUndefined: Self = StObject.set(x, "styleLevel", js.undefined)
    }
  }
}
