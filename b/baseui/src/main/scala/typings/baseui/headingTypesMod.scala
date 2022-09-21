package typings.baseui

import typings.baseui.baseuiNumbers.`1`
import typings.baseui.baseuiNumbers.`2`
import typings.baseui.baseuiNumbers.`3`
import typings.baseui.baseuiNumbers.`4`
import typings.baseui.baseuiNumbers.`5`
import typings.baseui.baseuiNumbers.`6`
import typings.baseui.baseuiStrings.h1
import typings.baseui.blockTypesMod.BlockProps
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headingTypesMod {
  
  trait HeadingLevelProps extends StObject {
    
    /** Content to be rendered in the HeadingLevel. */
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
       with BlockProps[h1] {
    
    /** Set and fix the style level independently on the hierarchy context. */
    var styleLevel: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  }
  object HeadingProps {
    
    inline def apply(): HeadingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeadingProps]
    }
    
    extension [Self <: HeadingProps](x: Self) {
      
      inline def setStyleLevel(value: `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "styleLevel", value.asInstanceOf[js.Any])
      
      inline def setStyleLevelUndefined: Self = StObject.set(x, "styleLevel", js.undefined)
    }
  }
}
