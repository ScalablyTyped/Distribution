package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMappingResponse extends js.Object {
  /**
    * A list of mappings to the specified targets.
    */
  var Mapping: MappingList = js.native
}

object GetMappingResponse {
  @scala.inline
  def apply(Mapping: MappingList): GetMappingResponse = {
    val __obj = js.Dynamic.literal(Mapping = Mapping.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetMappingResponse]
  }
}

