package typings.chromeApps.chrome.usb

import typings.chromeApps.chrome.integer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since Chrome 29. */
@js.native
trait InterfaceDescriptor extends js.Object {
  
  /**
    * The interface alternate setting number.
    * @default 0
    */
  var alternateSetting: integer = js.native
  
  /** Description of the interface */
  var description: js.UndefOr[String] = js.native
  
  /** Available endpoints. */
  var endpoints: js.Array[EndpointDescriptor] = js.native
  
  /**
    * Extra descriptor data associated with this interface.
    * @since Chrome 39.
    */
  var extra_data: ArrayBuffer = js.native
  
  /** The USB interface class. */
  var interfaceClass: integer = js.native
  
  /** The interface number */
  var interfaceNumber: integer = js.native
  
  /** The USB interface protocol. */
  var interfaceProtocol: integer = js.native
  
  /** The USB interface sub-class. */
  var interfaceSubclass: integer = js.native
}
object InterfaceDescriptor {
  
  @scala.inline
  def apply(
    alternateSetting: integer,
    endpoints: js.Array[EndpointDescriptor],
    extra_data: ArrayBuffer,
    interfaceClass: integer,
    interfaceNumber: integer,
    interfaceProtocol: integer,
    interfaceSubclass: integer
  ): InterfaceDescriptor = {
    val __obj = js.Dynamic.literal(alternateSetting = alternateSetting.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any], extra_data = extra_data.asInstanceOf[js.Any], interfaceClass = interfaceClass.asInstanceOf[js.Any], interfaceNumber = interfaceNumber.asInstanceOf[js.Any], interfaceProtocol = interfaceProtocol.asInstanceOf[js.Any], interfaceSubclass = interfaceSubclass.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceDescriptor]
  }
  
  @scala.inline
  implicit class InterfaceDescriptorOps[Self <: InterfaceDescriptor] (val x: Self) extends AnyVal {
    
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
    def setAlternateSetting(value: integer): Self = this.set("alternateSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointsVarargs(value: EndpointDescriptor*): Self = this.set("endpoints", js.Array(value :_*))
    
    @scala.inline
    def setEndpoints(value: js.Array[EndpointDescriptor]): Self = this.set("endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtra_data(value: ArrayBuffer): Self = this.set("extra_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceClass(value: integer): Self = this.set("interfaceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceNumber(value: integer): Self = this.set("interfaceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceProtocol(value: integer): Self = this.set("interfaceProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceSubclass(value: integer): Self = this.set("interfaceSubclass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
}
