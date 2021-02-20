package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Icon extends Overlay {
  
  var anchor: Size = js.native
  
  var imageOffset: Size = js.native
  
  var imageSize: Size = js.native
  
  var imageUrl: Size = js.native
  
  var infoWindowAnchor: Size = js.native
  
  var printImageUrl: String = js.native
  
  def setAnchor(anchor: Size): Unit = js.native
  
  def setImageOffset(offset: Size): Unit = js.native
  
  def setImageSize(offset: Size): Unit = js.native
  
  def setImageUrl(imageUrl: String): Unit = js.native
  
  def setInfoWindowAnchor(anchor: Size): Unit = js.native
  
  def setPrintImageUrl(url: String): Unit = js.native
  
  def setSize(size: Size): Unit = js.native
  
  var size: Size = js.native
}
object Icon {
  
  @scala.inline
  def apply(
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
  implicit class IconMutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: Size): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageOffset(value: Size): Self = StObject.set(x, "imageOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageSize(value: Size): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrl(value: Size): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoWindowAnchor(value: Size): Self = StObject.set(x, "infoWindowAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintImageUrl(value: String): Self = StObject.set(x, "printImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAnchor(value: Size => Unit): Self = StObject.set(x, "setAnchor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetImageOffset(value: Size => Unit): Self = StObject.set(x, "setImageOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetImageSize(value: Size => Unit): Self = StObject.set(x, "setImageSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetImageUrl(value: String => Unit): Self = StObject.set(x, "setImageUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetInfoWindowAnchor(value: Size => Unit): Self = StObject.set(x, "setInfoWindowAnchor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPrintImageUrl(value: String => Unit): Self = StObject.set(x, "setPrintImageUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSize(value: Size => Unit): Self = StObject.set(x, "setSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
