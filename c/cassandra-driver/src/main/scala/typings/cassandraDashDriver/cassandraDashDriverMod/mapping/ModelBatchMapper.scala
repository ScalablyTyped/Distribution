package typings.cassandraDashDriver.cassandraDashDriverMod.mapping

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelBatchMapper extends js.Object {
  def insert(doc: StringDictionary[js.Any]): ModelBatchItem = js.native
  def insert(doc: StringDictionary[js.Any], docInfo: MappingDocInfo): ModelBatchItem = js.native
  def remove(doc: StringDictionary[js.Any]): ModelBatchItem = js.native
  def remove(doc: StringDictionary[js.Any], docInfo: MappingDocInfo): ModelBatchItem = js.native
  def update(doc: StringDictionary[js.Any]): ModelBatchItem = js.native
  def update(doc: StringDictionary[js.Any], docInfo: MappingDocInfo): ModelBatchItem = js.native
}

