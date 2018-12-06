package typings
package csstypeLib.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StandardShorthandPropertiesFallback[TLength] extends js.Object {
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
  var all: js.UndefOr[Globals | js.Array[Globals]] = js.undefined
  /**
     * The **`animation`** CSS property is a shorthand property for the various animation properties: `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
     *
     * | Chrome | Firefox |   Safari    |  Edge  |   IE   |
     * | :----: | :-----: | :---------: | :----: | :----: |
     * | **43** | **16**  | **4** _-x-_ | **12** | **10** |
     * |        | 5 _-x-_ |             |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/animation
     */
  var animation: js.UndefOr[AnimationProperty | js.Array[AnimationProperty]] = js.undefined
  /**
     * The **`background`** CSS property is a short way to declare all background style options at once, including color, image, origin and size, repeat method, and other features.
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/background
     */
  var background: js.UndefOr[BackgroundProperty[TLength] | js.Array[BackgroundProperty[TLength]]] = js.undefined
  /**
     * The **`border`** CSS property is a shorthand for setting all individual border property values in a single declaration: `border-width`, `border-style`, and `border-color`.
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border
     */
  var border: js.UndefOr[BorderProperty[TLength] | js.Array[BorderProperty[TLength]]] = js.undefined
  /**
     * The **`border-block-end`** CSS property is a shorthand property for setting the individual logical block\-end border property values in a single place in the style sheet.
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * |   No   | **41**  |   No   |  No  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end
     */
  var borderBlockEnd: js.UndefOr[BorderBlockEndProperty[TLength] | js.Array[BorderBlockEndProperty[TLength]]] = js.undefined
  /**
     * The **`border-block-start`** CSS property is a shorthand property for setting the individual logical block\-start border property values in a single place in the style sheet.
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * |   No   | **41**  |   No   |  No  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start
     */
  var borderBlockStart: js.UndefOr[BorderBlockStartProperty[TLength] | js.Array[BorderBlockStartProperty[TLength]]] = js.undefined
  /**
     * The **`border-bottom`** CSS property is a shorthand that sets the values of `border-bottom-width`, `border-bottom-style` and `border-bottom-color`. These properties describe an element's bottom `border`.
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom
     */
  var borderBottom: js.UndefOr[BorderBottomProperty[TLength] | js.Array[BorderBottomProperty[TLength]]] = js.undefined
  /**
     * The **`border-color`** CSS property is a shorthand property for setting the colors on all four sides of an element's border.
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-color
     */
  var borderColor: js.UndefOr[BorderColorProperty | js.Array[BorderColorProperty]] = js.undefined
  /**
     * The **`border-image`** CSS property lets you draw an image in place of an element's `border-style`.
     *
     * | Chrome  |  Firefox  | Safari  |  Edge  |   IE   |
     * | :-----: | :-------: | :-----: | :----: | :----: |
     * | **16**  |  **15**   |  **6**  | **12** | **11** |
     * | 7 _-x-_ | 3.5 _-x-_ | 3 _-x-_ |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-image
     */
  var borderImage: js.UndefOr[BorderImageProperty | js.Array[BorderImageProperty]] = js.undefined
  /**
     * The **`border-inline-end`** CSS property is a shorthand property for setting the individual logical inline\-end border property values in a single place in the style sheet.
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * |   No   | **41**  |   No   | n/a  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end
     */
  var borderInlineEnd: js.UndefOr[BorderInlineEndProperty[TLength] | js.Array[BorderInlineEndProperty[TLength]]] = js.undefined
  /**
     * The **`border-inline-start`** CSS property is a shorthand property for setting the individual logical inline\-start border property values in a single place in the style sheet.
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * |   No   | **41**  |   No   | n/a  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start
     */
  var borderInlineStart: js.UndefOr[
    BorderInlineStartProperty[TLength] | js.Array[BorderInlineStartProperty[TLength]]
  ] = js.undefined
  /**
     * The **`border-left`** CSS property is a shorthand that sets the values of `border-left-width`, `border-left-style`, and `border-left-color`. These properties describe an element's left `border`.
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-left
     */
  var borderLeft: js.UndefOr[BorderLeftProperty[TLength] | js.Array[BorderLeftProperty[TLength]]] = js.undefined
  /**
     * The **`border-radius`** CSS property lets you round the corners of an element's outer border edge. You can specify a single radius to make circular corners, or two radii to make elliptical corners.
     *
     * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
     * | :-----: | :-----: | :-----: | :----: | :---: |
     * |  **4**  |  **4**  |  **5**  | **12** | **9** |
     * | 1 _-x-_ |         | 3 _-x-_ |        |       |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-radius
     */
  var borderRadius: js.UndefOr[BorderRadiusProperty[TLength] | js.Array[BorderRadiusProperty[TLength]]] = js.undefined
  /**
     * The **`border-right`** CSS property is a shorthand that sets the values of `border-right-width`, `border-right-style`, and `border-right-color`. These properties describe an element's right `border`.
     *
     * | Chrome | Firefox | Safari |  Edge  |   IE    |
     * | :----: | :-----: | :----: | :----: | :-----: |
     * | **1**  |  **1**  | **1**  | **12** | **5.5** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-right
     */
  var borderRight: js.UndefOr[BorderRightProperty[TLength] | js.Array[BorderRightProperty[TLength]]] = js.undefined
  /**
     * The **`border-style`** CSS property is a shorthand property that sets the line style for all four sides of an element's border.
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-style
     */
  var borderStyle: js.UndefOr[BorderStyleProperty | js.Array[BorderStyleProperty]] = js.undefined
  /**
     * The **`border-top`** CSS property is a shorthand that sets the values of `border-top-width`, `border-top-style`, and `border-top-color`. These properties describe an element's top `border`.
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-top
     */
  var borderTop: js.UndefOr[BorderTopProperty[TLength] | js.Array[BorderTopProperty[TLength]]] = js.undefined
  /**
     * The **`border-width`** CSS property is a shorthand property for setting the widths on all four sides of an element's border.
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/border-width
     */
  var borderWidth: js.UndefOr[BorderWidthProperty[TLength] | js.Array[BorderWidthProperty[TLength]]] = js.undefined
  /**
     * The **`column-rule`** CSS property sets the width, style, and color of the rule (line) drawn between columns in a multi\-column layout.
     *
     * | Chrome |  Firefox  |   Safari    |     Edge     |   IE   |
     * | :----: | :-------: | :---------: | :----------: | :----: |
     * | **50** |  **52**   | **3** _-x-_ | **12** _-x-_ | **10** |
     * |        | 3.5 _-x-_ |             |              |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/column-rule
     */
  var columnRule: js.UndefOr[ColumnRuleProperty[TLength] | js.Array[ColumnRuleProperty[TLength]]] = js.undefined
  /**
     * The **`columns`** CSS property sets the column width and column count of an element.
     *
     * | Chrome | Firefox |   Safari    |  Edge  |   IE   |
     * | :----: | :-----: | :---------: | :----: | :----: |
     * | **50** | **52**  | **3** _-x-_ | **12** | **10** |
     * |        | 9 _-x-_ |             |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/columns
     */
  var columns: js.UndefOr[ColumnsProperty[TLength] | js.Array[ColumnsProperty[TLength]]] = js.undefined
  /**
     * The **`flex`** CSS property specifies how a flex item will grow or shrink so as to fit the space available in its flex container. This is a shorthand property that sets `flex-grow`, `flex-shrink`, and `flex-basis`.
     *
     * |  Chrome  | Firefox |  Safari   |  Edge  |    IE    |
     * | :------: | :-----: | :-------: | :----: | :------: |
     * |  **29**  |  20-61  |   **9**   | **12** |  **11**  |
     * | 21 _-x-_ |         | 6.1 _-x-_ |        | 10 _-x-_ |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/flex
     */
  var flex: js.UndefOr[FlexProperty[TLength] | js.Array[FlexProperty[TLength]]] = js.undefined
  /**
     * The **`flex-flow`** CSS property is a shorthand property for `flex-direction` and `flex-wrap` individual properties.
     *
     * |  Chrome  | Firefox |  Safari   |  Edge  |   IE   |
     * | :------: | :-----: | :-------: | :----: | :----: |
     * |  **29**  | **28**  |   **9**   | **12** | **11** |
     * | 21 _-x-_ |         | 6.1 _-x-_ |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/flex-flow
     */
  var flexFlow: js.UndefOr[FlexFlowProperty | js.Array[FlexFlowProperty]] = js.undefined
  /**
     * The **`font`** CSS property is either a shorthand property for setting `font-style`, `font-variant`, `font-weight`, `font-size`, `line-height`, and `font-family`; or a way to set the element's font to a system font, using specific keywords.
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **3** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/font
     */
  var font: js.UndefOr[FontProperty | js.Array[FontProperty]] = js.undefined
  /**
     * The **`gap`** CSS property specifies the gaps (gutters) between rows and columns. It is a shorthand for `row-gap` and `column-gap`.
     *
     * ---
     *
     * _Supported in Flex Layout_
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * |  n/a   | **63**  |   No   | n/a  | No  |
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
  var gap: js.UndefOr[GapProperty[TLength] | js.Array[GapProperty[TLength]]] = js.undefined
  /**
     * The **`grid`** CSS property is a shorthand property that sets all of the explicit grid properties (`grid-template-rows`, `grid-template-columns`, and `grid-template-areas`), and all the implicit grid properties (`grid-auto-rows`, `grid-auto-columns`, and `grid-auto-flow`), in a single declaration.
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **57** | **52**  | **10.1** | **16** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/grid
     */
  var grid: js.UndefOr[GridProperty | js.Array[GridProperty]] = js.undefined
  /**
     * The **`grid-area`** CSS property is a shorthand property for `grid-row-start`, `grid-column-start`, `grid-row-end` and `grid-column-end`, specifying a grid item’s size and location within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the edges of its grid area.
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **57** | **52**  | **10.1** | **16** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/grid-area
     */
  var gridArea: js.UndefOr[GridAreaProperty | js.Array[GridAreaProperty]] = js.undefined
  /**
     * The **`grid-column`** CSS property is a shorthand property for `grid-column-start` and `grid-column-end` specifying a grid item's size and location within the grid column by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline\-start and inline\-end edge of its grid area.
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **57** | **52**  | **10.1** | **16** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/grid-column
     */
  var gridColumn: js.UndefOr[GridColumnProperty | js.Array[GridColumnProperty]] = js.undefined
  /**
     * The **`grid-row`** CSS property is a shorthand property for `grid-row-start` and `grid-row-end` specifying a grid item’s size and location within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline\-start and inline\-end edge of its grid area.
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **57** | **52**  | **10.1** | **16** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/grid-row
     */
  var gridRow: js.UndefOr[GridRowProperty | js.Array[GridRowProperty]] = js.undefined
  /**
     * The **`grid-template`** CSS property is a shorthand property for defining grid columns, rows, and areas.
     *
     * | Chrome | Firefox |  Safari  |  Edge  | IE  |
     * | :----: | :-----: | :------: | :----: | :-: |
     * | **57** | **52**  | **10.1** | **16** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/grid-template
     */
  var gridTemplate: js.UndefOr[GridTemplateProperty | js.Array[GridTemplateProperty]] = js.undefined
  /** **Initial value**: `none` */
  var lineClamp: js.UndefOr[LineClampProperty | js.Array[LineClampProperty]] = js.undefined
  /**
     * The **`list-style`** CSS property is a shorthand for setting the individual values that define how a list is displayed: `list-style-type`, `list-style-image`, and `list-style-position`.
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/list-style
     */
  var listStyle: js.UndefOr[ListStyleProperty | js.Array[ListStyleProperty]] = js.undefined
  /**
     * The **`margin`** CSS property sets the margin area on all four sides of an element. It is a shorthand for setting all individual margins at once: `margin-top`, `margin-right`, `margin-bottom`, and `margin-left`.
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **3** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/margin
     */
  var margin: js.UndefOr[MarginProperty[TLength] | js.Array[MarginProperty[TLength]]] = js.undefined
  /**
     * The **`mask`** CSS property alters the visibility of an element by either partially or fully hiding it. This is accomplished by either masking or clipping the image at specific points.
     *
     * | Chrome | Firefox | Safari |  Edge  | IE  |
     * | :----: | :-----: | :----: | :----: | :-: |
     * | **1**  |   Yes   | **4**  | **12** | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/mask
     */
  var mask: js.UndefOr[MaskProperty[TLength] | js.Array[MaskProperty[TLength]]] = js.undefined
  /** The **`mask-border`** CSS property lets you create a mask along the edge of an element's border. */
  var maskBorder: js.UndefOr[MaskBorderProperty | js.Array[MaskBorderProperty]] = js.undefined
  var motion: js.UndefOr[csstypeLib.GlobalsString | js.Array[csstypeLib.GlobalsString]] = js.undefined
  /**
     * The **`outline`** CSS property is a shorthand for setting various outline properties in a single declaration: `outline-style`, `outline-width`, and `outline-color`.
     *
     * | Chrome | Firefox | Safari  |  Edge  |  IE   |
     * | :----: | :-----: | :-----: | :----: | :---: |
     * | **1**  | **1.5** | **1.2** | **12** | **8** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/outline
     */
  var outline: js.UndefOr[OutlineProperty[TLength] | js.Array[OutlineProperty[TLength]]] = js.undefined
  /**
     * The **`padding`** CSS property sets the padding area on all four sides of an element. It is a shorthand for setting all individual paddings at once: `padding-top`, `padding-right`, `padding-bottom`, and `padding-left`.
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **4** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/padding
     */
  var padding: js.UndefOr[PaddingProperty[TLength] | js.Array[PaddingProperty[TLength]]] = js.undefined
  /**
     * The CSS **`place-items`** shorthand property sets both the `align-items` and `justify-items` properties. The first value is the `align-items` property value, the second the `justify-items` one. If the second value is not present, the first value is also used for it.
     *
     * ---
     *
     * _Supported in Flex Layout_
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * | **59** | **45**  |  n/a   | n/a  | n/a |
     *
     * ---
     *
     * _Supported in Grid Layout_
     *
     * | Chrome | Firefox | Safari | Edge | IE  |
     * | :----: | :-----: | :----: | :--: | :-: |
     * | **59** | **45**  |  n/a   | n/a  | n/a |
     *
     * ---
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/place-items
     */
  var placeItems: js.UndefOr[PlaceItemsProperty | js.Array[PlaceItemsProperty]] = js.undefined
  /**
     * The **`text-decoration`** CSS property specifies the appearance of decorative lines used on text. It is a shorthand for setting one or more individual text\-decoration values in a single declaration, which include `text-decoration-line`, `text-decoration-color`, and `text-decoration-style`.
     *
     * | Chrome | Firefox | Safari |  Edge  |  IE   |
     * | :----: | :-----: | :----: | :----: | :---: |
     * | **1**  |  **1**  | **1**  | **12** | **3** |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration
     */
  var textDecoration: js.UndefOr[TextDecorationProperty | js.Array[TextDecorationProperty]] = js.undefined
  /**
     * The **`text-emphasis`** CSS property is a shorthand property for setting `text-emphasis-style` and `text-emphasis-color` in one declaration. This property will apply the specified emphasis mark to each character of the element's text, except separator characters, like spaces,  and control characters.
     *
     * |    Chrome    | Firefox |    Safari     | Edge | IE  |
     * | :----------: | :-----: | :-----------: | :--: | :-: |
     * | **25** _-x-_ | **46**  | **6.1** _-x-_ | n/a  | No  |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis
     */
  var textEmphasis: js.UndefOr[TextEmphasisProperty | js.Array[TextEmphasisProperty]] = js.undefined
  /**
     * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
     *
     * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
     * | :-----: | :-----: | :-----: | :----: | :----: |
     * | **26**  | **16**  | **6.1** | **12** | **10** |
     * | 1 _-x-_ | 4 _-x-_ | 3 _-x-_ |        |        |
     *
     * @see https://developer.mozilla.org/docs/Web/CSS/transition
     */
  var transition: js.UndefOr[TransitionProperty | js.Array[TransitionProperty]] = js.undefined
}

