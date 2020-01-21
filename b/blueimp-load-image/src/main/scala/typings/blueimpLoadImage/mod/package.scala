package typings.blueimpLoadImage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AspectRatio = scala.Double
  type Exif = org.scalablytyped.runtime.NumberDictionary[scala.Double | java.lang.String | js.Array[java.lang.String]]
  type Iptc = org.scalablytyped.runtime.NumberDictionary[scala.Double | java.lang.String | js.Array[java.lang.String]]
  type LoadImageCallback = js.Function2[
    /* eventOrImage */ typings.std.Event_ | typings.std.HTMLCanvasElement | typings.std.HTMLImageElement, 
    /* data */ js.UndefOr[typings.blueimpLoadImage.mod.MetaData], 
    scala.Unit
  ]
  type LoadImageOptions = typings.blueimpLoadImage.mod.BasicOptions with typings.blueimpLoadImage.mod.CanvasOptions with typings.blueimpLoadImage.mod.CropOptions with typings.blueimpLoadImage.mod.MetaOptions
  type Orientation = scala.Double | scala.Boolean
  type ParseMetaDataCallback = js.Function1[/* data */ typings.blueimpLoadImage.mod.ImageHead, scala.Unit]
}
