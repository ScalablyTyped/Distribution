package typings.bcp47Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bcp-47-match", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def basicFilter(tags: String, ranges: String): js.Array[String] = js.native
  def basicFilter(tags: String, ranges: js.Array[String]): js.Array[String] = js.native
  def basicFilter(tags: js.Array[String], ranges: String): js.Array[String] = js.native
  def basicFilter(tags: js.Array[String], ranges: js.Array[String]): js.Array[String] = js.native
  
  def extendedFilter(tags: String, ranges: String): js.Array[String] = js.native
  def extendedFilter(tags: String, ranges: js.Array[String]): js.Array[String] = js.native
  def extendedFilter(tags: js.Array[String], ranges: String): js.Array[String] = js.native
  def extendedFilter(tags: js.Array[String], ranges: js.Array[String]): js.Array[String] = js.native
  
  def lookup(tags: String, ranges: String): js.UndefOr[String] = js.native
  def lookup(tags: String, ranges: js.Array[String]): js.UndefOr[String] = js.native
  def lookup(tags: js.Array[String], ranges: String): js.UndefOr[String] = js.native
  def lookup(tags: js.Array[String], ranges: js.Array[String]): js.UndefOr[String] = js.native
}
