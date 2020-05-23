package typings.bootstrapPaginator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginatorOptions extends js.Object {
  var alignment: js.UndefOr[String] = js.undefined
  var bootstrapMajorVersion: js.UndefOr[Double] = js.undefined
  var bootstrapTooltipOptions: js.UndefOr[js.Object] = js.undefined
  var currentPage: js.UndefOr[Double] = js.undefined
  var itemContainerClass: js.UndefOr[js.Function3[/* type */ String, /* page */ Double, /* current */ Double, String]] = js.undefined
  var itemTexts: js.UndefOr[js.Function3[/* type */ String, /* page */ Double, /* current */ Double, String]] = js.undefined
  var numberOfPages: js.UndefOr[Double] = js.undefined
  var onPageChanged: js.UndefOr[
    js.Function4[
      /* event */ js.Any, 
      /* originalEvent */ js.Any, 
      /* type */ String, 
      /* page */ Double, 
      Unit
    ]
  ] = js.undefined
  var onPageClicked: js.UndefOr[
    js.Function4[
      /* event */ js.Any, 
      /* originalEvent */ js.Any, 
      /* type */ String, 
      /* page */ Double, 
      Unit
    ]
  ] = js.undefined
  var pageUrl: js.UndefOr[js.Function3[/* type */ String, /* page */ Double, /* current */ Double, String]] = js.undefined
  var shouldShowPage: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var tooltipTitles: js.UndefOr[js.Function3[/* type */ String, /* page */ Double, /* current */ Double, String]] = js.undefined
  var totalPages: js.UndefOr[Double] = js.undefined
  var useBootstrapTooltip: js.UndefOr[Boolean] = js.undefined
}

object PaginatorOptions {
  @scala.inline
  def apply(
    alignment: String = null,
    bootstrapMajorVersion: js.UndefOr[Double] = js.undefined,
    bootstrapTooltipOptions: js.Object = null,
    currentPage: js.UndefOr[Double] = js.undefined,
    itemContainerClass: (/* type */ String, /* page */ Double, /* current */ Double) => String = null,
    itemTexts: (/* type */ String, /* page */ Double, /* current */ Double) => String = null,
    numberOfPages: js.UndefOr[Double] = js.undefined,
    onPageChanged: (/* event */ js.Any, /* originalEvent */ js.Any, /* type */ String, /* page */ Double) => Unit = null,
    onPageClicked: (/* event */ js.Any, /* originalEvent */ js.Any, /* type */ String, /* page */ Double) => Unit = null,
    pageUrl: (/* type */ String, /* page */ Double, /* current */ Double) => String = null,
    shouldShowPage: js.UndefOr[Boolean] = js.undefined,
    size: String = null,
    tooltipTitles: (/* type */ String, /* page */ Double, /* current */ Double) => String = null,
    totalPages: js.UndefOr[Double] = js.undefined,
    useBootstrapTooltip: js.UndefOr[Boolean] = js.undefined
  ): PaginatorOptions = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (!js.isUndefined(bootstrapMajorVersion)) __obj.updateDynamic("bootstrapMajorVersion")(bootstrapMajorVersion.get.asInstanceOf[js.Any])
    if (bootstrapTooltipOptions != null) __obj.updateDynamic("bootstrapTooltipOptions")(bootstrapTooltipOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(currentPage)) __obj.updateDynamic("currentPage")(currentPage.get.asInstanceOf[js.Any])
    if (itemContainerClass != null) __obj.updateDynamic("itemContainerClass")(js.Any.fromFunction3(itemContainerClass))
    if (itemTexts != null) __obj.updateDynamic("itemTexts")(js.Any.fromFunction3(itemTexts))
    if (!js.isUndefined(numberOfPages)) __obj.updateDynamic("numberOfPages")(numberOfPages.get.asInstanceOf[js.Any])
    if (onPageChanged != null) __obj.updateDynamic("onPageChanged")(js.Any.fromFunction4(onPageChanged))
    if (onPageClicked != null) __obj.updateDynamic("onPageClicked")(js.Any.fromFunction4(onPageClicked))
    if (pageUrl != null) __obj.updateDynamic("pageUrl")(js.Any.fromFunction3(pageUrl))
    if (!js.isUndefined(shouldShowPage)) __obj.updateDynamic("shouldShowPage")(shouldShowPage.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (tooltipTitles != null) __obj.updateDynamic("tooltipTitles")(js.Any.fromFunction3(tooltipTitles))
    if (!js.isUndefined(totalPages)) __obj.updateDynamic("totalPages")(totalPages.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useBootstrapTooltip)) __obj.updateDynamic("useBootstrapTooltip")(useBootstrapTooltip.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginatorOptions]
  }
}

