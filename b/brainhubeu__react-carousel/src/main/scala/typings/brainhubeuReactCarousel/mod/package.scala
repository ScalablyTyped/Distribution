package typings.brainhubeuReactCarousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CarouselPluginFunc = js.Function1[
    /* hasOptionsCarouselPropsRefs */ typings.brainhubeuReactCarousel.anon.CarouselProps, 
    typings.brainhubeuReactCarousel.anon.AfterCarouselItems
  ]
  
  type ImgProps = typings.react.mod.ReactComponentElement[
    typings.brainhubeuReactCarousel.brainhubeuReactCarouselStrings.img, 
    typings.std.Pick[
      typings.react.mod.ComponentProps[typings.brainhubeuReactCarousel.brainhubeuReactCarouselStrings.img], 
      typings.std.Exclude[
        /* keyof react.react.ComponentProps<'img'> */ java.lang.String, 
        typings.brainhubeuReactCarousel.brainhubeuReactCarouselStrings.key | typings.brainhubeuReactCarousel.brainhubeuReactCarouselStrings.ref
      ]
    ]
  ]
  
  type PluginStrategy = js.Function2[/* originalValue */ scala.Double, /* previousValue */ scala.Double, scala.Double]
}
