package typings.blueimpLoadImage.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.std.Event
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AspectRatio = Double

type ExifMap = Record[Double, Double]

type ExifTagValue = Double | String | js.Array[String]

type Iptc = NumberDictionary[Double | String | js.Array[String]]

type LoadImageCallback = js.Function2[
/* eventOrImage */ Event | HTMLCanvasElement | HTMLImageElement, 
/* data */ js.UndefOr[MetaData], 
Unit]

type LoadImageOptions = BasicOptions & CanvasOptions & CropOptions & MetaOptions

type Orientation = Double | Boolean

type ParseMetaDataCallback = js.Function1[/* data */ MetaData, Unit]

type Scale = js.Function2[
/* image */ HTMLImageElement | HTMLCanvasElement, 
/* options */ js.UndefOr[LoadImageOptions], 
/* import warning: importer.ImportType#apply Failed type conversion: blueimp-load-image.blueimp-load-image.LoadImageOptions extends blueimp-load-image.blueimp-load-image.CanvasTrueOptions ? std.HTMLCanvasElement : std.HTMLImageElement */ js.Any]
