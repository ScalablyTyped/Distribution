package typings.csstype.mod

import typings.csstype.mod.Property.All
import typings.csstype.mod.Property.Animation
import typings.csstype.mod.Property.Background
import typings.csstype.mod.Property.BackgroundPosition
import typings.csstype.mod.Property.Border
import typings.csstype.mod.Property.BorderBlock
import typings.csstype.mod.Property.BorderBlockEnd
import typings.csstype.mod.Property.BorderBlockStart
import typings.csstype.mod.Property.BorderBottom
import typings.csstype.mod.Property.BorderColor
import typings.csstype.mod.Property.BorderImage
import typings.csstype.mod.Property.BorderInline
import typings.csstype.mod.Property.BorderInlineEnd
import typings.csstype.mod.Property.BorderInlineStart
import typings.csstype.mod.Property.BorderLeft
import typings.csstype.mod.Property.BorderRadius
import typings.csstype.mod.Property.BorderRight
import typings.csstype.mod.Property.BorderStyle
import typings.csstype.mod.Property.BorderTop
import typings.csstype.mod.Property.BorderWidth
import typings.csstype.mod.Property.Caret
import typings.csstype.mod.Property.ColumnRule
import typings.csstype.mod.Property.Columns
import typings.csstype.mod.Property.ContainIntrinsicSize
import typings.csstype.mod.Property.Container
import typings.csstype.mod.Property.Flex
import typings.csstype.mod.Property.FlexFlow
import typings.csstype.mod.Property.Font
import typings.csstype.mod.Property.Gap
import typings.csstype.mod.Property.Grid
import typings.csstype.mod.Property.GridArea
import typings.csstype.mod.Property.GridColumn
import typings.csstype.mod.Property.GridRow
import typings.csstype.mod.Property.GridTemplate
import typings.csstype.mod.Property.Inset
import typings.csstype.mod.Property.InsetBlock
import typings.csstype.mod.Property.InsetInline
import typings.csstype.mod.Property.LineClamp
import typings.csstype.mod.Property.ListStyle
import typings.csstype.mod.Property.Margin
import typings.csstype.mod.Property.MarginBlock
import typings.csstype.mod.Property.MarginInline
import typings.csstype.mod.Property.Mask
import typings.csstype.mod.Property.MaskBorder
import typings.csstype.mod.Property.Offset
import typings.csstype.mod.Property.Outline
import typings.csstype.mod.Property.Overflow
import typings.csstype.mod.Property.OverscrollBehavior
import typings.csstype.mod.Property.Padding
import typings.csstype.mod.Property.PaddingBlock
import typings.csstype.mod.Property.PaddingInline
import typings.csstype.mod.Property.PlaceContent
import typings.csstype.mod.Property.PlaceItems
import typings.csstype.mod.Property.PlaceSelf
import typings.csstype.mod.Property.ScrollMargin
import typings.csstype.mod.Property.ScrollMarginBlock
import typings.csstype.mod.Property.ScrollMarginInline
import typings.csstype.mod.Property.ScrollPadding
import typings.csstype.mod.Property.ScrollPaddingBlock
import typings.csstype.mod.Property.ScrollPaddingInline
import typings.csstype.mod.Property.ScrollTimeline
import typings.csstype.mod.Property.TextDecoration
import typings.csstype.mod.Property.TextEmphasis
import typings.csstype.mod.Property.Transition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardShorthandPropertiesHyphen[TLength, TTime] extends StObject {
  
  /**
    * The **`all`** shorthand CSS property resets all of an element's properties except `unicode-bidi`, `direction`, and CSS Custom Properties. It can set properties to their initial or inherited values, or to the values specified in another cascade layer or stylesheet origin.
    *
    * **Syntax**: `initial | inherit | unset | revert | revert-layer`
    *
    * **Initial value**: There is no practical initial value for it.
    *
    * | Chrome | Firefox | Safari  | Edge | IE  |
    * | :----: | :-----: | :-----: | :--: | :-: |
    * | **37** | **27**  | **9.1** | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/all
    */
  var all: js.UndefOr[All] = js.undefined
  
  /**
    * The **`animation`** shorthand CSS property applies an animation between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
    *
    * **Syntax**: `<single-animation>#`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **43**  | **16**  |  **9**  | **12** | **10** |
    * | 3 _-x-_ | 5 _-x-_ | 4 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation
    */
  var animation: js.UndefOr[Animation[TTime]] = js.undefined
  
  /**
    * The **`background`** shorthand CSS property sets all background style properties at once, such as color, image, origin and size, or repeat method.
    *
    * **Syntax**: `[ <bg-layer> , ]* <final-bg-layer>`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background
    */
  var background: js.UndefOr[Background[TLength]] = js.undefined
  
  /**
    * The **`background-position`** CSS property sets the initial position for each background image. The position is relative to the position layer set by `background-origin`.
    *
    * **Syntax**: `<bg-position>#`
    *
    * **Initial value**: `0% 0%`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-position
    */
  var `background-position`: js.UndefOr[BackgroundPosition[TLength]] = js.undefined
  
  /**
    * The **`border`** shorthand CSS property sets an element's border. It sets the values of `border-width`, `border-style`, and `border-color`.
    *
    * **Syntax**: `<line-width> || <line-style> || <color>`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border
    */
  var border: js.UndefOr[Border[TLength]] = js.undefined
  
  /**
    * The **`border-block`** CSS property is a shorthand property for setting the individual logical block border property values in a single place in the style sheet.
    *
    * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <color>`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **87** | **66**  | **14.1** | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block
    */
  var `border-block`: js.UndefOr[BorderBlock[TLength]] = js.undefined
  
  /**
    * The **`border-block-end`** CSS property is a shorthand property for setting the individual logical block-end border property values in a single place in the style sheet.
    *
    * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <color>`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end
    */
  var `border-block-end`: js.UndefOr[BorderBlockEnd[TLength]] = js.undefined
  
  /**
    * The **`border-block-start`** CSS property is a shorthand property for setting the individual logical block-start border property values in a single place in the style sheet.
    *
    * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <color>`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start
    */
  var `border-block-start`: js.UndefOr[BorderBlockStart[TLength]] = js.undefined
  
  /**
    * The **`border-bottom`** shorthand CSS property sets an element's bottom border. It sets the values of `border-bottom-width`, `border-bottom-style` and `border-bottom-color`.
    *
    * **Syntax**: `<line-width> || <line-style> || <color>`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom
    */
  var `border-bottom`: js.UndefOr[BorderBottom[TLength]] = js.undefined
  
  /**
    * The **`border-color`** shorthand CSS property sets the color of an element's border.
    *
    * **Syntax**: `<color>{1,4}`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-color
    */
  var `border-color`: js.UndefOr[BorderColor] = js.undefined
  
  /**
    * The **`border-image`** CSS property draws an image around a given element. It replaces the element's regular border.
    *
    * **Syntax**: `<'border-image-source'> || <'border-image-slice'> [ / <'border-image-width'> | / <'border-image-width'>? / <'border-image-outset'> ]? || <'border-image-repeat'>`
    *
    * | Chrome  |  Firefox  | Safari  |  Edge  |   IE   |
    * | :-----: | :-------: | :-----: | :----: | :----: |
    * | **16**  |  **15**   |  **6**  | **12** | **11** |
    * | 7 _-x-_ | 3.5 _-x-_ | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image
    */
  var `border-image`: js.UndefOr[BorderImage] = js.undefined
  
  /**
    * The **`border-inline`** CSS property is a shorthand property for setting the individual logical inline border property values in a single place in the style sheet.
    *
    * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <color>`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **87** | **66**  | **14.1** | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline
    */
  var `border-inline`: js.UndefOr[BorderInline[TLength]] = js.undefined
  
  /**
    * The **`border-inline-end`** CSS property is a shorthand property for setting the individual logical inline-end border property values in a single place in the style sheet.
    *
    * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <color>`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end
    */
  var `border-inline-end`: js.UndefOr[BorderInlineEnd[TLength]] = js.undefined
  
  /**
    * The **`border-inline-start`** CSS property is a shorthand property for setting the individual logical inline-start border property values in a single place in the style sheet.
    *
    * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <color>`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start
    */
  var `border-inline-start`: js.UndefOr[BorderInlineStart[TLength]] = js.undefined
  
  /**
    * The **`border-left`** shorthand CSS property sets all the properties of an element's left border.
    *
    * **Syntax**: `<line-width> || <line-style> || <color>`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-left
    */
  var `border-left`: js.UndefOr[BorderLeft[TLength]] = js.undefined
  
  /**
    * The **`border-radius`** CSS property rounds the corners of an element's outer border edge. You can set a single radius to make circular corners, or two radii to make elliptical corners.
    *
    * **Syntax**: `<length-percentage>{1,4} [ / <length-percentage>{1,4} ]?`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * |  **4**  |  **4**  |  **5**  | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-radius
    */
  var `border-radius`: js.UndefOr[BorderRadius[TLength]] = js.undefined
  
  /**
    * The **`border-right`** shorthand CSS property sets all the properties of an element's right border.
    *
    * **Syntax**: `<line-width> || <line-style> || <color>`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-right
    */
  var `border-right`: js.UndefOr[BorderRight[TLength]] = js.undefined
  
  /**
    * The **`border-style`** shorthand CSS property sets the line style for all four sides of an element's border.
    *
    * **Syntax**: `<line-style>{1,4}`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-style
    */
  var `border-style`: js.UndefOr[BorderStyle] = js.undefined
  
  /**
    * The **`border-top`** shorthand CSS property sets all the properties of an element's top border.
    *
    * **Syntax**: `<line-width> || <line-style> || <color>`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top
    */
  var `border-top`: js.UndefOr[BorderTop[TLength]] = js.undefined
  
  /**
    * The **`border-width`** shorthand CSS property sets the width of an element's border.
    *
    * **Syntax**: `<line-width>{1,4}`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-width
    */
  var `border-width`: js.UndefOr[BorderWidth[TLength]] = js.undefined
  
  /** **Syntax**: `<'caret-color'> || <'caret-shape'>` */
  var caret: js.UndefOr[Caret] = js.undefined
  
  /**
    * The **`column-rule`** shorthand CSS property sets the width, style, and color of the line drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<'column-rule-width'> || <'column-rule-style'> || <'column-rule-color'>`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **50**  | **52**  |  **9**  | **12** | **10** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-rule
    */
  var `column-rule`: js.UndefOr[ColumnRule[TLength]] = js.undefined
  
  /**
    * The **`columns`** CSS shorthand property sets the number of columns to use when drawing an element's contents, as well as those columns' widths.
    *
    * **Syntax**: `<'column-width'> || <'column-count'>`
    *
    * | Chrome | Firefox | Safari  |  Edge  |   IE   |
    * | :----: | :-----: | :-----: | :----: | :----: |
    * | **50** | **52**  |  **9**  | **12** | **10** |
    * |        |         | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/columns
    */
  var columns: js.UndefOr[Columns[TLength]] = js.undefined
  
  /**
    * The **`contain-intrinsic-size`** CSS shorthand property sets the size of an element that a browser will use for layout when the element is subject to size containment.
    *
    * **Syntax**: `[ none | <length> | auto <length> ]{1,2}`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **83** | **107** |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/contain-intrinsic-size
    */
  var `contain-intrinsic-size`: js.UndefOr[ContainIntrinsicSize[TLength]] = js.undefined
  
  /**
    * The **container** shorthand CSS property establishes the element as a query container and specifies the name or name for the containment context used in a container query.
    *
    * **Syntax**: `<'container-name'> [ / <'container-type'> ]?`
    *
    * | Chrome  | Firefox | Safari | Edge | IE  |
    * | :-----: | :-----: | :----: | :--: | :-: |
    * | **105** | **110** | **16** | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/container
    */
  var container: js.UndefOr[Container] = js.undefined
  
  /**
    * The **`flex`** CSS shorthand property sets how a flex _item_ will grow or shrink to fit the space available in its flex container.
    *
    * **Syntax**: `none | [ <'flex-grow'> <'flex-shrink'>? || <'flex-basis'> ]`
    *
    * |  Chrome  | Firefox | Safari  |  Edge  |    IE    |
    * | :------: | :-----: | :-----: | :----: | :------: |
    * |  **29**  | **20**  |  **9**  | **12** |  **11**  |
    * | 21 _-x-_ |         | 7 _-x-_ |        | 10 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex
    */
  var flex: js.UndefOr[Flex[TLength]] = js.undefined
  
  /**
    * The **`flex-flow`** CSS shorthand property specifies the direction of a flex container, as well as its wrapping behavior.
    *
    * **Syntax**: `<'flex-direction'> || <'flex-wrap'>`
    *
    * |  Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :------: | :-----: | :-----: | :----: | :----: |
    * |  **29**  | **28**  |  **9**  | **12** | **11** |
    * | 21 _-x-_ |         | 7 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-flow
    */
  var `flex-flow`: js.UndefOr[FlexFlow] = js.undefined
  
  /**
    * The **`font`** CSS shorthand property sets all the different properties of an element's font. Alternatively, it sets an element's font to a system font.
    *
    * **Syntax**: `[ [ <'font-style'> || <font-variant-css21> || <'font-weight'> || <'font-stretch'> ]? <'font-size'> [ / <'line-height'> ]? <'font-family'> ] | caption | icon | menu | message-box | small-caption | status-bar`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font
    */
  var font: js.UndefOr[Font] = js.undefined
  
  /**
    * The **`gap`** CSS property sets the gaps (gutters) between rows and columns. It is a shorthand for `row-gap` and `column-gap`.
    *
    * **Syntax**: `<'row-gap'> <'column-gap'>?`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/gap
    */
  var gap: js.UndefOr[Gap[TLength]] = js.undefined
  
  /**
    * The **`grid`** CSS property is a shorthand property that sets all of the explicit and implicit grid properties in a single declaration.
    *
    * **Syntax**: `<'grid-template'> | <'grid-template-rows'> / [ auto-flow && dense? ] <'grid-auto-columns'>? | [ auto-flow && dense? ] <'grid-auto-rows'>? / <'grid-template-columns'>`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid
    */
  var grid: js.UndefOr[Grid] = js.undefined
  
  /**
    * The **`grid-area`** CSS shorthand property specifies a grid item's size and location within a grid by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the edges of its grid area.
    *
    * **Syntax**: `<grid-line> [ / <grid-line> ]{0,3}`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-area
    */
  var `grid-area`: js.UndefOr[GridArea] = js.undefined
  
  /**
    * The **`grid-column`** CSS shorthand property specifies a grid item's size and location within a grid column by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-start and inline-end edge of its grid area.
    *
    * **Syntax**: `<grid-line> [ / <grid-line> ]?`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-column
    */
  var `grid-column`: js.UndefOr[GridColumn] = js.undefined
  
  /**
    * The **`grid-row`** CSS shorthand property specifies a grid item's size and location within a grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-start and inline-end edge of its grid area.
    *
    * **Syntax**: `<grid-line> [ / <grid-line> ]?`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-row
    */
  var `grid-row`: js.UndefOr[GridRow] = js.undefined
  
  /**
    * The **`grid-template`** CSS property is a shorthand property for defining grid columns, grid rows, and grid areas.
    *
    * **Syntax**: `none | [ <'grid-template-rows'> / <'grid-template-columns'> ] | [ <line-names>? <string> <track-size>? <line-names>? ]+ [ / <explicit-track-list> ]?`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-template
    */
  var `grid-template`: js.UndefOr[GridTemplate] = js.undefined
  
  /**
    * The **`inset`** CSS property is a shorthand that corresponds to the `top`, `right`, `bottom`, and/or `left` properties. It has the same multi-value syntax of the `margin` shorthand.
    *
    * **Syntax**: `<'top'>{1,4}`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **87** | **66**  | **14.1** | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset
    */
  var inset: js.UndefOr[Inset[TLength]] = js.undefined
  
  /**
    * The **`inset-block`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>{1,2}`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **87** | **63**  | **14.1** | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-block
    */
  var `inset-block`: js.UndefOr[InsetBlock[TLength]] = js.undefined
  
  /**
    * The **`inset-inline`** CSS property defines the logical start and end offsets of an element in the inline direction, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>{1,2}`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **87** | **63**  | **14.1** | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-inline
    */
  var `inset-inline`: js.UndefOr[InsetInline[TLength]] = js.undefined
  
  /**
    * **Syntax**: `none | <integer>`
    *
    * **Initial value**: `none`
    */
  var `line-clamp`: js.UndefOr[LineClamp] = js.undefined
  
  /**
    * The **`list-style`** CSS shorthand property allows you to set all the list style properties at once.
    *
    * **Syntax**: `<'list-style-type'> || <'list-style-position'> || <'list-style-image'>`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/list-style
    */
  var `list-style`: js.UndefOr[ListStyle] = js.undefined
  
  /**
    * The **`margin`** CSS shorthand property sets the margin area on all four sides of an element.
    *
    * **Syntax**: `[ <length> | <percentage> | auto ]{1,4}`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin
    */
  var margin: js.UndefOr[Margin[TLength]] = js.undefined
  
  /**
    * The **`margin-block`** CSS shorthand property defines the logical block start and end margins of an element, which maps to physical margins depending on the element's writing mode, directionality, and text orientation.
    *
    * **Syntax**: `<'margin-left'>{1,2}`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **87** | **66**  | **14.1** | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-block
    */
  var `margin-block`: js.UndefOr[MarginBlock[TLength]] = js.undefined
  
  /**
    * The **`margin-inline`** CSS shorthand property is a shorthand property that defines both the logical inline start and end margins of an element, which maps to physical margins depending on the element's writing mode, directionality, and text orientation.
    *
    * **Syntax**: `<'margin-left'>{1,2}`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **87** | **66**  | **14.1** | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-inline
    */
  var `margin-inline`: js.UndefOr[MarginInline[TLength]] = js.undefined
  
  /**
    * The **`mask`** CSS shorthand property hides an element (partially or fully) by masking or clipping the image at specific points.
    *
    * **Syntax**: `<mask-layer>#`
    *
    * | Chrome | Firefox | Safari  | Edge  | IE  |
    * | :----: | :-----: | :-----: | :---: | :-: |
    * | **1**  |  **2**  | **3.1** | 12-79 | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask
    */
  var mask: js.UndefOr[Mask[TLength]] = js.undefined
  
  /**
    * The **`mask-border`** CSS shorthand property lets you create a mask along the edge of an element's border.
    *
    * **Syntax**: `<'mask-border-source'> || <'mask-border-slice'> [ / <'mask-border-width'>? [ / <'mask-border-outset'> ]? ]? || <'mask-border-repeat'> || <'mask-border-mode'>`
    *
    * |              Chrome              | Firefox |               Safari               | Edge | IE  |
    * | :------------------------------: | :-----: | :--------------------------------: | :--: | :-: |
    * | **1** _(-webkit-mask-box-image)_ |   No    | **3.1** _(-webkit-mask-box-image)_ | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-border
    */
  var `mask-border`: js.UndefOr[MaskBorder] = js.undefined
  
  /**
    * The **`offset`** CSS shorthand property sets all the properties required for animating an element along a defined path.
    *
    * **Syntax**: `[ <'offset-position'>? [ <'offset-path'> [ <'offset-distance'> || <'offset-rotate'> ]? ]? ]! [ / <'offset-anchor'> ]?`
    *
    * |    Chrome     | Firefox | Safari | Edge | IE  |
    * | :-----------: | :-----: | :----: | :--: | :-: |
    * |    **55**     | **72**  | **16** | n/a  | No  |
    * | 46 _(motion)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset
    */
  var motion: js.UndefOr[Offset[TLength]] = js.undefined
  
  /**
    * The **`offset`** CSS shorthand property sets all the properties required for animating an element along a defined path.
    *
    * **Syntax**: `[ <'offset-position'>? [ <'offset-path'> [ <'offset-distance'> || <'offset-rotate'> ]? ]? ]! [ / <'offset-anchor'> ]?`
    *
    * |    Chrome     | Firefox | Safari | Edge | IE  |
    * | :-----------: | :-----: | :----: | :--: | :-: |
    * |    **55**     | **72**  | **16** | n/a  | No  |
    * | 46 _(motion)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset
    */
  var offset: js.UndefOr[Offset[TLength]] = js.undefined
  
  /**
    * The **`outline`** CSS shorthand property sets most of the outline properties in a single declaration.
    *
    * **Syntax**: `[ <'outline-color'> || <'outline-style'> || <'outline-width'> ]`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **94** | **88**  | **1.2** | **94** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline
    */
  var outline: js.UndefOr[Outline[TLength]] = js.undefined
  
  /**
    * The **`overflow`** CSS shorthand property sets the desired behavior for an element's overflow — i.e. when an element's content is too big to fit in its block formatting context — in both directions.
    *
    * **Syntax**: `[ visible | hidden | clip | scroll | auto ]{1,2}`
    *
    * **Initial value**: `visible`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow
    */
  var overflow: js.UndefOr[Overflow] = js.undefined
  
  /**
    * The **`overscroll-behavior`** CSS property sets what a browser does when reaching the boundary of a scrolling area. It's a shorthand for `overscroll-behavior-x` and `overscroll-behavior-y`.
    *
    * **Syntax**: `[ contain | none | auto ]{1,2}`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **63** | **59**  | **16** | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior
    */
  var `overscroll-behavior`: js.UndefOr[OverscrollBehavior] = js.undefined
  
  /**
    * The **`padding`** CSS shorthand property sets the padding area on all four sides of an element at once.
    *
    * **Syntax**: `[ <length> | <percentage> ]{1,4}`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding
    */
  var padding: js.UndefOr[Padding[TLength]] = js.undefined
  
  /**
    * The **`padding-block`** CSS shorthand property defines the logical block start and end padding of an element, which maps to physical padding properties depending on the element's writing mode, directionality, and text orientation.
    *
    * **Syntax**: `<'padding-left'>{1,2}`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **87** | **66**  | **14.1** | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-block
    */
  var `padding-block`: js.UndefOr[PaddingBlock[TLength]] = js.undefined
  
  /**
    * The **`padding-inline`** CSS shorthand property defines the logical inline start and end padding of an element, which maps to physical padding properties depending on the element's writing mode, directionality, and text orientation.
    *
    * **Syntax**: `<'padding-left'>{1,2}`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **87** | **66**  | **14.1** | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-inline
    */
  var `padding-inline`: js.UndefOr[PaddingInline[TLength]] = js.undefined
  
  /**
    * The **`place-content`** CSS shorthand property allows you to align content along both the block and inline directions at once (i.e. the `align-content` and `justify-content` properties) in a relevant layout system such as Grid or Flexbox.
    *
    * **Syntax**: `<'align-content'> <'justify-content'>?`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **59** | **45**  | **9**  | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/place-content
    */
  var `place-content`: js.UndefOr[PlaceContent] = js.undefined
  
  /**
    * The CSS **`place-items`** shorthand property allows you to align items along both the block and inline directions at once (i.e. the `align-items` and `justify-items` properties) in a relevant layout system such as Grid or Flexbox. If the second value is not set, the first value is also used for it.
    *
    * **Syntax**: `<'align-items'> <'justify-items'>?`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **59** | **45**  | **11** | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/place-items
    */
  var `place-items`: js.UndefOr[PlaceItems] = js.undefined
  
  /**
    * The **`place-self`** CSS shorthand property allows you to align an individual item in both the block and inline directions at once (i.e. the `align-self` and `justify-self` properties) in a relevant layout system such as Grid or Flexbox. If the second value is not present, the first value is also used for it.
    *
    * **Syntax**: `<'align-self'> <'justify-self'>?`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **59** | **45**  | **11** | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/place-self
    */
  var `place-self`: js.UndefOr[PlaceSelf] = js.undefined
  
  /**
    * The **`scroll-margin`** shorthand property sets all of the scroll margins of an element at once, assigning values much like the `margin` property does for margins of an element.
    *
    * **Syntax**: `<length>{1,4}`
    *
    * | Chrome | Firefox |          Safari           | Edge | IE  |
    * | :----: | :-----: | :-----------------------: | :--: | :-: |
    * | **69** | **90**  |         **14.1**          | n/a  | No  |
    * |        |         | 11 _(scroll-snap-margin)_ |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin
    */
  var `scroll-margin`: js.UndefOr[ScrollMargin[TLength]] = js.undefined
  
  /**
    * The `scroll-margin-block` shorthand property sets the scroll margins of an element in the block dimension.
    *
    * **Syntax**: `<length>{1,2}`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **68**  | **14.1** | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-block
    */
  var `scroll-margin-block`: js.UndefOr[ScrollMarginBlock[TLength]] = js.undefined
  
  /**
    * The `scroll-margin-inline` shorthand property sets the scroll margins of an element in the inline dimension.
    *
    * **Syntax**: `<length>{1,2}`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **68**  | **14.1** | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-inline
    */
  var `scroll-margin-inline`: js.UndefOr[ScrollMarginInline[TLength]] = js.undefined
  
  /**
    * The **`scroll-padding`** shorthand property sets scroll padding on all sides of an element at once, much like the `padding` property does for padding on an element.
    *
    * **Syntax**: `[ auto | <length-percentage> ]{1,4}`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **68**  | **14.1** | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding
    */
  var `scroll-padding`: js.UndefOr[ScrollPadding[TLength]] = js.undefined
  
  /**
    * The `scroll-padding-block` shorthand property sets the scroll padding of an element in the block dimension.
    *
    * **Syntax**: `[ auto | <length-percentage> ]{1,2}`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **15** | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-block
    */
  var `scroll-padding-block`: js.UndefOr[ScrollPaddingBlock[TLength]] = js.undefined
  
  /**
    * The `scroll-padding-inline` shorthand property sets the scroll padding of an element in the inline dimension.
    *
    * **Syntax**: `[ auto | <length-percentage> ]{1,2}`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **15** | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-inline
    */
  var `scroll-padding-inline`: js.UndefOr[ScrollPaddingInline[TLength]] = js.undefined
  
  /**
    * The **`scroll-margin`** shorthand property sets all of the scroll margins of an element at once, assigning values much like the `margin` property does for margins of an element.
    *
    * **Syntax**: `<length>{1,4}`
    *
    * | Chrome | Firefox |          Safari           | Edge | IE  |
    * | :----: | :-----: | :-----------------------: | :--: | :-: |
    * | **69** |  68-90  |         **14.1**          | n/a  | No  |
    * |        |         | 11 _(scroll-snap-margin)_ |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin
    */
  var `scroll-snap-margin`: js.UndefOr[ScrollMargin[TLength]] = js.undefined
  
  /**
    * The **`scroll-timeline`** CSS shorthand property defines a name that can be used to identify the source element of a scroll timeline, along with the scrollbar axis that should provide the timeline.
    *
    * **Syntax**: `[<'scroll-timeline-name'> <'scroll-timeline-axis'>?]#`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   n/a   |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-timeline
    */
  var `scroll-timeline`: js.UndefOr[ScrollTimeline] = js.undefined
  
  /**
    * The **`text-decoration`** shorthand CSS property sets the appearance of decorative lines on text. It is a shorthand for `text-decoration-line`, `text-decoration-color`, `text-decoration-style`, and the newer `text-decoration-thickness` property.
    *
    * **Syntax**: `<'text-decoration-line'> || <'text-decoration-style'> || <'text-decoration-color'> || <'text-decoration-thickness'>`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration
    */
  var `text-decoration`: js.UndefOr[TextDecoration[TLength]] = js.undefined
  
  /**
    * The **`text-emphasis`** CSS property applies emphasis marks to text (except spaces and control characters). It is a shorthand for `text-emphasis-style` and `text-emphasis-color`.
    *
    * **Syntax**: `<'text-emphasis-style'> || <'text-emphasis-color'>`
    *
    * |  Chrome  | Firefox | Safari | Edge | IE  |
    * | :------: | :-----: | :----: | :--: | :-: |
    * |  **99**  | **46**  | **7**  | n/a  | No  |
    * | 25 _-x-_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis
    */
  var `text-emphasis`: js.UndefOr[TextEmphasis] = js.undefined
  
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * **Syntax**: `<single-transition>#`
    *
    * | Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :-----: | :-----: | :-------: | :----: | :----: |
    * | **26**  | **16**  |   **9**   | **12** | **10** |
    * | 1 _-x-_ | 4 _-x-_ | 3.1 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transition
    */
  var transition: js.UndefOr[Transition[TTime]] = js.undefined
}
object StandardShorthandPropertiesHyphen {
  
  inline def apply[TLength, TTime](): StandardShorthandPropertiesHyphen[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardShorthandPropertiesHyphen[TLength, TTime]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StandardShorthandPropertiesHyphen[?, ?], TLength, TTime] (val x: Self & (StandardShorthandPropertiesHyphen[TLength, TTime])) extends AnyVal {
    
    inline def setAll(value: All): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setAnimation(value: Animation[TTime]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setBackground(value: Background[TLength]): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def `setBackground-position`(value: BackgroundPosition[TLength]): Self = StObject.set(x, "background-position", value.asInstanceOf[js.Any])
    
    inline def `setBackground-positionUndefined`: Self = StObject.set(x, "background-position", js.undefined)
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBorder(value: Border[TLength]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def `setBorder-block`(value: BorderBlock[TLength]): Self = StObject.set(x, "border-block", value.asInstanceOf[js.Any])
    
    inline def `setBorder-block-end`(value: BorderBlockEnd[TLength]): Self = StObject.set(x, "border-block-end", value.asInstanceOf[js.Any])
    
    inline def `setBorder-block-endUndefined`: Self = StObject.set(x, "border-block-end", js.undefined)
    
    inline def `setBorder-block-start`(value: BorderBlockStart[TLength]): Self = StObject.set(x, "border-block-start", value.asInstanceOf[js.Any])
    
    inline def `setBorder-block-startUndefined`: Self = StObject.set(x, "border-block-start", js.undefined)
    
    inline def `setBorder-blockUndefined`: Self = StObject.set(x, "border-block", js.undefined)
    
    inline def `setBorder-bottom`(value: BorderBottom[TLength]): Self = StObject.set(x, "border-bottom", value.asInstanceOf[js.Any])
    
    inline def `setBorder-bottomUndefined`: Self = StObject.set(x, "border-bottom", js.undefined)
    
    inline def `setBorder-color`(value: BorderColor): Self = StObject.set(x, "border-color", value.asInstanceOf[js.Any])
    
    inline def `setBorder-colorUndefined`: Self = StObject.set(x, "border-color", js.undefined)
    
    inline def `setBorder-image`(value: BorderImage): Self = StObject.set(x, "border-image", value.asInstanceOf[js.Any])
    
    inline def `setBorder-imageUndefined`: Self = StObject.set(x, "border-image", js.undefined)
    
    inline def `setBorder-inline`(value: BorderInline[TLength]): Self = StObject.set(x, "border-inline", value.asInstanceOf[js.Any])
    
    inline def `setBorder-inline-end`(value: BorderInlineEnd[TLength]): Self = StObject.set(x, "border-inline-end", value.asInstanceOf[js.Any])
    
    inline def `setBorder-inline-endUndefined`: Self = StObject.set(x, "border-inline-end", js.undefined)
    
    inline def `setBorder-inline-start`(value: BorderInlineStart[TLength]): Self = StObject.set(x, "border-inline-start", value.asInstanceOf[js.Any])
    
    inline def `setBorder-inline-startUndefined`: Self = StObject.set(x, "border-inline-start", js.undefined)
    
    inline def `setBorder-inlineUndefined`: Self = StObject.set(x, "border-inline", js.undefined)
    
    inline def `setBorder-left`(value: BorderLeft[TLength]): Self = StObject.set(x, "border-left", value.asInstanceOf[js.Any])
    
    inline def `setBorder-leftUndefined`: Self = StObject.set(x, "border-left", js.undefined)
    
    inline def `setBorder-radius`(value: BorderRadius[TLength]): Self = StObject.set(x, "border-radius", value.asInstanceOf[js.Any])
    
    inline def `setBorder-radiusUndefined`: Self = StObject.set(x, "border-radius", js.undefined)
    
    inline def `setBorder-right`(value: BorderRight[TLength]): Self = StObject.set(x, "border-right", value.asInstanceOf[js.Any])
    
    inline def `setBorder-rightUndefined`: Self = StObject.set(x, "border-right", js.undefined)
    
    inline def `setBorder-style`(value: BorderStyle): Self = StObject.set(x, "border-style", value.asInstanceOf[js.Any])
    
    inline def `setBorder-styleUndefined`: Self = StObject.set(x, "border-style", js.undefined)
    
    inline def `setBorder-top`(value: BorderTop[TLength]): Self = StObject.set(x, "border-top", value.asInstanceOf[js.Any])
    
    inline def `setBorder-topUndefined`: Self = StObject.set(x, "border-top", js.undefined)
    
    inline def `setBorder-width`(value: BorderWidth[TLength]): Self = StObject.set(x, "border-width", value.asInstanceOf[js.Any])
    
    inline def `setBorder-widthUndefined`: Self = StObject.set(x, "border-width", js.undefined)
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setCaret(value: Caret): Self = StObject.set(x, "caret", value.asInstanceOf[js.Any])
    
    inline def setCaretUndefined: Self = StObject.set(x, "caret", js.undefined)
    
    inline def `setColumn-rule`(value: ColumnRule[TLength]): Self = StObject.set(x, "column-rule", value.asInstanceOf[js.Any])
    
    inline def `setColumn-ruleUndefined`: Self = StObject.set(x, "column-rule", js.undefined)
    
    inline def setColumns(value: Columns[TLength]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def `setContain-intrinsic-size`(value: ContainIntrinsicSize[TLength]): Self = StObject.set(x, "contain-intrinsic-size", value.asInstanceOf[js.Any])
    
    inline def `setContain-intrinsic-sizeUndefined`: Self = StObject.set(x, "contain-intrinsic-size", js.undefined)
    
    inline def setContainer(value: Container): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setFlex(value: Flex[TLength]): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    inline def `setFlex-flow`(value: FlexFlow): Self = StObject.set(x, "flex-flow", value.asInstanceOf[js.Any])
    
    inline def `setFlex-flowUndefined`: Self = StObject.set(x, "flex-flow", js.undefined)
    
    inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
    
    inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setGap(value: Gap[TLength]): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    inline def setGrid(value: Grid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def `setGrid-area`(value: GridArea): Self = StObject.set(x, "grid-area", value.asInstanceOf[js.Any])
    
    inline def `setGrid-areaUndefined`: Self = StObject.set(x, "grid-area", js.undefined)
    
    inline def `setGrid-column`(value: GridColumn): Self = StObject.set(x, "grid-column", value.asInstanceOf[js.Any])
    
    inline def `setGrid-columnUndefined`: Self = StObject.set(x, "grid-column", js.undefined)
    
    inline def `setGrid-row`(value: GridRow): Self = StObject.set(x, "grid-row", value.asInstanceOf[js.Any])
    
    inline def `setGrid-rowUndefined`: Self = StObject.set(x, "grid-row", js.undefined)
    
    inline def `setGrid-template`(value: GridTemplate): Self = StObject.set(x, "grid-template", value.asInstanceOf[js.Any])
    
    inline def `setGrid-templateUndefined`: Self = StObject.set(x, "grid-template", js.undefined)
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setInset(value: Inset[TLength]): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    inline def `setInset-block`(value: InsetBlock[TLength]): Self = StObject.set(x, "inset-block", value.asInstanceOf[js.Any])
    
    inline def `setInset-blockUndefined`: Self = StObject.set(x, "inset-block", js.undefined)
    
    inline def `setInset-inline`(value: InsetInline[TLength]): Self = StObject.set(x, "inset-inline", value.asInstanceOf[js.Any])
    
    inline def `setInset-inlineUndefined`: Self = StObject.set(x, "inset-inline", js.undefined)
    
    inline def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
    
    inline def `setLine-clamp`(value: LineClamp): Self = StObject.set(x, "line-clamp", value.asInstanceOf[js.Any])
    
    inline def `setLine-clampUndefined`: Self = StObject.set(x, "line-clamp", js.undefined)
    
    inline def `setList-style`(value: ListStyle): Self = StObject.set(x, "list-style", value.asInstanceOf[js.Any])
    
    inline def `setList-styleUndefined`: Self = StObject.set(x, "list-style", js.undefined)
    
    inline def setMargin(value: Margin[TLength]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def `setMargin-block`(value: MarginBlock[TLength]): Self = StObject.set(x, "margin-block", value.asInstanceOf[js.Any])
    
    inline def `setMargin-blockUndefined`: Self = StObject.set(x, "margin-block", js.undefined)
    
    inline def `setMargin-inline`(value: MarginInline[TLength]): Self = StObject.set(x, "margin-inline", value.asInstanceOf[js.Any])
    
    inline def `setMargin-inlineUndefined`: Self = StObject.set(x, "margin-inline", js.undefined)
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMask(value: Mask[TLength]): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def `setMask-border`(value: MaskBorder): Self = StObject.set(x, "mask-border", value.asInstanceOf[js.Any])
    
    inline def `setMask-borderUndefined`: Self = StObject.set(x, "mask-border", js.undefined)
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setMotion(value: Offset[TLength]): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
    
    inline def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
    
    inline def setOffset(value: Offset[TLength]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOutline(value: Outline[TLength]): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setOverflow(value: Overflow): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    inline def `setOverscroll-behavior`(value: OverscrollBehavior): Self = StObject.set(x, "overscroll-behavior", value.asInstanceOf[js.Any])
    
    inline def `setOverscroll-behaviorUndefined`: Self = StObject.set(x, "overscroll-behavior", js.undefined)
    
    inline def setPadding(value: Padding[TLength]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def `setPadding-block`(value: PaddingBlock[TLength]): Self = StObject.set(x, "padding-block", value.asInstanceOf[js.Any])
    
    inline def `setPadding-blockUndefined`: Self = StObject.set(x, "padding-block", js.undefined)
    
    inline def `setPadding-inline`(value: PaddingInline[TLength]): Self = StObject.set(x, "padding-inline", value.asInstanceOf[js.Any])
    
    inline def `setPadding-inlineUndefined`: Self = StObject.set(x, "padding-inline", js.undefined)
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def `setPlace-content`(value: PlaceContent): Self = StObject.set(x, "place-content", value.asInstanceOf[js.Any])
    
    inline def `setPlace-contentUndefined`: Self = StObject.set(x, "place-content", js.undefined)
    
    inline def `setPlace-items`(value: PlaceItems): Self = StObject.set(x, "place-items", value.asInstanceOf[js.Any])
    
    inline def `setPlace-itemsUndefined`: Self = StObject.set(x, "place-items", js.undefined)
    
    inline def `setPlace-self`(value: PlaceSelf): Self = StObject.set(x, "place-self", value.asInstanceOf[js.Any])
    
    inline def `setPlace-selfUndefined`: Self = StObject.set(x, "place-self", js.undefined)
    
    inline def `setScroll-margin`(value: ScrollMargin[TLength]): Self = StObject.set(x, "scroll-margin", value.asInstanceOf[js.Any])
    
    inline def `setScroll-margin-block`(value: ScrollMarginBlock[TLength]): Self = StObject.set(x, "scroll-margin-block", value.asInstanceOf[js.Any])
    
    inline def `setScroll-margin-blockUndefined`: Self = StObject.set(x, "scroll-margin-block", js.undefined)
    
    inline def `setScroll-margin-inline`(value: ScrollMarginInline[TLength]): Self = StObject.set(x, "scroll-margin-inline", value.asInstanceOf[js.Any])
    
    inline def `setScroll-margin-inlineUndefined`: Self = StObject.set(x, "scroll-margin-inline", js.undefined)
    
    inline def `setScroll-marginUndefined`: Self = StObject.set(x, "scroll-margin", js.undefined)
    
    inline def `setScroll-padding`(value: ScrollPadding[TLength]): Self = StObject.set(x, "scroll-padding", value.asInstanceOf[js.Any])
    
    inline def `setScroll-padding-block`(value: ScrollPaddingBlock[TLength]): Self = StObject.set(x, "scroll-padding-block", value.asInstanceOf[js.Any])
    
    inline def `setScroll-padding-blockUndefined`: Self = StObject.set(x, "scroll-padding-block", js.undefined)
    
    inline def `setScroll-padding-inline`(value: ScrollPaddingInline[TLength]): Self = StObject.set(x, "scroll-padding-inline", value.asInstanceOf[js.Any])
    
    inline def `setScroll-padding-inlineUndefined`: Self = StObject.set(x, "scroll-padding-inline", js.undefined)
    
    inline def `setScroll-paddingUndefined`: Self = StObject.set(x, "scroll-padding", js.undefined)
    
    inline def `setScroll-snap-margin`(value: ScrollMargin[TLength]): Self = StObject.set(x, "scroll-snap-margin", value.asInstanceOf[js.Any])
    
    inline def `setScroll-snap-marginUndefined`: Self = StObject.set(x, "scroll-snap-margin", js.undefined)
    
    inline def `setScroll-timeline`(value: ScrollTimeline): Self = StObject.set(x, "scroll-timeline", value.asInstanceOf[js.Any])
    
    inline def `setScroll-timelineUndefined`: Self = StObject.set(x, "scroll-timeline", js.undefined)
    
    inline def `setText-decoration`(value: TextDecoration[TLength]): Self = StObject.set(x, "text-decoration", value.asInstanceOf[js.Any])
    
    inline def `setText-decorationUndefined`: Self = StObject.set(x, "text-decoration", js.undefined)
    
    inline def `setText-emphasis`(value: TextEmphasis): Self = StObject.set(x, "text-emphasis", value.asInstanceOf[js.Any])
    
    inline def `setText-emphasisUndefined`: Self = StObject.set(x, "text-emphasis", js.undefined)
    
    inline def setTransition(value: Transition[TTime]): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
