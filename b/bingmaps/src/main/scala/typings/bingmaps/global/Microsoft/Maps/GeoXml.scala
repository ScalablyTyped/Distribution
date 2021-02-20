package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.IGeoXmlDataSet
import typings.bingmaps.Microsoft.Maps.IGeoXmlReadOptions
import typings.bingmaps.Microsoft.Maps.IGeoXmlWriteOptions
import typings.bingmaps.Microsoft.Maps.IPrimitive
import typings.std.ArrayBuffer
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GeoXml {
  
  @JSGlobal("Microsoft.Maps.GeoXml.read")
  @js.native
  def read(xml: String, options: IGeoXmlReadOptions): IGeoXmlDataSet = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.read")
  @js.native
  def read(xml: ArrayBuffer, options: IGeoXmlReadOptions): IGeoXmlDataSet = js.native
  
  @JSGlobal("Microsoft.Maps.GeoXml.readFromUrl")
  @js.native
  def readFromUrl(
    urlString: String,
    options: IGeoXmlReadOptions,
    callback: js.Function1[/* data */ IGeoXmlDataSet, Unit]
  ): Unit = js.native
  
  @JSGlobal("Microsoft.Maps.GeoXml.write")
  @js.native
  def write(shapes: js.Array[typings.bingmaps.Microsoft.Maps.GroundOverlay | IPrimitive]): String = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.write")
  @js.native
  def write(
    shapes: js.Array[typings.bingmaps.Microsoft.Maps.GroundOverlay | IPrimitive],
    options: IGeoXmlWriteOptions
  ): String = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.write")
  @js.native
  def write(shapes: IGeoXmlDataSet): String = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.write")
  @js.native
  def write(shapes: IGeoXmlDataSet, options: IGeoXmlWriteOptions): String = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.write")
  @js.native
  def write(shapes: IPrimitive): String = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.write")
  @js.native
  def write(shapes: IPrimitive, options: IGeoXmlWriteOptions): String = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.write")
  @js.native
  def write(shapes: typings.bingmaps.Microsoft.Maps.Layer): String = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.write")
  @js.native
  def write(shapes: typings.bingmaps.Microsoft.Maps.Layer, options: IGeoXmlWriteOptions): String = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.write")
  @js.native
  def write(shapes: typings.bingmaps.Microsoft.Maps.Map): String = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.write")
  @js.native
  def write(shapes: typings.bingmaps.Microsoft.Maps.Map, options: IGeoXmlWriteOptions): String = js.native
  
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(shapes: js.Array[typings.bingmaps.Microsoft.Maps.GroundOverlay | IPrimitive]): String | ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(
    shapes: js.Array[typings.bingmaps.Microsoft.Maps.GroundOverlay | IPrimitive],
    compressFormat: js.UndefOr[scala.Nothing],
    options: IGeoXmlWriteOptions
  ): String | ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(
    shapes: js.Array[typings.bingmaps.Microsoft.Maps.GroundOverlay | IPrimitive],
    compressFormat: typings.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat
  ): String | ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(
    shapes: js.Array[typings.bingmaps.Microsoft.Maps.GroundOverlay | IPrimitive],
    compressFormat: typings.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat,
    options: IGeoXmlWriteOptions
  ): String | ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(shapes: IGeoXmlDataSet): String | ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(shapes: IGeoXmlDataSet, compressFormat: js.UndefOr[scala.Nothing], options: IGeoXmlWriteOptions): String | ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(shapes: IGeoXmlDataSet, compressFormat: typings.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat): String | ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(
    shapes: IGeoXmlDataSet,
    compressFormat: typings.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat,
    options: IGeoXmlWriteOptions
  ): String | ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(shapes: IPrimitive): String | ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(shapes: IPrimitive, compressFormat: js.UndefOr[scala.Nothing], options: IGeoXmlWriteOptions): String | ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(shapes: IPrimitive, compressFormat: typings.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat): String | ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(
    shapes: IPrimitive,
    compressFormat: typings.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat,
    options: IGeoXmlWriteOptions
  ): String | ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(shapes: typings.bingmaps.Microsoft.Maps.Layer): String | ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(
    shapes: typings.bingmaps.Microsoft.Maps.Layer,
    compressFormat: js.UndefOr[scala.Nothing],
    options: IGeoXmlWriteOptions
  ): String | ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(
    shapes: typings.bingmaps.Microsoft.Maps.Layer,
    compressFormat: typings.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat
  ): String | ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(
    shapes: typings.bingmaps.Microsoft.Maps.Layer,
    compressFormat: typings.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat,
    options: IGeoXmlWriteOptions
  ): String | ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(shapes: typings.bingmaps.Microsoft.Maps.Map): String | ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(
    shapes: typings.bingmaps.Microsoft.Maps.Map,
    compressFormat: js.UndefOr[scala.Nothing],
    options: IGeoXmlWriteOptions
  ): String | ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(
    shapes: typings.bingmaps.Microsoft.Maps.Map,
    compressFormat: typings.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat
  ): String | ArrayBuffer | Blob = js.native
  @JSGlobal("Microsoft.Maps.GeoXml.writeCompressed")
  @js.native
  def writeCompressed(
    shapes: typings.bingmaps.Microsoft.Maps.Map,
    compressFormat: typings.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat,
    options: IGeoXmlWriteOptions
  ): String | ArrayBuffer | Blob = js.native
}
