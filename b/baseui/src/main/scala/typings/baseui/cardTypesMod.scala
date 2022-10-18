package typings.baseui

import typings.baseui.anon.Thumbnail
import typings.baseui.helpersOverridesMod.Override
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardTypesMod {
  
  trait CardOverrides extends StObject {
    
    var Action: js.UndefOr[Override[Any]] = js.undefined
    
    var Body: js.UndefOr[Override[Any]] = js.undefined
    
    var Contents: js.UndefOr[Override[Any]] = js.undefined
    
    var HeaderImage: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
    
    var Thumbnail: js.UndefOr[Override[Any]] = js.undefined
    
    var Title: js.UndefOr[Override[Any]] = js.undefined
  }
  object CardOverrides {
    
    inline def apply(): CardOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardOverrides]
    }
    
    extension [Self <: CardOverrides](x: Self) {
      
      inline def setAction(value: Override[Any]): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
      
      inline def setBody(value: Override[Any]): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
      
      inline def setContents(value: Override[Any]): Self = StObject.set(x, "Contents", value.asInstanceOf[js.Any])
      
      inline def setContentsUndefined: Self = StObject.set(x, "Contents", js.undefined)
      
      inline def setHeaderImage(value: Override[Any]): Self = StObject.set(x, "HeaderImage", value.asInstanceOf[js.Any])
      
      inline def setHeaderImageUndefined: Self = StObject.set(x, "HeaderImage", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setThumbnail(value: Override[Any]): Self = StObject.set(x, "Thumbnail", value.asInstanceOf[js.Any])
      
      inline def setThumbnailUndefined: Self = StObject.set(x, "Thumbnail", js.undefined)
      
      inline def setTitle(value: Override[Any]): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    }
  }
  
  trait CardProps extends StObject {
    
    /** Contents to be rendered at the bottom of the Card. Used to organize UI which enables user action. */
    val action: js.UndefOr[ReactNode] = js.undefined
    
    /** Content to be rendered within the Card body. */
    val children: js.UndefOr[ReactNode] = js.undefined
    
    /** Function that takes Card props and returns a boolean that represents if a thumbnail will be rendered. */
    val hasThumbnail: js.UndefOr[js.Function1[/* a */ Thumbnail, Boolean]] = js.undefined
    
    /** Image to be positioned at the top of the Card. Can be a string representing the img src or an object with img attrs */
    val headerImage: js.UndefOr[String | ImageProps] = js.undefined
    
    val overrides: CardOverrides
    
    /** Image src that by default is rendered to the side of children content. */
    val thumbnail: js.UndefOr[String] = js.undefined
    
    /** Content to render above the body content. */
    val title: js.UndefOr[ReactNode] = js.undefined
  }
  object CardProps {
    
    inline def apply(overrides: CardOverrides): CardProps = {
      val __obj = js.Dynamic.literal(overrides = overrides.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardProps]
    }
    
    extension [Self <: CardProps](x: Self) {
      
      inline def setAction(value: ReactNode): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setHasThumbnail(value: /* a */ Thumbnail => Boolean): Self = StObject.set(x, "hasThumbnail", js.Any.fromFunction1(value))
      
      inline def setHasThumbnailUndefined: Self = StObject.set(x, "hasThumbnail", js.undefined)
      
      inline def setHeaderImage(value: String | ImageProps): Self = StObject.set(x, "headerImage", value.asInstanceOf[js.Any])
      
      inline def setHeaderImageUndefined: Self = StObject.set(x, "headerImage", js.undefined)
      
      inline def setOverrides(value: CardOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait ImageProps extends StObject {
    
    var alt: js.UndefOr[String] = js.undefined
    
    var complete: js.UndefOr[Boolean] = js.undefined
    
    var crossOrigin: js.UndefOr[String] = js.undefined
    
    var currentSrc: js.UndefOr[String] = js.undefined
    
    var decode: js.UndefOr[js.Promise[Unit]] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var isMap: js.UndefOr[Boolean] = js.undefined
    
    var naturalHeight: js.UndefOr[Double] = js.undefined
    
    var naturalWidth: js.UndefOr[Double] = js.undefined
    
    var sizes: js.UndefOr[String] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
    
    var srcSet: js.UndefOr[String] = js.undefined
    
    var useMap: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ImageProps {
    
    inline def apply(): ImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageProps]
    }
    
    extension [Self <: ImageProps](x: Self) {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setCurrentSrc(value: String): Self = StObject.set(x, "currentSrc", value.asInstanceOf[js.Any])
      
      inline def setCurrentSrcUndefined: Self = StObject.set(x, "currentSrc", js.undefined)
      
      inline def setDecode(value: js.Promise[Unit]): Self = StObject.set(x, "decode", value.asInstanceOf[js.Any])
      
      inline def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIsMap(value: Boolean): Self = StObject.set(x, "isMap", value.asInstanceOf[js.Any])
      
      inline def setIsMapUndefined: Self = StObject.set(x, "isMap", js.undefined)
      
      inline def setNaturalHeight(value: Double): Self = StObject.set(x, "naturalHeight", value.asInstanceOf[js.Any])
      
      inline def setNaturalHeightUndefined: Self = StObject.set(x, "naturalHeight", js.undefined)
      
      inline def setNaturalWidth(value: Double): Self = StObject.set(x, "naturalWidth", value.asInstanceOf[js.Any])
      
      inline def setNaturalWidthUndefined: Self = StObject.set(x, "naturalWidth", js.undefined)
      
      inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
      
      inline def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setUseMap(value: String): Self = StObject.set(x, "useMap", value.asInstanceOf[js.Any])
      
      inline def setUseMapUndefined: Self = StObject.set(x, "useMap", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
