package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Icon
  extends StObject
     with Overlay {
  
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
