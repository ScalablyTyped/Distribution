package typings.baseui

import typings.baseui.baseuiStrings.auto
import typings.baseui.baseuiStrings.ltr
import typings.baseui.baseuiStrings.rtl
import typings.baseui.iconTypesMod.IconProps
import typings.baseui.themesTypesMod.Animation
import typings.baseui.themesTypesMod.Borders
import typings.baseui.themesTypesMod.Breakpoints
import typings.baseui.themesTypesMod.ColorTokens
import typings.baseui.themesTypesMod.ComponentColorTokens
import typings.baseui.themesTypesMod.Grid
import typings.baseui.themesTypesMod.Lighting
import typings.baseui.themesTypesMod.MediaQuery
import typings.baseui.themesTypesMod.SemanticColorTokens
import typings.baseui.themesTypesMod.Sizing
import typings.baseui.themesTypesMod.Typography
import typings.baseui.themesTypesMod.ZIndex
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesTypesMod {
  
  trait Colors
    extends StObject
       with ColorTokens
       with ComponentColorTokens
       with SemanticColorTokens
  object Colors {
    
    inline def apply(
      ComponentColorTokens: ComponentColorTokens,
      accent: String,
      accent100: String,
      accent200: String,
      accent300: String,
      accent400: String,
      accent50: String,
      accent500: String,
      accent600: String,
      accent700: String,
      black: String,
      mono100: String,
      mono1000: String,
      mono200: String,
      mono300: String,
      mono400: String,
      mono500: String,
      mono600: String,
      mono700: String,
      mono800: String,
      mono900: String,
      negative: String,
      negative100: String,
      negative200: String,
      negative300: String,
      negative400: String,
      negative50: String,
      negative500: String,
      negative600: String,
      negative700: String,
      positive: String,
      positive100: String,
      positive200: String,
      positive300: String,
      positive400: String,
      positive50: String,
      positive500: String,
      positive600: String,
      positive700: String,
      primary: String,
      primary100: String,
      primary200: String,
      primary300: String,
      primary400: String,
      primary50: String,
      primary500: String,
      primary600: String,
      primary700: String,
      primaryA: String,
      primaryB: String,
      ratingInactiveFill: String,
      ratingStroke: String,
      warning: String,
      warning100: String,
      warning200: String,
      warning300: String,
      warning400: String,
      warning50: String,
      warning500: String,
      warning600: String,
      warning700: String,
      white: String
    ): Colors = {
      val __obj = js.Dynamic.literal(accent = accent.asInstanceOf[js.Any], accent100 = accent100.asInstanceOf[js.Any], accent200 = accent200.asInstanceOf[js.Any], accent300 = accent300.asInstanceOf[js.Any], accent400 = accent400.asInstanceOf[js.Any], accent50 = accent50.asInstanceOf[js.Any], accent500 = accent500.asInstanceOf[js.Any], accent600 = accent600.asInstanceOf[js.Any], accent700 = accent700.asInstanceOf[js.Any], black = black.asInstanceOf[js.Any], mono100 = mono100.asInstanceOf[js.Any], mono1000 = mono1000.asInstanceOf[js.Any], mono200 = mono200.asInstanceOf[js.Any], mono300 = mono300.asInstanceOf[js.Any], mono400 = mono400.asInstanceOf[js.Any], mono500 = mono500.asInstanceOf[js.Any], mono600 = mono600.asInstanceOf[js.Any], mono700 = mono700.asInstanceOf[js.Any], mono800 = mono800.asInstanceOf[js.Any], mono900 = mono900.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], negative100 = negative100.asInstanceOf[js.Any], negative200 = negative200.asInstanceOf[js.Any], negative300 = negative300.asInstanceOf[js.Any], negative400 = negative400.asInstanceOf[js.Any], negative50 = negative50.asInstanceOf[js.Any], negative500 = negative500.asInstanceOf[js.Any], negative600 = negative600.asInstanceOf[js.Any], negative700 = negative700.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], positive100 = positive100.asInstanceOf[js.Any], positive200 = positive200.asInstanceOf[js.Any], positive300 = positive300.asInstanceOf[js.Any], positive400 = positive400.asInstanceOf[js.Any], positive50 = positive50.asInstanceOf[js.Any], positive500 = positive500.asInstanceOf[js.Any], positive600 = positive600.asInstanceOf[js.Any], positive700 = positive700.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], primary100 = primary100.asInstanceOf[js.Any], primary200 = primary200.asInstanceOf[js.Any], primary300 = primary300.asInstanceOf[js.Any], primary400 = primary400.asInstanceOf[js.Any], primary50 = primary50.asInstanceOf[js.Any], primary500 = primary500.asInstanceOf[js.Any], primary600 = primary600.asInstanceOf[js.Any], primary700 = primary700.asInstanceOf[js.Any], primaryA = primaryA.asInstanceOf[js.Any], primaryB = primaryB.asInstanceOf[js.Any], ratingInactiveFill = ratingInactiveFill.asInstanceOf[js.Any], ratingStroke = ratingStroke.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any], warning100 = warning100.asInstanceOf[js.Any], warning200 = warning200.asInstanceOf[js.Any], warning300 = warning300.asInstanceOf[js.Any], warning400 = warning400.asInstanceOf[js.Any], warning50 = warning50.asInstanceOf[js.Any], warning500 = warning500.asInstanceOf[js.Any], warning600 = warning600.asInstanceOf[js.Any], warning700 = warning700.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, ComponentColorTokens)
      __obj.asInstanceOf[Colors]
    }
  }
  
  trait Icon extends StObject {
    
    var Alert: js.UndefOr[ComponentType[IconProps]] = js.undefined
    
    var ArrowDown: js.UndefOr[ComponentType[IconProps]] = js.undefined
    
    var ArrowLeft: js.UndefOr[ComponentType[IconProps]] = js.undefined
    
    var ArrowRight: js.UndefOr[ComponentType[IconProps]] = js.undefined
    
    var ArrowUp: js.UndefOr[ComponentType[IconProps]] = js.undefined
    
    var Blank: js.UndefOr[ComponentType[IconProps]] = js.undefined
    
    var Check: js.UndefOr[ComponentType[IconProps]] = js.undefined
    
    var CheckIndeterminate: js.UndefOr[ComponentType[IconProps]] = js.undefined
    
    var ChevronDown: js.UndefOr[ComponentType[IconProps]] = js.undefined
    
    var ChevronLeft: js.UndefOr[ComponentType[IconProps]] = js.undefined
    
    var ChevronRight: js.UndefOr[ComponentType[IconProps]] = js.undefined
    
    var ChevronUp: js.UndefOr[ComponentType[IconProps]] = js.undefined
    
    var Delete: js.UndefOr[ComponentType[IconProps]] = js.undefined
    
    var DeleteAlt: js.UndefOr[ComponentType[IconProps]] = js.undefined
    
    var Filter: js.UndefOr[ComponentType[IconProps]] = js.undefined
    
    var Grab: js.UndefOr[ComponentType[IconProps]] = js.undefined
    
    var Hide: js.UndefOr[ComponentType[IconProps]] = js.undefined
    
    var Menu: js.UndefOr[ComponentType[IconProps]] = js.undefined
    
    var Overflow: js.UndefOr[ComponentType[IconProps]] = js.undefined
    
    var Plus: js.UndefOr[ComponentType[IconProps]] = js.undefined
    
    var Search: js.UndefOr[ComponentType[IconProps]] = js.undefined
    
    var Show: js.UndefOr[ComponentType[IconProps]] = js.undefined
    
    var Spinner: js.UndefOr[ComponentType[IconProps]] = js.undefined
    
    var TriangleDown: js.UndefOr[ComponentType[IconProps]] = js.undefined
    
    var TriangleLeft: js.UndefOr[ComponentType[IconProps]] = js.undefined
    
    var TriangleRight: js.UndefOr[ComponentType[IconProps]] = js.undefined
    
    var TriangleUp: js.UndefOr[ComponentType[IconProps]] = js.undefined
    
    var Upload: js.UndefOr[ComponentType[IconProps]] = js.undefined
  }
  object Icon {
    
    inline def apply(): Icon = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Icon]
    }
    
    extension [Self <: Icon](x: Self) {
      
      inline def setAlert(value: ComponentType[IconProps]): Self = StObject.set(x, "Alert", value.asInstanceOf[js.Any])
      
      inline def setAlertUndefined: Self = StObject.set(x, "Alert", js.undefined)
      
      inline def setArrowDown(value: ComponentType[IconProps]): Self = StObject.set(x, "ArrowDown", value.asInstanceOf[js.Any])
      
      inline def setArrowDownUndefined: Self = StObject.set(x, "ArrowDown", js.undefined)
      
      inline def setArrowLeft(value: ComponentType[IconProps]): Self = StObject.set(x, "ArrowLeft", value.asInstanceOf[js.Any])
      
      inline def setArrowLeftUndefined: Self = StObject.set(x, "ArrowLeft", js.undefined)
      
      inline def setArrowRight(value: ComponentType[IconProps]): Self = StObject.set(x, "ArrowRight", value.asInstanceOf[js.Any])
      
      inline def setArrowRightUndefined: Self = StObject.set(x, "ArrowRight", js.undefined)
      
      inline def setArrowUp(value: ComponentType[IconProps]): Self = StObject.set(x, "ArrowUp", value.asInstanceOf[js.Any])
      
      inline def setArrowUpUndefined: Self = StObject.set(x, "ArrowUp", js.undefined)
      
      inline def setBlank(value: ComponentType[IconProps]): Self = StObject.set(x, "Blank", value.asInstanceOf[js.Any])
      
      inline def setBlankUndefined: Self = StObject.set(x, "Blank", js.undefined)
      
      inline def setCheck(value: ComponentType[IconProps]): Self = StObject.set(x, "Check", value.asInstanceOf[js.Any])
      
      inline def setCheckIndeterminate(value: ComponentType[IconProps]): Self = StObject.set(x, "CheckIndeterminate", value.asInstanceOf[js.Any])
      
      inline def setCheckIndeterminateUndefined: Self = StObject.set(x, "CheckIndeterminate", js.undefined)
      
      inline def setCheckUndefined: Self = StObject.set(x, "Check", js.undefined)
      
      inline def setChevronDown(value: ComponentType[IconProps]): Self = StObject.set(x, "ChevronDown", value.asInstanceOf[js.Any])
      
      inline def setChevronDownUndefined: Self = StObject.set(x, "ChevronDown", js.undefined)
      
      inline def setChevronLeft(value: ComponentType[IconProps]): Self = StObject.set(x, "ChevronLeft", value.asInstanceOf[js.Any])
      
      inline def setChevronLeftUndefined: Self = StObject.set(x, "ChevronLeft", js.undefined)
      
      inline def setChevronRight(value: ComponentType[IconProps]): Self = StObject.set(x, "ChevronRight", value.asInstanceOf[js.Any])
      
      inline def setChevronRightUndefined: Self = StObject.set(x, "ChevronRight", js.undefined)
      
      inline def setChevronUp(value: ComponentType[IconProps]): Self = StObject.set(x, "ChevronUp", value.asInstanceOf[js.Any])
      
      inline def setChevronUpUndefined: Self = StObject.set(x, "ChevronUp", js.undefined)
      
      inline def setDelete(value: ComponentType[IconProps]): Self = StObject.set(x, "Delete", value.asInstanceOf[js.Any])
      
      inline def setDeleteAlt(value: ComponentType[IconProps]): Self = StObject.set(x, "DeleteAlt", value.asInstanceOf[js.Any])
      
      inline def setDeleteAltUndefined: Self = StObject.set(x, "DeleteAlt", js.undefined)
      
      inline def setDeleteUndefined: Self = StObject.set(x, "Delete", js.undefined)
      
      inline def setFilter(value: ComponentType[IconProps]): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
      
      inline def setGrab(value: ComponentType[IconProps]): Self = StObject.set(x, "Grab", value.asInstanceOf[js.Any])
      
      inline def setGrabUndefined: Self = StObject.set(x, "Grab", js.undefined)
      
      inline def setHide(value: ComponentType[IconProps]): Self = StObject.set(x, "Hide", value.asInstanceOf[js.Any])
      
      inline def setHideUndefined: Self = StObject.set(x, "Hide", js.undefined)
      
      inline def setMenu(value: ComponentType[IconProps]): Self = StObject.set(x, "Menu", value.asInstanceOf[js.Any])
      
      inline def setMenuUndefined: Self = StObject.set(x, "Menu", js.undefined)
      
      inline def setOverflow(value: ComponentType[IconProps]): Self = StObject.set(x, "Overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowUndefined: Self = StObject.set(x, "Overflow", js.undefined)
      
      inline def setPlus(value: ComponentType[IconProps]): Self = StObject.set(x, "Plus", value.asInstanceOf[js.Any])
      
      inline def setPlusUndefined: Self = StObject.set(x, "Plus", js.undefined)
      
      inline def setSearch(value: ComponentType[IconProps]): Self = StObject.set(x, "Search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "Search", js.undefined)
      
      inline def setShow(value: ComponentType[IconProps]): Self = StObject.set(x, "Show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "Show", js.undefined)
      
      inline def setSpinner(value: ComponentType[IconProps]): Self = StObject.set(x, "Spinner", value.asInstanceOf[js.Any])
      
      inline def setSpinnerUndefined: Self = StObject.set(x, "Spinner", js.undefined)
      
      inline def setTriangleDown(value: ComponentType[IconProps]): Self = StObject.set(x, "TriangleDown", value.asInstanceOf[js.Any])
      
      inline def setTriangleDownUndefined: Self = StObject.set(x, "TriangleDown", js.undefined)
      
      inline def setTriangleLeft(value: ComponentType[IconProps]): Self = StObject.set(x, "TriangleLeft", value.asInstanceOf[js.Any])
      
      inline def setTriangleLeftUndefined: Self = StObject.set(x, "TriangleLeft", js.undefined)
      
      inline def setTriangleRight(value: ComponentType[IconProps]): Self = StObject.set(x, "TriangleRight", value.asInstanceOf[js.Any])
      
      inline def setTriangleRightUndefined: Self = StObject.set(x, "TriangleRight", js.undefined)
      
      inline def setTriangleUp(value: ComponentType[IconProps]): Self = StObject.set(x, "TriangleUp", value.asInstanceOf[js.Any])
      
      inline def setTriangleUpUndefined: Self = StObject.set(x, "TriangleUp", js.undefined)
      
      inline def setUpload(value: ComponentType[IconProps]): Self = StObject.set(x, "Upload", value.asInstanceOf[js.Any])
      
      inline def setUploadUndefined: Self = StObject.set(x, "Upload", js.undefined)
    }
  }
  
  trait Theme extends StObject {
    
    var animation: Animation
    
    var borders: Borders
    
    var breakpoints: Breakpoints
    
    var colors: Colors
    
    var direction: auto | rtl | ltr
    
    var grid: Grid
    
    var icons: js.UndefOr[Icon] = js.undefined
    
    var lighting: Lighting
    
    var mediaQuery: MediaQuery
    
    var name: String
    
    var sizing: Sizing
    
    var typography: Typography
    
    var zIndex: ZIndex
  }
  object Theme {
    
    inline def apply(
      animation: Animation,
      borders: Borders,
      breakpoints: Breakpoints,
      colors: Colors,
      direction: auto | rtl | ltr,
      grid: Grid,
      lighting: Lighting,
      mediaQuery: MediaQuery,
      name: String,
      sizing: Sizing,
      typography: Typography,
      zIndex: ZIndex
    ): Theme = {
      val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], borders = borders.asInstanceOf[js.Any], breakpoints = breakpoints.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], lighting = lighting.asInstanceOf[js.Any], mediaQuery = mediaQuery.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sizing = sizing.asInstanceOf[js.Any], typography = typography.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    extension [Self <: Theme](x: Self) {
      
      inline def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setBorders(value: Borders): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
      
      inline def setBreakpoints(value: Breakpoints): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      inline def setColors(value: Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: auto | rtl | ltr): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setGrid(value: Grid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setIcons(value: Icon): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setLighting(value: Lighting): Self = StObject.set(x, "lighting", value.asInstanceOf[js.Any])
      
      inline def setMediaQuery(value: MediaQuery): Self = StObject.set(x, "mediaQuery", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSizing(value: Sizing): Self = StObject.set(x, "sizing", value.asInstanceOf[js.Any])
      
      inline def setTypography(value: Typography): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
      
      inline def setZIndex(value: ZIndex): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    }
  }
}
