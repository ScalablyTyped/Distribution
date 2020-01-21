package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseResource extends js.Object {
  /**
    * The name of the database resource. Unique to the Data Catalog.
    */
  var Name: NameString = js.native
}

object DatabaseResource {
  @scala.inline
  def apply(Name: NameString): DatabaseResource = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DatabaseResource]
  }
}

