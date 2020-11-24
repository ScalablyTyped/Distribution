package typings.cassanknex.mod

import typings.cassanknex.cassanknexStrings.asc
import typings.cassanknex.cassanknexStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateableColumnFamilyBuilder[T] extends js.Object {
  
  def withCaching(): this.type = js.native
  
  @JSName("withClusteringOrderBy")
  def withClusteringOrderBy_asc[K /* <: /* keyof T */ String */](value: K, direction: asc): this.type = js.native
  @JSName("withClusteringOrderBy")
  def withClusteringOrderBy_desc[K /* <: /* keyof T */ String */](value: K, direction: desc): this.type = js.native
  
  def withCompaction(): this.type = js.native
  
  def withCompression(): this.type = js.native
}
