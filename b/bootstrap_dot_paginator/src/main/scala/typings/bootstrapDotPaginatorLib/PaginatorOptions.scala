package typings
package bootstrapDotPaginatorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginatorOptions extends js.Object {
  var alignment: js.UndefOr[java.lang.String] = js.undefined
  var bootstrapMajorVersion: js.UndefOr[scala.Double] = js.undefined
  var bootstrapTooltipOptions: js.UndefOr[js.Object] = js.undefined
  var currentPage: js.UndefOr[scala.Double] = js.undefined
  var itemContainerClass: js.UndefOr[
    js.Function3[
      /* type */ java.lang.String, 
      /* page */ scala.Double, 
      /* current */ scala.Double, 
      java.lang.String
    ]
  ] = js.undefined
  var itemTexts: js.UndefOr[
    js.Function3[
      /* type */ java.lang.String, 
      /* page */ scala.Double, 
      /* current */ scala.Double, 
      java.lang.String
    ]
  ] = js.undefined
  var numberOfPages: js.UndefOr[scala.Double] = js.undefined
  var onPageChanged: js.UndefOr[
    js.Function4[
      /* event */ js.Any, 
      /* originalEvent */ js.Any, 
      /* type */ java.lang.String, 
      /* page */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var onPageClicked: js.UndefOr[
    js.Function4[
      /* event */ js.Any, 
      /* originalEvent */ js.Any, 
      /* type */ java.lang.String, 
      /* page */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var pageUrl: js.UndefOr[
    js.Function3[
      /* type */ java.lang.String, 
      /* page */ scala.Double, 
      /* current */ scala.Double, 
      java.lang.String
    ]
  ] = js.undefined
  var shouldShowPage: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var tooltipTitles: js.UndefOr[
    js.Function3[
      /* type */ java.lang.String, 
      /* page */ scala.Double, 
      /* current */ scala.Double, 
      java.lang.String
    ]
  ] = js.undefined
  var totalPages: js.UndefOr[scala.Double] = js.undefined
  var useBootstrapTooltip: js.UndefOr[scala.Boolean] = js.undefined
}

object PaginatorOptions {
  @scala.inline
  def apply(
    alignment: java.lang.String = null,
    bootstrapMajorVersion: scala.Int | scala.Double = null,
    bootstrapTooltipOptions: js.Object = null,
    currentPage: scala.Int | scala.Double = null,
    itemContainerClass: (/* type */ java.lang.String, /* page */ scala.Double, /* current */ scala.Double) => java.lang.String = null,
    itemTexts: (/* type */ java.lang.String, /* page */ scala.Double, /* current */ scala.Double) => java.lang.String = null,
    numberOfPages: scala.Int | scala.Double = null,
    onPageChanged: (/* event */ js.Any, /* originalEvent */ js.Any, /* type */ java.lang.String, /* page */ scala.Double) => scala.Unit = null,
    onPageClicked: (/* event */ js.Any, /* originalEvent */ js.Any, /* type */ java.lang.String, /* page */ scala.Double) => scala.Unit = null,
    pageUrl: (/* type */ java.lang.String, /* page */ scala.Double, /* current */ scala.Double) => java.lang.String = null,
    shouldShowPage: js.UndefOr[scala.Boolean] = js.undefined,
    size: java.lang.String = null,
    tooltipTitles: (/* type */ java.lang.String, /* page */ scala.Double, /* current */ scala.Double) => java.lang.String = null,
    totalPages: scala.Int | scala.Double = null,
    useBootstrapTooltip: js.UndefOr[scala.Boolean] = js.undefined
  ): PaginatorOptions = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (bootstrapMajorVersion != null) __obj.updateDynamic("bootstrapMajorVersion")(bootstrapMajorVersion.asInstanceOf[js.Any])
    if (bootstrapTooltipOptions != null) __obj.updateDynamic("bootstrapTooltipOptions")(bootstrapTooltipOptions)
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (itemContainerClass != null) __obj.updateDynamic("itemContainerClass")(js.Any.fromFunction3(itemContainerClass))
    if (itemTexts != null) __obj.updateDynamic("itemTexts")(js.Any.fromFunction3(itemTexts))
    if (numberOfPages != null) __obj.updateDynamic("numberOfPages")(numberOfPages.asInstanceOf[js.Any])
    if (onPageChanged != null) __obj.updateDynamic("onPageChanged")(js.Any.fromFunction4(onPageChanged))
    if (onPageClicked != null) __obj.updateDynamic("onPageClicked")(js.Any.fromFunction4(onPageClicked))
    if (pageUrl != null) __obj.updateDynamic("pageUrl")(js.Any.fromFunction3(pageUrl))
    if (!js.isUndefined(shouldShowPage)) __obj.updateDynamic("shouldShowPage")(shouldShowPage)
    if (size != null) __obj.updateDynamic("size")(size)
    if (tooltipTitles != null) __obj.updateDynamic("tooltipTitles")(js.Any.fromFunction3(tooltipTitles))
    if (totalPages != null) __obj.updateDynamic("totalPages")(totalPages.asInstanceOf[js.Any])
    if (!js.isUndefined(useBootstrapTooltip)) __obj.updateDynamic("useBootstrapTooltip")(useBootstrapTooltip)
    __obj.asInstanceOf[PaginatorOptions]
  }
}

