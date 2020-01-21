package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSchemasResponse extends js.Object {
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The described schema.
    */
  var Schemas: js.UndefOr[SchemaList] = js.native
}

object DescribeSchemasResponse {
  @scala.inline
  def apply(Marker: String = null, Schemas: SchemaList = null): DescribeSchemasResponse = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (Schemas != null) __obj.updateDynamic("Schemas")(Schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSchemasResponse]
  }
}

