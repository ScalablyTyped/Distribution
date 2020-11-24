package typings.d3.mod

import typings.d3Geo.mod.GeoContext
import typings.d3Geo.mod.GeoPath_
import typings.d3Geo.mod.GeoPermissibleObjects
import typings.d3Geo.mod.GeoProjection_
import typings.d3Geo.mod.GeoStreamWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "geoPath")
@js.native
object geoPath extends js.Object {
  
  def apply(): GeoPath_[_, GeoPermissibleObjects] = js.native
  def apply(projection: js.UndefOr[scala.Nothing], context: GeoContext): GeoPath_[_, GeoPermissibleObjects] = js.native
  def apply(projection: Null, context: GeoContext): GeoPath_[_, GeoPermissibleObjects] = js.native
  def apply(projection: GeoProjection_): GeoPath_[_, GeoPermissibleObjects] = js.native
  def apply(projection: GeoProjection_, context: GeoContext): GeoPath_[_, GeoPermissibleObjects] = js.native
  def apply(projection: GeoStreamWrapper): GeoPath_[_, GeoPermissibleObjects] = js.native
  def apply(projection: GeoStreamWrapper, context: GeoContext): GeoPath_[_, GeoPermissibleObjects] = js.native
}
