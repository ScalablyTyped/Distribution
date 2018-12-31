package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.GeoXmlLayer")
@js.native
/**
  * @constructor
  * @param dataSource The XML as a string, URL or ArrayBuffer to read.
  * @param isUrl Whether the dataSource provided is an URL. Default = true
  * @param options The options used to render the layer.
  */
class GeoXmlLayer () extends CustomOverlay {
  def this(dataSource: java.lang.String) = this()
  def this(dataSource: stdLib.ArrayBuffer) = this()
  def this(dataSource: java.lang.String, isUrl: scala.Boolean) = this()
  def this(dataSource: stdLib.ArrayBuffer, isUrl: scala.Boolean) = this()
  def this(dataSource: java.lang.String, isUrl: scala.Boolean, options: IGeoXmlLayerOptions) = this()
  def this(dataSource: stdLib.ArrayBuffer, isUrl: scala.Boolean, options: IGeoXmlLayerOptions) = this()
  /** Optional property to store any additional metadata for this layer. */
  var metadata: js.Any = js.native
  /**
    * Removes all the data in the layer.
    */
  def clear(): scala.Unit = js.native
  /**
    * Cleans up any resources this object is consuming.
    */
  def dispose(): scala.Unit = js.native
  /**
    * Returns the data set that ws extracted from the data source.
    * @returns The data set that ws extracted from the data source.
    */
  def getDataSet(): IGeoXmlDataSet = js.native
  /**
    * Returns the data source used by the layer.
    * @returns The data source used by the layer.
    */
  def getDataSource(): java.lang.String | stdLib.ArrayBuffer = js.native
  /**
    * Returns the options used by the GeoXmlLayer.
    * @returns The options used by the GeoXmlLayer.
    */
  def getOptions(): IGeoXmlLayerOptions = js.native
  /**
    * Gets a value indicating whether the layer is visible or not.
    * @returns A boolean indicating if the layer is visible or not.
    */
  def getVisible(): scala.Boolean = js.native
  /**
    * Sets the data source to render in the GeoXmlLayer.
    * @param dataSource The data source to render in the GeoXmlLayer.
    * @param isUrl Whether the dataSource provided is an URL. Default = true
    */
  def setDataSource(dataSource: java.lang.String, isUrl: scala.Boolean): scala.Unit = js.native
  def setDataSource(dataSource: stdLib.ArrayBuffer, isUrl: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the options used for loading and rendering data into the GeoXmlLayer.
    * @param options The options to use when loading and rendering data into the GeoXmlLayer.
    */
  def setOptions(options: IGeoXmlLayerOptions): scala.Unit = js.native
  /**
    * Sets whether the layer is visible or not.
    * @param value A value indicating if the layer should be displayed or not.
    */
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
}

