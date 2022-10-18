package typings.baseui

import typings.baseui.helpersOverridesMod.Override
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonTypesMod {
  
  trait SkeletonOverrides extends StObject {
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
    
    var Row: js.UndefOr[Override[Any]] = js.undefined
  }
  object SkeletonOverrides {
    
    inline def apply(): SkeletonOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonOverrides]
    }
    
    extension [Self <: SkeletonOverrides](x: Self) {
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setRow(value: Override[Any]): Self = StObject.set(x, "Row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "Row", js.undefined)
    }
  }
  
  trait SkeletonProps extends StObject {
    
    /** Defines if the skeleton has an animation default is false*/
    var animation: Boolean
    
    /** Defines the height of the skeleton container*/
    var height: js.UndefOr[String] = js.undefined
    
    var overrides: js.UndefOr[SkeletonOverrides] = js.undefined
    
    /** Defines the number of row element in a skeleton */
    var rows: js.UndefOr[Double] = js.undefined
    
    /** Defines the width of the skeleton container*/
    var width: js.UndefOr[String] = js.undefined
  }
  object SkeletonProps {
    
    inline def apply(animation: Boolean): SkeletonProps = {
      val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkeletonProps]
    }
    
    extension [Self <: SkeletonProps](x: Self) {
      
      inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
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
