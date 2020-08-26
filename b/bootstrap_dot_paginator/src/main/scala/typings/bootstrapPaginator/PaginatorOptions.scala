package typings.bootstrapPaginator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginatorOptions extends js.Object {
  var alignment: js.UndefOr[String] = js.native
  var bootstrapMajorVersion: js.UndefOr[Double] = js.native
  var bootstrapTooltipOptions: js.UndefOr[js.Object] = js.native
  var currentPage: js.UndefOr[Double] = js.native
  var itemContainerClass: js.UndefOr[js.Function3[/* type */ String, /* page */ Double, /* current */ Double, String]] = js.native
  var itemTexts: js.UndefOr[js.Function3[/* type */ String, /* page */ Double, /* current */ Double, String]] = js.native
  var numberOfPages: js.UndefOr[Double] = js.native
  var onPageChanged: js.UndefOr[
    js.Function4[
      /* event */ js.Any, 
      /* originalEvent */ js.Any, 
      /* type */ String, 
      /* page */ Double, 
      Unit
    ]
  ] = js.native
  var onPageClicked: js.UndefOr[
    js.Function4[
      /* event */ js.Any, 
      /* originalEvent */ js.Any, 
      /* type */ String, 
      /* page */ Double, 
      Unit
    ]
  ] = js.native
  var pageUrl: js.UndefOr[js.Function3[/* type */ String, /* page */ Double, /* current */ Double, String]] = js.native
  var shouldShowPage: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[String] = js.native
  var tooltipTitles: js.UndefOr[js.Function3[/* type */ String, /* page */ Double, /* current */ Double, String]] = js.native
  var totalPages: js.UndefOr[Double] = js.native
  var useBootstrapTooltip: js.UndefOr[Boolean] = js.native
}

object PaginatorOptions {
  @scala.inline
  def apply(): PaginatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginatorOptions]
  }
  @scala.inline
  implicit class PaginatorOptionsOps[Self <: PaginatorOptions] (val x: Self) extends AnyVal {
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
    def setAlignment(value: String): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    @scala.inline
    def setBootstrapMajorVersion(value: Double): Self = this.set("bootstrapMajorVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBootstrapMajorVersion: Self = this.set("bootstrapMajorVersion", js.undefined)
    @scala.inline
    def setBootstrapTooltipOptions(value: js.Object): Self = this.set("bootstrapTooltipOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBootstrapTooltipOptions: Self = this.set("bootstrapTooltipOptions", js.undefined)
    @scala.inline
    def setCurrentPage(value: Double): Self = this.set("currentPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentPage: Self = this.set("currentPage", js.undefined)
    @scala.inline
    def setItemContainerClass(value: (/* type */ String, /* page */ Double, /* current */ Double) => String): Self = this.set("itemContainerClass", js.Any.fromFunction3(value))
    @scala.inline
    def deleteItemContainerClass: Self = this.set("itemContainerClass", js.undefined)
    @scala.inline
    def setItemTexts(value: (/* type */ String, /* page */ Double, /* current */ Double) => String): Self = this.set("itemTexts", js.Any.fromFunction3(value))
    @scala.inline
    def deleteItemTexts: Self = this.set("itemTexts", js.undefined)
    @scala.inline
    def setNumberOfPages(value: Double): Self = this.set("numberOfPages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfPages: Self = this.set("numberOfPages", js.undefined)
    @scala.inline
    def setOnPageChanged(
      value: (/* event */ js.Any, /* originalEvent */ js.Any, /* type */ String, /* page */ Double) => Unit
    ): Self = this.set("onPageChanged", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnPageChanged: Self = this.set("onPageChanged", js.undefined)
    @scala.inline
    def setOnPageClicked(
      value: (/* event */ js.Any, /* originalEvent */ js.Any, /* type */ String, /* page */ Double) => Unit
    ): Self = this.set("onPageClicked", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnPageClicked: Self = this.set("onPageClicked", js.undefined)
    @scala.inline
    def setPageUrl(value: (/* type */ String, /* page */ Double, /* current */ Double) => String): Self = this.set("pageUrl", js.Any.fromFunction3(value))
    @scala.inline
    def deletePageUrl: Self = this.set("pageUrl", js.undefined)
    @scala.inline
    def setShouldShowPage(value: Boolean): Self = this.set("shouldShowPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldShowPage: Self = this.set("shouldShowPage", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTooltipTitles(value: (/* type */ String, /* page */ Double, /* current */ Double) => String): Self = this.set("tooltipTitles", js.Any.fromFunction3(value))
    @scala.inline
    def deleteTooltipTitles: Self = this.set("tooltipTitles", js.undefined)
    @scala.inline
    def setTotalPages(value: Double): Self = this.set("totalPages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalPages: Self = this.set("totalPages", js.undefined)
    @scala.inline
    def setUseBootstrapTooltip(value: Boolean): Self = this.set("useBootstrapTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseBootstrapTooltip: Self = this.set("useBootstrapTooltip", js.undefined)
  }
  
}

