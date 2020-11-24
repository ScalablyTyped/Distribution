package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofdeviceAttributes extends js.Object {
  
  def getDeviceAnnotatedLocation(callback: js.Function1[/* annotatedLocation */ String, Unit]): Unit = js.native
  
  def getDeviceAssetId(callback: js.Function1[/* assetId */ String, Unit]): Unit = js.native
  
  def getDeviceSerialNumber(callback: js.Function1[/* serialNumber */ String, Unit]): Unit = js.native
  
  def getDirectoryDeviceId(callback: js.Function1[/* deviceId */ String, Unit]): Unit = js.native
}
object TypeofdeviceAttributes {
  
  @scala.inline
  def apply(
    getDeviceAnnotatedLocation: js.Function1[/* annotatedLocation */ String, Unit] => Unit,
    getDeviceAssetId: js.Function1[/* assetId */ String, Unit] => Unit,
    getDeviceSerialNumber: js.Function1[/* serialNumber */ String, Unit] => Unit,
    getDirectoryDeviceId: js.Function1[/* deviceId */ String, Unit] => Unit
  ): TypeofdeviceAttributes = {
    val __obj = js.Dynamic.literal(getDeviceAnnotatedLocation = js.Any.fromFunction1(getDeviceAnnotatedLocation), getDeviceAssetId = js.Any.fromFunction1(getDeviceAssetId), getDeviceSerialNumber = js.Any.fromFunction1(getDeviceSerialNumber), getDirectoryDeviceId = js.Any.fromFunction1(getDirectoryDeviceId))
    __obj.asInstanceOf[TypeofdeviceAttributes]
  }
  
  @scala.inline
  implicit class TypeofdeviceAttributesOps[Self <: TypeofdeviceAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetDeviceAnnotatedLocation(value: js.Function1[/* annotatedLocation */ String, Unit] => Unit): Self = this.set("getDeviceAnnotatedLocation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDeviceAssetId(value: js.Function1[/* assetId */ String, Unit] => Unit): Self = this.set("getDeviceAssetId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDeviceSerialNumber(value: js.Function1[/* serialNumber */ String, Unit] => Unit): Self = this.set("getDeviceSerialNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDirectoryDeviceId(value: js.Function1[/* deviceId */ String, Unit] => Unit): Self = this.set("getDirectoryDeviceId", js.Any.fromFunction1(value))
  }
}
