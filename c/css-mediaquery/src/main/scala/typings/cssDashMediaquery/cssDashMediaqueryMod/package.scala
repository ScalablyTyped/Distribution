package typings.cssDashMediaquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cssDashMediaqueryMod {
  import typings.cssDashMediaquery.cssDashMediaqueryStrings.`aspect-ratio`
  import typings.cssDashMediaquery.cssDashMediaqueryStrings.`color-index`
  import typings.cssDashMediaquery.cssDashMediaqueryStrings.`device-aspect-ratio`
  import typings.cssDashMediaquery.cssDashMediaqueryStrings.`device-height`
  import typings.cssDashMediaquery.cssDashMediaqueryStrings.`device-width`
  import typings.cssDashMediaquery.cssDashMediaqueryStrings.color
  import typings.cssDashMediaquery.cssDashMediaqueryStrings.grid
  import typings.cssDashMediaquery.cssDashMediaqueryStrings.height
  import typings.cssDashMediaquery.cssDashMediaqueryStrings.monochrome
  import typings.cssDashMediaquery.cssDashMediaqueryStrings.orientation
  import typings.cssDashMediaquery.cssDashMediaqueryStrings.resolution
  import typings.cssDashMediaquery.cssDashMediaqueryStrings.scan
  import typings.cssDashMediaquery.cssDashMediaqueryStrings.width
  import typings.std.Record

  type AST = js.Array[QueryNode]
  type MediaValues = Record[
    orientation | scan | width | height | `device-width` | `device-height` | resolution | `aspect-ratio` | `device-aspect-ratio` | grid | color | `color-index` | monochrome, 
    js.Any
  ]
}
