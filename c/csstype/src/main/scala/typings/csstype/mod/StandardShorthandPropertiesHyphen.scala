package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardShorthandPropertiesHyphen[TLength] extends js.Object {
  /**
    * The `**all**` CSS shorthand property sets all of an element's properties (other than `unicode-bidi` and `direction`) to their initial or inherited values, or to the values specified in another stylesheet origin.
    *
    * **Initial value**: There is no practical initial value for it.
    *
    * | Chrome | Firefox | Safari  | Edge | IE  |
    * | :----: | :-----: | :-----: | :--: | :-: |
    * | **37** | **27**  | **9.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/all
    */
  var all: js.UndefOr[Globals] = js.undefined
  /**
    * The **`animation`** shorthand CSS property sets an animated transition between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **43**  | **16**  |  **9**  | **12** | **10** |
    * | 3 _-x-_ | 5 _-x-_ | 4 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation
    */
  var animation: js.UndefOr[AnimationProperty] = js.undefined
  /**
    * The **`background`** shorthand CSS property sets all background style properties at once, such as color, image, origin and size, or repeat method.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background
    */
  var background: js.UndefOr[BackgroundProperty[TLength]] = js.undefined
  /**
    * The **`border`** CSS property sets an element's border. It's a shorthand for `border-width`, `border-style`, and `border-color`.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border
    */
  var border: js.UndefOr[BorderProperty[TLength]] = js.undefined
  /**
    * The **`border-block`** CSS property is a shorthand property for setting the individual logical block border property values in a single place in the style sheet.
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block
    */
  var `border-block`: js.UndefOr[BorderBlockProperty[TLength]] = js.undefined
  /**
    * The **`border-block-end`** CSS property is a shorthand property for setting the individual logical block-end border property values in a single place in the style sheet.
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end
    */
  var `border-block-end`: js.UndefOr[BorderBlockEndProperty[TLength]] = js.undefined
  /**
    * The **`border-block-start`** CSS property is a shorthand property for setting the individual logical block-start border property values in a single place in the style sheet.
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start
    */
  var `border-block-start`: js.UndefOr[BorderBlockStartProperty[TLength]] = js.undefined
  /**
    * The **`border-bottom`** CSS property is a shorthand that sets the values of `border-bottom-width`, `border-bottom-style` and `border-bottom-color`. These properties set an element's bottom border.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom
    */
  var `border-bottom`: js.UndefOr[BorderBottomProperty[TLength]] = js.undefined
  /**
    * The **`border-color`** shorthand CSS property sets the color of all sides of an element's border.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-color
    */
  var `border-color`: js.UndefOr[BorderColorProperty] = js.undefined
  /**
    * The **`border-image`** CSS property draws an image in place of an element's `border-style`.
    *
    * | Chrome  |  Firefox  | Safari  |  Edge  |   IE   |
    * | :-----: | :-------: | :-----: | :----: | :----: |
    * | **16**  |  **15**   |  **6**  | **12** | **11** |
    * | 7 _-x-_ | 3.5 _-x-_ | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image
    */
  var `border-image`: js.UndefOr[BorderImageProperty] = js.undefined
  /**
    * The **`border-inline`** CSS property is a shorthand property for setting the individual logical inline border property values in a single place in the style sheet.
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline
    */
  var `border-inline`: js.UndefOr[BorderInlineProperty[TLength]] = js.undefined
  /**
    * The **`border-inline-end`** CSS property is a shorthand property for setting the individual logical inline-end border property values in a single place in the style sheet.
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end
    */
  var `border-inline-end`: js.UndefOr[BorderInlineEndProperty[TLength]] = js.undefined
  /**
    * The **`border-inline-start`** CSS property is a shorthand property for setting the individual logical inline-start border property values in a single place in the style sheet.
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start
    */
  var `border-inline-start`: js.UndefOr[BorderInlineStartProperty[TLength]] = js.undefined
  /**
    * The **`border-left`** CSS property is a shorthand that sets the values of `border-left-width`, `border-left-style` and `border-left-color`. These properties set an element's left border.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-left
    */
  var `border-left`: js.UndefOr[BorderLeftProperty[TLength]] = js.undefined
  /**
    * The **`border-radius`** CSS property rounds the corners of an element's outer border edge. You can set a single radius to make circular corners, or two radii to make elliptical corners.
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * |  **4**  |  **4**  |  **5**  | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-radius
    */
  var `border-radius`: js.UndefOr[BorderRadiusProperty[TLength]] = js.undefined
  /**
    * The **`border-right`** CSS property is a shorthand that sets the values of `border-right-width`, `border-right-style` and `border-right-color`. These properties set an element's right border.
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-right
    */
  var `border-right`: js.UndefOr[BorderRightProperty[TLength]] = js.undefined
  /**
    * The **`border-style`** CSS property is a shorthand property that sets the line style for all four sides of an element's border.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-style
    */
  var `border-style`: js.UndefOr[BorderStyleProperty] = js.undefined
  /**
    * The **`border-top`** CSS property is a shorthand that sets the values of `border-top-width`, `border-top-style` and `border-top-color`. These properties set an element's top border.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top
    */
  var `border-top`: js.UndefOr[BorderTopProperty[TLength]] = js.undefined
  /**
    * The **`border-width`** shorthand CSS property sets the widths of all four sides of an element's border.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-width
    */
  var `border-width`: js.UndefOr[BorderWidthProperty[TLength]] = js.undefined
  /**
    * The **`column-rule`** CSS property sets the width, style, and color of the rule (line) drawn between columns in a multi-column layout.
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **50**  | **52**  |  **9**  | **12** | **10** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-rule
    */
  var `column-rule`: js.UndefOr[ColumnRuleProperty[TLength]] = js.undefined
  /**
    * The **`columns`** CSS property sets the column width and column count of an element.
    *
    * | Chrome | Firefox | Safari  |  Edge  |   IE   |
    * | :----: | :-----: | :-----: | :----: | :----: |
    * | **50** | **52**  |  **9**  | **12** | **10** |
    * |        |         | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/columns
    */
  var columns: js.UndefOr[ColumnsProperty[TLength]] = js.undefined
  /**
    * The **`flex`** CSS property sets how a flex item will grow or shrink to fit the space available in its flex container. It is a shorthand for `flex-grow`, `flex-shrink`, and `flex-basis`.
    *
    * |  Chrome  | Firefox |  Safari   |  Edge  |    IE    |
    * | :------: | :-----: | :-------: | :----: | :------: |
    * |  **29**  | **20**  |   **9**   | **12** |  **11**  |
    * | 21 _-x-_ |         | 6.1 _-x-_ |        | 10 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex
    */
  var flex: js.UndefOr[FlexProperty[TLength]] = js.undefined
  /**
    * The **`flex-flow`** CSS property is a shorthand property for `flex-direction` and `flex-wrap` properties.
    *
    * |  Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :------: | :-----: | :-------: | :----: | :----: |
    * |  **29**  | **28**  |   **9**   | **12** | **11** |
    * | 21 _-x-_ |         | 6.1 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-flow
    */
  var `flex-flow`: js.UndefOr[FlexFlowProperty] = js.undefined
  /**
    * The **`font`** CSS property is a shorthand for `font-style`, `font-variant`, `font-weight`, `font-size`, `line-height`, and `font-family`. Alternatively, it sets an element's font to a system font.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font
    */
  var font: js.UndefOr[FontProperty] = js.undefined
  /**
    * The **`gap`** CSS property sets the gaps (gutters) between rows and columns. It is a shorthand for `row-gap` and `column-gap`.
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **63**  |   No   |  No  | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * |     Chrome      |     Firefox     |        Safari         |  Edge  | IE  |
    * | :-------------: | :-------------: | :-------------------: | :----: | :-: |
    * |     **66**      |     **61**      | **10.1** _(grid-gap)_ | **16** | No  |
    * | 57 _(grid-gap)_ | 52 _(grid-gap)_ |                       |        |     |
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
  var gap: js.UndefOr[GapProperty[TLength]] = js.undefined
  /**
    * The **`grid`** CSS property is a shorthand property that sets all of the explicit grid properties (`grid-template-rows`, `grid-template-columns`, and `grid-template-areas`), and all the implicit grid properties (`grid-auto-rows`, `grid-auto-columns`, and `grid-auto-flow`), in a single declaration.
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid
    */
  var grid: js.UndefOr[GridProperty] = js.undefined
  /**
    * The **`grid-area`** CSS property is a shorthand property for `grid-row-start`, `grid-column-start`, `grid-row-end` and `grid-column-end`, specifying a grid item’s size and location within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the edges of its grid area.
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-area
    */
  var `grid-area`: js.UndefOr[GridAreaProperty] = js.undefined
  /**
    * The **`grid-column`** CSS property is a shorthand property for `grid-column-start` and `grid-column-end` specifying a grid item's size and location within the grid column by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-start and inline-end edge of its grid area.
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-column
    */
  var `grid-column`: js.UndefOr[GridColumnProperty] = js.undefined
  /**
    * The **`grid-row`** CSS property is a shorthand property for `grid-row-start` and `grid-row-end` specifying a grid item’s size and location within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-start and inline-end edge of its grid area.
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-row
    */
  var `grid-row`: js.UndefOr[GridRowProperty] = js.undefined
  /**
    * The **`grid-template`** CSS property is a shorthand property for defining grid columns, rows, and areas.
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-template
    */
  var `grid-template`: js.UndefOr[GridTemplateProperty] = js.undefined
  /** **Initial value**: `none` */
  var `line-clamp`: js.UndefOr[LineClampProperty] = js.undefined
  /**
    * The **`list-style`** CSS property is a shorthand to set list style properties `list-style-type`, `list-style-image`, and `list-style-position`.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/list-style
    */
  var `list-style`: js.UndefOr[ListStyleProperty] = js.undefined
  /**
    * The **`margin`** CSS property sets the margin area on all four sides of an element. It is a shorthand for `margin-top`, `margin-right`, `margin-bottom`, and `margin-left`.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin
    */
  var margin: js.UndefOr[MarginProperty[TLength]] = js.undefined
  /**
    * The **`mask`** CSS property hides an element (partially or fully) by masking or clipping the image at specific points.
    *
    * | Chrome | Firefox | Safari  |  Edge  | IE  |
    * | :----: | :-----: | :-----: | :----: | :-: |
    * | **1**  |  **2**  | **3.2** | **12** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask
    */
  var mask: js.UndefOr[MaskProperty[TLength]] = js.undefined
  /** The **`mask-border`** CSS property lets you create a mask along the edge of an element's border. */
  var `mask-border`: js.UndefOr[MaskBorderProperty] = js.undefined
  /**
    * The **`offset`** CSS property is a shorthand property for animating an element along a defined path.
    *
    * |    Chrome     | Firefox | Safari | Edge | IE  |
    * | :-----------: | :-----: | :----: | :--: | :-: |
    * |    **55**     | **72**  |   No   |  No  | No  |
    * | 46 _(motion)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset
    */
  var motion: js.UndefOr[OffsetProperty[TLength]] = js.undefined
  /**
    * The **`offset`** CSS property is a shorthand property for animating an element along a defined path.
    *
    * |    Chrome     | Firefox | Safari | Edge | IE  |
    * | :-----------: | :-----: | :----: | :--: | :-: |
    * |    **55**     | **72**  |   No   |  No  | No  |
    * | 46 _(motion)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset
    */
  var offset: js.UndefOr[OffsetProperty[TLength]] = js.undefined
  /**
    * The **`outline`** CSS property is a shorthand to set various outline properties in a single declaration: `outline-style`, `outline-width`, and `outline-color`.
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **1.5** | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline
    */
  var outline: js.UndefOr[OutlineProperty[TLength]] = js.undefined
  /**
    * The **`padding`** CSS property sets the padding area on all four sides of an element. It is a shorthand for `padding-top`, `padding-right`, `padding-bottom`, and `padding-left`.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding
    */
  var padding: js.UndefOr[PaddingProperty[TLength]] = js.undefined
  /**
    * The CSS **`place-items`** shorthand property sets the `align-items` and `justify-items` properties, respectively. If the second value is not set, the first value is also used for it.
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **59** | **45**  | **11** |  No  | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **59** | **45**  | **11** |  No  | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/place-items
    */
  var `place-items`: js.UndefOr[PlaceItemsProperty] = js.undefined
  /**
    * The **`place-self`** CSS property is a shorthand property sets both the `align-self` and `justify-self` properties. The first value is the `align-self` property value, the second the `justify-self` one. If the second value is not present, the first value is also used for it.
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **59** | **45**  |   No   |  No  | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **59** | **45**  |   No   |  No  | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/place-self
    */
  var `place-self`: js.UndefOr[PlaceSelfProperty] = js.undefined
  /**
    * The **`text-decoration`** CSS property sets the appearance of decorative lines on text. It is a shorthand for `text-decoration-line`, `text-decoration-color`, and `text-decoration-style`.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration
    */
  var `text-decoration`: js.UndefOr[TextDecorationProperty[TLength]] = js.undefined
  /**
    * The **`text-emphasis`** CSS property applies emphasis marks to text (except spaces and control characters). It is a shorthand for `text-emphasis-style` and `text-emphasis-color`.
    *
    * | Chrome | Firefox | Safari  | Edge | IE  |
    * | :----: | :-----: | :-----: | :--: | :-: |
    * | **25** | **46**  | **6.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis
    */
  var `text-emphasis`: js.UndefOr[TextEmphasisProperty] = js.undefined
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * | Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :-----: | :-----: | :-------: | :----: | :----: |
    * | **26**  | **16**  |   **9**   | **12** | **10** |
    * | 1 _-x-_ | 4 _-x-_ | 3.1 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transition
    */
  var transition: js.UndefOr[TransitionProperty] = js.undefined
}

object StandardShorthandPropertiesHyphen {
  @scala.inline
  def apply[TLength](
    all: Globals = null,
    animation: AnimationProperty = null,
    background: BackgroundProperty[TLength] = null,
    border: BorderProperty[TLength] = null,
    `border-block`: BorderBlockProperty[TLength] = null,
    `border-block-end`: BorderBlockEndProperty[TLength] = null,
    `border-block-start`: BorderBlockStartProperty[TLength] = null,
    `border-bottom`: BorderBottomProperty[TLength] = null,
    `border-color`: BorderColorProperty = null,
    `border-image`: BorderImageProperty = null,
    `border-inline`: BorderInlineProperty[TLength] = null,
    `border-inline-end`: BorderInlineEndProperty[TLength] = null,
    `border-inline-start`: BorderInlineStartProperty[TLength] = null,
    `border-left`: BorderLeftProperty[TLength] = null,
    `border-radius`: BorderRadiusProperty[TLength] = null,
    `border-right`: BorderRightProperty[TLength] = null,
    `border-style`: BorderStyleProperty = null,
    `border-top`: BorderTopProperty[TLength] = null,
    `border-width`: BorderWidthProperty[TLength] = null,
    `column-rule`: ColumnRuleProperty[TLength] = null,
    columns: ColumnsProperty[TLength] = null,
    flex: FlexProperty[TLength] = null,
    `flex-flow`: FlexFlowProperty = null,
    font: FontProperty = null,
    gap: GapProperty[TLength] = null,
    grid: GridProperty = null,
    `grid-area`: GridAreaProperty = null,
    `grid-column`: GridColumnProperty = null,
    `grid-row`: GridRowProperty = null,
    `grid-template`: GridTemplateProperty = null,
    `line-clamp`: LineClampProperty = null,
    `list-style`: ListStyleProperty = null,
    margin: MarginProperty[TLength] = null,
    mask: MaskProperty[TLength] = null,
    `mask-border`: MaskBorderProperty = null,
    motion: OffsetProperty[TLength] = null,
    offset: OffsetProperty[TLength] = null,
    outline: OutlineProperty[TLength] = null,
    padding: PaddingProperty[TLength] = null,
    `place-items`: PlaceItemsProperty = null,
    `place-self`: PlaceSelfProperty = null,
    `text-decoration`: TextDecorationProperty[TLength] = null,
    `text-emphasis`: TextEmphasisProperty = null,
    transition: TransitionProperty = null
  ): StandardShorthandPropertiesHyphen[TLength] = {
    val __obj = js.Dynamic.literal()
    if (all != null) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (`border-block` != null) __obj.updateDynamic("border-block")(`border-block`.asInstanceOf[js.Any])
    if (`border-block-end` != null) __obj.updateDynamic("border-block-end")(`border-block-end`.asInstanceOf[js.Any])
    if (`border-block-start` != null) __obj.updateDynamic("border-block-start")(`border-block-start`.asInstanceOf[js.Any])
    if (`border-bottom` != null) __obj.updateDynamic("border-bottom")(`border-bottom`.asInstanceOf[js.Any])
    if (`border-color` != null) __obj.updateDynamic("border-color")(`border-color`.asInstanceOf[js.Any])
    if (`border-image` != null) __obj.updateDynamic("border-image")(`border-image`.asInstanceOf[js.Any])
    if (`border-inline` != null) __obj.updateDynamic("border-inline")(`border-inline`.asInstanceOf[js.Any])
    if (`border-inline-end` != null) __obj.updateDynamic("border-inline-end")(`border-inline-end`.asInstanceOf[js.Any])
    if (`border-inline-start` != null) __obj.updateDynamic("border-inline-start")(`border-inline-start`.asInstanceOf[js.Any])
    if (`border-left` != null) __obj.updateDynamic("border-left")(`border-left`.asInstanceOf[js.Any])
    if (`border-radius` != null) __obj.updateDynamic("border-radius")(`border-radius`.asInstanceOf[js.Any])
    if (`border-right` != null) __obj.updateDynamic("border-right")(`border-right`.asInstanceOf[js.Any])
    if (`border-style` != null) __obj.updateDynamic("border-style")(`border-style`.asInstanceOf[js.Any])
    if (`border-top` != null) __obj.updateDynamic("border-top")(`border-top`.asInstanceOf[js.Any])
    if (`border-width` != null) __obj.updateDynamic("border-width")(`border-width`.asInstanceOf[js.Any])
    if (`column-rule` != null) __obj.updateDynamic("column-rule")(`column-rule`.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (`flex-flow` != null) __obj.updateDynamic("flex-flow")(`flex-flow`.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (`grid-area` != null) __obj.updateDynamic("grid-area")(`grid-area`.asInstanceOf[js.Any])
    if (`grid-column` != null) __obj.updateDynamic("grid-column")(`grid-column`.asInstanceOf[js.Any])
    if (`grid-row` != null) __obj.updateDynamic("grid-row")(`grid-row`.asInstanceOf[js.Any])
    if (`grid-template` != null) __obj.updateDynamic("grid-template")(`grid-template`.asInstanceOf[js.Any])
    if (`line-clamp` != null) __obj.updateDynamic("line-clamp")(`line-clamp`.asInstanceOf[js.Any])
    if (`list-style` != null) __obj.updateDynamic("list-style")(`list-style`.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (`mask-border` != null) __obj.updateDynamic("mask-border")(`mask-border`.asInstanceOf[js.Any])
    if (motion != null) __obj.updateDynamic("motion")(motion.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (`place-items` != null) __obj.updateDynamic("place-items")(`place-items`.asInstanceOf[js.Any])
    if (`place-self` != null) __obj.updateDynamic("place-self")(`place-self`.asInstanceOf[js.Any])
    if (`text-decoration` != null) __obj.updateDynamic("text-decoration")(`text-decoration`.asInstanceOf[js.Any])
    if (`text-emphasis` != null) __obj.updateDynamic("text-emphasis")(`text-emphasis`.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardShorthandPropertiesHyphen[TLength]]
  }
}

