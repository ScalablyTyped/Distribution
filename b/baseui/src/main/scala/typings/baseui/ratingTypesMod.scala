package typings.baseui

import typings.baseui.anon.ValueNumber
import typings.baseui.helpersOverridesMod.Override
import typings.baseui.stylesTypesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ratingTypesMod {
  
  trait EmoticonRatingProps extends StObject {
    
    /** Callback that's called with the newly selected value. */
    var onChange: js.UndefOr[js.Function1[/* a */ ValueNumber, Any]] = js.undefined
    
    var overrides: js.UndefOr[RatingOverrides] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    /** The current rating value. */
    var value: js.UndefOr[Double] = js.undefined
  }
  object EmoticonRatingProps {
    
    inline def apply(): EmoticonRatingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmoticonRatingProps]
    }
    
    extension [Self <: EmoticonRatingProps](x: Self) {
      
      inline def setOnChange(value: /* a */ ValueNumber => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOverrides(value: RatingOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait RatingOverrides extends StObject {
    
    var Item: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
  }
  object RatingOverrides {
    
    inline def apply(): RatingOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RatingOverrides]
    }
    
    extension [Self <: RatingOverrides](x: Self) {
      
      inline def setItem(value: Override[Any]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  trait RatingState extends StObject {
    
    var isFocusVisible: js.UndefOr[Boolean] = js.undefined
    
    var previewIndex: js.UndefOr[Double] = js.undefined
  }
  object RatingState {
    
    inline def apply(): RatingState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RatingState]
    }
    
    extension [Self <: RatingState](x: Self) {
      
      inline def setIsFocusVisible(value: Boolean): Self = StObject.set(x, "isFocusVisible", value.asInstanceOf[js.Any])
      
      inline def setIsFocusVisibleUndefined: Self = StObject.set(x, "isFocusVisible", js.undefined)
      
      inline def setPreviewIndex(value: Double): Self = StObject.set(x, "previewIndex", value.asInstanceOf[js.Any])
      
      inline def setPreviewIndexUndefined: Self = StObject.set(x, "previewIndex", js.undefined)
    }
  }
  
  trait StarRatingProps extends StObject {
    
    /** The total number of items to display. */
    var numItems: Double
    
    /** Callback that's called with the newly selected value. */
    var onChange: js.UndefOr[js.Function1[/* a */ ValueNumber, Any]] = js.undefined
    
    var overrides: js.UndefOr[RatingOverrides] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    /** The current rating value. */
    var value: js.UndefOr[Double] = js.undefined
  }
  object StarRatingProps {
    
    inline def apply(numItems: Double): StarRatingProps = {
      val __obj = js.Dynamic.literal(numItems = numItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[StarRatingProps]
    }
    
    extension [Self <: StarRatingProps](x: Self) {
      
      inline def setNumItems(value: Double): Self = StObject.set(x, "numItems", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: /* a */ ValueNumber => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOverrides(value: RatingOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait StyledRatingItemProps extends StObject {
    
    @JSName("$index")
    var $index: Double
    
    @JSName("$isActive")
    var $isActive: Boolean
    
    @JSName("$isFocusVisible")
    var $isFocusVisible: Boolean
    
    @JSName("$isPartialActive")
    var $isPartialActive: Boolean
    
    @JSName("$isReadOnly")
    var $isReadOnly: Boolean
    
    @JSName("$isSelected")
    var $isSelected: Boolean
    
    @JSName("$size")
    var $size: Double
    
    @JSName("$theme")
    var $theme: Theme
  }
  object StyledRatingItemProps {
    
    inline def apply(
      $index: Double,
      $isActive: Boolean,
      $isFocusVisible: Boolean,
      $isPartialActive: Boolean,
      $isReadOnly: Boolean,
      $isSelected: Boolean,
      $size: Double,
      $theme: Theme
    ): StyledRatingItemProps = {
      val __obj = js.Dynamic.literal($index = $index.asInstanceOf[js.Any], $isActive = $isActive.asInstanceOf[js.Any], $isFocusVisible = $isFocusVisible.asInstanceOf[js.Any], $isPartialActive = $isPartialActive.asInstanceOf[js.Any], $isReadOnly = $isReadOnly.asInstanceOf[js.Any], $isSelected = $isSelected.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], $theme = $theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyledRatingItemProps]
    }
    
    extension [Self <: StyledRatingItemProps](x: Self) {
      
      inline def set$index(value: Double): Self = StObject.set(x, "$index", value.asInstanceOf[js.Any])
      
      inline def set$isActive(value: Boolean): Self = StObject.set(x, "$isActive", value.asInstanceOf[js.Any])
      
      inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
      
      inline def set$isPartialActive(value: Boolean): Self = StObject.set(x, "$isPartialActive", value.asInstanceOf[js.Any])
      
      inline def set$isReadOnly(value: Boolean): Self = StObject.set(x, "$isReadOnly", value.asInstanceOf[js.Any])
      
      inline def set$isSelected(value: Boolean): Self = StObject.set(x, "$isSelected", value.asInstanceOf[js.Any])
      
      inline def set$size(value: Double): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
      
      inline def set$theme(value: Theme): Self = StObject.set(x, "$theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait StyledRootProps extends StObject {
    
    @JSName("$theme")
    var $theme: Theme
  }
  object StyledRootProps {
    
    inline def apply($theme: Theme): StyledRootProps = {
      val __obj = js.Dynamic.literal($theme = $theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyledRootProps]
    }
    
    extension [Self <: StyledRootProps](x: Self) {
      
      inline def set$theme(value: Theme): Self = StObject.set(x, "$theme", value.asInstanceOf[js.Any])
    }
  }
}
