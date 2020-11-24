package typings.clearbladejsServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryOptionsWithName
  extends CollectionOptionsWithName
     with QueryOptions
object QueryOptionsWithName {
  
  @scala.inline
  def apply(collectionName: String): QueryOptionsWithName = {
    val __obj = js.Dynamic.literal(collectionName = collectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptionsWithName]
  }
}
