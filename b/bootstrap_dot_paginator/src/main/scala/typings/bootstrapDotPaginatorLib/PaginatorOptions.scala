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

