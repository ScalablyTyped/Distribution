package typings.csstype.mod

import typings.csstype.mod.Property.All
import typings.csstype.mod.Property.Animation
import typings.csstype.mod.Property.Background
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
import typings.csstype.mod.Property.ColumnRule
import typings.csstype.mod.Property.Columns
import typings.csstype.mod.Property.Flex
import typings.csstype.mod.Property.FlexFlow
import typings.csstype.mod.Property.Font
import typings.csstype.mod.Property.Gap
import typings.csstype.mod.Property.Grid
import typings.csstype.mod.Property.GridArea
import typings.csstype.mod.Property.GridColumn
import typings.csstype.mod.Property.GridRow
import typings.csstype.mod.Property.GridTemplate
import typings.csstype.mod.Property.LineClamp
import typings.csstype.mod.Property.ListStyle
import typings.csstype.mod.Property.Margin
import typings.csstype.mod.Property.Mask
import typings.csstype.mod.Property.MaskBorder
import typings.csstype.mod.Property.Offset
import typings.csstype.mod.Property.Outline
import typings.csstype.mod.Property.Overflow
import typings.csstype.mod.Property.Padding
import typings.csstype.mod.Property.PlaceItems
import typings.csstype.mod.Property.PlaceSelf
import typings.csstype.mod.Property.TextDecoration
import typings.csstype.mod.Property.TextEmphasis
import typings.csstype.mod.Property.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandardShorthandProperties[TLength, TTime] extends js.Object {
  /**
    * The `**all**` shorthand CSS property resets all of an element's properties (except `unicode-bidi` and `direction`). It can set properties to their initial or inherited values, or to the values specified in another stylesheet origin.
    *
    * **Syntax**: `initial | inherit | unset | revert`
    *
    * **Initial value**: There is no practical initial value for it.
    *
    * | Chrome | Firefox | Safari  |  Edge  | IE  |
    * | :----: | :-----: | :-----: | :----: | :-: |
    * | **37** | **27**  | **9.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/all
    */
  var all: js.UndefOr[All] = js.native
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
  var animation: js.UndefOr[Animation[TTime]] = js.native
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
  var background: js.UndefOr[Background[TLength]] = js.native
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
  var border: js.UndefOr[Border[TLength]] = js.native
  /**
    * The **`border-block`** CSS property is a shorthand property for setting the individual logical block border property values in a single place in the style sheet.
    *
    * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <'color'>`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **66**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block
    */
  var borderBlock: js.UndefOr[BorderBlock[TLength]] = js.native
  /**
    * The **`border-block-end`** CSS property is a shorthand property for setting the individual logical block-end border property values in a single place in the style sheet.
    *
    * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <'color'>`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end
    */
  var borderBlockEnd: js.UndefOr[BorderBlockEnd[TLength]] = js.native
  /**
    * The **`border-block-start`** CSS property is a shorthand property for setting the individual logical block-start border property values in a single place in the style sheet.
    *
    * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <'color'>`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start
    */
  var borderBlockStart: js.UndefOr[BorderBlockStart[TLength]] = js.native
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
  var borderBottom: js.UndefOr[BorderBottom[TLength]] = js.native
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
  var borderColor: js.UndefOr[BorderColor] = js.native
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
  var borderImage: js.UndefOr[BorderImage] = js.native
  /**
    * The **`border-inline`** CSS property is a shorthand property for setting the individual logical inline border property values in a single place in the style sheet.
    *
    * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <'color'>`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **66**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline
    */
  var borderInline: js.UndefOr[BorderInline[TLength]] = js.native
  /**
    * The **`border-inline-end`** CSS property is a shorthand property for setting the individual logical inline-end border property values in a single place in the style sheet.
    *
    * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <'color'>`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end
    */
  var borderInlineEnd: js.UndefOr[BorderInlineEnd[TLength]] = js.native
  /**
    * The **`border-inline-start`** CSS property is a shorthand property for setting the individual logical inline-start border property values in a single place in the style sheet.
    *
    * **Syntax**: `<'border-top-width'> || <'border-top-style'> || <'color'>`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start
    */
  var borderInlineStart: js.UndefOr[BorderInlineStart[TLength]] = js.native
  /**
    * The **`border-left`** shorthand CSS property set an element's left border.
    *
    * **Syntax**: `<line-width> || <line-style> || <color>`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-left
    */
  var borderLeft: js.UndefOr[BorderLeft[TLength]] = js.native
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
  var borderRadius: js.UndefOr[BorderRadius[TLength]] = js.native
  /**
    * The **`border-right`** shorthand CSS property sets an element's right border. It sets the values of `border-right-width`, `border-right-style` and `border-right-color`.
    *
    * **Syntax**: `<line-width> || <line-style> || <color>`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-right
    */
  var borderRight: js.UndefOr[BorderRight[TLength]] = js.native
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
  var borderStyle: js.UndefOr[BorderStyle] = js.native
  /**
    * The **`border-top`** shorthand CSS property set an element's top border. It sets the values of `border-top-width`, `border-top-style` and `border-top-color`.
    *
    * **Syntax**: `<line-width> || <line-style> || <color>`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top
    */
  var borderTop: js.UndefOr[BorderTop[TLength]] = js.native
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
  var borderWidth: js.UndefOr[BorderWidth[TLength]] = js.native
  /**
    * The **`column-rule`** shorthand CSS property sets the width, style, and color of the line drawn between columns in a multi-column layout.
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
  var columnRule: js.UndefOr[ColumnRule[TLength]] = js.native
  /**
    * The **`columns`** CSS property sets the column width and column count of an element.
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
  var columns: js.UndefOr[Columns[TLength]] = js.native
  /**
    * The **`flex`** CSS property sets how a flex _item_ will grow or shrink to fit the space available in its flex container. It is a shorthand for `flex-grow`, `flex-shrink`, and `flex-basis`.
    *
    * **Syntax**: `none | [ <'flex-grow'> <'flex-shrink'>? || <'flex-basis'> ]`
    *
    * |  Chrome  | Firefox |  Safari   |  Edge  |    IE    |
    * | :------: | :-----: | :-------: | :----: | :------: |
    * |  **29**  | **20**  |   **9**   | **12** |  **11**  |
    * | 21 _-x-_ |         | 6.1 _-x-_ |        | 10 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex
    */
  var flex: js.UndefOr[Flex[TLength]] = js.native
  /**
    * The **`flex-flow`** CSS property is a shorthand property for `flex-direction` and `flex-wrap` properties.
    *
    * **Syntax**: `<'flex-direction'> || <'flex-wrap'>`
    *
    * |  Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :------: | :-----: | :-------: | :----: | :----: |
    * |  **29**  | **28**  |   **9**   | **12** | **11** |
    * | 21 _-x-_ |         | 6.1 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-flow
    */
  var flexFlow: js.UndefOr[FlexFlow] = js.native
  /**
    * The **`font`** CSS property is a shorthand for `font-style`, `font-variant`, `font-weight`, `font-stretch`, `font-size`, `line-height`, and `font-family`. Alternatively, it sets an element's font to a system font.
    *
    * **Syntax**: `[ [ <'font-style'> || <font-variant-css21> || <'font-weight'> || <'font-stretch'> ]? <'font-size'> [ / <'line-height'> ]? <'font-family'> ] | caption | icon | menu | message-box | small-caption | status-bar`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font
    */
  var font: js.UndefOr[Font] = js.native
  /**
    * The **`gap`** CSS property sets the gaps (gutters) between rows and columns. It is a shorthand for `row-gap` and `column-gap`.
    *
    * **Syntax**: `<'row-gap'> <'column-gap'>?`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **84** | **63**  |   No   |  No  | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * |     Chrome      |     Firefox     |      Safari       |  Edge  | IE  |
    * | :-------------: | :-------------: | :---------------: | :----: | :-: |
    * |     **66**      |     **61**      |      **12**       | **16** | No  |
    * | 57 _(grid-gap)_ | 52 _(grid-gap)_ | 10.1 _(grid-gap)_ |        |     |
    *
    * ---
    *
    * _Supported in Multi-column Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **66** | **61**  |   No   | **16** | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/gap
    */
  var gap: js.UndefOr[Gap[TLength]] = js.native
  /**
    * The **`grid`** CSS property is a shorthand property that sets all of the explicit grid properties (`grid-template-rows`, `grid-template-columns`, and `grid-template-areas`), and all the implicit grid properties (`grid-auto-rows`, `grid-auto-columns`, and `grid-auto-flow`), in a single declaration.
    *
    * **Syntax**: `<'grid-template'> | <'grid-template-rows'> / [ auto-flow && dense? ] <'grid-auto-columns'>? | [ auto-flow && dense? ] <'grid-auto-rows'>? / <'grid-template-columns'>`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid
    */
  var grid: js.UndefOr[Grid] = js.native
  /**
    * The **`grid-area`** CSS property is a shorthand property for `grid-row-start`, `grid-column-start`, `grid-row-end` and `grid-column-end`, specifying a grid item’s size and location within the grid by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the edges of its grid area.
    *
    * **Syntax**: `<grid-line> [ / <grid-line> ]{0,3}`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-area
    */
  var gridArea: js.UndefOr[GridArea] = js.native
  /**
    * The **`grid-column`** CSS property is a shorthand property for `grid-column-start` and `grid-column-end` specifying a grid item's size and location within the grid column by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-start and inline-end edge of its grid area.
    *
    * **Syntax**: `<grid-line> [ / <grid-line> ]?`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-column
    */
  var gridColumn: js.UndefOr[GridColumn] = js.native
  /**
    * The **`grid-row`** CSS property is a shorthand property for `grid-row-start` and `grid-row-end` specifying a grid item’s size and location within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-start and inline-end edge of its grid area.
    *
    * **Syntax**: `<grid-line> [ / <grid-line> ]?`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-row
    */
  var gridRow: js.UndefOr[GridRow] = js.native
  /**
    * The **`grid-template`** CSS property is a shorthand property for defining grid columns, rows, and areas.
    *
    * **Syntax**: `none | [ <'grid-template-rows'> / <'grid-template-columns'> ] | [ <line-names>? <string> <track-size>? <line-names>? ]+ [ / <explicit-track-list> ]?`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-template
    */
  var gridTemplate: js.UndefOr[GridTemplate] = js.native
  /**
    * **Syntax**: `none | <integer>`
    *
    * **Initial value**: `none`
    */
  var lineClamp: js.UndefOr[LineClamp] = js.native
  /**
    * The **`list-style`** CSS property is a shorthand to set list style properties `list-style-type`, `list-style-image`, and `list-style-position`.
    *
    * **Syntax**: `<'list-style-type'> || <'list-style-position'> || <'list-style-image'>`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/list-style
    */
  var listStyle: js.UndefOr[ListStyle] = js.native
  /**
    * The **`margin`** CSS property sets the margin area on all four sides of an element. It is a shorthand for `margin-top`, `margin-right`, `margin-bottom`, and `margin-left`.
    *
    * **Syntax**: `[ <length> | <percentage> | auto ]{1,4}`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin
    */
  var margin: js.UndefOr[Margin[TLength]] = js.native
  /**
    * The **`mask`** CSS property hides an element (partially or fully) by masking or clipping the image at specific points.
    *
    * **Syntax**: `<mask-layer>#`
    *
    * | Chrome | Firefox | Safari  |  Edge  | IE  |
    * | :----: | :-----: | :-----: | :----: | :-: |
    * | **1**  |  **2**  | **3.2** | **12** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask
    */
  var mask: js.UndefOr[Mask[TLength]] = js.native
  /**
    * The **`mask-border`** CSS property lets you create a mask along the edge of an element's border.
    *
    * **Syntax**: `<'mask-border-source'> || <'mask-border-slice'> [ / <'mask-border-width'>? [ / <'mask-border-outset'> ]? ]? || <'mask-border-repeat'> || <'mask-border-mode'>`
    */
  var maskBorder: js.UndefOr[MaskBorder] = js.native
  /**
    * The **`offset`** CSS property is a shorthand property for animating an element along a defined path. It sets the values of `offset-position`, `offset-path`, `offset-distance`, `offset-rotate`, and `offset-anchor`.
    *
    * **Syntax**: `[ <'offset-position'>? [ <'offset-path'> [ <'offset-distance'> || <'offset-rotate'> ]? ]? ]! [ / <'offset-anchor'> ]?`
    *
    * |    Chrome     | Firefox | Safari |  Edge  | IE  |
    * | :-----------: | :-----: | :----: | :----: | :-: |
    * |    **55**     | **72**  |   No   | **79** | No  |
    * | 46 _(motion)_ |         |        |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset
    */
  var motion: js.UndefOr[Offset[TLength]] = js.native
  /**
    * The **`offset`** CSS property is a shorthand property for animating an element along a defined path. It sets the values of `offset-position`, `offset-path`, `offset-distance`, `offset-rotate`, and `offset-anchor`.
    *
    * **Syntax**: `[ <'offset-position'>? [ <'offset-path'> [ <'offset-distance'> || <'offset-rotate'> ]? ]? ]! [ / <'offset-anchor'> ]?`
    *
    * |    Chrome     | Firefox | Safari |  Edge  | IE  |
    * | :-----------: | :-----: | :----: | :----: | :-: |
    * |    **55**     | **72**  |   No   | **79** | No  |
    * | 46 _(motion)_ |         |        |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset
    */
  var offset: js.UndefOr[Offset[TLength]] = js.native
  /**
    * The **`outline`** CSS property is a shorthand to set various outline properties in a single declaration: `outline-style`, `outline-width`, and `outline-color`.
    *
    * **Syntax**: `[ <'outline-color'> || <'outline-style'> || <'outline-width'> ]`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **1.5** | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline
    */
  var outline: js.UndefOr[Outline[TLength]] = js.native
  /**
    * The **`overflow`** shorthand CSS property sets what to do when an element's content is too big to fit in its block formatting context. It is a shorthand for `overflow-x` and `overflow-y`.
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
  var overflow: js.UndefOr[Overflow] = js.native
  /**
    * The **`padding`** CSS property sets the padding area on all four sides of an element. It is a shorthand for `padding-top`, `padding-right`, `padding-bottom`, and `padding-left`.
    *
    * **Syntax**: `[ <length> | <percentage> ]{1,4}`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding
    */
  var padding: js.UndefOr[Padding[TLength]] = js.native
  /**
    * The CSS **`place-items`** shorthand property sets the `align-items` and `justify-items` properties, respectively. If the second value is not set, the first value is also used for it.
    *
    * **Syntax**: `<'align-items'> <'justify-items'>?`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **59** | **45**  | **11** | **79** | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **59** | **45**  | **11** | **79** | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/place-items
    */
  var placeItems: js.UndefOr[PlaceItems] = js.native
  /**
    * The **`place-self`** CSS property is a shorthand property sets both the `align-self` and `justify-self` properties. The first value is the `align-self` property value, the second the `justify-self` one. If the second value is not present, the first value is also used for it.
    *
    * **Syntax**: `<'align-self'> <'justify-self'>?`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **59** | **45**  |   No   | **79** | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **59** | **45**  |   No   | **79** | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/place-self
    */
  var placeSelf: js.UndefOr[PlaceSelf] = js.native
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
  var textDecoration: js.UndefOr[TextDecoration[TLength]] = js.native
  /**
    * The **`text-emphasis`** CSS property applies emphasis marks to text (except spaces and control characters). It is a shorthand for `text-emphasis-style` and `text-emphasis-color`.
    *
    * **Syntax**: `<'text-emphasis-style'> || <'text-emphasis-color'>`
    *
    * |    Chrome    | Firefox | Safari  |     Edge     | IE  |
    * | :----------: | :-----: | :-----: | :----------: | :-: |
    * | **25** _-x-_ | **46**  | **6.1** | **79** _-x-_ | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis
    */
  var textEmphasis: js.UndefOr[TextEmphasis] = js.native
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
  var transition: js.UndefOr[Transition[TTime]] = js.native
}

object StandardShorthandProperties {
  @scala.inline
  def apply[TLength, TTime](): StandardShorthandProperties[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardShorthandProperties[TLength, TTime]]
  }
  @scala.inline
  implicit class StandardShorthandPropertiesOps[Self <: StandardShorthandProperties[_, _], TLength, TTime] (val x: Self with (StandardShorthandProperties[TLength, TTime])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAll(value: All): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
    @scala.inline
    def setAnimation(value: Animation[TTime]): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setBackground(value: Background[TLength]): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBorder(value: Border[TLength]): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setBorderBlock(value: BorderBlock[TLength]): Self = this.set("borderBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBlock: Self = this.set("borderBlock", js.undefined)
    @scala.inline
    def setBorderBlockEnd(value: BorderBlockEnd[TLength]): Self = this.set("borderBlockEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBlockEnd: Self = this.set("borderBlockEnd", js.undefined)
    @scala.inline
    def setBorderBlockStart(value: BorderBlockStart[TLength]): Self = this.set("borderBlockStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBlockStart: Self = this.set("borderBlockStart", js.undefined)
    @scala.inline
    def setBorderBottom(value: BorderBottom[TLength]): Self = this.set("borderBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottom: Self = this.set("borderBottom", js.undefined)
    @scala.inline
    def setBorderColor(value: BorderColor): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderImage(value: BorderImage): Self = this.set("borderImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderImage: Self = this.set("borderImage", js.undefined)
    @scala.inline
    def setBorderInline(value: BorderInline[TLength]): Self = this.set("borderInline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderInline: Self = this.set("borderInline", js.undefined)
    @scala.inline
    def setBorderInlineEnd(value: BorderInlineEnd[TLength]): Self = this.set("borderInlineEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderInlineEnd: Self = this.set("borderInlineEnd", js.undefined)
    @scala.inline
    def setBorderInlineStart(value: BorderInlineStart[TLength]): Self = this.set("borderInlineStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderInlineStart: Self = this.set("borderInlineStart", js.undefined)
    @scala.inline
    def setBorderLeft(value: BorderLeft[TLength]): Self = this.set("borderLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderLeft: Self = this.set("borderLeft", js.undefined)
    @scala.inline
    def setBorderRadius(value: BorderRadius[TLength]): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    @scala.inline
    def setBorderRight(value: BorderRight[TLength]): Self = this.set("borderRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRight: Self = this.set("borderRight", js.undefined)
    @scala.inline
    def setBorderStyle(value: BorderStyle): Self = this.set("borderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderStyle: Self = this.set("borderStyle", js.undefined)
    @scala.inline
    def setBorderTop(value: BorderTop[TLength]): Self = this.set("borderTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTop: Self = this.set("borderTop", js.undefined)
    @scala.inline
    def setBorderWidth(value: BorderWidth[TLength]): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setColumnRule(value: ColumnRule[TLength]): Self = this.set("columnRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnRule: Self = this.set("columnRule", js.undefined)
    @scala.inline
    def setColumns(value: Columns[TLength]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setFlex(value: Flex[TLength]): Self = this.set("flex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlex: Self = this.set("flex", js.undefined)
    @scala.inline
    def setFlexFlow(value: FlexFlow): Self = this.set("flexFlow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexFlow: Self = this.set("flexFlow", js.undefined)
    @scala.inline
    def setFont(value: Font): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setGap(value: Gap[TLength]): Self = this.set("gap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGap: Self = this.set("gap", js.undefined)
    @scala.inline
    def setGrid(value: Grid): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    @scala.inline
    def setGridArea(value: GridArea): Self = this.set("gridArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridArea: Self = this.set("gridArea", js.undefined)
    @scala.inline
    def setGridColumn(value: GridColumn): Self = this.set("gridColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridColumn: Self = this.set("gridColumn", js.undefined)
    @scala.inline
    def setGridRow(value: GridRow): Self = this.set("gridRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridRow: Self = this.set("gridRow", js.undefined)
    @scala.inline
    def setGridTemplate(value: GridTemplate): Self = this.set("gridTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridTemplate: Self = this.set("gridTemplate", js.undefined)
    @scala.inline
    def setLineClamp(value: LineClamp): Self = this.set("lineClamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineClamp: Self = this.set("lineClamp", js.undefined)
    @scala.inline
    def setListStyle(value: ListStyle): Self = this.set("listStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListStyle: Self = this.set("listStyle", js.undefined)
    @scala.inline
    def setMargin(value: Margin[TLength]): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMask(value: Mask[TLength]): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    @scala.inline
    def setMaskBorder(value: MaskBorder): Self = this.set("maskBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskBorder: Self = this.set("maskBorder", js.undefined)
    @scala.inline
    def setMotion(value: Offset[TLength]): Self = this.set("motion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMotion: Self = this.set("motion", js.undefined)
    @scala.inline
    def setOffset(value: Offset[TLength]): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOutline(value: Outline[TLength]): Self = this.set("outline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
    @scala.inline
    def setOverflow(value: Overflow): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    @scala.inline
    def setPadding(value: Padding[TLength]): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPlaceItems(value: PlaceItems): Self = this.set("placeItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceItems: Self = this.set("placeItems", js.undefined)
    @scala.inline
    def setPlaceSelf(value: PlaceSelf): Self = this.set("placeSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceSelf: Self = this.set("placeSelf", js.undefined)
    @scala.inline
    def setTextDecoration(value: TextDecoration[TLength]): Self = this.set("textDecoration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextDecoration: Self = this.set("textDecoration", js.undefined)
    @scala.inline
    def setTextEmphasis(value: TextEmphasis): Self = this.set("textEmphasis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextEmphasis: Self = this.set("textEmphasis", js.undefined)
    @scala.inline
    def setTransition(value: Transition[TTime]): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
  }
  
}

