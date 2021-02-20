package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.IGeoXmlLayerOptions
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.Maps.GeoXmlLayer")
@js.native
/**
  * @constructor
  * @param dataSource The XML as a string, URL or ArrayBuffer to read.
  * @param isUrl Whether the dataSource provided is an URL. Default = true
  * @param options The options used to render the layer.
  */
class GeoXmlLayer ()
  extends typings.bingmaps.Microsoft.Maps.GeoXmlLayer {
  def this(dataSource: String) = this()
  def this(dataSource: ArrayBuffer) = this()
  def this(dataSource: js.UndefOr[scala.Nothing], isUrl: Boolean) = this()
  def this(dataSource: String, isUrl: Boolean) = this()
  def this(dataSource: ArrayBuffer, isUrl: Boolean) = this()
  def this(
    dataSource: js.UndefOr[scala.Nothing],
    isUrl: js.UndefOr[scala.Nothing],
    options: IGeoXmlLayerOptions
  ) = this()
  def this(dataSource: js.UndefOr[scala.Nothing], isUrl: Boolean, options: IGeoXmlLayerOptions) = this()
  def this(dataSource: String, isUrl: js.UndefOr[scala.Nothing], options: IGeoXmlLayerOptions) = this()
  def this(dataSource: String, isUrl: Boolean, options: IGeoXmlLayerOptions) = this()
  def this(dataSource: ArrayBuffer, isUrl: js.UndefOr[scala.Nothing], options: IGeoXmlLayerOptions) = this()
  def this(dataSource: ArrayBuffer, isUrl: Boolean, options: IGeoXmlLayerOptions) = this()
}
