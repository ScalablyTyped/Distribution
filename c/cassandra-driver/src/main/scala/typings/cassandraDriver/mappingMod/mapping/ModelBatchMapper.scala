package typings.cassandraDriver.mappingMod.mapping

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelBatchMapper extends js.Object {
  
  def insert(doc: js.Any): ModelBatchItem = js.native
  def insert(doc: js.Any, docInfo: InsertDocInfo): ModelBatchItem = js.native
  
  def remove(doc: js.Any): ModelBatchItem = js.native
  def remove(doc: js.Any, docInfo: RemoveDocInfo): ModelBatchItem = js.native
  
  def update(doc: js.Any): ModelBatchItem = js.native
  def update(doc: js.Any, docInfo: UpdateDocInfo): ModelBatchItem = js.native
}
