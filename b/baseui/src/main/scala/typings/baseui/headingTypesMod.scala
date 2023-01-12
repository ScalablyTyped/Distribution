package typings.baseui

import typings.baseui.baseuiInts.`1`
import typings.baseui.baseuiInts.`2`
import typings.baseui.baseuiInts.`3`
import typings.baseui.baseuiInts.`4`
import typings.baseui.baseuiInts.`5`
import typings.baseui.baseuiInts.`6`
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeadingLevelProps] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeadingProps] (val x: Self) extends AnyVal {
      
      inline def setStyleLevel(value: `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "styleLevel", value.asInstanceOf[js.Any])
      
      inline def setStyleLevelUndefined: Self = StObject.set(x, "styleLevel", js.undefined)
    }
  }
}
