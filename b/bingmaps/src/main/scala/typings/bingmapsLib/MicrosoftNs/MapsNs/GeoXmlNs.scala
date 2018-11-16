package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.GeoXml")
@js.native
object GeoXmlNs extends js.Object {
  def read(xml: java.lang.String, options: bingmapsLib.MicrosoftNs.MapsNs.IGeoXmlReadOptions): bingmapsLib.MicrosoftNs.MapsNs.IGeoXmlDataSet = js.native
  def read(xml: stdLib.ArrayBuffer, options: bingmapsLib.MicrosoftNs.MapsNs.IGeoXmlReadOptions): bingmapsLib.MicrosoftNs.MapsNs.IGeoXmlDataSet = js.native
  def readFromUrl(
    urlString: java.lang.String,
    options: bingmapsLib.MicrosoftNs.MapsNs.IGeoXmlReadOptions,
    callback: js.Function1[/* data */ bingmapsLib.MicrosoftNs.MapsNs.IGeoXmlDataSet, scala.Unit]
  ): scala.Unit = js.native
  def write(shapes: bingmapsLib.MicrosoftNs.MapsNs.IGeoXmlDataSet): java.lang.String = js.native
  def write(
    shapes: bingmapsLib.MicrosoftNs.MapsNs.IGeoXmlDataSet,
    options: bingmapsLib.MicrosoftNs.MapsNs.IGeoXmlWriteOptions
  ): java.lang.String = js.native
  def write(shapes: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive): java.lang.String = js.native
  def write(
    shapes: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    options: bingmapsLib.MicrosoftNs.MapsNs.IGeoXmlWriteOptions
  ): java.lang.String = js.native
  def write(shapes: bingmapsLib.MicrosoftNs.MapsNs.Layer): java.lang.String = js.native
  def write(
    shapes: bingmapsLib.MicrosoftNs.MapsNs.Layer,
    options: bingmapsLib.MicrosoftNs.MapsNs.IGeoXmlWriteOptions
  ): java.lang.String = js.native
  def write(shapes: bingmapsLib.MicrosoftNs.MapsNs.Map): java.lang.String = js.native
  def write(
    shapes: bingmapsLib.MicrosoftNs.MapsNs.Map,
    options: bingmapsLib.MicrosoftNs.MapsNs.IGeoXmlWriteOptions
  ): java.lang.String = js.native
  def write(
    shapes: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.GroundOverlay | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ]
  ): java.lang.String = js.native
  def write(
    shapes: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.GroundOverlay | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    options: bingmapsLib.MicrosoftNs.MapsNs.IGeoXmlWriteOptions
  ): java.lang.String = js.native
  def writeCompressed(shapes: bingmapsLib.MicrosoftNs.MapsNs.IGeoXmlDataSet): java.lang.String | stdLib.ArrayBuffer | stdLib.Blob = js.native
  def writeCompressed(
    shapes: bingmapsLib.MicrosoftNs.MapsNs.IGeoXmlDataSet,
    compressFormat: bingmapsLib.MicrosoftNs.MapsNs.GeoXmlCompressedFormat
  ): java.lang.String | stdLib.ArrayBuffer | stdLib.Blob = js.native
  def writeCompressed(
    shapes: bingmapsLib.MicrosoftNs.MapsNs.IGeoXmlDataSet,
    compressFormat: bingmapsLib.MicrosoftNs.MapsNs.GeoXmlCompressedFormat,
    options: bingmapsLib.MicrosoftNs.MapsNs.IGeoXmlWriteOptions
  ): java.lang.String | stdLib.ArrayBuffer | stdLib.Blob = js.native
  def writeCompressed(shapes: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive): java.lang.String | stdLib.ArrayBuffer | stdLib.Blob = js.native
  def writeCompressed(
    shapes: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    compressFormat: bingmapsLib.MicrosoftNs.MapsNs.GeoXmlCompressedFormat
  ): java.lang.String | stdLib.ArrayBuffer | stdLib.Blob = js.native
  def writeCompressed(
    shapes: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    compressFormat: bingmapsLib.MicrosoftNs.MapsNs.GeoXmlCompressedFormat,
    options: bingmapsLib.MicrosoftNs.MapsNs.IGeoXmlWriteOptions
  ): java.lang.String | stdLib.ArrayBuffer | stdLib.Blob = js.native
  def writeCompressed(shapes: bingmapsLib.MicrosoftNs.MapsNs.Layer): java.lang.String | stdLib.ArrayBuffer | stdLib.Blob = js.native
  def writeCompressed(
    shapes: bingmapsLib.MicrosoftNs.MapsNs.Layer,
    compressFormat: bingmapsLib.MicrosoftNs.MapsNs.GeoXmlCompressedFormat
  ): java.lang.String | stdLib.ArrayBuffer | stdLib.Blob = js.native
  def writeCompressed(
    shapes: bingmapsLib.MicrosoftNs.MapsNs.Layer,
    compressFormat: bingmapsLib.MicrosoftNs.MapsNs.GeoXmlCompressedFormat,
    options: bingmapsLib.MicrosoftNs.MapsNs.IGeoXmlWriteOptions
  ): java.lang.String | stdLib.ArrayBuffer | stdLib.Blob = js.native
  def writeCompressed(shapes: bingmapsLib.MicrosoftNs.MapsNs.Map): java.lang.String | stdLib.ArrayBuffer | stdLib.Blob = js.native
  def writeCompressed(
    shapes: bingmapsLib.MicrosoftNs.MapsNs.Map,
    compressFormat: bingmapsLib.MicrosoftNs.MapsNs.GeoXmlCompressedFormat
  ): java.lang.String | stdLib.ArrayBuffer | stdLib.Blob = js.native
  def writeCompressed(
    shapes: bingmapsLib.MicrosoftNs.MapsNs.Map,
    compressFormat: bingmapsLib.MicrosoftNs.MapsNs.GeoXmlCompressedFormat,
    options: bingmapsLib.MicrosoftNs.MapsNs.IGeoXmlWriteOptions
  ): java.lang.String | stdLib.ArrayBuffer | stdLib.Blob = js.native
  def writeCompressed(
    shapes: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.GroundOverlay | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ]
  ): java.lang.String | stdLib.ArrayBuffer | stdLib.Blob = js.native
  def writeCompressed(
    shapes: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.GroundOverlay | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    compressFormat: bingmapsLib.MicrosoftNs.MapsNs.GeoXmlCompressedFormat
  ): java.lang.String | stdLib.ArrayBuffer | stdLib.Blob = js.native
  def writeCompressed(
    shapes: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.GroundOverlay | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    compressFormat: bingmapsLib.MicrosoftNs.MapsNs.GeoXmlCompressedFormat,
    options: bingmapsLib.MicrosoftNs.MapsNs.IGeoXmlWriteOptions
  ): java.lang.String | stdLib.ArrayBuffer | stdLib.Blob = js.native
}

