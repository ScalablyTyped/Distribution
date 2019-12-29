package typings.blueimpDashLoadDashImage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object blueimpDashLoadDashImageMod {
  import org.scalablytyped.runtime.NumberDictionary
  import typings.std.Event
  import typings.std.HTMLCanvasElement
  import typings.std.HTMLImageElement

  type AspectRatio = Double
  type Exif = NumberDictionary[Double | String | js.Array[String]]
  type Iptc = NumberDictionary[Double | String | js.Array[String]]
  type LoadImageCallback = js.Function2[
    /* eventOrImage */ Event | HTMLCanvasElement | HTMLImageElement, 
    /* data */ js.UndefOr[MetaData], 
    Unit
  ]
  type LoadImageOptions = BasicOptions with CanvasOptions with CropOptions with MetaOptions
  type Orientation = Double | Boolean
  type ParseMetaDataCallback = js.Function1[/* data */ ImageHead, Unit]
}
