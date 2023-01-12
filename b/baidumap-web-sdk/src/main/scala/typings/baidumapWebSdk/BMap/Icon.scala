package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Icon
  extends StObject
     with Overlay {
  
  var anchor: Size
  
  var imageOffset: Size
  
  var imageSize: Size
  
  var imageUrl: Size
  
  var infoWindowAnchor: Size
  
  var printImageUrl: String
  
  def setAnchor(anchor: Size): Unit
  
  def setImageOffset(offset: Size): Unit
  
  def setImageSize(offset: Size): Unit
  
  def setImageUrl(imageUrl: String): Unit
  
  def setInfoWindowAnchor(anchor: Size): Unit
  
  def setPrintImageUrl(url: String): Unit
  
  def setSize(size: Size): Unit
  
  var size: Size
}
object Icon {
  
  inline def apply(
    anchor: Size,
    imageOffset: Size,
    imageSize: Size,
    imageUrl: Size,
    infoWindowAnchor: Size,
    printImageUrl: String,
    setAnchor: Size => Unit,
    setImageOffset: Size => Unit,
    setImageSize: Size => Unit,
    setImageUrl: String => Unit,
    setInfoWindowAnchor: Size => Unit,
    setPrintImageUrl: String => Unit,
    setSize: Size => Unit,
    size: Size
  ): Icon = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], imageOffset = imageOffset.asInstanceOf[js.Any], imageSize = imageSize.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], infoWindowAnchor = infoWindowAnchor.asInstanceOf[js.Any], printImageUrl = printImageUrl.asInstanceOf[js.Any], setAnchor = js.Any.fromFunction1(setAnchor), setImageOffset = js.Any.fromFunction1(setImageOffset), setImageSize = js.Any.fromFunction1(setImageSize), setImageUrl = js.Any.fromFunction1(setImageUrl), setInfoWindowAnchor = js.Any.fromFunction1(setInfoWindowAnchor), setPrintImageUrl = js.Any.fromFunction1(setPrintImageUrl), setSize = js.Any.fromFunction1(setSize), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
    
    inline def setAnchor(value: Size): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setImageOffset(value: Size): Self = StObject.set(x, "imageOffset", value.asInstanceOf[js.Any])
    
    inline def setImageSize(value: Size): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
    
    inline def setImageUrl(value: Size): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setInfoWindowAnchor(value: Size): Self = StObject.set(x, "infoWindowAnchor", value.asInstanceOf[js.Any])
    
    inline def setPrintImageUrl(value: String): Self = StObject.set(x, "printImageUrl", value.asInstanceOf[js.Any])
    
    inline def setSetAnchor(value: Size => Unit): Self = StObject.set(x, "setAnchor", js.Any.fromFunction1(value))
    
    inline def setSetImageOffset(value: Size => Unit): Self = StObject.set(x, "setImageOffset", js.Any.fromFunction1(value))
    
    inline def setSetImageSize(value: Size => Unit): Self = StObject.set(x, "setImageSize", js.Any.fromFunction1(value))
    
    inline def setSetImageUrl(value: String => Unit): Self = StObject.set(x, "setImageUrl", js.Any.fromFunction1(value))
    
    inline def setSetInfoWindowAnchor(value: Size => Unit): Self = StObject.set(x, "setInfoWindowAnchor", js.Any.fromFunction1(value))
    
    inline def setSetPrintImageUrl(value: String => Unit): Self = StObject.set(x, "setPrintImageUrl", js.Any.fromFunction1(value))
    
    inline def setSetSize(value: Size => Unit): Self = StObject.set(x, "setSize", js.Any.fromFunction1(value))
    
    inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
